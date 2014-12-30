package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class LineItems.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "adjustment" })
public class LineItems {

  /** The adjustment. */
  @XmlElement(required = true)
  private Adjustment adjustment;

  /**
   * Gets the adjustment.
   * 
   * @return the adjustment
   */
  public Adjustment getAdjustment() {
    return adjustment;
  }

  /**
   * Sets the adjustment.
   * 
   * @param adjustment
   *          the new adjustment
   */
  public void setAdjustment(Adjustment adjustment) {
    this.adjustment = adjustment;
  }

}
