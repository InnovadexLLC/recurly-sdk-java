package com.sciul.recurly.config;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpHeaders;

/**
 * @author gaurav
 */
@Configuration
@Scope("singleton")
public class RecurlyConfiguration {

  private String apiKey;
  private String recurlyServerURL;
  private String snsTopic;
  private String awsTopicRegion;
  private String notifyEmailId;

  public RecurlyConfiguration(String apiKey, String recurlyServerURL) {
    this.apiKey = apiKey;
    this.recurlyServerURL = recurlyServerURL;
  }

  public RecurlyConfiguration() {
  }

  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public String getRecurlyServerURL() {
    return recurlyServerURL;
  }

  public void setRecurlyServerURL(String recurlyServerURL) {
    this.recurlyServerURL = recurlyServerURL;
  }

  public String getSnsTopic() {
    return snsTopic;
  }

  public void setSnsTopic(String snsTopic) {
    this.snsTopic = snsTopic;
  }

  public String getAwsTopicRegion() {
    return awsTopicRegion;
  }

  public void setAwsTopicRegion(String awsTopicRegion) {
    this.awsTopicRegion = awsTopicRegion;
  }

  public String getNotifyEmailId() {
    return notifyEmailId;
  }

  public void setNotifyEmailId(String email) {
    this.notifyEmailId = email;
  }

  public HttpHeaders getRecurllyHeaders() throws UnsupportedEncodingException {
    HttpHeaders headers = new HttpHeaders();
    headers.set("Accept", "application/xml");
    headers.set("Content-Type", "application/xml; charset=utf-8");
    headers.set("Authorization", "Basic " + new String(Base64.encodeBase64(StringUtils.getBytesUtf8(apiKey)), "UTF-8"));
    return headers;
  }

}
