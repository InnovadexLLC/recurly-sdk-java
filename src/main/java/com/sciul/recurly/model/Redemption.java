package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class Redemption.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "coupon", "account", "singleUse", "totalDiscountedInCents", "currency", "createdAt" })
@XmlRootElement(name = "redemption")
public class Redemption {

  /** The coupon. */
  @XmlElement(required = true)
  private Coupon coupon;

  /** The account. */
  @XmlElement(required = true)
  private Account account;

  /** The single use. */
  @XmlElement(name = "single_use", required = true)
  private SingleUse singleUse;

  /** The total discounted in cents. */
  @XmlElement(name = "total_discounted_in_cents", required = true)
  private TotalDiscountedInCents totalDiscountedInCents;

  /** The currency. */
  @XmlElement(required = true)
  private String currency;

  /** The created at. */
  @XmlElement(name = "created_at", required = true)
  private CreatedAt createdAt;

  /** The href. */
  @XmlAttribute(name = "href")
  private String href;

  /**
   * Gets the coupon.
   * 
   * @return the coupon
   */
  public Coupon getCoupon() {
    return coupon;
  }

  /**
   * Sets the coupon.
   * 
   * @param coupon
   *          the new coupon
   */
  public void setCoupon(Coupon coupon) {
    this.coupon = coupon;
  }

  /**
   * Gets the account.
   * 
   * @return the account
   */
  public Account getAccount() {
    return account;
  }

  /**
   * Sets the account.
   * 
   * @param account
   *          the new account
   */
  public void setAccount(Account account) {
    this.account = account;
  }

  /**
   * Gets the single use.
   * 
   * @return the single use
   */
  public SingleUse getSingleUse() {
    return singleUse;
  }

  /**
   * Sets the single use.
   * 
   * @param singleUse
   *          the new single use
   */
  public void setSingleUse(SingleUse singleUse) {
    this.singleUse = singleUse;
  }

  /**
   * Gets the total discounted in cents.
   * 
   * @return the total discounted in cents
   */
  public TotalDiscountedInCents getTotalDiscountedInCents() {
    return totalDiscountedInCents;
  }

  /**
   * Sets the total discounted in cents.
   * 
   * @param totalDiscountedInCents
   *          the new total discounted in cents
   */
  public void setTotalDiscountedInCents(TotalDiscountedInCents totalDiscountedInCents) {
    this.totalDiscountedInCents = totalDiscountedInCents;
  }

  /**
   * Gets the currency.
   * 
   * @return the currency
   */
  public String getCurrency() {
    return currency;
  }

  /**
   * Sets the currency.
   * 
   * @param currency
   *          the new currency
   */
  public void setCurrency(String currency) {
    this.currency = currency;
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