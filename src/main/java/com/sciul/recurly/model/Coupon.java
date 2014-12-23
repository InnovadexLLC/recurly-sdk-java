package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "redemptions", "couponCode", "name", "state", "discountType", "discountPercent",
    "redeemByDate", "singleUse", "appliesForMonths", "maxRedemptions", "appliesToAllPlans", "createdAt", "planCodes",
    "a" })
public class Coupon {

  @XmlElement(required = true)
  private Redemptions redemptions;
  @XmlElement(name = "coupon_code", required = true)
  private String couponCode;
  @XmlElement(required = true)
  private String name;
  @XmlElement(required = true)
  private String state;
  @XmlElement(name = "discount_type", required = true)
  private String discountType;
  @XmlElement(name = "discount_percent", required = true)
  private DiscountPercent discountPercent;
  @XmlElement(name = "redeem_by_date", required = true)
  private RedeemByDate redeemByDate;
  @XmlElement(name = "single_use", required = true)
  private SingleUse singleUse;
  @XmlElement(name = "applies_for_months", required = true)
  private AppliesForMonths appliesForMonths;
  @XmlElement(name = "max_redemptions", required = true)
  private MaxRedemptions maxRedemptions;
  @XmlElement(name = "applies_to_all_plans", required = true)
  private AppliesToAllPlans appliesToAllPlans;
  @XmlElement(name = "created_at", required = true)
  private CreatedAt createdAt;
  @XmlElement(name = "plan_codes", required = true)
  private List<PlanCodes> planCodes;
  @XmlElement(required = true)
  private A a;
  @XmlAttribute(name = "href")
  private String href;

  public Redemptions getRedemptions() {
    return redemptions;
  }

  public void setRedemptions(Redemptions redemptions) {
    this.redemptions = redemptions;
  }

  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getDiscountType() {
    return discountType;
  }

  public void setDiscountType(String discountType) {
    this.discountType = discountType;
  }

  public DiscountPercent getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(DiscountPercent discountPercent) {
    this.discountPercent = discountPercent;
  }

  public RedeemByDate getRedeemByDate() {
    return redeemByDate;
  }

  public void setRedeemByDate(RedeemByDate redeemByDate) {
    this.redeemByDate = redeemByDate;
  }

  public SingleUse getSingleUse() {
    return singleUse;
  }

  public void setSingleUse(SingleUse singleUse) {
    this.singleUse = singleUse;
  }

  public AppliesForMonths getAppliesForMonths() {
    return appliesForMonths;
  }

  public void setAppliesForMonths(AppliesForMonths appliesForMonths) {
    this.appliesForMonths = appliesForMonths;
  }

  public MaxRedemptions getMaxRedemptions() {
    return maxRedemptions;
  }

  public void setMaxRedemptions(MaxRedemptions maxRedemptions) {
    this.maxRedemptions = maxRedemptions;
  }

  public AppliesToAllPlans getAppliesToAllPlans() {
    return appliesToAllPlans;
  }

  public void setAppliesToAllPlans(AppliesToAllPlans appliesToAllPlans) {
    this.appliesToAllPlans = appliesToAllPlans;
  }

  public CreatedAt getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(CreatedAt createdAt) {
    this.createdAt = createdAt;
  }

  public List<PlanCodes> getPlanCodes() {
    return planCodes;
  }

  public void setPlanCodes(List<PlanCodes> planCodes) {
    this.planCodes = planCodes;
  }

  public A getA() {
    return a;
  }

  public void setA(A a) {
    this.a = a;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

}
