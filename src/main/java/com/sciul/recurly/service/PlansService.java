package com.sciul.recurly.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.helper.BillingConstants;
import com.sciul.recurly.helper.BillingHelper;
import com.sciul.recurly.model.AddOn;
import com.sciul.recurly.model.Plan;
import com.sciul.recurly.model.Plans;

/**
 * @author Gaurav
 */
@Service
public class PlansService extends AbsctractService {

  @SuppressWarnings("unused")
  private static Logger logger = LoggerFactory.getLogger(PlansService.class);

  @Autowired
  private BillingHelper billingHelper;

  public Plans getPlans() throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.PLANS.toString(), null, Plans.class, HttpMethod.GET);
  }

  public Plans getPlan(String planCode) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.PLANS.toString() + planCode, null, Plans.class, HttpMethod.GET);
  }

  public Plan createPlan(Plan plan) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.PLANS.toString(), plan, Plan.class, HttpMethod.POST);
  }

  public AddOn createPlanAddon(String planCode, AddOn addOn) throws RecurlyException {
    return call(
          BillingConstants.RecurlyApiPath.PLANS.toString() + planCode
                + BillingConstants.RecurlyApiPath.ADDONS.toString(), addOn, AddOn.class, HttpMethod.POST);
  }

}
