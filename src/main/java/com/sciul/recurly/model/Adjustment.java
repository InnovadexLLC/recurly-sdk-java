package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * The Class Adjustment.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
@XmlRootElement(name = "adjustment")
public class Adjustment {

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

  /** The description. */
  @XmlElement
  private String description;

  /** The accounting code. */
  @XmlElement(name = "accounting_code")
  private String accountingCode;

  /** The product code. */
  @XmlElement(name = "product_code")
  private String productCode;

  /** The origin. */
  @XmlElement
  private String origin;

  /** The unit amount in cents. */
  @XmlElement(name = "unit_amount_in_cents")
  private Integer unitAmountInCents;

  /** The quantity. */
  @XmlElement
  private Integer quantity;

  /** The discount in cents. */
  @XmlElement(name = "discount_in_cents")
  private Integer discountInCents;

  /** The tax in cents. */
  @XmlElement(name = "tax_in_cents")
  private Integer taxInCents;

  /** The total in cents. */
  @XmlElement(name = "total_in_cents")
  private Integer totalInCents;

  /** The currency. */
  @XmlElement
  private String currency;

  /** The tax exempt. */
  @XmlElement(name = "tax_exempt")
  private Boolean taxExempt;

  /** The start date. */
  @XmlElement(name = "start_date")
  private StartDate startDate;

  /** The end date. */
  @XmlElement(name = "end_date")
  private EndDate endDate;

  /** The created at. */
  @XmlElement(name = "created_at")
  private CreatedAt createdAt;

  /** The type. */
  @XmlAttribute(name = "type")
  private String type;

  /** The href. */
  @XmlAttribute(name = "href")
  private String href;

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
   * Gets the description.
   * 
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the description.
   * 
   * @param description
   *          the new description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Gets the accounting code.
   * 
   * @return the accounting code
   */
  public String getAccountingCode() {
    return accountingCode;
  }

  /**
   * Sets the accounting code.
   * 
   * @param accountingCode
   *          the new accounting code
   */
  public void setAccountingCode(String accountingCode) {
    this.accountingCode = accountingCode;
  }

  /**
   * Gets the product code.
   * 
   * @return the product code
   */
  public String getProductCode() {
    return productCode;
  }

  /**
   * Sets the product code.
   * 
   * @param productCode
   *          the new product code
   */
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  /**
   * Gets the origin.
   * 
   * @return the origin
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Sets the origin.
   * 
   * @param origin
   *          the new origin
   */
  public void setOrigin(String origin) {
    this.origin = origin;
  }

  /**
   * Gets the unit amount in cents.
   * 
   * @return the unit amount in cents
   */
  public Integer getUnitAmountInCents() {
    return unitAmountInCents;
  }

  /**
   * Sets the unit amount in cents.
   * 
   * @param unitAmountInCents
   *          the new unit amount in cents
   */
  public void setUnitAmountInCents(Integer unitAmountInCents) {
    this.unitAmountInCents = unitAmountInCents;
  }

  /**
   * Gets the quantity.
   * 
   * @return the quantity
   */
  public Integer getQuantity() {
    return quantity;
  }

  /**
   * Sets the quantity.
   * 
   * @param quantity
   *          the new quantity
   */
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * Gets the discount in cents.
   * 
   * @return the discount in cents
   */
  public Integer getDiscountInCents() {
    return discountInCents;
  }

  /**
   * Sets the discount in cents.
   * 
   * @param discountInCents
   *          the new discount in cents
   */
  public void setDiscountInCents(Integer discountInCents) {
    this.discountInCents = discountInCents;
  }

  /**
   * Gets the tax in cents.
   * 
   * @return the tax in cents
   */
  public Integer getTaxInCents() {
    return taxInCents;
  }

  /**
   * Sets the tax in cents.
   * 
   * @param taxInCents
   *          the new tax in cents
   */
  public void setTaxInCents(Integer taxInCents) {
    this.taxInCents = taxInCents;
  }

  /**
   * Gets the total in cents.
   * 
   * @return the total in cents
   */
  public Integer getTotalInCents() {
    return totalInCents;
  }

  /**
   * Sets the total in cents.
   * 
   * @param totalInCents
   *          the new total in cents
   */
  public void setTotalInCents(Integer totalInCents) {
    this.totalInCents = totalInCents;
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
   * Gets the start date.
   * 
   * @return the start date
   */
  public StartDate getStartDate() {
    return startDate;
  }

  /**
   * Sets the start date.
   * 
   * @param startDate
   *          the new start date
   */
  public void setStartDate(StartDate startDate) {
    this.startDate = startDate;
  }

  /**
   * Gets the end date.
   * 
   * @return the end date
   */
  public EndDate getEndDate() {
    return endDate;
  }

  /**
   * Sets the end date.
   * 
   * @param endDate
   *          the new end date
   */
  public void setEndDate(EndDate endDate) {
    this.endDate = endDate;
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
