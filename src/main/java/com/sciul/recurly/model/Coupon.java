package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Coupon.
 * 
 * @author GauravChawla
 */
@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "redemptions", "couponCode", "name", "state", "discountType", "discountPercent",
    "redeemByDate", "singleUse", "appliesForMonths", "maxRedemptions", "appliesToAllPlans", "createdAt", "planCodes",
    "a" })
public class Coupon {

  /** The redemptions. */
  @XmlElement(required = true)
  private Redemptions redemptions;

  /** The coupon code. */
  @XmlElement(name = "coupon_code", required = true)
  private String couponCode;

  /** The name. */
  @XmlElement(required = true)
  private String name;

  /** The state. */
  @XmlElement(required = true)
  private String state;

  /** The discount type. */
  @XmlElement(name = "discount_type", required = true)
  private String discountType;

  /** The discount percent. */
  @XmlElement(name = "discount_percent", required = true)
  private DiscountPercent discountPercent;

  /** The redeem by date. */
  @XmlElement(name = "redeem_by_date", required = true)
  private RedeemByDate redeemByDate;

  /** The single use. */
  @XmlElement(name = "single_use", required = true)
  private SingleUse singleUse;

  /** The applies for months. */
  @XmlElement(name = "applies_for_months", required = true)
  private AppliesForMonths appliesForMonths;

  /** The max redemptions. */
  @XmlElement(name = "max_redemptions", required = true)
  private MaxRedemptions maxRedemptions;

  /** The applies to all plans. */
  @XmlElement(name = "applies_to_all_plans", required = true)
  private AppliesToAllPlans appliesToAllPlans;

  /** The created at. */
  @XmlElement(name = "created_at", required = true)
  private CreatedAt createdAt;

  /** The plan codes. */
  @XmlElement(name = "plan_codes", required = true)
  private List<PlanCodes> planCodes;

  /** The a. */
  @XmlElement(required = true)
  private A a;

  /** The href. */
  @XmlAttribute(name = "href")
  private String href;

  /**
   * Gets the redemptions.
   * 
   * @return the redemptions
   */
  public Redemptions getRedemptions() {
    return redemptions;
  }

  /**
   * Sets the redemptions.
   * 
   * @param redemptions
   *          the new redemptions
   */
  public void setRedemptions(Redemptions redemptions) {
    this.redemptions = redemptions;
  }

  /**
   * Gets the coupon code.
   * 
   * @return the coupon code
   */
  public String getCouponCode() {
    return couponCode;
  }

  /**
   * Sets the coupon code.
   * 
   * @param couponCode
   *          the new coupon code
   */
  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
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
   * Gets the state.
   * 
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Sets the state.
   * 
   * @param state
   *          the new state
   */
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Gets the discount type.
   * 
   * @return the discount type
   */
  public String getDiscountType() {
    return discountType;
  }

  /**
   * Sets the discount type.
   * 
   * @param discountType
   *          the new discount type
   */
  public void setDiscountType(String discountType) {
    this.discountType = discountType;
  }

  /**
   * Gets the discount percent.
   * 
   * @return the discount percent
   */
  public DiscountPercent getDiscountPercent() {
    return discountPercent;
  }

  /**
   * Sets the discount percent.
   * 
   * @param discountPercent
   *          the new discount percent
   */
  public void setDiscountPercent(DiscountPercent discountPercent) {
    this.discountPercent = discountPercent;
  }

  /**
   * Gets the redeem by date.
   * 
   * @return the redeem by date
   */
  public RedeemByDate getRedeemByDate() {
    return redeemByDate;
  }

  /**
   * Sets the redeem by date.
   * 
   * @param redeemByDate
   *          the new redeem by date
   */
  public void setRedeemByDate(RedeemByDate redeemByDate) {
    this.redeemByDate = redeemByDate;
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
   * Gets the applies for months.
   * 
   * @return the applies for months
   */
  public AppliesForMonths getAppliesForMonths() {
    return appliesForMonths;
  }

  /**
   * Sets the applies for months.
   * 
   * @param appliesForMonths
   *          the new applies for months
   */
  public void setAppliesForMonths(AppliesForMonths appliesForMonths) {
    this.appliesForMonths = appliesForMonths;
  }

  /**
   * Gets the max redemptions.
   * 
   * @return the max redemptions
   */
  public MaxRedemptions getMaxRedemptions() {
    return maxRedemptions;
  }

  /**
   * Sets the max redemptions.
   * 
   * @param maxRedemptions
   *          the new max redemptions
   */
  public void setMaxRedemptions(MaxRedemptions maxRedemptions) {
    this.maxRedemptions = maxRedemptions;
  }

  /**
   * Gets the applies to all plans.
   * 
   * @return the applies to all plans
   */
  public AppliesToAllPlans getAppliesToAllPlans() {
    return appliesToAllPlans;
  }

  /**
   * Sets the applies to all plans.
   * 
   * @param appliesToAllPlans
   *          the new applies to all plans
   */
  public void setAppliesToAllPlans(AppliesToAllPlans appliesToAllPlans) {
    this.appliesToAllPlans = appliesToAllPlans;
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
   * Gets the plan codes.
   * 
   * @return the plan codes
   */
  public List<PlanCodes> getPlanCodes() {
    return planCodes;
  }

  /**
   * Sets the plan codes.
   * 
   * @param planCodes
   *          the new plan codes
   */
  public void setPlanCodes(List<PlanCodes> planCodes) {
    this.planCodes = planCodes;
  }

  /**
   * Gets the a.
   * 
   * @return the a
   */
  public A getA() {
    return a;
  }

  /**
   * Sets the a.
   * 
   * @param a
   *          the new a
   */
  public void setA(A a) {
    this.a = a;
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
