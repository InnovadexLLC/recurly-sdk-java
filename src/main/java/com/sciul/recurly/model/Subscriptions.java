package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class Subscriptions.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "subscription" })
@XmlRootElement(name = "subscriptions")
public class Subscriptions {

  /** The subscription. */
  @XmlElement(required = true)
  private List<Subscription> subscription;

  /** The type. */
  @XmlAttribute(name = "type")
  private String type;

  /**
   * Gets the subscription.
   * 
   * @return the subscription
   */
  public List<Subscription> getSubscription() {
    return subscription;
  }

  /**
   * Sets the subscription.
   * 
   * @param subscription
   *          the new subscription
   */
  public void setSubscription(List<Subscription> subscription) {
    this.subscription = subscription;
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
