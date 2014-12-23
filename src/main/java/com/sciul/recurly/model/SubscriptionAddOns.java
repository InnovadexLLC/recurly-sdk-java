package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "subscriptionAddOn" })
public class SubscriptionAddOns {

  @XmlElement(name = "subscription_add_on")
  private List<SubscriptionAddOn> subscriptionAddOn;

  public List<SubscriptionAddOn> getSubscriptionAddOn() {
    return subscriptionAddOn;
  }

  public void setSubscriptionAddOn(List<SubscriptionAddOn> subscriptionAddOn) {
    this.subscriptionAddOn = subscriptionAddOn;
  }

}
