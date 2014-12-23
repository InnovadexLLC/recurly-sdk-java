package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "address1", "address2", "city", "state", "zip", "country", "phone" })
public class Address {

  @XmlElement(required = true)
  private String address1;
  @XmlElement(required = true)
  private Address2 address2;
  @XmlElement(required = true)
  private String city;
  @XmlElement(required = true)
  private String state;
  @XmlElement(required = true)
  private int zip;
  @XmlElement(required = true)
  private String country;
  @XmlElement(required = true)
  private Phone phone;

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

}
