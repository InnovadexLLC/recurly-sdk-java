package com.sciul.recurly.helper;

import com.sciul.recurly.model.Plans.Plan;
import com.sciul.recurly.model.Plans.Plan.BypassHostedConfirmation;
import com.sciul.recurly.model.Plans.Plan.PlanIntervalLength;
import com.sciul.recurly.model.Plans.Plan.SetupFeeInCents;
import com.sciul.recurly.model.Plans.Plan.SuccessUrl;
import com.sciul.recurly.model.Plans.Plan.TaxExempt;
import com.sciul.recurly.model.Plans.Plan.TotalBillingCycles;
import com.sciul.recurly.model.Plans.Plan.UnitAmountInCents;
import com.sciul.recurly.model.Plans.Plan.UnitAmountInCents.USD;

public class BillingHelper {

  public void setPlanInterval(Plan plan, Integer planIntervalLength, String planIntervalUnit) {
    PlanIntervalLength interval = new PlanIntervalLength();
    interval.setType(BillingConstants.PLAN_INTERVAL_LENGTH_TYPE_INTEGER);
    interval.setValue(planIntervalLength);
    plan.setPlanIntervalUnit(planIntervalUnit);
    plan.setPlanIntervalLength(interval);
  }

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
