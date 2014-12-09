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
import com.sciul.recurly.model.n.Subscription;
import com.sciul.sdk.helper.RestWsUtils;

@Service
public class SubscriptionsServiceImpl implements SubscriptionsService {

  private static Logger logger = LoggerFactory.getLogger(SubscriptionsServiceImpl.class);

  @Autowired
  private RestWsUtils restWsUtils;

  @Autowired
  private RecurlyConfiguration recurly;

  @Autowired
  private BillingHelper billingHelper;

  @Override
  public Subscription createSubscription(Subscription subscription) {
    logger.debug("RecurllyServerURL::::{}", "HERE");
    Subscription sub = null;
    try {
      logger.debug("RecurllyServerURL::::{}", recurly.getRecurllyServerURL());
      logger.debug("subscription::::{}", subscription.toString());

      sub =
            restWsUtils.callRestApiWithHeaders(
                  new URI(URIUtil.encodeQuery(recurly.getRecurllyServerURL() + "/v2/subscriptions", "UTF-8")),
                  subscription, Subscription.class, HttpMethod.POST, recurly.getRecurllyHeaders());

      // restWsUtils.callRestApiWithHeaders(
      // new URI(URIUtil.encodeQuery("http://localhost:8080/api/v1/events/billing", "UTF-8")), subscription,
      // Subscription.class, HttpMethod.POST, recurly.getRecurllyHeaders());
    } catch (URIException | URISyntaxException | UnsupportedEncodingException e) {
      logger.debug("Error!!!!!!!!!!!!!!! {}", e);
    }
    return sub;
  }

  public Subscription createSubscriptionWithManualInvoice(Subscription subscription, Integer netTerms, String poNumber) {
    billingHelper.setSubscriptionWithManualInvoice(subscription, netTerms, poNumber);

    Subscription s = createSubscription(subscription);
    return s;
  }

  public Subscription createSubscriptionWithAddOn(Subscription subscription,
        String addOnCode,
        Long amountInCents,
        Integer quantity) {
    billingHelper.setSubscriptionWithAddOn(subscription, addOnCode, amountInCents, quantity);

    Subscription s = createSubscription(subscription);
    return s;
  }

  public Subscription createManualInvoiceSubscriptionWithAddon(Subscription subscription,
        Integer netTerms,
        String poNumber,
        String addOnCode,
        Long addOnAmountInCents,
        Integer quantity) {
    billingHelper.setSubscriptionWithManualInvoice(subscription, netTerms, poNumber);
    billingHelper.setSubscriptionWithAddOn(subscription, addOnCode, addOnAmountInCents, quantity);

    Subscription s = createSubscription(subscription);
    return s;
  }
}
