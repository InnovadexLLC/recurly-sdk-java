package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class UnitAmountInCents.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "usd", "eur" })
public class UnitAmountInCents {

  /** The usd. */
  @XmlElement(name = "USD")
  protected USD usd;

  /** The eur. */
  @XmlElement(name = "EUR")
  protected EUR eur;

  /**
   * Gets the usd.
   * 
   * @return the usd
   */
  public USD getUsd() {
    return usd;
  }

  /**
   * Sets the usd.
   * 
   * @param usd
   *          the new usd
   */
  public void setUsd(USD usd) {
    this.usd = usd;
  }

  /**
   * Gets the eur.
   * 
   * @return the eur
   */
  public EUR getEur() {
    return eur;
  }

  /**
   * Sets the eur.
   * 
   * @param eur
   *          the new eur
   */
  public void setEur(EUR eur) {
    this.eur = eur;
  }

}
