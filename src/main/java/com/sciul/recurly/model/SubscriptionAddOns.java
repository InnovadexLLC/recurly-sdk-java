package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class SubscriptionAddOns.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "subscriptionAddOn" })
public class SubscriptionAddOns {

  /** The subscription add on. */
  @XmlElement(name = "subscription_add_on")
  private List<SubscriptionAddOn> subscriptionAddOn;

  /**
   * Gets the subscription add on.
   * 
   * @return the subscription add on
   */
  public List<SubscriptionAddOn> getSubscriptionAddOn() {
    return subscriptionAddOn;
  }

  /**
   * Sets the subscription add on.
   * 
   * @param subscriptionAddOn
   *          the new subscription add on
   */
  public void setSubscriptionAddOn(List<SubscriptionAddOn> subscriptionAddOn) {
    this.subscriptionAddOn = subscriptionAddOn;
  }

}
