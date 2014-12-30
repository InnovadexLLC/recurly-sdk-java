package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Token.
 * 
 * @author GauravChawla
 */
@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "token" })
@XmlRootElement(name = "billing_info")
public class Token {

  /** The token. */
  @XmlElement(name = "token_id")
  private String token;

  /**
   * Gets the token.
   * 
   * @return the token
   */
  public String getToken() {
    return token;
  }

  /**
   * Sets the token.
   * 
   * @param token
   *          the new token
   */
  public void setToken(String token) {
    this.token = token;
  }

}
