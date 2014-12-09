package com.sciul.recurly.model.n;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "coupon" })
public class Coupons {
  @XmlElement(required = true)
  private List<Coupon> coupon;
  @XmlAttribute(name = "type")
  private String type;

  public List<Coupon> getCoupon() {
    return coupon;
  }

  public void setCoupon(List<Coupon> coupon) {
    this.coupon = coupon;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
