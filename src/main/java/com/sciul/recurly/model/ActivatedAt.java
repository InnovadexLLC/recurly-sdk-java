package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * The Class ActivatedAt.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "value" })
public class ActivatedAt {

  /** The value. */
  @XmlValue
  @XmlSchemaType(name = "dateTime")
  private XMLGregorianCalendar value;

  /** The type. */
  @XmlAttribute(name = "type")
  private String type;

  /**
   * Gets the value.
   * 
   * @return the value
   */
  public XMLGregorianCalendar getValue() {
    return value;
  }

  /**
   * Sets the value.
   * 
   * @param value
   *          the new value
   */
  public void setValue(XMLGregorianCalendar value) {
    this.value = value;
  }

  /**
   * Gets the type.
   * 
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the type.
   * 
   * @param type
   *          the new type
   */
  public void setType(String type) {
    this.type = type;
  }

}
