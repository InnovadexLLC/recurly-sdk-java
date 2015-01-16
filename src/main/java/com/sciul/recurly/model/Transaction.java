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
@XmlType(name = "", propOrder = {})
@XmlRootElement(name = "transaction")
public class Transaction {

  /** The account. */
  @XmlElement
  private Account account;

  /** The invoice. */
  @XmlElement
  private Invoice invoice;

  /** The subscription. */
  @XmlElement
  private Subscription subscription;

  /** The uuid. */
  @XmlElement
  private String uuid;

  /** The action. */
  @XmlElement
  private String action;

  /** The amount in cents. */
  @XmlElement(name = "amount_in_cents")
  private Integer amountInCents;

  /** The tax in cents. */
  @XmlElement(name = "tax_in_cents")
  private Integer taxInCents;

  /** The currency. */
  @XmlElement
  private String currency;

  /** The status. */
  @XmlElement
  private String status;

  /** The payment method. */
  @XmlElement(name = "payment_method")
  private String paymentMethod;

  /** The reference. */
  @XmlElement
  private String reference;

  /** The source. */
  @XmlElement
  private String source;

  /** The recurring. */
  @XmlElement
  private Boolean recurring;

  /** The test. */
  @XmlElement
  private Boolean test;

  /** The voidable. */
  @XmlElement
  private Boolean voidable;

  /** The refundable. */
  @XmlElement
  private Boolean refundable;

  /** The cvv result. */
  @XmlElement(name = "cvv_result")
  private CvvResult cvvResult;

  /** The avs result. */
  @XmlElement(name = "avs_result")
  private AvsResult avsResult;

  /** The avs result street. */
  @XmlElement(name = "avs_result_street")
  private AvsResultStreet avsResultStreet;

  /** The avs result postal. */
  @XmlElement(name = "avs_result_postal")
  private AvsResultPostal avsResultPostal;

  /** The created at. */
  @XmlElement(name = "created_at")
  private CreatedAt createdAt;

  /** The details. */
  @XmlElement
  private Details details;

  /** The a. */
  @XmlElement
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

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  public Subscription getSubscription() {
    return subscription;
  }

  public void setSubscription(Subscription subscription) {
    this.subscription = subscription;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Integer getAmountInCents() {
    return amountInCents;
  }

  public void setAmountInCents(Integer amountInCents) {
    this.amountInCents = amountInCents;
  }

  public Integer getTaxInCents() {
    return taxInCents;
  }

  public void setTaxInCents(Integer taxInCents) {
    this.taxInCents = taxInCents;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Boolean getRecurring() {
    return recurring;
  }

  public void setRecurring(Boolean recurring) {
    this.recurring = recurring;
  }

  public Boolean getTest() {
    return test;
  }

  public void setTest(Boolean test) {
    this.test = test;
  }

  public Boolean getVoidable() {
    return voidable;
  }

  public void setVoidable(Boolean voidable) {
    this.voidable = voidable;
  }

  public Boolean getRefundable() {
    return refundable;
  }

  public void setRefundable(Boolean refundable) {
    this.refundable = refundable;
  }

  public CvvResult getCvvResult() {
    return cvvResult;
  }

  public void setCvvResult(CvvResult cvvResult) {
    this.cvvResult = cvvResult;
  }

  public AvsResult getAvsResult() {
    return avsResult;
  }

  public void setAvsResult(AvsResult avsResult) {
    this.avsResult = avsResult;
  }

  public AvsResultStreet getAvsResultStreet() {
    return avsResultStreet;
  }

  public void setAvsResultStreet(AvsResultStreet avsResultStreet) {
    this.avsResultStreet = avsResultStreet;
  }

  public AvsResultPostal getAvsResultPostal() {
    return avsResultPostal;
  }

  public void setAvsResultPostal(AvsResultPostal avsResultPostal) {
    this.avsResultPostal = avsResultPostal;
  }

  public CreatedAt getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(CreatedAt createdAt) {
    this.createdAt = createdAt;
  }

  public Details getDetails() {
    return details;
  }

  public void setDetails(Details details) {
    this.details = details;
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

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getChargeDescription() {
    return chargeDescription;
  }

  public void setChargeDescription(String chargeDescription) {
    this.chargeDescription = chargeDescription;
  }

  public String getChargeAccountinCode() {
    return chargeAccountinCode;
  }

  public void setChargeAccountinCode(String chargeAccountinCode) {
    this.chargeAccountinCode = chargeAccountinCode;
  }

}
