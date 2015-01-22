package com.sciul.recurly.proxies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;

import com.sciul.recurly.config.RecurlyConfiguration;
import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.helper.BillingConstants;
import com.sciul.recurly.model.AddOn;
import com.sciul.recurly.model.Plan;
import com.sciul.recurly.model.Plans;

/**
 * The Class PlansService.
 * 
 * @author GauravChawla
 */
public class PlanProxy extends AbstractProxy {

  /**
   * @param recurly
   */
  PlanProxy(RecurlyConfiguration recurly) {
    super(recurly);
  }

  /** The logger. */
  private static Logger logger = LoggerFactory.getLogger(PlanProxy.class);

  @Override
  public Logger getLogger() {
    return logger;
  }

  /**
   * Gets the plans.
   * 
   * @return the plans
   * @throws RecurlyException
   *           the recurly exception
   */
  public Plans getPlans() throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.PLANS.toString(), null, Plans.class, HttpMethod.GET);
  }

  /**
   * Gets the plan.
   * 
   * @param planCode
   *          the plan code
   * @return the plan
   * @throws RecurlyException
   *           the recurly exception
   */
  public Plans getPlan(String planCode) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.PLANS.toString() + planCode, null, Plans.class, HttpMethod.GET);
  }

  /**
   * Creates the plan.
   * 
   * @param plan
   *          the plan
   * @return the plan
   * @throws RecurlyException
   *           the recurly exception
   */
  public Plan createPlan(Plan plan) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.PLANS.toString(), plan, Plan.class, HttpMethod.POST);
  }

  /**
   * Creates the plan addon.
   * 
   * @param planCode
   *          the plan code
   * @param addOn
   *          the add on
   * @return the adds the on
   * @throws RecurlyException
   *           the recurly exception
   */
  public AddOn createPlanAddon(String planCode, AddOn addOn) throws RecurlyException {
    return call(
          BillingConstants.RecurlyApiPath.PLANS.toString() + planCode
                + BillingConstants.RecurlyApiPath.ADDONS.toString(), addOn, AddOn.class, HttpMethod.POST);
  }

}
