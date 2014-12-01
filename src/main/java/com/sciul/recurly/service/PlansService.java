package com.sciul.recurly.service;

import com.sciul.recurly.model.Plans;
import com.sciul.recurly.model.Plans.Plan;

/**
 * @author gaurav
 */
public interface PlansService {
  public Plans getPlans();

  public Plan createOneTimeTransactionPlan(String id, Integer priceInCents, String successURL);
}
