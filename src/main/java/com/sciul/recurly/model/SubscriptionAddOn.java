package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "addOnCode", "quantity", "unitAmountInCents" })
public class SubscriptionAddOn {

  @XmlElement(name = "add_on_code", required = true)
  private String addOnCode;
  private Integer quantity;
  @XmlElement(name = "unit_amount_in_cents")
  private Long unitAmountInCents;

  public String getAddOnCode() {
    return addOnCode;
  }

  public void setAddOnCode(String addOnCode) {
    this.addOnCode = addOnCode;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Long getUnitAmountInCents() {
    return unitAmountInCents;
  }

  public void setUnitAmountInCents(Long unitAmountInCents) {
    this.unitAmountInCents = unitAmountInCents;
  }

}
