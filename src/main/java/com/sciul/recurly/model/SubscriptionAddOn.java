package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class SubscriptionAddOn.
 * 
 * @author GauravChawla
 */
@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "addOnCode", "quantity", "unitAmountInCents" })
public class SubscriptionAddOn {

  /** The add on code. */
  @XmlElement(name = "add_on_code", required = true)
  private String addOnCode;

  /** The quantity. */
  private Integer quantity;

  /** The unit amount in cents. */
  @XmlElement(name = "unit_amount_in_cents")
  private Long unitAmountInCents;

  /**
   * Gets the adds the on code.
   * 
   * @return the adds the on code
   */
  public String getAddOnCode() {
    return addOnCode;
  }

  /**
   * Sets the adds the on code.
   * 
   * @param addOnCode
   *          the new adds the on code
   */
  public void setAddOnCode(String addOnCode) {
    this.addOnCode = addOnCode;
  }

  /**
   * Gets the quantity.
   * 
   * @return the quantity
   */
  public Integer getQuantity() {
    return quantity;
  }

  /**
   * Sets the quantity.
   * 
   * @param quantity
   *          the new quantity
   */
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * Gets the unit amount in cents.
   * 
   * @return the unit amount in cents
   */
  public Long getUnitAmountInCents() {
    return unitAmountInCents;
  }

  /**
   * Sets the unit amount in cents.
   * 
   * @param unitAmountInCents
   *          the new unit amount in cents
   */
  public void setUnitAmountInCents(Long unitAmountInCents) {
    this.unitAmountInCents = unitAmountInCents;
  }

}
