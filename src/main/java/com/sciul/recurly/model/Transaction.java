package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class Transaction.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "account", "invoice", "subscription", "uuid", "action", "amountInCents",
    "taxInCents", "currency", "status", "paymentMethod", "reference", "source", "recurring", "test", "voidable",
    "refundable", "cvvResult", "avsResult", "avsResultStreet", "avsResultPostal", "createdAt", "details", "a",
    "chargeDescription", "chargeAccountinCode" })
@XmlRootElement(name = "transaction")
public class Transaction {

  /** The account. */
  @XmlElement(required = true)
  private Account account;

  /** The invoice. */
  @XmlElement(required = true)
  private Invoice invoice;

  /** The subscription. */
  @XmlElement(required = true)
  private Subscription subscription;

  /** The uuid. */
  @XmlElement(required = true)
  private String uuid;

  /** The action. */
  @XmlElement(required = true)
  private String action;

  /** The amount in cents. */
  @XmlElement(name = "amount_in_cents", required = true)
  private AmountInCents amountInCents;

  /** The tax in cents. */
  @XmlElement(name = "tax_in_cents", required = true)
  private TaxInCents taxInCents;

  /** The currency. */
  @XmlElement(required = true)
  private String currency;

  /** The status. */
  @XmlElement(required = true)
  private String status;

  /** The payment method. */
  @XmlElement(name = "payment_method", required = true)
  private String paymentMethod;

  /** The reference. */
  @XmlElement(required = true)
  private Reference reference;

  /** The source. */
  @XmlElement(required = true)
  private String source;

  /** The recurring. */
  @XmlElement(required = true)
  private Recurring recurring;

  /** The test. */
  @XmlElement(required = true)
  private Test test;

  /** The voidable. */
  @XmlElement(required = true)
  private Voidable voidable;

  /** The refundable. */
  @XmlElement(required = true)
  private Refundable refundable;

  /** The cvv result. */
  @XmlElement(name = "cvv_result", required = true)
  private CvvResult cvvResult;

  /** The avs result. */
  @XmlElement(name = "avs_result", required = true)
  private AvsResult avsResult;

  /** The avs result street. */
  @XmlElement(name = "avs_result_street", required = true)
  private AvsResultStreet avsResultStreet;

  /** The avs result postal. */
  @XmlElement(name = "avs_result_postal", required = true)
  private AvsResultPostal avsResultPostal;

  /** The created at. */
  @XmlElement(name = "created_at", required = true)
  private CreatedAt createdAt;

  /** The details. */
  @XmlElement(required = true)
  private Details details;

  /** The a. */
  @XmlElement(required = true)
  private A a;

  /** The href. */
  @XmlAttribute(name = "href")
  private String href;

  /** The type. */
  @XmlAttribute(name = "type")
  private String type;

  /** The charge description. */
  @XmlAttribute(name = "charge_description")
  private String chargeDescription;

  /** The charge accountin code. */
  @XmlAttribute(name = "charge_accounting_code")
  private String chargeAccountinCode;

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
   * Gets the invoice.
   * 
   * @return the invoice
   */
  public Invoice getInvoice() {
    return invoice;
  }

  /**
   * Sets the invoice.
   * 
   * @param invoice
   *          the new invoice
   */
  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  /**
   * Gets the subscription.
   * 
   * @return the subscription
   */
  public Subscription getSubscription() {
    return subscription;
  }

  /**
   * Sets the subscription.
   * 
   * @param subscription
   *          the new subscription
   */
  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }

  /**
   * Gets the uuid.
   * 
   * @return the uuid
   */
  public String getUuid() {
    return uuid;
  }

  /**
   * Sets the uuid.
   * 
   * @param uuid
   *          the new uuid
   */
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * Gets the action.
   * 
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Sets the action.
   * 
   * @param action
   *          the new action
   */
  public void setAction(String action) {
    this.action = action;
  }

  /**
   * Gets the amount in cents.
   * 
   * @return the amount in cents
   */
  public AmountInCents getAmountInCents() {
    return amountInCents;
  }

  /**
   * Sets the amount in cents.
   * 
   * @param amountInCents
   *          the new amount in cents
   */
  public void setAmountInCents(AmountInCents amountInCents) {
    this.amountInCents = amountInCents;
  }

  /**
   * Gets the tax in cents.
   * 
   * @return the tax in cents
   */
  public TaxInCents getTaxInCents() {
    return taxInCents;
  }

  /**
   * Sets the tax in cents.
   * 
   * @param taxInCents
   *          the new tax in cents
   */
  public void setTaxInCents(TaxInCents taxInCents) {
    this.taxInCents = taxInCents;
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
   * Gets the status.
   * 
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Sets the status.
   * 
   * @param status
   *          the new status
   */
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Gets the payment method.
   * 
   * @return the payment method
   */
  public String getPaymentMethod() {
    return paymentMethod;
  }

  /**
   * Sets the payment method.
   * 
   * @param paymentMethod
   *          the new payment method
   */
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /**
   * Gets the reference.
   * 
   * @return the reference
   */
  public Reference getReference() {
    return reference;
  }

  /**
   * Sets the reference.
   * 
   * @param reference
   *          the new reference
   */
  public void setReference(Reference reference) {
    this.reference = reference;
  }

  /**
   * Gets the source.
   * 
   * @return the source
   */
  public String getSource() {
    return source;
  }

  /**
   * Sets the source.
   * 
   * @param source
   *          the new source
   */
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * Gets the recurring.
   * 
   * @return the recurring
   */
  public Recurring getRecurring() {
    return recurring;
  }

  /**
   * Sets the recurring.
   * 
   * @param recurring
   *          the new recurring
   */
  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }

  /**
   * Gets the test.
   * 
   * @return the test
   */
  public Test getTest() {
    return test;
  }

  /**
   * Sets the test.
   * 
   * @param test
   *          the new test
   */
  public void setTest(Test test) {
    this.test = test;
  }

  /**
   * Gets the voidable.
   * 
   * @return the voidable
   */
  public Voidable getVoidable() {
    return voidable;
  }

  /**
   * Sets the voidable.
   * 
   * @param voidable
   *          the new voidable
   */
  public void setVoidable(Voidable voidable) {
    this.voidable = voidable;
  }

  /**
   * Gets the refundable.
   * 
   * @return the refundable
   */
  public Refundable getRefundable() {
    return refundable;
  }

  /**
   * Sets the refundable.
   * 
   * @param refundable
   *          the new refundable
   */
  public void setRefundable(Refundable refundable) {
    this.refundable = refundable;
  }

  /**
   * Gets the cvv result.
   * 
   * @return the cvv result
   */
  public CvvResult getCvvResult() {
    return cvvResult;
  }

  /**
   * Sets the cvv result.
   * 
   * @param cvvResult
   *          the new cvv result
   */
  public void setCvvResult(CvvResult cvvResult) {
    this.cvvResult = cvvResult;
  }

  /**
   * Gets the avs result.
   * 
   * @return the avs result
   */
  public AvsResult getAvsResult() {
    return avsResult;
  }

  /**
   * Sets the avs result.
   * 
   * @param avsResult
   *          the new avs result
   */
  public void setAvsResult(AvsResult avsResult) {
    this.avsResult = avsResult;
  }

  /**
   * Gets the avs result street.
   * 
   * @return the avs result street
   */
  public AvsResultStreet getAvsResultStreet() {
    return avsResultStreet;
  }

  /**
   * Sets the avs result street.
   * 
   * @param avsResultStreet
   *          the new avs result street
   */
  public void setAvsResultStreet(AvsResultStreet avsResultStreet) {
    this.avsResultStreet = avsResultStreet;
  }

  /**
   * Gets the avs result postal.
   * 
   * @return the avs result postal
   */
  public AvsResultPostal getAvsResultPostal() {
    return avsResultPostal;
  }

  /**
   * Sets the avs result postal.
   * 
   * @param avsResultPostal
   *          the new avs result postal
   */
  public void setAvsResultPostal(AvsResultPostal avsResultPostal) {
    this.avsResultPostal = avsResultPostal;
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
   * Gets the details.
   * 
   * @return the details
   */
  public Details getDetails() {
    return details;
  }

  /**
   * Sets the details.
   * 
   * @param details
   *          the new details
   */
  public void setDetails(Details details) {
    this.details = details;
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

  /**
   * Gets the charge description.
   * 
   * @return the charge description
   */
  public String getChargeDescription() {
    return chargeDescription;
  }

  /**
   * Sets the charge description.
   * 
   * @param chargeDescription
   *          the new charge description
   */
  public void setChargeDescription(String chargeDescription) {
    this.chargeDescription = chargeDescription;
  }

  /**
   * Gets the charge accountin code.
   * 
   * @return the charge accountin code
   */
  public String getChargeAccountinCode() {
    return chargeAccountinCode;
  }

  /**
   * Sets the charge accountin code.
   * 
   * @param chargeAccountinCode
   *          the new charge accountin code
   */
  public void setChargeAccountinCode(String chargeAccountinCode) {
    this.chargeAccountinCode = chargeAccountinCode;
  }

}
