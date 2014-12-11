package com.sciul.recurly.model.n;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "addOnCode", "name", "unitAmountInCents", "createdAt" })
@XmlRootElement(name = "add_on")
public class AddOn {

  @XmlElement(name = "add_on_code")
  protected String addOnCode;
  @XmlElement
  protected String name;
  @XmlElement(name = "unit_amount_in_cents")
  protected UnitAmountInCents unitAmountInCents;
  @XmlElement(name = "created_at")
  protected CreatedAt createdAt;
  @XmlAttribute(name = "href")
  protected String href;

  public String getAddOnCode() {
    return addOnCode;
  }

  public void setAddOnCode(String addOnCode) {
    this.addOnCode = addOnCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UnitAmountInCents getUnitAmountInCents() {
    return unitAmountInCents;
  }

  public void setUnitAmountInCents(UnitAmountInCents unitAmountInCents) {
    this.unitAmountInCents = unitAmountInCents;
  }

  public CreatedAt getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(CreatedAt createdAt) {
    this.createdAt = createdAt;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

}
