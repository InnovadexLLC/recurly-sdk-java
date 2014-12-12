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
import com.sciul.recurly.model.n.Adjustment;
import com.sciul.recurly.model.n.BillingInfo;
import com.sciul.recurly.model.n.Invoice;
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

  // Post a pending charge to an account.
  @Override
  public Invoice postPendingChargeToAccount(Invoice invoice, String accountCode) {
    Invoice i = null;
    try {
      logger.debug("Recurlly Account::::{}", invoice.toString());

      i =
            restWsUtils
                  .callRestApiWithHeaders(
                        new URI(URIUtil.encodeQuery(recurly.getRecurllyServerURL() + "/v2/accounts/" + accountCode
                              + "/invoices", "UTF-8")), invoice, Invoice.class, HttpMethod.POST,
                        recurly.getRecurllyHeaders());
    } catch (URIException | UnsupportedEncodingException | URISyntaxException e) {
      logger.debug("Error!!!!!!!!!!!!!!! {}", e);
    }
    return i;
  }

  @Override
  public BillingInfo updateBilling(String accountCode, String token) {
    BillingInfo b = null;
    try {
      logger.debug("Recurlly Account::::{}, {}", accountCode, token);

      b =
            restWsUtils.callRestApiWithHeaders(
                  new URI(URIUtil.encodeQuery(recurly.getRecurllyServerURL() + "/v2/accounts/" + accountCode
                        + "/billing_info?token=" + token, "UTF-8")), Void.class, BillingInfo.class, HttpMethod.PUT,
                  recurly.getRecurllyHeaders());
    } catch (URIException | UnsupportedEncodingException | URISyntaxException e) {
      logger.debug("Error!!!!!!!!!!!!!!! {}", e);
    }
    return b;
  }

  @Override
  public Adjustment createAdjustment(Adjustment adjustment, String accountCode) {
    Adjustment a = null;
    try {
      logger.debug("Recurlly Account::::{}", adjustment.toString());

      a =
            restWsUtils.callRestApiWithHeaders(
                  new URI(URIUtil.encodeQuery(recurly.getRecurllyServerURL() + "/v2/accounts/" + accountCode
                        + "/adjustments", "UTF-8")), adjustment, Adjustment.class, HttpMethod.POST,
                  recurly.getRecurllyHeaders());
    } catch (URIException | UnsupportedEncodingException | URISyntaxException e) {
      logger.debug("Error!!!!!!!!!!!!!!! {}", e);
    }
    return a;
  }
}
