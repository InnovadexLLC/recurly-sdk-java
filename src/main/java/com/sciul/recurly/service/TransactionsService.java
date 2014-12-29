package com.sciul.recurly.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.helper.BillingConstants;
import com.sciul.recurly.helper.BillingHelper;
import com.sciul.recurly.model.Transaction;

@Service
public class TransactionsService extends AbsctractService {

  @SuppressWarnings("unused")
  private static Logger logger = LoggerFactory.getLogger(TransactionsService.class);

  @Autowired
  private BillingHelper billingHelper;

  public Transaction createTransaction(Transaction transaction) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.TRANSACTIONS.toString(), transaction, Transaction.class,
          HttpMethod.POST);
  }

}
