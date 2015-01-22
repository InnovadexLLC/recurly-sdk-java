package com.sciul.recurly.config;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.http.HttpHeaders;

import com.sciul.recurly.proxies.Notifier;

/**
 * The Class RecurlyConfiguration.
 * 
 * @author GauravChawla
 */
public class RecurlyConfiguration {

  /** The api key. */
  private String apiKey;

  /** The recurly server url. */
  private String recurlyServerURL;

  /** The error notifier. */
  private Notifier errorNotifier;

  /**
   * Instantiates a new recurly configuration.
   * 
   * @param apiKey
   *          the api key
   * @param recurlyServerURL
   *          the recurly server url
   */
  public RecurlyConfiguration(String apiKey, String recurlyServerURL) {
    this.apiKey = apiKey;
    this.recurlyServerURL = recurlyServerURL;
  }

  /**
   * Instantiates a new recurly configuration.
   * 
   * @param apiKey
   *          the api key
   * @param recurlyServerURL
   *          the recurly server url
   * @param errorNotifier
   *          the error notifier
   */
  public RecurlyConfiguration(String apiKey, String recurlyServerURL, Notifier errorNotifier) {
    this.apiKey = apiKey;
    this.recurlyServerURL = recurlyServerURL;
    this.errorNotifier = errorNotifier;
  }

  /**
   * Instantiates a new recurly configuration.
   */
  public RecurlyConfiguration() {
  }

  /**
   * Gets the api key.
   * 
   * @return the api key
   */
  public String getApiKey() {
    return apiKey;
  }

  /**
   * Sets the api key.
   * 
   * @param apiKey
   *          the new api key
   */
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  /**
   * Gets the recurly server url.
   * 
   * @return the recurly server url
   */
  public String getRecurlyServerURL() {
    return recurlyServerURL;
  }

  /**
   * Sets the recurly server url.
   * 
   * @param recurlyServerURL
   *          the new recurly server url
   */
  public void setRecurlyServerURL(String recurlyServerURL) {
    this.recurlyServerURL = recurlyServerURL;
  }

  /**
   * Gets the error notifier.
   * 
   * @return the error notifier
   */
  public Notifier getErrorNotifier() {
    return errorNotifier;
  }

  /**
   * Sets the error notifier.
   * 
   * @param errorNotifier
   *          the new error notifier
   */
  public void setErrorNotifier(Notifier errorNotifier) {
    this.errorNotifier = errorNotifier;
  }

  /**
   * Gets the recurly headers.
   * 
   * @return the recurly headers
   * @throws UnsupportedEncodingException
   *           the unsupported encoding exception
   */
  public HttpHeaders getRecurlyHeaders() throws UnsupportedEncodingException {
    HttpHeaders headers = new HttpHeaders();
    headers.set("Accept", "application/xml");
    headers.set("Content-Type", "application/xml; charset=utf-8");
    headers.set("Authorization", "Basic " + new String(Base64.encodeBase64(StringUtils.getBytesUtf8(apiKey)), "UTF-8"));
    return headers;
  }

}
