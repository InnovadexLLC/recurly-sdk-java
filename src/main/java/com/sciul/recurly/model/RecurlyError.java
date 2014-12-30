package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class RecurlyError.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "symbol", "description" })
@XmlRootElement(name = "error")
public class RecurlyError {

  /** The symbol. */
  @XmlElement
  protected String symbol;

  /** The description. */
  @XmlElement
  protected String description;

  /**
   * Gets the symbol.
   * 
   * @return the symbol
   */
  public String getSymbol() {
    return symbol;
  }

  /**
   * Sets the symbol.
   * 
   * @param value
   *          the new symbol
   */
  public void setSymbol(String value) {
    this.symbol = value;
  }

  /**
   * Gets the description.
   * 
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the description.
   * 
   * @param value
   *          the new description
   */
  public void setDescription(String value) {
    this.description = value;
  }

}
