package com.sciul.recurly.model.n;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "adjustment" })
public class LineItems {

  @XmlElement(required = true)
  private Adjustment adjustment;

  public Adjustment getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(Adjustment adjustment) {
    this.adjustment = adjustment;
  }

}
