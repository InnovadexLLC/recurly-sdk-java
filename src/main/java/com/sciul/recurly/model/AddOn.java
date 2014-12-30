package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class AddOn.
 * 
 * @author GauravChawla
 */
@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "addOnCode", "name", "unitAmountInCents", "createdAt" })
@XmlRootElement(name = "add_on")
public class AddOn {

  /** The add on code. */
  @XmlElement(name = "add_on_code")
  protected String addOnCode;

  /** The name. */
  @XmlElement
  protected String name;

  /** The unit amount in cents. */
  @XmlElement(name = "unit_amount_in_cents")
  protected UnitAmountInCents unitAmountInCents;

  /** The created at. */
  @XmlElement(name = "created_at")
  protected CreatedAt createdAt;

  /** The href. */
  @XmlAttribute(name = "href")
  protected String href;

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
   * Gets the unit amount in cents.
   * 
   * @return the unit amount in cents
   */
  public UnitAmountInCents getUnitAmountInCents() {
    return unitAmountInCents;
  }

  /**
   * Sets the unit amount in cents.
   * 
   * @param unitAmountInCents
   *          the new unit amount in cents
   */
  public void setUnitAmountInCents(UnitAmountInCents unitAmountInCents) {
    this.unitAmountInCents = unitAmountInCents;
  }

  /**
   * Gets the created at.
   * 
   * @return the created at
   */
  public CreatedAt getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the created at.
   * 
   * @param createdAt
   *          the new created at
   */
  public void setCreatedAt(CreatedAt createdAt) {
    this.createdAt = createdAt;
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

}
