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

import com.sciul.recurly.config.RecurlyConfiguration;
import com.sciul.recurly.helper.BillingHelper;
import com.sciul.recurly.model.n.Transaction;
import com.sciul.sdk.helper.RestWsUtils;

public class TransactionServiceImpl implements TransactionService {

  private static Logger logger = LoggerFactory.getLogger(TransactionServiceImpl.class);

  @Autowired
  private RestWsUtils restWsUtils;

  @Autowired
  private RecurlyConfiguration recurly;

  @Autowired
  private BillingHelper billingHelper;

  @Override
  public Transaction createTransaction(Transaction transaction) {
    Transaction t = null;
    try {
      logger.debug("Recurlly Account::::{}", transaction.toString());

      t =
            restWsUtils.callRestApiWithHeaders(
                  new URI(URIUtil.encodeQuery(recurly.getRecurllyServerURL() + "/v2/transactions", "UTF-8")),
                  transaction, Transaction.class, HttpMethod.POST, recurly.getRecurllyHeaders());
    } catch (URIException | UnsupportedEncodingException | URISyntaxException e) {
      logger.debug("Error!!!!!!!!!!!!!!! {}", e);
    }
    return t;
  }

}
