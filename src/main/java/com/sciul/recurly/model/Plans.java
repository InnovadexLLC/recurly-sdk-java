package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class Plans.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "plan" })
@XmlRootElement(name = "plans")
public class Plans {

  /** The plan. */
  @XmlElement(required = true)
  private List<Plan> plan;

  /** The type. */
  @XmlAttribute(name = "type")
  private String type;

  /**
   * Gets the plan.
   * 
   * @return the plan
   */
  public List<Plan> getPlan() {
    return plan;
  }

  /**
   * Sets the plan.
   * 
   * @param plan
   *          the new plan
   */
  public void setPlan(List<Plan> plan) {
    this.plan = plan;
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
