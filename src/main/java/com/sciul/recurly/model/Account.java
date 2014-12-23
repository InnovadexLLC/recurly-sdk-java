package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "adjustments", "billingInfo", "invoices", "redemption", "subscriptions",
    "transactions", "accountCode", "state", "username", "email", "firstName", "lastName", "companyName", "vatNumber",
    "taxExempt", "address", "acceptLanguage", "hostedLoginToken", "createdAt" })
@XmlRootElement(name = "account")
public class Account {

  @XmlElement
  private Adjustments adjustments;
  @XmlElement(name = "billing_info")
  private BillingInfo billingInfo;
  @XmlElement
  private Invoices invoices;
  @XmlElement
  private Redemption redemption;
  @XmlElement
  private Subscriptions subscriptions;
  @XmlElement
  private Transactions transactions;
  @XmlElement(name = "account_code")
  private String accountCode;
  @XmlElement
  private String state;
  @XmlElement
  private Username username;
  @XmlElement
  private String email;
  @XmlElement(name = "first_name")
  private String firstName;
  @XmlElement(name = "last_name")
  private String lastName;
  @XmlElement(name = "company_name")
  private String companyName;
  @XmlElement(name = "vat_number")
  private VatNumber vatNumber;
  @XmlElement(name = "tax_exempt")
  private TaxExempt taxExempt;
  @XmlElement
  private Address address;
  @XmlElement(name = "accept_language")
  private AcceptLanguage acceptLanguage;
  @XmlElement(name = "hosted_login_token")
  private String hostedLoginToken;
  @XmlElement(name = "created_at")
  private CreatedAt createdAt;
  @XmlAttribute(name = "href")
  private String href;

  public Adjustments getAdjustments() {
    return adjustments;
  }

  public void setAdjustments(Adjustments adjustments) {
    this.adjustments = adjustments;
  }

  public BillingInfo getBillingInfo() {
    return billingInfo;
  }

  public void setBillingInfo(BillingInfo billingInfo) {
    this.billingInfo = billingInfo;
  }

  public Invoices getInvoices() {
    return invoices;
  }

  public void setInvoices(Invoices invoices) {
    this.invoices = invoices;
  }

  public Redemption getRedemption() {
    return redemption;
  }

  public void setRedemption(Redemption redemption) {
    this.redemption = redemption;
  }

  public Subscriptions getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(Subscriptions subscriptions) {
    this.subscriptions = subscriptions;
  }

  public Transactions getTransactions() {
    return transactions;
  }

  public void setTransactions(Transactions transactions) {
    this.transactions = transactions;
  }

  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Username getUsername() {
    return username;
  }

  public void setUsername(Username username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public VatNumber getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(VatNumber vatNumber) {
    this.vatNumber = vatNumber;
  }

  public TaxExempt getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(TaxExempt taxExempt) {
    this.taxExempt = taxExempt;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public AcceptLanguage getAcceptLanguage() {
    return acceptLanguage;
  }

  public void setAcceptLanguage(AcceptLanguage acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
  }

  public String getHostedLoginToken() {
    return hostedLoginToken;
  }

  public void setHostedLoginToken(String hostedLoginToken) {
    this.hostedLoginToken = hostedLoginToken;
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
