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
import com.sciul.recurly.helper.BillingConstants;
import com.sciul.recurly.helper.BillingHelper;
import com.sciul.recurly.model.Plans;
import com.sciul.recurly.model.Plans.Plan;
import com.sciul.recurly.model.n.AddOn;
import com.sciul.sdk.helper.RestWsUtils;

/**
 * @author Gaurav
 */
@Service
public class PlansServiceImpl implements PlansService {

  private static Logger logger = LoggerFactory.getLogger(PlansServiceImpl.class);

  @Autowired
  private RestWsUtils restWsUtils;

  @Autowired
  private RecurlyConfiguration recurly;

  @Autowired
  private BillingHelper billingHelper;

  @Override
  public Plans getPlans() {
    logger.debug("RecurllyServerURL::::{}", "HERE");
    Plans plans = null;
    try {
      logger.debug("RecurllyServerURL::::{}", recurly.getRecurllyServerURL());
      plans =
            restWsUtils.callRestApiWithHeaders(
                  new URI(URIUtil.encodeQuery(recurly.getRecurllyServerURL() + "/v2/plans", "UTF-8")), null,
                  Plans.class, HttpMethod.GET, recurly.getRecurllyHeaders());
    } catch (URIException | URISyntaxException | UnsupportedEncodingException e) {
      logger.debug("Error!!!!!!!!!!!!!!! {}", e);
    }
    return plans;
  }

  @Override
  public com.sciul.recurly.model.n.Plans getNewPlans() {
    logger.debug("RecurllyServerURL::::{}", "HERE");
    com.sciul.recurly.model.n.Plans plans = null;
    try {
      logger.debug("RecurllyServerURL::::{}", recurly.getRecurllyServerURL());
      plans =
            restWsUtils.callRestApiWithHeaders(
                  new URI(URIUtil.encodeQuery(recurly.getRecurllyServerURL() + "/v2/plans", "UTF-8")), null,
                  com.sciul.recurly.model.n.Plans.class, HttpMethod.GET, recurly.getRecurllyHeaders());
    } catch (URIException | URISyntaxException | UnsupportedEncodingException e) {
      logger.debug("Error!!!!!!!!!!!!!!! {}", e);
    }
    return plans;
  }

  @Override
  public com.sciul.recurly.model.n.Plan createSubscriptionPlan(com.sciul.recurly.model.n.Plan plan) {
    com.sciul.recurly.model.n.Plan p = null;
    try {
      logger.debug("RecurllyServerURL::::{}", recurly.getRecurllyServerURL());
      logger.debug("RecurllyHeaders::::{}", plan.toString());

      p =
            restWsUtils.callRestApiWithHeaders(
                  new URI(URIUtil.encodeQuery(recurly.getRecurllyServerURL() + "/v2/plans", "UTF-8")), plan,
                  com.sciul.recurly.model.n.Plan.class, HttpMethod.POST, recurly.getRecurllyHeaders());
    } catch (URIException | UnsupportedEncodingException | URISyntaxException e) {
      logger.debug("Error!!!!!!!!!!!!!!! {}", e);
    }
    return p;
  }

  @Override
  public AddOn createPlanAddon(String planCode, AddOn addOn) {
    AddOn result = null;
    try {
      logger.debug("RecurllyServerURL::::{}", recurly.getRecurllyServerURL());
      logger.debug("RecurllyPost::::{}", addOn.toString());

      result =
            restWsUtils.callRestApiWithHeaders(
                  new URI(URIUtil.encodeQuery(recurly.getRecurllyServerURL() + "/v2/plans/" + planCode + "/add_ons",
                        "UTF-8")), addOn, AddOn.class, HttpMethod.POST, recurly.getRecurllyHeaders());
    } catch (URIException | UnsupportedEncodingException | URISyntaxException e) {
      logger.debug("Error!!!!!!!!!!!!!!! {}", e);
    }
    return result;
  }

  @Override
  public Plan createPlan(Plan plan) {
    Plan p = null;
    try {
      logger.debug("RecurllyServerURL::::{}", recurly.getRecurllyServerURL());
      logger.debug("RecurllyHeaders::::{}", plan.toString());

      p =
            restWsUtils.callRestApiWithHeaders(
                  new URI(URIUtil.encodeQuery(recurly.getRecurllyServerURL() + "/v2/plans", "UTF-8")), plan,
                  Plan.class, HttpMethod.POST, recurly.getRecurllyHeaders());
    } catch (URIException | UnsupportedEncodingException | URISyntaxException e) {
      logger.debug("Error!!!!!!!!!!!!!!! {}", e);
    }
    return p;
  }

  @Override
  public Plan createOneTimeTransactionPlan(String planName, Integer priceInCents, String successURL) {
    Plan plan = new Plan();
    billingHelper.setPlanCodeName(plan, planName, planName);
    billingHelper.setPlanInterval(plan, 1, BillingConstants.PLAN_INTERVAL_DAYS);
    billingHelper.setSuccessURL(plan, successURL);
    billingHelper.setBypassHostedConfirmation(plan, true);
    billingHelper.setUnitAmountInCents(plan, true, false, 0, 0);
    billingHelper.setSetupFee(plan, true, false, priceInCents, 0);
    billingHelper.setTotalBillingCycles(plan, 1);
    billingHelper.setTaxExempt(plan, false);

    Plan p = createPlan(plan);
    return p;
  }

  @Override
  public String getHostedPaymentPageURL(String planName) {
    return recurly.getRecurllyServerURL() + "/" + BillingConstants.SUBSCRIBE_URL + "/" + planName;
  }

}
