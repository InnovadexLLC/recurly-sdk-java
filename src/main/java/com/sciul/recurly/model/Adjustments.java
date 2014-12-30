package com.sciul.recurly.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class Adjustments.
 * 
 * @author GauravChawla
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "adjustment" })
@XmlRootElement(name = "adjustments")
public class Adjustments {

  /** The adjustment. */
  @XmlElement(required = true)
  private Adjustment adjustment;

  /** The type. */
  @XmlAttribute(name = "type")
  private String type;

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
