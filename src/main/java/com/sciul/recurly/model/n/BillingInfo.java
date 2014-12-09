package com.sciul.recurly.model.n;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "account", "firstName", "lastName", "company", "address1", "address2", "city",
    "state", "zip", "country", "phone", "vatNumber", "ipAddress", "ipAddressCountry", "cardType", "year", "month",
    "firstSix", "lastFour" })
@XmlRootElement(name = "billing_info")
public class BillingInfo {

  @XmlElement(required = true)
  private Account account;
  @XmlElement(name = "first_name", required = true)
  private String firstName;
  @XmlElement(name = "last_name", required = true)
  private String lastName;
  @XmlElement(required = true)
  private Company company;
  @XmlElement(required = true)
  private String address1;
  @XmlElement(required = true)
  private Address2 address2;
  @XmlElement(required = true)
  private String city;
  @XmlElement(required = true)
  private String state;
  private int zip;
  @XmlElement(required = true)
  private String country;
  @XmlElement(required = true)
  private Phone phone;
  @XmlElement(name = "vat_number", required = true)
  private String vatNumber;
  @XmlElement(name = "ip_address", required = true)
  private String ipAddress;
  @XmlElement(name = "ip_address_country", required = true)
  private String ipAddressCountry;
  @XmlElement(name = "card_type", required = true)
  private String cardType;
  @XmlElement(required = true)
  private Year year;
  @XmlElement(required = true)
  private Month month;
  @XmlElement(name = "first_six")
  private int firstSix;
  @XmlElement(name = "last_four")
  private short lastFour;
  @XmlAttribute(name = "href")
  @XmlSchemaType(name = "anyURI")
  private String href;
  @XmlAttribute(name = "type")
  private String type;

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
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

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Address2 getAddress2() {
    return address2;
  }

  public void setAddress2(Address2 address2) {
    this.address2 = address2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getZip() {
    return zip;
  }

  public void setZip(int zip) {
    this.zip = zip;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Phone getPhone() {
    return phone;
  }

  public void setPhone(Phone phone) {
    this.phone = phone;
  }

  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public String getIpAddressCountry() {
    return ipAddressCountry;
  }

  public void setIpAddressCountry(String ipAddressCountry) {
    this.ipAddressCountry = ipAddressCountry;
  }

  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public Year getYear() {
    return year;
  }

  public void setYear(Year year) {
    this.year = year;
  }

  public Month getMonth() {
    return month;
  }

  public void setMonth(Month month) {
    this.month = month;
  }

  public int getFirstSix() {
    return firstSix;
  }

  public void setFirstSix(int firstSix) {
    this.firstSix = firstSix;
  }

  public short getLastFour() {
    return lastFour;
  }

  public void setLastFour(short lastFour) {
    this.lastFour = lastFour;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
