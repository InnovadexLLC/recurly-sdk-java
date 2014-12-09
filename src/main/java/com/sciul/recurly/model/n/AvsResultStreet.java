package com.sciul.recurly.model.n;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "value" })
public class AvsResultStreet {

  @XmlValue
  private String value;
  @XmlAttribute(name = "nil")
  private String nil;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getNil() {
    return nil;
  }

  public void setNil(String nil) {
    this.nil = nil;
  }

}
