package com.sciul.recurly.model.n;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "account", "subscription", "uuid", "state", "invoiceNumber", "poNumber", "vatNumber",
    "subtotalInCents", "taxInCents", "totalInCents", "currency", "createdAt", "closedAt", "taxType", "taxRegion",
    "taxRate", "netTerms", "collectionMethod", "redemption", "lineItems", "transactions" })
@XmlRootElement(name = "invoice")
public class Invoice {

  @XmlElement(required = true)
  private Account account;
  @XmlElement(required = true)
  private Subscription subscription;
  @XmlElement(required = true)
  private String uuid;
  @XmlElement(required = true)
  private String state;
  @XmlElement(name = "invoice_number")
  private InvoiceNumber invoiceNumber;
  @XmlElement(name = "po_number")
  private PoNumber poNumber;
  @XmlElement(name = "vat_number")
  private VatNumber vatNumber;
  @XmlElement(name = "subtotal_in_cents")
  private SubtotalInCents subtotalInCents;
  @XmlElement(name = "tax_in_cents")
  private TaxInCents taxInCents;
  @XmlElement(name = "total_in_cents")
  private TotalInCents totalInCents;
  @XmlElement(name = "currency")
  private String currency;
  @XmlElement(name = "created_at")
  private CreatedAt createdAt;
  @XmlElement(name = "closed_at")
  private ClosedAt closedAt;
  @XmlElement(name = "tax_type")
  private String taxType;
  @XmlElement(name = "tax_region")
  private String taxRegion;
  @XmlElement(name = "tax_rate")
  private TaxRate taxRate;
  @XmlElement(name = "net_terms")
  private NetTerms netTerms;
  @XmlElement(name = "collection_method")
  private String collectionMethod;
  @XmlElement(name = "redemption")
  private Redemption redemption;
  @XmlElement(name = "line_items")
  private LineItems lineItems;
  @XmlElement(name = "transactions")
  private Transactions transactions;
  @XmlAttribute(name = "href")
  private String href;

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
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

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public InvoiceNumber getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(InvoiceNumber invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public PoNumber getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(PoNumber poNumber) {
    this.poNumber = poNumber;
  }

  public VatNumber getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(VatNumber vatNumber) {
    this.vatNumber = vatNumber;
  }

  public SubtotalInCents getSubtotalInCents() {
    return subtotalInCents;
  }

  public void setSubtotalInCents(SubtotalInCents subtotalInCents) {
    this.subtotalInCents = subtotalInCents;
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

  public CreatedAt getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(CreatedAt createdAt) {
    this.createdAt = createdAt;
  }

  public ClosedAt getClosedAt() {
    return closedAt;
  }

  public void setClosedAt(ClosedAt closedAt) {
    this.closedAt = closedAt;
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

  public Redemption getRedemption() {
    return redemption;
  }

  public void setRedemption(Redemption redemption) {
    this.redemption = redemption;
  }

  public LineItems getLineItems() {
    return lineItems;
  }

  public void setLineItems(LineItems lineItems) {
    this.lineItems = lineItems;
  }

  public Transactions getTransactions() {
    return transactions;
  }

  public void setTransactions(Transactions transactions) {
    this.transactions = transactions;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

}
