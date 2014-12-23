package com.sciul.recurly.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "plan" })
@XmlRootElement(name = "plans")
public class Plans {

  @XmlElement(required = true)
  private List<Plan> plan;
  @XmlAttribute(name = "type")
  private String type;

  public List<Plan> getPlan() {
    return plan;
  }

  public void setPlan(List<Plan> plan) {
    this.plan = plan;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
