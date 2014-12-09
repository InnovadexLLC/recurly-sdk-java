package com.sciul.recurly.model.n;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "account", "invoice", "plan", "uuid", "state", "unitAmountInCents", "currency",
    "quantity", "activatedAt", "canceledAt", "expiresAt", "currentPeriodStartedAt", "currentPeriodEndsAt",
    "trialStartedAt", "trialEndsAt", "taxInCents", "taxType", "taxRegion", "taxRate", "poNumber", "netTerms",
    "collectionMethod", "subscriptionAddOns", "a", "planCode" })
@XmlRootElement(name = "subscription")
public class Subscription {

  @XmlElement(required = true)
  private Subscription.Account account;
  @XmlElement(required = true)
  private Invoice invoice;
  @XmlElement(required = true)
  private Plan plan;
  @XmlElement(required = true)
  private String uuid;
  @XmlElement(required = true)
  private String state;
  @XmlElement(name = "unit_amount_in_cents")
  private UnitAmountInCents unitAmountInCents;
  @XmlElement(required = true)
  private String currency;
  @XmlElement(required = true)
  private Quantity quantity;
  @XmlElement(name = "activated_at")
  private ActivatedAt activatedAt;
  @XmlElement(name = "canceled_at")
  private CanceledAt canceledAt;
  @XmlElement(name = "expires_at")
  private ExpiresAt expiresAt;
  @XmlElement(name = "current_period_started_at")
  private CurrentPeriodStartedAt currentPeriodStartedAt;
  @XmlElement(name = "current_period_ends_at")
  private CurrentPeriodEndsAt currentPeriodEndsAt;
  @XmlElement(name = "trial_started_at")
  private TrialStartedAt trialStartedAt;
  @XmlElement(name = "trial_ends_at")
  private TrialEndsAt trialEndsAt;
  @XmlElement(name = "tax_in_cents")
  private TaxInCents taxInCents;
  @XmlElement(name = "tax_type")
  private String taxType;
  @XmlElement(name = "tax_region")
  private String taxRegion;
  @XmlElement(name = "tax_rate")
  private TaxRate taxRate;
  @XmlElement(name = "po_number")
  private PoNumber poNumber;
  @XmlElement(name = "net_terms")
  private NetTerms netTerms;
  @XmlElement(name = "collection_method")
  private String collectionMethod;
  @XmlElement(name = "subscription_add_ons")
  private SubscriptionAddOns subscriptionAddOns;
  @XmlElement
  private List<A> a;
  @XmlAttribute(name = "href")
  private String href;
  @XmlElement(name = "plan_code")
  private String planCode;

  public String getPlanCode() {
    return planCode;
  }

  public void setPlanCode(String planCode) {
    this.planCode = planCode;
  }

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

  public Plan getPlan() {
    return plan;
  }

  public void setPlan(Plan plan) {
    this.plan = plan;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public UnitAmountInCents getUnitAmountInCents() {
    return unitAmountInCents;
  }

  public void setUnitAmountInCents(UnitAmountInCents unitAmountInCents) {
    this.unitAmountInCents = unitAmountInCents;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Quantity getQuantity() {
    return quantity;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public ActivatedAt getActivatedAt() {
    return activatedAt;
  }

  public void setActivatedAt(ActivatedAt activatedAt) {
    this.activatedAt = activatedAt;
  }

  public CanceledAt getCanceledAt() {
    return canceledAt;
  }

  public void setCanceledAt(CanceledAt canceledAt) {
    this.canceledAt = canceledAt;
  }

  public ExpiresAt getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(ExpiresAt expiresAt) {
    this.expiresAt = expiresAt;
  }

  public CurrentPeriodStartedAt getCurrentPeriodStartedAt() {
    return currentPeriodStartedAt;
  }

  public void setCurrentPeriodStartedAt(CurrentPeriodStartedAt currentPeriodStartedAt) {
    this.currentPeriodStartedAt = currentPeriodStartedAt;
  }

  public CurrentPeriodEndsAt getCurrentPeriodEndsAt() {
    return currentPeriodEndsAt;
  }

  public void setCurrentPeriodEndsAt(CurrentPeriodEndsAt currentPeriodEndsAt) {
    this.currentPeriodEndsAt = currentPeriodEndsAt;
  }

  public TrialStartedAt getTrialStartedAt() {
    return trialStartedAt;
  }

  public void setTrialStartedAt(TrialStartedAt trialStartedAt) {
    this.trialStartedAt = trialStartedAt;
  }

  public TrialEndsAt getTrialEndsAt() {
    return trialEndsAt;
  }

  public void setTrialEndsAt(TrialEndsAt trialEndsAt) {
    this.trialEndsAt = trialEndsAt;
  }

  public TaxInCents getTaxInCents() {
    return taxInCents;
  }

  public void setTaxInCents(TaxInCents taxInCents) {
    this.taxInCents = taxInCents;
  }

  public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  public String getTaxRegion() {
    return taxRegion;
  }

  public void setTaxRegion(String taxRegion) {
    this.taxRegion = taxRegion;
  }

  public TaxRate getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(TaxRate taxRate) {
    this.taxRate = taxRate;
  }

  public PoNumber getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(PoNumber poNumber) {
    this.poNumber = poNumber;
  }

  public NetTerms getNetTerms() {
    return netTerms;
  }

  public void setNetTerms(NetTerms netTerms) {
    this.netTerms = netTerms;
  }

  public String getCollectionMethod() {
    return collectionMethod;
  }

  public void setCollectionMethod(String collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  public SubscriptionAddOns getSubscriptionAddOns() {
    return subscriptionAddOns;
  }

  public void setSubscriptionAddOns(SubscriptionAddOns subscriptionAddOns) {
    this.subscriptionAddOns = subscriptionAddOns;
  }

  public List<A> getA() {
    return a;
  }

  public void setA(List<A> a) {
    this.a = a;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = { "accountCode", "email", "firstName", "lastName" })
  public static class Account {

    @XmlElement(name = "account_code")
    protected String accountCode;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(name = "first_name", required = true)
    protected String firstName;
    @XmlElement(name = "last_name", required = true)
    protected String lastName;

    public String getAccountCode() {
      return accountCode;
    }

    public void setAccountCode(String accountCode) {
      this.accountCode = accountCode;
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

  }

}
