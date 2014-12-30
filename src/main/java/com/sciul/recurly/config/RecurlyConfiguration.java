package com.sciul.recurly.config;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpHeaders;

/**
 * The Class RecurlyConfiguration.
 * 
 * @author gaurav
 */
@Configuration
@Scope("singleton")
public class RecurlyConfiguration {

  /** The api key. */
  private String apiKey;

  /** The recurly server url. */
  private String recurlyServerURL;

  /** The sns topic. */
  private String snsTopic;

  /** The aws topic region. */
  private String awsTopicRegion;

  /** The notify email id. */
  private String channel;

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
   * Gets the sns topic.
   * 
   * @return the sns topic
   */
  public String getSnsTopic() {
    return snsTopic;
  }

  /**
   * Sets the sns topic.
   * 
   * @param snsTopic
   *          the new sns topic
   */
  public void setSnsTopic(String snsTopic) {
    this.snsTopic = snsTopic;
  }

  /**
   * Gets the aws topic region.
   * 
   * @return the aws topic region
   */
  public String getAwsTopicRegion() {
    return awsTopicRegion;
  }

  /**
   * Sets the aws topic region.
   * 
   * @param awsTopicRegion
   *          the new aws topic region
   */
  public void setAwsTopicRegion(String awsTopicRegion) {
    this.awsTopicRegion = awsTopicRegion;
  }

  /**
   * Gets the slack channel.
   * 
   * @return channel
   */
  public String getChannel() {
    return channel;
  }

  /**
   * Sets the slack channel.
   * 
   * @param channel
   *          the slack channel
   */
  public void setChannel(String channel) {
    this.channel = channel;
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
