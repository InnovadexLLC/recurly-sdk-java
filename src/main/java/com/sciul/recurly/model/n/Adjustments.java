package com.sciul.recurly.model.n;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "adjustment" })
@XmlRootElement(name = "adjustments")
public class Adjustments {

  @XmlElement(required = true)
  private Adjustment adjustment;
  @XmlAttribute(name = "type")
  private String type;

  public Adjustment getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(Adjustment adjustment) {
    this.adjustment = adjustment;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
