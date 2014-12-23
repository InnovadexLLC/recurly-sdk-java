package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "planCode" })
public class PlanCodes {

  @XmlElement(name = "plan_code")
  private List<String> planCode;
  @XmlAttribute(name = "type")
  private String type;

  public List<String> getPlanCode() {
    return planCode;
  }

  public void setPlanCode(List<String> planCode) {
    this.planCode = planCode;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}