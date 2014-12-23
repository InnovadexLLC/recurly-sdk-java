package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "account", "invoice", "subscription", "uuid", "description", "accountingCode",
    "productCode", "origin", "unitAmountInCents", "quantity", "discountInCents", "taxInCents", "totalInCents",
    "currency", "taxExempt", "startDate", "endDate", "createdAt" })
@XmlRootElement(name = "adjustment")
public class Adjustment {

  @XmlElement
  private Account account;
  @XmlElement
  private Invoice invoice;
  @XmlElement
  private Subscription subscription;
  @XmlElement
  private String uuid;
  @XmlElement
  private String description;
  @XmlElement(name = "accounting_code")
  private AccountingCode accountingCode;
  @XmlElement(name = "product_code")
  private String productCode;
  @XmlElement
  private String origin;
  @XmlElement(name = "unit_amount_in_cents")
  private Integer unitAmountInCents;
  @XmlElement
  private Quantity quantity;
  @XmlElement(name = "discount_in_cents")
  private DiscountInCents discountInCents;
  @XmlElement(name = "tax_in_cents")
  private TaxInCents taxInCents;
  @XmlElement(name = "total_in_cents")
  private TotalInCents totalInCents;
  @XmlElement
  private String currency;
  @XmlElement(name = "tax_exempt")
  private TaxExempt taxExempt;
  @XmlElement(name = "start_date")
  private StartDate startDate;
  @XmlElement(name = "end_date")
  private EndDate endDate;
  @XmlElement(name = "created_at")
  private CreatedAt createdAt;
  @XmlAttribute(name = "type")
  private String type;
  @XmlAttribute(name = "href")
  private String href;

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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountingCode getAccountingCode() {
    return accountingCode;
  }

  public void setAccountingCode(AccountingCode accountingCode) {
    this.accountingCode = accountingCode;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public Integer getUnitAmountInCents() {
    return unitAmountInCents;
  }

  public void setUnitAmountInCents(Integer unitAmountInCents) {
    this.unitAmountInCents = unitAmountInCents;
  }

  public Quantity getQuantity() {
    return quantity;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public DiscountInCents getDiscountInCents() {
    return discountInCents;
  }

  public void setDiscountInCents(DiscountInCents discountInCents) {
    this.discountInCents = discountInCents;
  }

  public TaxInCents getTaxInCents() {
    return taxInCents;
  }

  public void setTaxInCents(TaxInCents taxInCents) {
    this.taxInCents = taxInCents;
  }

  public TotalInCents getTotalInCents() {
    return totalInCents;
  }

  public void setTotalInCents(TotalInCents totalInCents) {
    this.totalInCents = totalInCents;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public TaxExempt getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(TaxExempt taxExempt) {
    this.taxExempt = taxExempt;
  }

  public StartDate getStartDate() {
    return startDate;
  }

  public void setStartDate(StartDate startDate) {
    this.startDate = startDate;
  }

  public EndDate getEndDate() {
    return endDate;
  }

  public void setEndDate(EndDate endDate) {
    this.endDate = endDate;
  }

  public CreatedAt getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(CreatedAt createdAt) {
    this.createdAt = createdAt;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

}
