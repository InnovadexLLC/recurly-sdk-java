package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "usd", "eur" })
public class SetupFeeInCents {

  @XmlElement(name = "USD", required = true)
  private USD usd;
  @XmlElement(name = "EUR", required = true)
  private EUR eur;

  public USD getUsd() {
    return usd;
  }

  public void setUsd(USD usd) {
    this.usd = usd;
  }

  public EUR getEur() {
    return eur;
  }

  public void setEur(EUR eur) {
    this.eur = eur;
  }
}
