package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Plan.
 * 
 * @author GauravChawla
 */
@JsonIgnoreProperties
@XmlRootElement(name = "plan")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "addOns", "planCode", "name", "description", "successUrl", "cancelUrl",
    "displayDonationAmounts", "displayQuantity", "displayPhoneNumber", "bypassHostedConfirmation", "unitName",
    "paymentPageTosLink", "planIntervalLength", "planIntervalUnit", "trialIntervalLength", "trialIntervalUnit",
    "accountingCode", "totalBillingCycles", "createdAt", "taxExempt", "unitAmountInCents", "setupFeeInCents" })
public class Plan {

  /** The add ons. */
  @XmlElement(name = "add_ons", required = true)
  private AddOns addOns;

  /** The plan code. */
  @XmlElement(name = "plan_code", required = true)
  private String planCode;

  /** The name. */
  @XmlElement(required = true)
  private String name;

  /** The description. */
  @XmlElement(required = true)
  private Description description;

  /** The success url. */
  @XmlElement(name = "success_url", required = true)
  private SuccessUrl successUrl;

  /** The cancel url. */
  @XmlElement(name = "cancel_url", required = true)
  private CancelUrl cancelUrl;

  /** The display donation amounts. */
  @XmlElement(name = "display_donation_amounts", required = true)
  private DisplayDonationAmounts displayDonationAmounts;

  /** The display quantity. */
  @XmlElement(name = "display_quantity", required = true)
  private DisplayQuantity displayQuantity;

  /** The display phone number. */
  @XmlElement(name = "display_phone_number", required = true)
  private DisplayPhoneNumber displayPhoneNumber;

  /** The bypass hosted confirmation. */
  @XmlElement(name = "bypass_hosted_confirmation", required = true)
  private BypassHostedConfirmation bypassHostedConfirmation;

  /** The unit name. */
  @XmlElement(name = "unit_name", required = true)
  private String unitName;

  /** The payment page tos link. */
  @XmlElement(name = "payment_page_tos_link", required = true)
  private PaymentPageTosLink paymentPageTosLink;

  /** The plan interval length. */
  @XmlElement(name = "plan_interval_length", required = true)
  private PlanIntervalLength planIntervalLength;

  /** The plan interval unit. */
  @XmlElement(name = "plan_interval_unit", required = true)
  private String planIntervalUnit;

  /** The trial interval length. */
  @XmlElement(name = "trial_interval_length", required = true)
  private TrialIntervalLength trialIntervalLength;

  /** The trial interval unit. */
  @XmlElement(name = "trial_interval_unit", required = true)
  private String trialIntervalUnit;

  /** The accounting code. */
  @XmlElement(name = "accounting_code", required = true)
  private AccountingCode accountingCode;

  /** The total billing cycles. */
  @XmlElement(name = "total_billing_cycles", required = true)
  private TotalBillingCycles totalBillingCycles;

  /** The created at. */
  @XmlElement(name = "created_at", required = true)
  private CreatedAt createdAt;

  /** The tax exempt. */
  @XmlElement(name = "tax_exempt", required = true)
  private TaxExempt taxExempt;

  /** The unit amount in cents. */
  @XmlElement(name = "unit_amount_in_cents", required = true)
  private UnitAmountInCents unitAmountInCents;

  /** The setup fee in cents. */
  @XmlElement(name = "setup_fee_in_cents", required = true)
  private SetupFeeInCents setupFeeInCents;

  /** The href. */
  @XmlAttribute(name = "href")
  private String href;

  /**
   * Gets the adds the ons.
   * 
   * @return the adds the ons
   */
  public AddOns getAddOns() {
    return addOns;
  }

  /**
   * Sets the adds the ons.
   * 
   * @param addOns
   *          the new adds the ons
   */
  public void setAddOns(AddOns addOns) {
    this.addOns = addOns;
  }

  /**
   * Gets the plan code.
   * 
   * @return the plan code
   */
  public String getPlanCode() {
    return planCode;
  }

  /**
   * Sets the plan code.
   * 
   * @param planCode
   *          the new plan code
   */
  public void setPlanCode(String planCode) {
    this.planCode = planCode;
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
   * Gets the description.
   * 
   * @return the description
   */
  public Description getDescription() {
    return description;
  }

  /**
   * Sets the description.
   * 
   * @param description
   *          the new description
   */
  public void setDescription(Description description) {
    this.description = description;
  }

  /**
   * Gets the success url.
   * 
   * @return the success url
   */
  public SuccessUrl getSuccessUrl() {
    return successUrl;
  }

  /**
   * Sets the success url.
   * 
   * @param successUrl
   *          the new success url
   */
  public void setSuccessUrl(SuccessUrl successUrl) {
    this.successUrl = successUrl;
  }

  /**
   * Gets the cancel url.
   * 
   * @return the cancel url
   */
  public CancelUrl getCancelUrl() {
    return cancelUrl;
  }

  /**
   * Sets the cancel url.
   * 
   * @param cancelUrl
   *          the new cancel url
   */
  public void setCancelUrl(CancelUrl cancelUrl) {
    this.cancelUrl = cancelUrl;
  }

  /**
   * Gets the display donation amounts.
   * 
   * @return the display donation amounts
   */
  public DisplayDonationAmounts getDisplayDonationAmounts() {
    return displayDonationAmounts;
  }

  /**
   * Sets the display donation amounts.
   * 
   * @param displayDonationAmounts
   *          the new display donation amounts
   */
  public void setDisplayDonationAmounts(DisplayDonationAmounts displayDonationAmounts) {
    this.displayDonationAmounts = displayDonationAmounts;
  }

  /**
   * Gets the display quantity.
   * 
   * @return the display quantity
   */
  public DisplayQuantity getDisplayQuantity() {
    return displayQuantity;
  }

  /**
   * Sets the display quantity.
   * 
   * @param displayQuantity
   *          the new display quantity
   */
  public void setDisplayQuantity(DisplayQuantity displayQuantity) {
    this.displayQuantity = displayQuantity;
  }

  /**
   * Gets the display phone number.
   * 
   * @return the display phone number
   */
  public DisplayPhoneNumber getDisplayPhoneNumber() {
    return displayPhoneNumber;
  }

  /**
   * Sets the display phone number.
   * 
   * @param displayPhoneNumber
   *          the new display phone number
   */
  public void setDisplayPhoneNumber(DisplayPhoneNumber displayPhoneNumber) {
    this.displayPhoneNumber = displayPhoneNumber;
  }

  /**
   * Gets the bypass hosted confirmation.
   * 
   * @return the bypass hosted confirmation
   */
  public BypassHostedConfirmation getBypassHostedConfirmation() {
    return bypassHostedConfirmation;
  }

  /**
   * Sets the bypass hosted confirmation.
   * 
   * @param bypassHostedConfirmation
   *          the new bypass hosted confirmation
   */
  public void setBypassHostedConfirmation(BypassHostedConfirmation bypassHostedConfirmation) {
    this.bypassHostedConfirmation = bypassHostedConfirmation;
  }

  /**
   * Gets the unit name.
   * 
   * @return the unit name
   */
  public String getUnitName() {
    return unitName;
  }

  /**
   * Sets the unit name.
   * 
   * @param unitName
   *          the new unit name
   */
  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }

  /**
   * Gets the payment page tos link.
   * 
   * @return the payment page tos link
   */
  public PaymentPageTosLink getPaymentPageTosLink() {
    return paymentPageTosLink;
  }

  /**
   * Sets the payment page tos link.
   * 
   * @param paymentPageTosLink
   *          the new payment page tos link
   */
  public void setPaymentPageTosLink(PaymentPageTosLink paymentPageTosLink) {
    this.paymentPageTosLink = paymentPageTosLink;
  }

  /**
   * Gets the plan interval length.
   * 
   * @return the plan interval length
   */
  public PlanIntervalLength getPlanIntervalLength() {
    return planIntervalLength;
  }

  /**
   * Sets the plan interval length.
   * 
   * @param planIntervalLength
   *          the new plan interval length
   */
  public void setPlanIntervalLength(PlanIntervalLength planIntervalLength) {
    this.planIntervalLength = planIntervalLength;
  }

  /**
   * Gets the plan interval unit.
   * 
   * @return the plan interval unit
   */
  public String getPlanIntervalUnit() {
    return planIntervalUnit;
  }

  /**
   * Sets the plan interval unit.
   * 
   * @param planIntervalUnit
   *          the new plan interval unit
   */
  public void setPlanIntervalUnit(String planIntervalUnit) {
    this.planIntervalUnit = planIntervalUnit;
  }

  /**
   * Gets the trial interval length.
   * 
   * @return the trial interval length
   */
  public TrialIntervalLength getTrialIntervalLength() {
    return trialIntervalLength;
  }

  /**
   * Sets the trial interval length.
   * 
   * @param trialIntervalLength
   *          the new trial interval length
   */
  public void setTrialIntervalLength(TrialIntervalLength trialIntervalLength) {
    this.trialIntervalLength = trialIntervalLength;
  }

  /**
   * Gets the trial interval unit.
   * 
   * @return the trial interval unit
   */
  public String getTrialIntervalUnit() {
    return trialIntervalUnit;
  }

  /**
   * Sets the trial interval unit.
   * 
   * @param trialIntervalUnit
   *          the new trial interval unit
   */
  public void setTrialIntervalUnit(String trialIntervalUnit) {
    this.trialIntervalUnit = trialIntervalUnit;
  }

  /**
   * Gets the accounting code.
   * 
   * @return the accounting code
   */
  public AccountingCode getAccountingCode() {
    return accountingCode;
  }

  /**
   * Sets the accounting code.
   * 
   * @param accountingCode
   *          the new accounting code
   */
  public void setAccountingCode(AccountingCode accountingCode) {
    this.accountingCode = accountingCode;
  }

  /**
   * Gets the total billing cycles.
   * 
   * @return the total billing cycles
   */
  public TotalBillingCycles getTotalBillingCycles() {
    return totalBillingCycles;
  }

  /**
   * Sets the total billing cycles.
   * 
   * @param totalBillingCycles
   *          the new total billing cycles
   */
  public void setTotalBillingCycles(TotalBillingCycles totalBillingCycles) {
    this.totalBillingCycles = totalBillingCycles;
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
   * Gets the tax exempt.
   * 
   * @return the tax exempt
   */
  public TaxExempt getTaxExempt() {
    return taxExempt;
  }

  /**
   * Sets the tax exempt.
   * 
   * @param taxExempt
   *          the new tax exempt
   */
  public void setTaxExempt(TaxExempt taxExempt) {
    this.taxExempt = taxExempt;
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
   * Gets the setup fee in cents.
   * 
   * @return the setup fee in cents
   */
  public SetupFeeInCents getSetupFeeInCents() {
    return setupFeeInCents;
  }

  /**
   * Sets the setup fee in cents.
   * 
   * @param setupFeeInCents
   *          the new setup fee in cents
   */
  public void setSetupFeeInCents(SetupFeeInCents setupFeeInCents) {
    this.setupFeeInCents = setupFeeInCents;
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
