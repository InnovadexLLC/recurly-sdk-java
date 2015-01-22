package com.sciul.recurly.proxies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;

import com.sciul.recurly.config.RecurlyConfiguration;
import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.helper.BillingConstants;
import com.sciul.recurly.model.Transaction;

/**
 * The Class TransactionsService.
 * 
 * @author GauravChawla
 */
public class TransactionProxy extends AbstractProxy {

  /**
   * @param recurly
   */
  TransactionProxy(RecurlyConfiguration recurly) {
    super(recurly);
  }

  /** The logger. */
  private static Logger logger = LoggerFactory.getLogger(TransactionProxy.class);

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
