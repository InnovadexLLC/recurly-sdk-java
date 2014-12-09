package com.sciul.recurly.model.n;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "transaction" })
@XmlRootElement(name = "transactions")
public class Transactions {

  @XmlElement
  private List<Transaction> transaction;
  @XmlAttribute(name = "type")
  private String type;

  public List<Transaction> getTransaction() {
    return transaction;
  }

  public void setTransaction(List<Transaction> transaction) {
    this.transaction = transaction;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
