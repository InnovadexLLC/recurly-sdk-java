package com.sciul.recurly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * The Class RecurlyClientFactoryBean. This class it to provide all the auto wire services.
 * 
 * @author GauravChawla
 */
@Component
public class RecurlyClientFactoryBean {

  /** The account service. */
  @Autowired
  private AccountService accountService;

  /** The subscriptions service. */
  @Autowired
  private SubscriptionService subscriptionService;

  /** The plans service. */
  @Autowired
  private PlanService planService;

  /** The transactions service. */
  @Autowired
  private TransactionService transactionService;

  /** The Invoice service. */
  @Autowired
  private InvoiceService invoiceService;

  /**
   * Gets the invoice service.
   * 
   * @return the invoice service
   */
  public InvoiceService getInvoiceService() {
    return invoiceService;
  }

  /**
   * Gets the plans service.
   * 
   * @return the plans service
   */
  public PlanService getPlanService() {
    return planService;
  }

  /**
   * Gets the transactions service.
   * 
   * @return the transactions service
   */
  public TransactionService getTransactionService() {
    return transactionService;
  }

  /**
   * Gets the account service.
   * 
   * @return the account service
   */
  public AccountService getAccountService() {
    return accountService;
  }

  /**
   * Gets the subscriptions service.
   * 
   * @return the subscriptions service
   */
  public SubscriptionService getSubscriptionService() {
    return subscriptionService;
  }

}
