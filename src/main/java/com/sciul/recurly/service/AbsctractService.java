package com.sciul.recurly.service;

import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.httpclient.URIException;
import org.apache.commons.httpclient.util.URIUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.xml.sax.InputSource;

import com.sciul.recurly.config.RecurlyConfiguration;
import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.model.RecurlyError;
import com.sciul.recurly.model.RecurlyErrors;
import com.sciul.sdk.helper.SNSNotification;

public abstract class AbsctractService {

  private static Logger logger = LoggerFactory.getLogger(AbsctractService.class);

  @Autowired
  private RecurlyConfiguration recurly;

  @Autowired
  private SNSNotification snsClient;

  private RestTemplate restTemplate = new RestTemplate();

  public <T, E> T call(String path, E payload, Class<T> responseClass, HttpMethod method) {

    URI uri = null;
    ResponseEntity<T> responseEntity = null;
    T reponse = null;
    try {
      HttpEntity<?> entity = new HttpEntity<>(payload, recurly.getRecurllyHeaders());

      uri = new URI(URIUtil.encodeQuery(recurly.getRecurlyServerURL() + path, "UTF-8"));

      logger.debug("Calling Recurly URL {}", uri.toString());

      responseEntity = restTemplate.exchange(uri, method, entity, responseClass);

      if (responseEntity != null)
        reponse = responseEntity.getBody();

    } catch (URIException | UnsupportedEncodingException | URISyntaxException e) {
      throw new RecurlyException("Not able to reach recurly. Please check the URL.");
    } catch (RestClientException e) {
      String err = ((HttpStatusCodeException) e).getResponseBodyAsString();
      int code = ((HttpStatusCodeException) e).getStatusCode().value();
      logger.error("Recurly API: {} - Error:  {}", uri.toString(), err);
      if (recurly.getSnsTopic() != null && !recurly.getSnsTopic().isEmpty() && recurly.getAwsTopicRegion() != null
            && !recurly.getAwsTopicRegion().isEmpty()) {
        String msgId =
              snsClient.publish(err, recurly.getSnsTopic(), recurly.getAwsTopicRegion(), "Recurly Error: " + code);
        logger.info("Sending Recurly Error via SNS - MessageId: {}", msgId);
      } else {
        logger.info("Topic: {}, Region: {}", recurly.getSnsTopic(), recurly.getAwsTopicRegion());
      }
      RecurlyException ex = handleError(err);
      ex.setCode(code);
      throw ex;
    }
    return reponse;
  }

  public RecurlyException handleError(String err) {
    RecurlyErrors errors = null;
    try {
      if (err.indexOf("<errors>") != -1) {
        JAXBContext jaxbContext = JAXBContext.newInstance(RecurlyErrors.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        errors = (RecurlyErrors) jaxbUnmarshaller.unmarshal(new InputSource(new StringReader(err)));
      } else if (err.indexOf("<error>") != -1) {
        JAXBContext jaxbContext = JAXBContext.newInstance(RecurlyError.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        RecurlyError error = (RecurlyError) jaxbUnmarshaller.unmarshal(new InputSource(new StringReader(err)));
        errors = new RecurlyErrors();
        List<RecurlyError> errorList = new ArrayList<RecurlyError>();
        errorList.add(error);
        errors.setError(errorList);
      }
    } catch (Exception e) {
      logger.error("JAXBContext Failed {} ", e);
      return new RecurlyException("Not able to parse Recurly exception.");
    }
    RecurlyException ex = new RecurlyException("Recurly API Exception");
    ex.setRecurlyErrors(errors);
    return ex;
  }
}