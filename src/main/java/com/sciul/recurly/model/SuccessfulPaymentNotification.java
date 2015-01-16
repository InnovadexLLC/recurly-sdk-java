package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
@XmlRootElement(name = "successful_payment_notification")
public class SuccessfulPaymentNotification {

  @XmlElement
  protected SuccessfulPaymentNotification.Account account;
  @XmlElement
  protected SuccessfulPaymentNotification.Transaction transaction;

  public SuccessfulPaymentNotification.Account getAccount() {
    return account;
  }

  public void setAccount(SuccessfulPaymentNotification.Account value) {
    this.account = value;
  }

  public SuccessfulPaymentNotification.Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction(SuccessfulPaymentNotification.Transaction value) {
    this.transaction = value;
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {})
  public static class Account {

    @XmlElement(name = "account_code")
    protected String accountCode;
    @XmlElement
    protected String username;
    @XmlElement
    protected String email;
    @XmlElement(name = "first_name")
    protected String firstName;
    @XmlElement(name = "last_name")
    protected String lastName;
    @XmlElement(name = "company_name")
    protected String companyName;

    /**
     * Gets the value of the accountCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAccountCode() {
      return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setAccountCode(String value) {
      this.accountCode = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUsername() {
      return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setUsername(String value) {
      this.username = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEmail() {
      return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setEmail(String value) {
      this.email = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFirstName() {
      return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setFirstName(String value) {
      this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLastName() {
      return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setLastName(String value) {
      this.lastName = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCompanyName() {
      return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setCompanyName(String value) {
      this.companyName = value;
    }

  }

  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {})
  public static class Transaction {

    @XmlElement
    protected String id;
    @XmlElement(name = "invoice_id")
    protected String invoiceId;
    @XmlElement(name = "invoice_number_prefix")
    protected String invoiceNumberPrefix;
    @XmlElement(name = "invoice_number")
    protected int invoiceNumber;
    @XmlElement(name = "subscription_id")
    protected String subscriptionId;
    @XmlElement
    protected String action;
    @XmlElement
    protected SuccessfulPaymentNotification.Transaction.Date date;
    @XmlElement(name = "amount_in_cents")
    protected int amountInCents;
    @XmlElement
    protected String status;
    @XmlElement
    protected String message;
    @XmlElement
    protected String reference;
    @XmlElement
    protected String source;
    @XmlElement(name = "cvv_result")
    protected SuccessfulPaymentNotification.Transaction.CvvResult cvvResult;
    @XmlElement(name = "avs_result")
    protected SuccessfulPaymentNotification.Transaction.AvsResult avsResult;
    @XmlElement(name = "avs_result_street")
    protected SuccessfulPaymentNotification.Transaction.AvsResultStreet avsResultStreet;
    @XmlElement(name = "avs_result_postal")
    protected SuccessfulPaymentNotification.Transaction.AvsResultPostal avsResultPostal;
    @XmlElement
    protected SuccessfulPaymentNotification.Transaction.Test test;
    protected boolean voidable;
    protected boolean refundable;

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {
      return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setId(String value) {
      this.id = value;
    }

    /**
     * Gets the value of the invoiceId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getInvoiceId() {
      return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setInvoiceId(String value) {
      this.invoiceId = value;
    }

    /**
     * Gets the value of the invoiceNumberPrefix property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getInvoiceNumberPrefix() {
      return invoiceNumberPrefix;
    }

    /**
     * Sets the value of the invoiceNumberPrefix property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setInvoiceNumberPrefix(String value) {
      this.invoiceNumberPrefix = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     */
    public int getInvoiceNumber() {
      return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     */
    public void setInvoiceNumber(int value) {
      this.invoiceNumber = value;
    }

    /**
     * Gets the value of the subscriptionId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSubscriptionId() {
      return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setSubscriptionId(String value) {
      this.subscriptionId = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAction() {
      return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setAction(String value) {
      this.action = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return possible object is {@link SuccessfulPaymentNotification.Transaction.Date }
     * 
     */
    public SuccessfulPaymentNotification.Transaction.Date getDate() {
      return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *          allowed object is {@link SuccessfulPaymentNotification.Transaction.Date }
     * 
     */
    public void setDate(SuccessfulPaymentNotification.Transaction.Date value) {
      this.date = value;
    }

    /**
     * Gets the value of the amountInCents property.
     * 
     */
    public int getAmountInCents() {
      return amountInCents;
    }

    /**
     * Sets the value of the amountInCents property.
     * 
     */
    public void setAmountInCents(int value) {
      this.amountInCents = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatus() {
      return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setStatus(String value) {
      this.status = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMessage() {
      return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setMessage(String value) {
      this.message = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReference() {
      return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setReference(String value) {
      this.reference = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSource() {
      return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *          allowed object is {@link String }
     * 
     */
    public void setSource(String value) {
      this.source = value;
    }

    /**
     * Gets the value of the cvvResult property.
     * 
     * @return possible object is {@link SuccessfulPaymentNotification.Transaction.CvvResult }
     * 
     */
    public SuccessfulPaymentNotification.Transaction.CvvResult getCvvResult() {
      return cvvResult;
    }

    /**
     * Sets the value of the cvvResult property.
     * 
     * @param value
     *          allowed object is {@link SuccessfulPaymentNotification.Transaction.CvvResult }
     * 
     */
    public void setCvvResult(SuccessfulPaymentNotification.Transaction.CvvResult value) {
      this.cvvResult = value;
    }

    /**
     * Gets the value of the avsResult property.
     * 
     * @return possible object is {@link SuccessfulPaymentNotification.Transaction.AvsResult }
     * 
     */
    public SuccessfulPaymentNotification.Transaction.AvsResult getAvsResult() {
      return avsResult;
    }

    /**
     * Sets the value of the avsResult property.
     * 
     * @param value
     *          allowed object is {@link SuccessfulPaymentNotification.Transaction.AvsResult }
     * 
     */
    public void setAvsResult(SuccessfulPaymentNotification.Transaction.AvsResult value) {
      this.avsResult = value;
    }

    /**
     * Gets the value of the avsResultStreet property.
     * 
     * @return possible object is {@link SuccessfulPaymentNotification.Transaction.AvsResultStreet }
     * 
     */
    public SuccessfulPaymentNotification.Transaction.AvsResultStreet getAvsResultStreet() {
      return avsResultStreet;
    }

    /**
     * Sets the value of the avsResultStreet property.
     * 
     * @param value
     *          allowed object is {@link SuccessfulPaymentNotification.Transaction.AvsResultStreet }
     * 
     */
    public void setAvsResultStreet(SuccessfulPaymentNotification.Transaction.AvsResultStreet value) {
      this.avsResultStreet = value;
    }

    /**
     * Gets the value of the avsResultPostal property.
     * 
     * @return possible object is {@link SuccessfulPaymentNotification.Transaction.AvsResultPostal }
     * 
     */
    public SuccessfulPaymentNotification.Transaction.AvsResultPostal getAvsResultPostal() {
      return avsResultPostal;
    }

    /**
     * Sets the value of the avsResultPostal property.
     * 
     * @param value
     *          allowed object is {@link SuccessfulPaymentNotification.Transaction.AvsResultPostal }
     * 
     */
    public void setAvsResultPostal(SuccessfulPaymentNotification.Transaction.AvsResultPostal value) {
      this.avsResultPostal = value;
    }

    /**
     * Gets the value of the test property.
     * 
     * @return possible object is {@link SuccessfulPaymentNotification.Transaction.Test }
     * 
     */
    public SuccessfulPaymentNotification.Transaction.Test getTest() {
      return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *          allowed object is {@link SuccessfulPaymentNotification.Transaction.Test }
     * 
     */
    public void setTest(SuccessfulPaymentNotification.Transaction.Test value) {
      this.test = value;
    }

    /**
     * Gets the value of the voidable property.
     * 
     */
    public boolean isVoidable() {
      return voidable;
    }

    /**
     * Sets the value of the voidable property.
     * 
     */
    public void setVoidable(boolean value) {
      this.voidable = value;
    }

    /**
     * Gets the value of the refundable property.
     * 
     */
    public boolean isRefundable() {
      return refundable;
    }

    /**
     * Sets the value of the refundable property.
     * 
     */
    public void setRefundable(boolean value) {
      this.refundable = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "value" })
    public static class AvsResult {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "code")
      protected String code;

      /**
       * Gets the value of the value property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getValue() {
        return value;
      }

      /**
       * Sets the value of the value property.
       * 
       * @param value
       *          allowed object is {@link String }
       * 
       */
      public void setValue(String value) {
        this.value = value;
      }

      /**
       * Gets the value of the code property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getCode() {
        return code;
      }

      /**
       * Sets the value of the code property.
       * 
       * @param value
       *          allowed object is {@link String }
       * 
       */
      public void setCode(String value) {
        this.code = value;
      }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "value" })
    public static class AvsResultPostal {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "nil")
      protected String nil;

      /**
       * Gets the value of the value property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getValue() {
        return value;
      }

      /**
       * Sets the value of the value property.
       * 
       * @param value
       *          allowed object is {@link String }
       * 
       */
      public void setValue(String value) {
        this.value = value;
      }

      /**
       * Gets the value of the nil property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getNil() {
        return nil;
      }

      /**
       * Sets the value of the nil property.
       * 
       * @param value
       *          allowed object is {@link String }
       * 
       */
      public void setNil(String value) {
        this.nil = value;
      }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "value" })
    public static class AvsResultStreet {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "nil")
      protected String nil;

      /**
       * Gets the value of the value property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getValue() {
        return value;
      }

      /**
       * Sets the value of the value property.
       * 
       * @param value
       *          allowed object is {@link String }
       * 
       */
      public void setValue(String value) {
        this.value = value;
      }

      /**
       * Gets the value of the nil property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getNil() {
        return nil;
      }

      /**
       * Sets the value of the nil property.
       * 
       * @param value
       *          allowed object is {@link String }
       * 
       */
      public void setNil(String value) {
        this.nil = value;
      }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "value" })
    public static class CvvResult {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "code")
      protected String code;

      /**
       * Gets the value of the value property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getValue() {
        return value;
      }

      /**
       * Sets the value of the value property.
       * 
       * @param value
       *          allowed object is {@link String }
       * 
       */
      public void setValue(String value) {
        this.value = value;
      }

      /**
       * Gets the value of the code property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getCode() {
        return code;
      }

      /**
       * Sets the value of the code property.
       * 
       * @param value
       *          allowed object is {@link String }
       * 
       */
      public void setCode(String value) {
        this.code = value;
      }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "value" })
    public static class Date {

      @XmlValue
      @XmlSchemaType(name = "dateTime")
      protected XMLGregorianCalendar value;
      @XmlAttribute(name = "type")
      protected String type;

      /**
       * Gets the value of the value property.
       * 
       * @return possible object is {@link XMLGregorianCalendar }
       * 
       */
      public XMLGregorianCalendar getValue() {
        return value;
      }

      /**
       * Sets the value of the value property.
       * 
       * @param value
       *          allowed object is {@link XMLGregorianCalendar }
       * 
       */
      public void setValue(XMLGregorianCalendar value) {
        this.value = value;
      }

      /**
       * Gets the value of the type property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getType() {
        return type;
      }

      /**
       * Sets the value of the type property.
       * 
       * @param value
       *          allowed object is {@link String }
       * 
       */
      public void setType(String value) {
        this.type = value;
      }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "value" })
    public static class Test {

      @XmlValue
      protected String value;
      @XmlAttribute(name = "type")
      protected String type;

      /**
       * Gets the value of the value property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getValue() {
        return value;
      }

      /**
       * Sets the value of the value property.
       * 
       * @param value
       *          allowed object is {@link String }
       * 
       */
      public void setValue(String value) {
        this.value = value;
      }

      /**
       * Gets the value of the type property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getType() {
        return type;
      }

      /**
       * Sets the value of the type property.
       * 
       * @param value
       *          allowed object is {@link String }
       * 
       */
      public void setType(String value) {
        this.type = value;
      }

    }

  }

}
