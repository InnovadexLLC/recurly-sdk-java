package com.sciul.recurly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecurlyClientFactoryBean {

  @Autowired
  private AccountsService accountService;

  @Autowired
  private SubscriptionsService subscriptionsService;

  @Autowired
  private PlansService plansService;

  @Autowired
  private TransactionsService transactionsService;

  public PlansService getPlansService() {
    return plansService;
  }

  public TransactionsService getTransactionsService() {
    return transactionsService;
  }

  public AccountsService getAccountService() {
    return accountService;
  }

  public SubscriptionsService getSubscriptionsService() {
    return subscriptionsService;
  }

}
