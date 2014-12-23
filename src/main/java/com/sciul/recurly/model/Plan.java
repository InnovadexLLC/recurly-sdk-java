package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@XmlRootElement(name = "plan")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "addOns", "planCode", "name", "description", "successUrl", "cancelUrl",
    "displayDonationAmounts", "displayQuantity", "displayPhoneNumber", "bypassHostedConfirmation", "unitName",
    "paymentPageTosLink", "planIntervalLength", "planIntervalUnit", "trialIntervalLength", "trialIntervalUnit",
    "accountingCode", "totalBillingCycles", "createdAt", "taxExempt", "unitAmountInCents", "setupFeeInCents" })
public class Plan {

  @XmlElement(name = "add_ons", required = true)
  private AddOns addOns;
  @XmlElement(name = "plan_code", required = true)
  private String planCode;
  @XmlElement(required = true)
  private String name;
  @XmlElement(required = true)
  private Description description;
  @XmlElement(name = "success_url", required = true)
  private SuccessUrl successUrl;
  @XmlElement(name = "cancel_url", required = true)
  private CancelUrl cancelUrl;
  @XmlElement(name = "display_donation_amounts", required = true)
  private DisplayDonationAmounts displayDonationAmounts;
  @XmlElement(name = "display_quantity", required = true)
  private DisplayQuantity displayQuantity;
  @XmlElement(name = "display_phone_number", required = true)
  private DisplayPhoneNumber displayPhoneNumber;
  @XmlElement(name = "bypass_hosted_confirmation", required = true)
  private BypassHostedConfirmation bypassHostedConfirmation;
  @XmlElement(name = "unit_name", required = true)
  private String unitName;
  @XmlElement(name = "payment_page_tos_link", required = true)
  private PaymentPageTosLink paymentPageTosLink;
  @XmlElement(name = "plan_interval_length", required = true)
  private PlanIntervalLength planIntervalLength;
  @XmlElement(name = "plan_interval_unit", required = true)
  private String planIntervalUnit;
  @XmlElement(name = "trial_interval_length", required = true)
  private TrialIntervalLength trialIntervalLength;
  @XmlElement(name = "trial_interval_unit", required = true)
  private String trialIntervalUnit;
  @XmlElement(name = "accounting_code", required = true)
  private AccountingCode accountingCode;
  @XmlElement(name = "total_billing_cycles", required = true)
  private TotalBillingCycles totalBillingCycles;
  @XmlElement(name = "created_at", required = true)
  private CreatedAt createdAt;
  @XmlElement(name = "tax_exempt", required = true)
  private TaxExempt taxExempt;
  @XmlElement(name = "unit_amount_in_cents", required = true)
  private UnitAmountInCents unitAmountInCents;
  @XmlElement(name = "setup_fee_in_cents", required = true)
  private SetupFeeInCents setupFeeInCents;
  @XmlAttribute(name = "href")
  private String href;

  public AddOns getAddOns() {
    return addOns;
  }

  public void setAddOns(AddOns addOns) {
    this.addOns = addOns;
  }

  public String getPlanCode() {
    return planCode;
  }

  public void setPlanCode(String planCode) {
    this.planCode = planCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Description getDescription() {
    return description;
  }

  public void setDescription(Description description) {
    this.description = description;
  }

  public SuccessUrl getSuccessUrl() {
    return successUrl;
  }

  public void setSuccessUrl(SuccessUrl successUrl) {
    this.successUrl = successUrl;
  }

  public CancelUrl getCancelUrl() {
    return cancelUrl;
  }

  public void setCancelUrl(CancelUrl cancelUrl) {
    this.cancelUrl = cancelUrl;
  }

  public DisplayDonationAmounts getDisplayDonationAmounts() {
    return displayDonationAmounts;
  }

  public void setDisplayDonationAmounts(DisplayDonationAmounts displayDonationAmounts) {
    this.displayDonationAmounts = displayDonationAmounts;
  }

  public DisplayQuantity getDisplayQuantity() {
    return displayQuantity;
  }

  public void setDisplayQuantity(DisplayQuantity displayQuantity) {
    this.displayQuantity = displayQuantity;
  }

  public DisplayPhoneNumber getDisplayPhoneNumber() {
    return displayPhoneNumber;
  }

  public void setDisplayPhoneNumber(DisplayPhoneNumber displayPhoneNumber) {
    this.displayPhoneNumber = displayPhoneNumber;
  }

  public BypassHostedConfirmation getBypassHostedConfirmation() {
    return bypassHostedConfirmation;
  }

  public void setBypassHostedConfirmation(BypassHostedConfirmation bypassHostedConfirmation) {
    this.bypassHostedConfirmation = bypassHostedConfirmation;
  }

  public String getUnitName() {
    return unitName;
  }

  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }

  public PaymentPageTosLink getPaymentPageTosLink() {
    return paymentPageTosLink;
  }

  public void setPaymentPageTosLink(PaymentPageTosLink paymentPageTosLink) {
    this.paymentPageTosLink = paymentPageTosLink;
  }

  public PlanIntervalLength getPlanIntervalLength() {
    return planIntervalLength;
  }

  public void setPlanIntervalLength(PlanIntervalLength planIntervalLength) {
    this.planIntervalLength = planIntervalLength;
  }

  public String getPlanIntervalUnit() {
    return planIntervalUnit;
  }

  public void setPlanIntervalUnit(String planIntervalUnit) {
    this.planIntervalUnit = planIntervalUnit;
  }

  public TrialIntervalLength getTrialIntervalLength() {
    return trialIntervalLength;
  }

  public void setTrialIntervalLength(TrialIntervalLength trialIntervalLength) {
    this.trialIntervalLength = trialIntervalLength;
  }

  public String getTrialIntervalUnit() {
    return trialIntervalUnit;
  }

  public void setTrialIntervalUnit(String trialIntervalUnit) {
    this.trialIntervalUnit = trialIntervalUnit;
  }

  public AccountingCode getAccountingCode() {
    return accountingCode;
  }

  public void setAccountingCode(AccountingCode accountingCode) {
    this.accountingCode = accountingCode;
  }

  public TotalBillingCycles getTotalBillingCycles() {
    return totalBillingCycles;
  }

  public void setTotalBillingCycles(TotalBillingCycles totalBillingCycles) {
    this.totalBillingCycles = totalBillingCycles;
  }

  public CreatedAt getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(CreatedAt createdAt) {
    this.createdAt = createdAt;
  }

  public TaxExempt getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(TaxExempt taxExempt) {
    this.taxExempt = taxExempt;
  }

  public UnitAmountInCents getUnitAmountInCents() {
    return unitAmountInCents;
  }

  public void setUnitAmountInCents(UnitAmountInCents unitAmountInCents) {
    this.unitAmountInCents = unitAmountInCents;
  }

  public SetupFeeInCents getSetupFeeInCents() {
    return setupFeeInCents;
  }

  public void setSetupFeeInCents(SetupFeeInCents setupFeeInCents) {
    this.setupFeeInCents = setupFeeInCents;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }
}
