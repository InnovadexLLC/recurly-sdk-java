package com.sciul.recurly.service;

import com.sciul.recurly.model.n.Account;
import com.sciul.recurly.model.n.Invoice;

/**
 * @author Gaurav
 */
public interface AccountsService {

  Account createAccount(Account account);

  Account createAccount(String accountId, String emailId);

  Invoice postPendingChargeToAccount(Invoice invoice, String accountCode);

}
