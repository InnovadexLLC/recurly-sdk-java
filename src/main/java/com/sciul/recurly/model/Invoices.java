package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Invoices.
 * 
 * @author GauravChawla
 */
@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "invoice" })
@XmlRootElement(name = "invoices")
public class Invoices {

  /** The invoice. */
  @XmlElement(required = true)
  private List<Invoice> invoice;

  /** The type. */
  @XmlAttribute(name = "type")
  private String type;

  /**
   * Gets the invoice.
   * 
   * @return the invoice
   */
  public List<Invoice> getInvoice() {
    return invoice;
  }

  /**
   * Sets the invoice.
   * 
   * @param invoice
   *          the new invoice
   */
  public void setInvoice(List<Invoice> invoice) {
    this.invoice = invoice;
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
