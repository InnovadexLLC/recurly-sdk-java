package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "error" })
@XmlRootElement(name = "errors")
public class RecurlyErrors {

  @XmlElement
  protected List<RecurlyError> error;

  public List<RecurlyError> getError() {
    return error;
  }

  public void setError(List<RecurlyError> error) {
    this.error = error;
  }

}