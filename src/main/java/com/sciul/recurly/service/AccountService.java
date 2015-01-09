package com.sciul.recurly.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.helper.BillingConstants;
import com.sciul.recurly.model.Account;
import com.sciul.recurly.model.Adjustment;
import com.sciul.recurly.model.BillingInfo;
import com.sciul.recurly.model.Invoice;
import com.sciul.recurly.model.Token;

/**
 * The Class AccountsService.
 * 
 * @author GauravChawla
 */
@Service
public class AccountService extends AbstractService {

  /** The logger. */
  private static Logger logger = LoggerFactory.getLogger(AccountService.class);

  @Override
  public Logger getLogger() {
    return logger;
  }

  /**
   * Creates the account.
   * 
   * @param account
   *          the account
   * @return the account
   * @throws RecurlyException
   *           the recurly exception
   */
  public Account createAccount(Account account) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.ACCOUNTS.toString(), account, Account.class, HttpMethod.POST);
  }

  /**
   * Gets the account.
   * 
   * @param accountCode
   *          the account code
   * @return the account
   * @throws RecurlyException
   *           the recurly exception
   */
  public Account getAccount(String accountCode) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.ACCOUNTS.toString() + "/" + accountCode, null, Account.class,
          HttpMethod.GET);
  }

  /**
   * Post one or more pending charge(s)/adjustment(s) to an account.
   * 
   * @param invoice
   *          the invoice
   * @param accountCode
   *          the account code
   * @return the invoice
   * @throws RecurlyException
   *           the recurly exception
   */
  public Invoice postPendingChargeToAccount(Invoice invoice, String accountCode) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.ACCOUNTS.toString() + "/" + accountCode
          + BillingConstants.RecurlyApiPath.INVOICES.toString(), invoice, Invoice.class, HttpMethod.POST);
  }

  /**
   * Update billing - Adds CC token to account.
   * 
   * @param accountCode
   *          the account code
   * @param token
   *          the token
   * @return the billing info
   * @throws RecurlyException
   *           the recurly exception
   */
  public BillingInfo updateBilling(String accountCode, String token) throws RecurlyException {
    Token t = new Token();
    t.setToken(token);
    return call(BillingConstants.RecurlyApiPath.ACCOUNTS.toString() + "/" + accountCode
          + BillingConstants.RecurlyApiPath.BILLING_INFO.toString(), t, BillingInfo.class, HttpMethod.PUT);
  }

  /**
   * Get billingInfo
   * 
   * @param accountCode
   *          the account code
   * @return the billing info
   * @throws RecurlyException
   *           the recurly exception
   */
  public BillingInfo getBillingInfo(String accountCode) throws RecurlyException {

    return call(BillingConstants.RecurlyApiPath.ACCOUNTS.toString() + "/" + accountCode
          + BillingConstants.RecurlyApiPath.BILLING_INFO.toString(), null, BillingInfo.class, HttpMethod.GET);
  }

  /**
   * Creates the adjustment to an account.
   * 
   * @param adjustment
   *          the adjustment
   * @param accountCode
   *          the account code
   * @return the adjustment
   * @throws RecurlyException
   *           the recurly exception
   */
  public Adjustment createAdjustment(Adjustment adjustment, String accountCode) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.ACCOUNTS.toString() + "/" + accountCode
          + BillingConstants.RecurlyApiPath.ADJUSTMENTS.toString(), adjustment, Adjustment.class, HttpMethod.POST);
  }

  /**
   * Delete adjustment from account using adjustment uuid.
   * 
   * @param uuid
   *          the uuid
   * @throws RecurlyException
   *           the recurly exception
   */
  public void deleteAdjustment(String uuid) throws RecurlyException {
    call(BillingConstants.RecurlyApiPath.V2ADJUSTMENTS.toString() + "/" + uuid, null, void.class, HttpMethod.DELETE);
  }
}
