package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "subscription" })
@XmlRootElement(name = "subscriptions")
public class Subscriptions {

  @XmlElement(required = true)
  private List<Subscription> subscription;
  @XmlAttribute(name = "type")
  private String type;

  public List<Subscription> getSubscription() {
    return subscription;
  }

  public void setSubscription(List<Subscription> subscription) {
    this.subscription = subscription;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
