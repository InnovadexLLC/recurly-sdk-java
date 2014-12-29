package com.sciul.recurly.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.helper.BillingConstants;
import com.sciul.recurly.helper.BillingHelper;
import com.sciul.recurly.model.Account;
import com.sciul.recurly.model.Adjustment;
import com.sciul.recurly.model.BillingInfo;
import com.sciul.recurly.model.Invoice;
import com.sciul.recurly.model.Token;

/**
 * @author Gaurav
 */
@Service
public class AccountsService extends AbsctractService {

  @SuppressWarnings("unused")
  private static Logger logger = LoggerFactory.getLogger(AccountsService.class);

  @Autowired
  private BillingHelper billingHelper;

  public Account createAccount(Account account) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.ACCOUNTS.toString(), account, Account.class, HttpMethod.POST);
  }

  public Account getAccount(String accountCode) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.ACCOUNTS.toString() + "/" + accountCode, null, Account.class,
          HttpMethod.GET);
  }

  public Account createAccount(String accountId, String emailId) throws RecurlyException {
    Account acct = new Account();
    billingHelper.setAccountDetails(acct, accountId, emailId);
    acct = createAccount(acct);
    return acct;
  }

  // Post a pending charge to an account.
  public Invoice postPendingChargeToAccount(Invoice invoice, String accountCode) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.ACCOUNTS.toString() + "/" + accountCode
          + BillingConstants.RecurlyApiPath.INVOICES.toString(), invoice, Invoice.class, HttpMethod.POST);
  }

  public BillingInfo updateBilling(String accountCode, String token) throws RecurlyException {
    Token t = new Token();
    t.setToken(token);
    BillingInfo b =
          call(BillingConstants.RecurlyApiPath.ACCOUNTS.toString() + "/" + accountCode
                + BillingConstants.RecurlyApiPath.BILLING_INFO.toString(), t, BillingInfo.class, HttpMethod.PUT);
    return b;
  }

  public Adjustment createAdjustment(Adjustment adjustment, String accountCode) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.ACCOUNTS.toString() + "/" + accountCode
          + BillingConstants.RecurlyApiPath.ADJUSTMENTS.toString(), adjustment, Adjustment.class, HttpMethod.POST);
  }

  public void deleteAdjustment(String uuid) throws RecurlyException {
    call(BillingConstants.RecurlyApiPath.V2ADJUSTMENTS.toString() + "/" + uuid, null, void.class, HttpMethod.DELETE);
  }
}
