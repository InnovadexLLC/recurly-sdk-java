package com.sciul.recurly.helper;

/**
 * The Class BillingConstants.
 * 
 * @author GauravChawla
 */
public class BillingConstants {

  /** The Constant DATA_TYPE_INTEGER. */
  public static final String DATA_TYPE_INTEGER = "Integer";

  /** The Constant DATA_TYPE_BOOLEAN. */
  public static final String DATA_TYPE_BOOLEAN = "boolean";

  /** The Constant PLAN_INTERVAL_DAYS. */
  public static final String PLAN_INTERVAL_DAYS = "days";

  /** The Constant SUBSCRIBE_URL. */
  public static final String SUBSCRIBE_URL = "subscribe";

  /** The Constant RECURLY_ERRORS. */
  public static final String RECURLY_ERRORS = "<errors>";

  /** The Constant RECURLY_ERROR. */
  public static final String RECURLY_ERROR = "<error>";

  /**
   * The Enum RecurlyApiPath.
   */
  public enum RecurlyApiPath {

    /** The accounts. */
    ACCOUNTS("/v2/accounts"),

    /** The invoices. */
    INVOICES("/invoices"),

    /** The billing info. */
    BILLING_INFO("/billing_info"),

    /** The adjustments. */
    ADJUSTMENTS("/adjustments"),

    /** The plans. */
    PLANS("/v2/plans"),

    /** The addons. */
    ADDONS("/add_ons"),

    /** The subscriptions. */
    SUBSCRIPTIONS("/v2/subscriptions"),

    /** The transactions. */
    TRANSACTIONS("/v2/transactions"),

    /** The V2 adjustments. */
    V2ADJUSTMENTS("/v2/adjustments");

    /** The value. */
    private String value;

    /**
     * Instantiates a new recurly api path.
     * 
     * @param value
     *          the value
     */
    RecurlyApiPath(String value) {
      this.value = value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Enum#toString()
     */
    public String toString() {
      return value;
    }
  }
}
