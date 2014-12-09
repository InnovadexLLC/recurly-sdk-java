package com.sciul.recurly.service;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.httpclient.URIException;
import org.apache.commons.httpclient.util.URIUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.sciul.recurly.config.RecurlyConfiguration;
import com.sciul.recurly.helper.BillingHelper;
import com.sciul.recurly.model.n.Account;
import com.sciul.sdk.helper.RestWsUtils;

/**
 * @author Gaurav
 */
@Service
public class AccountsServiceImpl implements AccountsService {

  private static Logger logger = LoggerFactory.getLogger(AccountsServiceImpl.class);

  @Autowired
  private RestWsUtils restWsUtils;

  @Autowired
  private RecurlyConfiguration recurly;

  @Autowired
  private BillingHelper billingHelper;

  @Override
  public Account createAccount(Account account) {
    Account acct = null;
    try {
      logger.debug("Recurlly Account::::{}", account.toString());

      acct =
            restWsUtils.callRestApiWithHeaders(
                  new URI(URIUtil.encodeQuery(recurly.getRecurllyServerURL() + "/v2/accounts", "UTF-8")), account,
                  Account.class, HttpMethod.POST, recurly.getRecurllyHeaders());
    } catch (URIException | UnsupportedEncodingException | URISyntaxException e) {
      logger.debug("Error!!!!!!!!!!!!!!! {}", e);
    }
    return acct;
  }

  @Override
  public Account createAccount(String accountId, String emailId) {
    logger.debug("Recurlly AccountId::::{}", accountId);
    Account acct = new Account();
    billingHelper.setAccountDetails(acct, accountId, emailId);

    acct = createAccount(acct);
    return acct;
  }
}
