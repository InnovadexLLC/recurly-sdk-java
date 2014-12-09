package com.sciul.recurly.config;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpHeaders;

/**
 * @author gaurav
 */
@Configuration
@PropertySource("classpath:app.props")
public class RecurlyConfiguration {
  private static Logger logger = LoggerFactory.getLogger(RecurlyConfiguration.class);

  @Value("${recurly.key}")
  private String apiKey;

  @Value("${recurly.server.url}")
  private String recurlyServerURL;

  public HttpHeaders getRecurllyHeaders() throws UnsupportedEncodingException {
    HttpHeaders headers = new HttpHeaders();
    headers.set("Accept", "application/xml");
    headers.set("Content-Type", "application/xml; charset=utf-8");
    headers.set("Authorization", "Basic " + new String(Base64.encodeBase64(StringUtils.getBytesUtf8(apiKey)), "UTF-8"));
    headers.set("X-UL-Auth", "test");
    return headers;
  }

  public String getRecurllyServerURL() {
    return recurlyServerURL;
  }

}
