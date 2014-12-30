package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * The Class CvvResult.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "value" })
public class CvvResult {

  /** The value. */
  @XmlValue
  private String value;

  /** The code. */
  @XmlAttribute(name = "code")
  private String code;

  /** The nil. */
  @XmlAttribute(name = "nil")
  private String nil;

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
   * Gets the code.
   * 
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Sets the code.
   * 
   * @param code
   *          the new code
   */
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Gets the nil.
   * 
   * @return the nil
   */
  public String getNil() {
    return nil;
  }

  /**
   * Sets the nil.
   * 
   * @param nil
   *          the new nil
   */
  public void setNil(String nil) {
    this.nil = nil;
  }

}
