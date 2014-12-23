package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "symbol", "description" })
public class RecurlyError {

  @XmlElement
  protected String symbol;
  @XmlElement
  protected String description;

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String value) {
    this.symbol = value;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String value) {
    this.description = value;
  }

}
