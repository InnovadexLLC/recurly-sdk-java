package com.sciul.recurly.helper;

public class BillingConstants {
  public static final String DATA_TYPE_INTEGER = "Integer";
  public static final String DATA_TYPE_BOOLEAN = "boolean";
  public static final String PLAN_INTERVAL_DAYS = "days";
  public static final String SUBSCRIBE_URL = "subscribe";

  public enum RecurlyApiPath {
    ACCOUNTS("/v2/accounts/"),
    INVOICES("/invoices"),
    BILLING_INFO("/billing_info"),
    ADJUSTMENTS("/adjustments"),
    PLANS("/v2/plans"),
    ADDONS("/add_ons"),
    SUBSCRIPTIONS("/v2/subscriptions"),
    TRANSACTIONS("/v2/transactions");

    private String value;

    RecurlyApiPath(String value) {
      this.value = value;
    }

    public String toString() {
      return value;
    }
  }
}
