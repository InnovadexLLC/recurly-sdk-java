package com.sciul.recurly.model.n;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "coupon", "account", "singleUse", "totalDiscountedInCents", "currency", "createdAt" })
@XmlRootElement(name = "redemption")
public class Redemption {

  @XmlElement(required = true)
  private Coupon coupon;
  @XmlElement(required = true)
  private Account account;
  @XmlElement(name = "single_use", required = true)
  private SingleUse singleUse;
  @XmlElement(name = "total_discounted_in_cents", required = true)
  private TotalDiscountedInCents totalDiscountedInCents;
  @XmlElement(required = true)
  private String currency;
  @XmlElement(name = "created_at", required = true)
  private CreatedAt createdAt;
  @XmlAttribute(name = "href")
  private String href;

  public Coupon getCoupon() {
    return coupon;
  }

  public void setCoupon(Coupon coupon) {
    this.coupon = coupon;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public SingleUse getSingleUse() {
    return singleUse;
  }

  public void setSingleUse(SingleUse singleUse) {
    this.singleUse = singleUse;
  }

  public TotalDiscountedInCents getTotalDiscountedInCents() {
    return totalDiscountedInCents;
  }

  public void setTotalDiscountedInCents(TotalDiscountedInCents totalDiscountedInCents) {
    this.totalDiscountedInCents = totalDiscountedInCents;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
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