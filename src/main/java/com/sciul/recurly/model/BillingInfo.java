package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class BillingInfo.
 * 
 * @author GauravChawla
 */
@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "account", "firstName", "lastName", "company", "address1", "address2", "city",
    "state", "zip", "country", "phone", "vatNumber", "ipAddress", "ipAddressCountry", "cardType", "year", "month",
    "firstSix", "lastFour" })
@XmlRootElement(name = "billing_info")
public class BillingInfo {

  /** The account. */
  @XmlElement(required = true)
  private Account account;

  /** The first name. */
  @XmlElement(name = "first_name", required = true)
  private String firstName;

  /** The last name. */
  @XmlElement(name = "last_name", required = true)
  private String lastName;

  /** The company. */
  @XmlElement(required = true)
  private Company company;

  /** The address1. */
  @XmlElement(required = true)
  private String address1;

  /** The address2. */
  @XmlElement(required = true)
  private Address2 address2;

  /** The city. */
  @XmlElement(required = true)
  private String city;

  /** The state. */
  @XmlElement(required = true)
  private String state;

  /** The zip. */
  private int zip;

  /** The country. */
  @XmlElement(required = true)
  private String country;

  /** The phone. */
  @XmlElement(required = true)
  private Phone phone;

  /** The vat number. */
  @XmlElement(name = "vat_number", required = true)
  private String vatNumber;

  /** The ip address. */
  @XmlElement(name = "ip_address", required = true)
  private String ipAddress;

  /** The ip address country. */
  @XmlElement(name = "ip_address_country", required = true)
  private String ipAddressCountry;

  /** The card type. */
  @XmlElement(name = "card_type", required = true)
  private String cardType;

  /** The year. */
  @XmlElement(required = true)
  private Year year;

  /** The month. */
  @XmlElement(required = true)
  private Month month;

  /** The first six. */
  @XmlElement(name = "first_six")
  private int firstSix;

  /** The last four. */
  @XmlElement(name = "last_four")
  private short lastFour;

  /** The href. */
  @XmlAttribute(name = "href")
  @XmlSchemaType(name = "anyURI")
  private String href;

  /** The type. */
  @XmlAttribute(name = "type")
  private String type;

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
   * Gets the company.
   * 
   * @return the company
   */
  public Company getCompany() {
    return company;
  }

  /**
   * Sets the company.
   * 
   * @param company
   *          the new company
   */
  public void setCompany(Company company) {
    this.company = company;
  }

  /**
   * Gets the address1.
   * 
   * @return the address1
   */
  public String getAddress1() {
    return address1;
  }

  /**
   * Sets the address1.
   * 
   * @param address1
   *          the new address1
   */
  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  /**
   * Gets the address2.
   * 
   * @return the address2
   */
  public Address2 getAddress2() {
    return address2;
  }

  /**
   * Sets the address2.
   * 
   * @param address2
   *          the new address2
   */
  public void setAddress2(Address2 address2) {
    this.address2 = address2;
  }

  /**
   * Gets the city.
   * 
   * @return the city
   */
  public String getCity() {
    return city;
  }

  /**
   * Sets the city.
   * 
   * @param city
   *          the new city
   */
  public void setCity(String city) {
    this.city = city;
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
   * Gets the zip.
   * 
   * @return the zip
   */
  public int getZip() {
    return zip;
  }

  /**
   * Sets the zip.
   * 
   * @param zip
   *          the new zip
   */
  public void setZip(int zip) {
    this.zip = zip;
  }

  /**
   * Gets the country.
   * 
   * @return the country
   */
  public String getCountry() {
    return country;
  }

  /**
   * Sets the country.
   * 
   * @param country
   *          the new country
   */
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Gets the phone.
   * 
   * @return the phone
   */
  public Phone getPhone() {
    return phone;
  }

  /**
   * Sets the phone.
   * 
   * @param phone
   *          the new phone
   */
  public void setPhone(Phone phone) {
    this.phone = phone;
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
   * Gets the ip address.
   * 
   * @return the ip address
   */
  public String getIpAddress() {
    return ipAddress;
  }

  /**
   * Sets the ip address.
   * 
   * @param ipAddress
   *          the new ip address
   */
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   * Gets the ip address country.
   * 
   * @return the ip address country
   */
  public String getIpAddressCountry() {
    return ipAddressCountry;
  }

  /**
   * Sets the ip address country.
   * 
   * @param ipAddressCountry
   *          the new ip address country
   */
  public void setIpAddressCountry(String ipAddressCountry) {
    this.ipAddressCountry = ipAddressCountry;
  }

  /**
   * Gets the card type.
   * 
   * @return the card type
   */
  public String getCardType() {
    return cardType;
  }

  /**
   * Sets the card type.
   * 
   * @param cardType
   *          the new card type
   */
  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  /**
   * Gets the year.
   * 
   * @return the year
   */
  public Year getYear() {
    return year;
  }

  /**
   * Sets the year.
   * 
   * @param year
   *          the new year
   */
  public void setYear(Year year) {
    this.year = year;
  }

  /**
   * Gets the month.
   * 
   * @return the month
   */
  public Month getMonth() {
    return month;
  }

  /**
   * Sets the month.
   * 
   * @param month
   *          the new month
   */
  public void setMonth(Month month) {
    this.month = month;
  }

  /**
   * Gets the first six.
   * 
   * @return the first six
   */
  public int getFirstSix() {
    return firstSix;
  }

  /**
   * Sets the first six.
   * 
   * @param firstSix
   *          the new first six
   */
  public void setFirstSix(int firstSix) {
    this.firstSix = firstSix;
  }

  /**
   * Gets the last four.
   * 
   * @return the last four
   */
  public short getLastFour() {
    return lastFour;
  }

  /**
   * Sets the last four.
   * 
   * @param lastFour
   *          the new last four
   */
  public void setLastFour(short lastFour) {
    this.lastFour = lastFour;
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

}
