package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * The Class A.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "value" })
public class A {

  /** The value. */
  @XmlValue
  private String value;

  /** The name. */
  @XmlAttribute(name = "name")
  private String name;

  /** The href. */
  @XmlAttribute(name = "href")
  @XmlSchemaType(name = "anyURI")
  private String href;

  /** The method. */
  @XmlAttribute(name = "method")
  private String method;

  /**
   * Gets the value.
   * 
   * @return the value
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value.
   * 
   * @param value
   *          the new value
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Gets the name.
   * 
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name.
   * 
   * @param name
   *          the new name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the href.
   * 
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Sets the href.
   * 
   * @param href
   *          the new href
   */
  public void setHref(String href) {
    this.href = href;
  }

  /**
   * Gets the method.
   * 
   * @return the method
   */
  public String getMethod() {
    return method;
  }

  /**
   * Sets the method.
   * 
   * @param method
   *          the new method
   */
  public void setMethod(String method) {
    this.method = method;
  }

}
