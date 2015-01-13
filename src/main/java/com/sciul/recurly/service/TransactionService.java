package com.sciul.recurly.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.helper.BillingConstants;
import com.sciul.recurly.model.Transaction;

/**
 * The Class TransactionsService.
 * 
 * @author GauravChawla
 */
@Service
public class TransactionService extends AbstractService {

  /** The logger. */
  private static Logger logger = LoggerFactory.getLogger(TransactionService.class);

  @Override
  public Logger getLogger() {
    return logger;
  }

  /**
   * Creates the transaction.
   * 
   * @param transaction
   *          the transaction
   * @return the transaction
   * @throws RecurlyException
   *           the recurly exception
   */
  public Transaction createTransaction(Transaction transaction) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.TRANSACTIONS.toString(), transaction, Transaction.class,
          HttpMethod.POST);
  }

}
