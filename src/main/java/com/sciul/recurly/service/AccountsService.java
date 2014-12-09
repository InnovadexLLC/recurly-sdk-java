package com.sciul.recurly.service;

import com.sciul.recurly.model.n.Account;

/**
 * @author Gaurav
 */
public interface AccountsService {

  Account createAccount(Account account);

  Account createAccount(String accountId, String emailId);

}
