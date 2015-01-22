/**
 * 
 */
package com.sciul.recurly.proxies;

import com.sciul.recurly.config.RecurlyConfiguration;

/**
 * @author GauravChawla
 * 
 */
public class RecurlyProxyFactory {
  private RecurlyConfiguration config;

  public RecurlyProxyFactory(RecurlyConfiguration config) {
    this.config = config;
  }

  public AccountProxy getAccountProxy() {
    return new AccountProxy(config);
  }

  public InvoiceProxy getInvoiceProxy() {
    return new InvoiceProxy(config);
  }

  public PlanProxy getPlanProxy() {
    return new PlanProxy(config);
  }

  public SubscriptionProxy getSubscriptionProxy() {
    return new SubscriptionProxy(config);
  }

  public TransactionProxy getTransactionProxy() {
    return new TransactionProxy(config);
  }
}
