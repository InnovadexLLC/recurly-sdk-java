package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class Transactions.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "transaction" })
@XmlRootElement(name = "transactions")
public class Transactions {

  /** The transaction. */
  @XmlElement
  private List<Transaction> transaction;

  /** The type. */
  @XmlAttribute(name = "type")
  private String type;

  /**
   * Gets the transaction.
   * 
   * @return the transaction
   */
  public List<Transaction> getTransaction() {
    return transaction;
  }

  /**
   * Sets the transaction.
   * 
   * @param transaction
   *          the new transaction
   */
  public void setTransaction(List<Transaction> transaction) {
    this.transaction = transaction;
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
