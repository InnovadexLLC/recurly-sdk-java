package com.sciul.recurly.proxies;

import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;

import org.apache.commons.httpclient.URIException;
import org.apache.commons.httpclient.util.URIUtil;
import org.slf4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.xml.sax.InputSource;

import com.sciul.recurly.config.RecurlyConfiguration;
import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.helper.BillingConstants;
import com.sciul.recurly.model.Errors;
import com.sciul.recurly.model.RecurlyError;
import com.sciul.recurly.model.RecurlyErrors;

/**
 * The Class AbstractService.
 * 
 * @author GauravChawla
 */
public abstract class AbstractProxy {

  /** The recurly. */
  protected RecurlyConfiguration recurly;

  /**
   * Instantiates a new abstract proxy.
   * 
   * @param recurly
   *          the recurly
   */
  AbstractProxy(RecurlyConfiguration recurly) {
    this.recurly = recurly;
  }

  /**
   * The logger.
   * 
   * @return the logger
   */
  public abstract Logger getLogger();

  /** The rest template. */
  private static RestTemplate restTemplate = new RestTemplate();

  /**
   * Call recurly API.
   * 
   * @param <T>
   *          the generic type
   * @param <E>
   *          the element type
   * @param path
   *          the path
   * @param payload
   *          the payload
   * @param responseClass
   *          the response class
   * @param method
   *          the method
   * @return the t
   * @throws RecurlyException
   *           the recurly exception
   */
  protected <T, E> T call(String path, E payload, Class<T> responseClass, HttpMethod method) throws RecurlyException {
    return call(path, payload, responseClass, method, null);
  }

  /**
   * Call recurly API.
   * 
   * @param <T>
   *          the generic type
   * @param <E>
   *          the element type
   * @param path
   *          the path
   * @param payload
   *          the payload
   * @param responseClass
   *          the response class
   * @param method
   *          the method
   * @param headers
   *          the headers
   * @return the t
   * @throws RecurlyException
   *           the recurly exception
   */
  protected <T, E> T call(String path, E payload, Class<T> responseClass, HttpMethod method, HttpHeaders headers)
        throws RecurlyException {

    URI uri = null;
    ResponseEntity<T> responseEntity = null;
    T reponse = null;
    HttpEntity<?> entity = null;
    try {
      if (headers == null) {
        entity = new HttpEntity<>(payload, recurly.getRecurlyHeaders());
      } else {
        entity = new HttpEntity<>(payload, headers);
      }
      uri = new URI(URIUtil.encodeQuery(recurly.getRecurlyServerURL() + path, "UTF-8"));
      getLogger().debug("Calling Recurly URL {}, method: {}", uri.toString(), method.toString());
      responseEntity = restTemplate.exchange(uri, method, entity, responseClass);
      if (responseEntity != null)
        reponse = responseEntity.getBody();

    } catch (URIException | UnsupportedEncodingException | URISyntaxException e) {
      throw new RecurlyException("Not able to reach recurly. Please check the URL.", e);
    } catch (RestClientException e) {
      String err = ((HttpStatusCodeException) e).getResponseBodyAsString();
      int code = ((HttpStatusCodeException) e).getStatusCode().value();
      publishError(uri.toString(), err, code);
      RecurlyException ex = handleError(err, code, e);
      throw ex;
    }
    return reponse;
  }

  /**
   * Handle recurly error.
   * 
   * @param err
   *          the error message
   * @param code
   *          the error code
   * @param ex
   *          the exception
   * @return the recurly exception
   */
  private RecurlyException handleError(String err, int code, Exception ex) {
    RecurlyErrors errors = null;
    try {
      if (err.indexOf(BillingConstants.RECURLY_TRANSACTION_ERRORS) != -1) {
        Errors transactionErrors =
              (Errors) JAXBContext.newInstance(Errors.class).createUnmarshaller()
                    .unmarshal(new InputSource(new StringReader(err)));
        RecurlyError recurlyError = new RecurlyError();
        recurlyError.setDescription(transactionErrors.getTransactionError().getCustomerMessage());
        recurlyError.setSymbol(transactionErrors.getTransactionError().getErrorCode());
        List<RecurlyError> errorList = new ArrayList<RecurlyError>();
        errorList.add(recurlyError);
        errors = new RecurlyErrors();
        errors.setError(errorList);
      } else if (err.indexOf(BillingConstants.RECURLY_ERRORS) != -1
            && err.indexOf(BillingConstants.RECURLY_TRANSACTION_ERRORS) == -1) {
        errors =
              (RecurlyErrors) JAXBContext.newInstance(RecurlyErrors.class).createUnmarshaller()
                    .unmarshal(new InputSource(new StringReader(err)));
      } else if (err.indexOf(BillingConstants.RECURLY_ERROR) != -1) {
        RecurlyError error =
              (RecurlyError) JAXBContext.newInstance(RecurlyError.class).createUnmarshaller()
                    .unmarshal(new InputSource(new StringReader(err)));
        errors = new RecurlyErrors();
        List<RecurlyError> errorList = new ArrayList<RecurlyError>();
        errorList.add(error);
        errors.setError(errorList);
      }
    } catch (Exception e) {
      getLogger().error("JAXBContext Failed {} ", e);
      return new RecurlyException(err, code, e);
    }
    String error = null;
    for (RecurlyError e : errors.getError()) {
      if (error == null)
        error = e.getSymbol() + " : " + e.getDescription();
      else
        error = error + " | " + e.getSymbol() + " : " + e.getDescription();
    }
    return new RecurlyException(error, code, ex);
  }

  /**
   * Publish error via Notify method passed in.
   * 
   * @param url
   *          the api path.
   * @param error
   *          the error
   * @param code
   *          the error http code
   */
  private void publishError(String url, String error, Integer code) {
    if (recurly.getErrorNotifier() != null) {
      recurly.getErrorNotifier().publish(error, code);
      getLogger().info("Notified Error via publish message.");
    }
  }

  // /**
  // * Publish to slack.
  // *
  // * @param message
  // * the error message
  // * @throws URIException
  // */
  // private void publishToSlack(String error) {
  // URI uri = null;
  // HttpMethod method = HttpMethod.POST;
  // try {
  // HttpHeaders headers = new HttpHeaders();
  // headers.set("Content-Type", "application/json; charset=utf-8");
  // Payload payload = new Payload(error);
  // HttpEntity<?> entity = new HttpEntity<>(payload, headers);
  // uri = new URI(URIUtil.encodeQuery(recurly.getChannel(), "UTF-8"));
  // getLogger().debug("Calling Slack URL {}, method: {}", uri.toString(), method.toString());
  // restTemplate.exchange(uri, method, entity, void.class);
  // } catch (URIException | URISyntaxException | RestClientException e) {
  // getLogger().error("Calling Slack URL {}, error: {}", uri.toString(), e);
  // }
  // }
}