package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "account", "invoice", "subscription", "uuid", "action", "amountInCents",
    "taxInCents", "currency", "status", "paymentMethod", "reference", "source", "recurring", "test", "voidable",
    "refundable", "cvvResult", "avsResult", "avsResultStreet", "avsResultPostal", "createdAt", "details", "a",
    "chargeDescription", "chargeAccountinCode" })
@XmlRootElement(name = "transaction")
public class Transaction {

  @XmlElement(required = true)
  private Account account;
  @XmlElement(required = true)
  private Invoice invoice;
  @XmlElement(required = true)
  private Subscription subscription;
  @XmlElement(required = true)
  private String uuid;
  @XmlElement(required = true)
  private String action;
  @XmlElement(name = "amount_in_cents", required = true)
  private AmountInCents amountInCents;
  @XmlElement(name = "tax_in_cents", required = true)
  private TaxInCents taxInCents;
  @XmlElement(required = true)
  private String currency;
  @XmlElement(required = true)
  private String status;
  @XmlElement(name = "payment_method", required = true)
  private String paymentMethod;
  @XmlElement(required = true)
  private Reference reference;
  @XmlElement(required = true)
  private String source;
  @XmlElement(required = true)
  private Recurring recurring;
  @XmlElement(required = true)
  private Test test;
  @XmlElement(required = true)
  private Voidable voidable;
  @XmlElement(required = true)
  private Refundable refundable;
  @XmlElement(name = "cvv_result", required = true)
  private CvvResult cvvResult;
  @XmlElement(name = "avs_result", required = true)
  private AvsResult avsResult;
  @XmlElement(name = "avs_result_street", required = true)
  private AvsResultStreet avsResultStreet;
  @XmlElement(name = "avs_result_postal", required = true)
  private AvsResultPostal avsResultPostal;
  @XmlElement(name = "created_at", required = true)
  private CreatedAt createdAt;
  @XmlElement(required = true)
  private Details details;
  @XmlElement(required = true)
  private A a;
  @XmlAttribute(name = "href")
  private String href;
  @XmlAttribute(name = "type")
  private String type;
  @XmlAttribute(name = "charge_description")
  private String chargeDescription;
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

  public AmountInCents getAmountInCents() {
    return amountInCents;
  }

  public void setAmountInCents(AmountInCents amountInCents) {
    this.amountInCents = amountInCents;
  }

  public TaxInCents getTaxInCents() {
    return taxInCents;
  }

  public void setTaxInCents(TaxInCents taxInCents) {
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

  public Reference getReference() {
    return reference;
  }

  public void setReference(Reference reference) {
    this.reference = reference;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Recurring getRecurring() {
    return recurring;
  }

  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }

  public Test getTest() {
    return test;
  }

  public void setTest(Test test) {
    this.test = test;
  }

  public Voidable getVoidable() {
    return voidable;
  }

  public void setVoidable(Voidable voidable) {
    this.voidable = voidable;
  }

  public Refundable getRefundable() {
    return refundable;
  }

  public void setRefundable(Refundable refundable) {
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
