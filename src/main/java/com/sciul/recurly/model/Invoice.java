package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class Invoice.
 * 
 * @author GauravChawla
 */
@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "account", "subscription", "uuid", "state", "invoiceNumber", "poNumber", "vatNumber",
    "subtotalInCents", "taxInCents", "totalInCents", "currency", "createdAt", "closedAt", "taxType", "taxRegion",
    "taxRate", "netTerms", "collectionMethod", "redemption", "lineItems", "transactions" })
@XmlRootElement(name = "invoice")
public class Invoice {

  /** The account. */
  @XmlElement(required = true)
  private Account account;

  /** The subscription. */
  @XmlElement(required = true)
  private Subscription subscription;

  /** The uuid. */
  @XmlElement(required = true)
  private String uuid;

  /** The state. */
  @XmlElement(required = true)
  private String state;

  /** The invoice number. */
  @XmlElement(name = "invoice_number")
  private InvoiceNumber invoiceNumber;

  /** The po number. */
  @XmlElement(name = "po_number")
  private PoNumber poNumber;

  /** The vat number. */
  @XmlElement(name = "vat_number")
  private VatNumber vatNumber;

  /** The subtotal in cents. */
  @XmlElement(name = "subtotal_in_cents")
  private SubtotalInCents subtotalInCents;

  /** The tax in cents. */
  @XmlElement(name = "tax_in_cents")
  private TaxInCents taxInCents;

  /** The total in cents. */
  @XmlElement(name = "total_in_cents")
  private TotalInCents totalInCents;

  /** The currency. */
  @XmlElement(name = "currency")
  private String currency;

  /** The created at. */
  @XmlElement(name = "created_at")
  private CreatedAt createdAt;

  /** The closed at. */
  @XmlElement(name = "closed_at")
  private ClosedAt closedAt;

  /** The tax type. */
  @XmlElement(name = "tax_type")
  private String taxType;

  /** The tax region. */
  @XmlElement(name = "tax_region")
  private String taxRegion;

  /** The tax rate. */
  @XmlElement(name = "tax_rate")
  private TaxRate taxRate;

  /** The net terms. */
  @XmlElement(name = "net_terms")
  private NetTerms netTerms;

  /** The collection method. */
  @XmlElement(name = "collection_method")
  private String collectionMethod;

  /** The redemption. */
  @XmlElement(name = "redemption")
  private Redemption redemption;

  /** The line items. */
  @XmlElement(name = "line_items")
  private LineItems lineItems;

  /** The transactions. */
  @XmlElement(name = "transactions")
  private Transactions transactions;

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
   * Gets the invoice number.
   * 
   * @return the invoice number
   */
  public InvoiceNumber getInvoiceNumber() {
    return invoiceNumber;
  }

  /**
   * Sets the invoice number.
   * 
   * @param invoiceNumber
   *          the new invoice number
   */
  public void setInvoiceNumber(InvoiceNumber invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
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
   * Gets the vat number.
   * 
   * @return the vat number
   */
  public VatNumber getVatNumber() {
    return vatNumber;
  }

  /**
   * Sets the vat number.
   * 
   * @param vatNumber
   *          the new vat number
   */
  public void setVatNumber(VatNumber vatNumber) {
    this.vatNumber = vatNumber;
  }

  /**
   * Gets the subtotal in cents.
   * 
   * @return the subtotal in cents
   */
  public SubtotalInCents getSubtotalInCents() {
    return subtotalInCents;
  }

  /**
   * Sets the subtotal in cents.
   * 
   * @param subtotalInCents
   *          the new subtotal in cents
   */
  public void setSubtotalInCents(SubtotalInCents subtotalInCents) {
    this.subtotalInCents = subtotalInCents;
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
   * Gets the total in cents.
   * 
   * @return the total in cents
   */
  public TotalInCents getTotalInCents() {
    return totalInCents;
  }

  /**
   * Sets the total in cents.
   * 
   * @param totalInCents
   *          the new total in cents
   */
  public void setTotalInCents(TotalInCents totalInCents) {
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
   * Gets the closed at.
   * 
   * @return the closed at
   */
  public ClosedAt getClosedAt() {
    return closedAt;
  }

  /**
   * Sets the closed at.
   * 
   * @param closedAt
   *          the new closed at
   */
  public void setClosedAt(ClosedAt closedAt) {
    this.closedAt = closedAt;
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
   * Gets the line items.
   * 
   * @return the line items
   */
  public LineItems getLineItems() {
    return lineItems;
  }

  /**
   * Sets the line items.
   * 
   * @param lineItems
   *          the new line items
   */
  public void setLineItems(LineItems lineItems) {
    this.lineItems = lineItems;
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
