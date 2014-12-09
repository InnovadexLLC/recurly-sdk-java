package com.sciul.recurly.service;

import com.sciul.recurly.model.Plans;
import com.sciul.recurly.model.Plans.Plan;

/**
 * @author gaurav
 */
public interface PlansService {
  public Plans getPlans();

  public Plan createOneTimeTransactionPlan(String id, Integer priceInCents, String successURL);

  String getHostedPaymentPageURL(String planName);

  com.sciul.recurly.model.n.Plans getNewPlans();

  com.sciul.recurly.model.n.Plan createSubscriptionPlan(com.sciul.recurly.model.n.Plan plan);

  Plan createPlan(Plan plan);

}
