package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class PlanCodes.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "planCode" })
public class PlanCodes {

  /** The plan code. */
  @XmlElement(name = "plan_code")
  private List<String> planCode;

  /** The type. */
  @XmlAttribute(name = "type")
  private String type;

  /**
   * Gets the plan code.
   * 
   * @return the plan code
   */
  public List<String> getPlanCode() {
    return planCode;
  }

  /**
   * Sets the plan code.
   * 
   * @param planCode
   *          the new plan code
   */
  public void setPlanCode(List<String> planCode) {
    this.planCode = planCode;
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
