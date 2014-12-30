package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Subscription.
 * 
 * @author GauravChawla
 */
@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "account", "invoice", "plan", "uuid", "state", "unitAmountInCents", "currency",
    "quantity", "activatedAt", "canceledAt", "expiresAt", "currentPeriodStartedAt", "currentPeriodEndsAt",
    "trialStartedAt", "trialEndsAt", "taxInCents", "taxType", "taxRegion", "taxRate", "poNumber", "netTerms",
    "collectionMethod", "subscriptionAddOns", "a", "planCode" })
@XmlRootElement(name = "subscription")
public class Subscription {

  /** The account. */
  @XmlElement(required = true)
  private Subscription.Account account;

  /** The invoice. */
  @XmlElement(required = true)
  private Invoice invoice;

  /** The plan. */
  @XmlElement(required = true)
  private Plan plan;

  /** The uuid. */
  @XmlElement(required = true)
  private String uuid;

  /** The state. */
  @XmlElement(required = true)
  private String state;

  /** The unit amount in cents. */
  @XmlElement(name = "unit_amount_in_cents")
  private UnitAmountInCents unitAmountInCents;

  /** The currency. */
  @XmlElement(required = true)
  private String currency;

  /** The quantity. */
  @XmlElement(required = true)
  private Quantity quantity;

  /** The activated at. */
  @XmlElement(name = "activated_at")
  private ActivatedAt activatedAt;

  /** The canceled at. */
  @XmlElement(name = "canceled_at")
  private CanceledAt canceledAt;

  /** The expires at. */
  @XmlElement(name = "expires_at")
  private ExpiresAt expiresAt;

  /** The current period started at. */
  @XmlElement(name = "current_period_started_at")
  private CurrentPeriodStartedAt currentPeriodStartedAt;

  /** The current period ends at. */
  @XmlElement(name = "current_period_ends_at")
  private CurrentPeriodEndsAt currentPeriodEndsAt;

  /** The trial started at. */
  @XmlElement(name = "trial_started_at")
  private TrialStartedAt trialStartedAt;

  /** The trial ends at. */
  @XmlElement(name = "trial_ends_at")
  private TrialEndsAt trialEndsAt;

  /** The tax in cents. */
  @XmlElement(name = "tax_in_cents")
  private TaxInCents taxInCents;

  /** The tax type. */
  @XmlElement(name = "tax_type")
  private String taxType;

  /** The tax region. */
  @XmlElement(name = "tax_region")
  private String taxRegion;

  /** The tax rate. */
  @XmlElement(name = "tax_rate")
  private TaxRate taxRate;

  /** The po number. */
  @XmlElement(name = "po_number")
  private PoNumber poNumber;

  /** The net terms. */
  @XmlElement(name = "net_terms")
  private NetTerms netTerms;

  /** The collection method. */
  @XmlElement(name = "collection_method")
  private String collectionMethod;

  /** The subscription add ons. */
  @XmlElement(name = "subscription_add_ons")
  private SubscriptionAddOns subscriptionAddOns;

  /** The a. */
  @XmlElement
  private List<A> a;

  /** The href. */
  @XmlAttribute(name = "href")
  private String href;

  /** The plan code. */
  @XmlElement(name = "plan_code")
  private String planCode;

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
   * Gets the plan.
   * 
   * @return the plan
   */
  public Plan getPlan() {
    return plan;
  }

  /**
   * Sets the plan.
   * 
   * @param plan
   *          the new plan
   */
  public void setPlan(Plan plan) {
    this.plan = plan;
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
   * Gets the quantity.
   * 
   * @return the quantity
   */
  public Quantity getQuantity() {
    return quantity;
  }

  /**
   * Sets the quantity.
   * 
   * @param quantity
   *          the new quantity
   */
  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  /**
   * Gets the activated at.
   * 
   * @return the activated at
   */
  public ActivatedAt getActivatedAt() {
    return activatedAt;
  }

  /**
   * Sets the activated at.
   * 
   * @param activatedAt
   *          the new activated at
   */
  public void setActivatedAt(ActivatedAt activatedAt) {
    this.activatedAt = activatedAt;
  }

  /**
   * Gets the canceled at.
   * 
   * @return the canceled at
   */
  public CanceledAt getCanceledAt() {
    return canceledAt;
  }

  /**
   * Sets the canceled at.
   * 
   * @param canceledAt
   *          the new canceled at
   */
  public void setCanceledAt(CanceledAt canceledAt) {
    this.canceledAt = canceledAt;
  }

  /**
   * Gets the expires at.
   * 
   * @return the expires at
   */
  public ExpiresAt getExpiresAt() {
    return expiresAt;
  }

  /**
   * Sets the expires at.
   * 
   * @param expiresAt
   *          the new expires at
   */
  public void setExpiresAt(ExpiresAt expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * Gets the current period started at.
   * 
   * @return the current period started at
   */
  public CurrentPeriodStartedAt getCurrentPeriodStartedAt() {
    return currentPeriodStartedAt;
  }

  /**
   * Sets the current period started at.
   * 
   * @param currentPeriodStartedAt
   *          the new current period started at
   */
  public void setCurrentPeriodStartedAt(CurrentPeriodStartedAt currentPeriodStartedAt) {
    this.currentPeriodStartedAt = currentPeriodStartedAt;
  }

  /**
   * Gets the current period ends at.
   * 
   * @return the current period ends at
   */
  public CurrentPeriodEndsAt getCurrentPeriodEndsAt() {
    return currentPeriodEndsAt;
  }

  /**
   * Sets the current period ends at.
   * 
   * @param currentPeriodEndsAt
   *          the new current period ends at
   */
  public void setCurrentPeriodEndsAt(CurrentPeriodEndsAt currentPeriodEndsAt) {
    this.currentPeriodEndsAt = currentPeriodEndsAt;
  }

  /**
   * Gets the trial started at.
   * 
   * @return the trial started at
   */
  public TrialStartedAt getTrialStartedAt() {
    return trialStartedAt;
  }

  /**
   * Sets the trial started at.
   * 
   * @param trialStartedAt
   *          the new trial started at
   */
  public void setTrialStartedAt(TrialStartedAt trialStartedAt) {
    this.trialStartedAt = trialStartedAt;
  }

  /**
   * Gets the trial ends at.
   * 
   * @return the trial ends at
   */
  public TrialEndsAt getTrialEndsAt() {
    return trialEndsAt;
  }

  /**
   * Sets the trial ends at.
   * 
   * @param trialEndsAt
   *          the new trial ends at
   */
  public void setTrialEndsAt(TrialEndsAt trialEndsAt) {
    this.trialEndsAt = trialEndsAt;
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
   * Gets the tax type.
   * 
   * @return the tax type
   */
  public String getTaxType() {
    return taxType;
  }

  /**
   * Sets the tax type.
   * 
   * @param taxType
   *          the new tax type
   */
  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  /**
   * Gets the tax region.
   * 
   * @return the tax region
   */
  public String getTaxRegion() {
    return taxRegion;
  }

  /**
   * Sets the tax region.
   * 
   * @param taxRegion
   *          the new tax region
   */
  public void setTaxRegion(String taxRegion) {
    this.taxRegion = taxRegion;
  }

  /**
   * Gets the tax rate.
   * 
   * @return the tax rate
   */
  public TaxRate getTaxRate() {
    return taxRate;
  }

  /**
   * Sets the tax rate.
   * 
   * @param taxRate
   *          the new tax rate
   */
  public void setTaxRate(TaxRate taxRate) {
    this.taxRate = taxRate;
  }

  /**
   * Gets the po number.
   * 
   * @return the po number
   */
  public PoNumber getPoNumber() {
    return poNumber;
  }

  /**
   * Sets the po number.
   * 
   * @param poNumber
   *          the new po number
   */
  public void setPoNumber(PoNumber poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * Gets the net terms.
   * 
   * @return the net terms
   */
  public NetTerms getNetTerms() {
    return netTerms;
  }

  /**
   * Sets the net terms.
   * 
   * @param netTerms
   *          the new net terms
   */
  public void setNetTerms(NetTerms netTerms) {
    this.netTerms = netTerms;
  }

  /**
   * Gets the collection method.
   * 
   * @return the collection method
   */
  public String getCollectionMethod() {
    return collectionMethod;
  }

  /**
   * Sets the collection method.
   * 
   * @param collectionMethod
   *          the new collection method
   */
  public void setCollectionMethod(String collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  /**
   * Gets the subscription add ons.
   * 
   * @return the subscription add ons
   */
  public SubscriptionAddOns getSubscriptionAddOns() {
    return subscriptionAddOns;
  }

  /**
   * Sets the subscription add ons.
   * 
   * @param subscriptionAddOns
   *          the new subscription add ons
   */
  public void setSubscriptionAddOns(SubscriptionAddOns subscriptionAddOns) {
    this.subscriptionAddOns = subscriptionAddOns;
  }

  /**
   * Gets the a.
   * 
   * @return the a
   */
  public List<A> getA() {
    return a;
  }

  /**
   * Sets the a.
   * 
   * @param a
   *          the new a
   */
  public void setA(List<A> a) {
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
   * The Class Account.
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = { "accountCode", "email", "firstName", "lastName" })
  public static class Account {

    /** The account code. */
    @XmlElement(name = "account_code")
    protected String accountCode;

    /** The email. */
    @XmlElement(required = true)
    protected String email;

    /** The first name. */
    @XmlElement(name = "first_name", required = true)
    protected String firstName;

    /** The last name. */
    @XmlElement(name = "last_name", required = true)
    protected String lastName;

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

  }

}
