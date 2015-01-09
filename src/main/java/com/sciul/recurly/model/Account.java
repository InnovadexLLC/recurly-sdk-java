package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Account.
 * 
 * @author GauravChawla
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
@XmlRootElement(name = "account")
public class Account {

  /** The adjustments. */
  @XmlElement
  private Adjustments adjustments;

  /** The billing info. */
  @XmlElement(name = "billing_info")
  private BillingInfo billingInfo;

  /** The invoices. */
  @XmlElement
  private Invoices invoices;

  /** The redemption. */
  @XmlElement
  private Redemption redemption;

  /** The subscriptions. */
  @XmlElement
  private Subscriptions subscriptions;

  /** The transactions. */
  @XmlElement
  private Transactions transactions;

  /** The account code. */
  @XmlElement(name = "account_code")
  private String accountCode;

  /** The state. */
  @XmlElement
  private String state;

  /** The username. */
  @XmlElement
  private Username username;

  /** The email. */
  @XmlElement
  private String email;

  /** The first name. */
  @XmlElement(name = "first_name")
  private String firstName;

  /** The last name. */
  @XmlElement(name = "last_name")
  private String lastName;

  /** The company name. */
  @XmlElement(name = "company_name")
  private String companyName;

  /** The vat number. */
  @XmlElement(name = "vat_number")
  private String vatNumber;

  /** The tax exempt. */
  @XmlElement(name = "tax_exempt")
  private Boolean taxExempt;

  /** The address. */
  @XmlElement
  private Address address;

  /** The accept language. */
  @XmlElement(name = "accept_language")
  private AcceptLanguage acceptLanguage;

  /** The hosted login token. */
  @XmlElement(name = "hosted_login_token")
  private String hostedLoginToken;

  /** The created at. */
  @XmlElement(name = "created_at")
  private CreatedAt createdAt;

  /** The href. */
  @XmlAttribute(name = "href")
  private String href;

  /**
   * Gets the adjustments.
   * 
   * @return the adjustments
   */
  public Adjustments getAdjustments() {
    return adjustments;
  }

  /**
   * Sets the adjustments.
   * 
   * @param adjustments
   *          the new adjustments
   */
  public void setAdjustments(Adjustments adjustments) {
    this.adjustments = adjustments;
  }

  /**
   * Gets the billing info.
   * 
   * @return the billing info
   */
  public BillingInfo getBillingInfo() {
    return billingInfo;
  }

  /**
   * Sets the billing info.
   * 
   * @param billingInfo
   *          the new billing info
   */
  public void setBillingInfo(BillingInfo billingInfo) {
    this.billingInfo = billingInfo;
  }

  /**
   * Gets the invoices.
   * 
   * @return the invoices
   */
  public Invoices getInvoices() {
    return invoices;
  }

  /**
   * Sets the invoices.
   * 
   * @param invoices
   *          the new invoices
   */
  public void setInvoices(Invoices invoices) {
    this.invoices = invoices;
  }

  /**
   * Gets the redemption.
   * 
   * @return the redemption
   */
  public Redemption getRedemption() {
    return redemption;
  }

  /**
   * Sets the redemption.
   * 
   * @param redemption
   *          the new redemption
   */
  public void setRedemption(Redemption redemption) {
    this.redemption = redemption;
  }

  /**
   * Gets the subscriptions.
   * 
   * @return the subscriptions
   */
  public Subscriptions getSubscriptions() {
    return subscriptions;
  }

  /**
   * Sets the subscriptions.
   * 
   * @param subscriptions
   *          the new subscriptions
   */
  public void setSubscriptions(Subscriptions subscriptions) {
    this.subscriptions = subscriptions;
  }

  /**
   * Gets the transactions.
   * 
   * @return the transactions
   */
  public Transactions getTransactions() {
    return transactions;
  }

  /**
   * Sets the transactions.
   * 
   * @param transactions
   *          the new transactions
   */
  public void setTransactions(Transactions transactions) {
    this.transactions = transactions;
  }

  /**
   * Gets the account code.
   * 
   * @return the account code
   */
  public String getAccountCode() {
    return accountCode;
  }

  /**
   * Sets the account code.
   * 
   * @param accountCode
   *          the new account code
   */
  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
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
   * Gets the username.
   * 
   * @return the username
   */
  public Username getUsername() {
    return username;
  }

  /**
   * Sets the username.
   * 
   * @param username
   *          the new username
   */
  public void setUsername(Username username) {
    this.username = username;
  }

  /**
   * Gets the email.
   * 
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Sets the email.
   * 
   * @param email
   *          the new email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Gets the first name.
   * 
   * @return the first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the first name.
   * 
   * @param firstName
   *          the new first name
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Gets the last name.
   * 
   * @return the last name
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets the last name.
   * 
   * @param lastName
   *          the new last name
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Gets the company name.
   * 
   * @return the company name
   */
  public String getCompanyName() {
    return companyName;
  }

  /**
   * Sets the company name.
   * 
   * @param companyName
   *          the new company name
   */
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   * Gets the vat number.
   * 
   * @return the vat number
   */
  public String getVatNumber() {
    return vatNumber;
  }

  /**
   * Sets the vat number.
   * 
   * @param vatNumber
   *          the new vat number
   */
  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  /**
   * Gets the tax exempt.
   * 
   * @return the tax exempt
   */
  public Boolean getTaxExempt() {
    return taxExempt;
  }

  /**
   * Sets the tax exempt.
   * 
   * @param taxExempt
   *          the new tax exempt
   */
  public void setTaxExempt(Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  /**
   * Gets the address.
   * 
   * @return the address
   */
  public Address getAddress() {
    return address;
  }

  /**
   * Sets the address.
   * 
   * @param address
   *          the new address
   */
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   * Gets the accept language.
   * 
   * @return the accept language
   */
  public AcceptLanguage getAcceptLanguage() {
    return acceptLanguage;
  }

  /**
   * Sets the accept language.
   * 
   * @param acceptLanguage
   *          the new accept language
   */
  public void setAcceptLanguage(AcceptLanguage acceptLanguage) {
    this.acceptLanguage = acceptLanguage;
  }

  /**
   * Gets the hosted login token.
   * 
   * @return the hosted login token
   */
  public String getHostedLoginToken() {
    return hostedLoginToken;
  }

  /**
   * Sets the hosted login token.
   * 
   * @param hostedLoginToken
   *          the new hosted login token
   */
  public void setHostedLoginToken(String hostedLoginToken) {
    this.hostedLoginToken = hostedLoginToken;
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
