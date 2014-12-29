package com.sciul.recurly.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.helper.BillingConstants;
import com.sciul.recurly.helper.BillingHelper;
import com.sciul.recurly.model.Subscription;

@Service
public class SubscriptionsService extends AbsctractService {

  @SuppressWarnings("unused")
  private static Logger logger = LoggerFactory.getLogger(SubscriptionsService.class);

  @Autowired
  private BillingHelper billingHelper;

  public Subscription createSubscription(Subscription subscription) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.SUBSCRIPTIONS.toString(), subscription, Subscription.class,
          HttpMethod.POST);
  }

  public Subscription createSubscriptionWithManualInvoice(Subscription subscription, Integer netTerms, String poNumber)
        throws RecurlyException {
    billingHelper.setSubscriptionWithManualInvoice(subscription, netTerms, poNumber);
    Subscription s = createSubscription(subscription);
    return s;
  }

  public Subscription createSubscriptionWithAddOn(Subscription subscription,
        String addOnCode,
        Long amountInCents,
        Integer quantity) throws RecurlyException {
    billingHelper.setSubscriptionWithAddOn(subscription, addOnCode, amountInCents, quantity);
    Subscription s = createSubscription(subscription);
    return s;
  }

  public Subscription createManualInvoiceSubscriptionWithAddon(Subscription subscription,
        Integer netTerms,
        String poNumber,
        String addOnCode,
        Long addOnAmountInCents,
        Integer quantity) throws RecurlyException {
    billingHelper.setSubscriptionWithManualInvoice(subscription, netTerms, poNumber);
    billingHelper.setSubscriptionWithAddOn(subscription, addOnCode, addOnAmountInCents, quantity);
    Subscription s = createSubscription(subscription);
    return s;
  }
}
