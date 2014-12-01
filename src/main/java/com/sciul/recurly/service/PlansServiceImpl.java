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
import com.sciul.recurly.model.Plans;
import com.sciul.recurly.model.Plans.Plan;
import com.sciul.recurly.model.Plans.Plan.BypassHostedConfirmation;
import com.sciul.recurly.model.Plans.Plan.PlanIntervalLength;
import com.sciul.recurly.model.Plans.Plan.SetupFeeInCents;
import com.sciul.recurly.model.Plans.Plan.SuccessUrl;
import com.sciul.recurly.model.Plans.Plan.TaxExempt;
import com.sciul.recurly.model.Plans.Plan.TotalBillingCycles;
import com.sciul.recurly.model.Plans.Plan.UnitAmountInCents;
import com.sciul.recurly.model.Plans.Plan.UnitAmountInCents.USD;
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

  // @Value("${recurly.apiKey}")
  // private String apiKey;

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

  public Plan createPlan(Plan plan) {
    Plan p = null;
    try {
      logger.debug("RecurllyServerURL::::{}", recurly.getRecurllyServerURL());
      logger.debug("RecurllyHeaders::::{}", plan.toString());

      restWsUtils.callRestApiWithHeaders(
            new URI(URIUtil.encodeQuery(recurly.getRecurllyServerURL() + "/v2/plans", "UTF-8")), plan, null,
            HttpMethod.POST, recurly.getRecurllyHeaders());
    } catch (URIException | UnsupportedEncodingException | URISyntaxException e) {
      logger.debug("Error!!!!!!!!!!!!!!! {}", e);
    }
    return p;
  }

  @Override
  public Plan createOneTimeTransactionPlan(String id, Integer priceInCents, String successURL) {
    Plan plan = new Plan();
    plan.setPlanCode(id);
    plan.setName(id);

    PlanIntervalLength interval = new PlanIntervalLength();
    interval.setType("Integer");
    interval.setValue((byte) 1);
    plan.setPlanIntervalLength(interval);
    plan.setPlanIntervalUnit("days");
    SuccessUrl s = new SuccessUrl();
    s.setValue(successURL);
    plan.setSuccessUrl(s);

    BypassHostedConfirmation b = new BypassHostedConfirmation();
    b.setType("boolean");
    b.setValue("true");
    plan.setBypassHostedConfirmation(b);

    UnitAmountInCents amount = new UnitAmountInCents();
    USD usd = new USD();
    usd.setValue(0);
    amount.setUSD(usd);
    plan.setUnitAmountInCents(amount);

    SetupFeeInCents setupFee = new SetupFeeInCents();
    com.sciul.recurly.model.Plans.Plan.SetupFeeInCents.USD usd1 =
          new com.sciul.recurly.model.Plans.Plan.SetupFeeInCents.USD();
    usd1.setValue(priceInCents);
    setupFee.setUSD(usd1);
    plan.setSetupFeeInCents(setupFee);

    TotalBillingCycles cycles = new TotalBillingCycles();
    cycles.setValue("1");
    plan.setTotalBillingCycles(cycles);

    TaxExempt t = new TaxExempt();
    t.setValue("false");
    plan.setTaxExempt(t);

    Plan p = createPlan(plan);
    return p;
  }
}
