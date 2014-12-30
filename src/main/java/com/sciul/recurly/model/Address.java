package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class Address.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "address1", "address2", "city", "state", "zip", "country", "phone" })
public class Address {

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
  @XmlElement(required = true)
  private int zip;

  /** The country. */
  @XmlElement(required = true)
  private String country;

  /** The phone. */
  @XmlElement(required = true)
  private Phone phone;

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

}
