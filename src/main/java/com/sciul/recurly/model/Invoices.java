package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "invoice" })
@XmlRootElement(name = "invoices")
public class Invoices {

  @XmlElement(required = true)
  private List<Invoice> invoice;
  @XmlAttribute(name = "type")
  private String type;

  public List<Invoice> getInvoice() {
    return invoice;
  }

  public void setInvoice(List<Invoice> invoice) {
    this.invoice = invoice;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
