package com.sciul.recurly.proxies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;

import com.sciul.recurly.config.RecurlyConfiguration;
import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.helper.BillingConstants;
import com.sciul.recurly.helper.BillingHelper;
import com.sciul.recurly.model.Subscription;

/**
 * The Class SubscriptionsService.
 * 
 * @author GauravChawla
 */
public class SubscriptionProxy extends AbstractProxy {

  private BillingHelper billingHelper = null;

  /**
   * @param recurly
   */
  SubscriptionProxy(RecurlyConfiguration recurly) {
    super(recurly);
    billingHelper = new BillingHelper();
  }

  /** The logger. */
  private static Logger logger = LoggerFactory.getLogger(SubscriptionProxy.class);

  @Override
  public Logger getLogger() {
    return logger;
  }

  /**
   * Creates the subscription.
   * 
   * @param subscription
   *          the subscription
   * @return the subscription
   * @throws RecurlyException
   *           the recurly exception
   */
  public Subscription createSubscription(Subscription subscription) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.SUBSCRIPTIONS.toString(), subscription, Subscription.class,
          HttpMethod.POST);
  }

  /**
   * Creates the subscription with manual invoice.
   * 
   * @param subscription
   *          the subscription
   * @param netTerms
   *          the net terms
   * @param poNumber
   *          the po number
   * @return the subscription
   * @throws RecurlyException
   *           the recurly exception
   */
  public Subscription createSubscriptionWithManualInvoice(Subscription subscription, Integer netTerms, String poNumber)
        throws RecurlyException {
    billingHelper.setSubscriptionWithManualInvoice(subscription, netTerms, poNumber);
    Subscription s = createSubscription(subscription);
    return s;
  }

  /**
   * Creates the subscription with add on.
   * 
   * @param subscription
   *          the subscription
   * @param addOnCode
   *          the add on code
   * @param amountInCents
   *          the amount in cents
   * @param quantity
   *          the quantity
   * @return the subscription
   * @throws RecurlyException
   *           the recurly exception
   */
  public Subscription createSubscriptionWithAddOn(Subscription subscription,
        String addOnCode,
        Long amountInCents,
        Integer quantity) throws RecurlyException {
    billingHelper.setSubscriptionWithAddOn(subscription, addOnCode, amountInCents, quantity);
    Subscription s = createSubscription(subscription);
    return s;
  }

  /**
   * Creates the manual invoice subscription with addon.
   * 
   * @param subscription
   *          the subscription
   * @param netTerms
   *          the net terms
   * @param poNumber
   *          the po number
   * @param addOnCode
   *          the add on code
   * @param addOnAmountInCents
   *          the add on amount in cents
   * @param quantity
   *          the quantity
   * @return the subscription
   * @throws RecurlyException
   *           the recurly exception
   */
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
