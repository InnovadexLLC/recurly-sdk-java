package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Coupons.
 * 
 * @author GauravChawla
 */
@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "coupon" })
public class Coupons {

  /** The coupon. */
  @XmlElement(required = true)
  private List<Coupon> coupon;

  /** The type. */
  @XmlAttribute(name = "type")
  private String type;

  /**
   * Gets the coupon.
   * 
   * @return the coupon
   */
  public List<Coupon> getCoupon() {
    return coupon;
  }

  /**
   * Sets the coupon.
   * 
   * @param coupon
   *          the new coupon
   */
  public void setCoupon(List<Coupon> coupon) {
    this.coupon = coupon;
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
