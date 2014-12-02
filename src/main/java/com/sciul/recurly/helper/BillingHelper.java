package com.sciul.recurly.helper;

import org.springframework.stereotype.Component;

import com.sciul.recurly.model.Plans.Plan;
import com.sciul.recurly.model.Plans.Plan.BypassHostedConfirmation;
import com.sciul.recurly.model.Plans.Plan.PlanIntervalLength;
import com.sciul.recurly.model.Plans.Plan.SetupFeeInCents;
import com.sciul.recurly.model.Plans.Plan.SuccessUrl;
import com.sciul.recurly.model.Plans.Plan.TaxExempt;
import com.sciul.recurly.model.Plans.Plan.TotalBillingCycles;
import com.sciul.recurly.model.Plans.Plan.UnitAmountInCents;
import com.sciul.recurly.model.Plans.Plan.UnitAmountInCents.EUR;
import com.sciul.recurly.model.Plans.Plan.UnitAmountInCents.USD;

@Component
public class BillingHelper {

  public void setPlanInterval(Plan plan, Integer planIntervalLength, String planIntervalUnit) {
    PlanIntervalLength interval = new PlanIntervalLength();
    interval.setType(BillingConstants.DATA_TYPE_INTEGER);
    interval.setValue(planIntervalLength);
    plan.setPlanIntervalUnit(planIntervalUnit);
    plan.setPlanIntervalLength(interval);
  }

  public void setSuccessURL(Plan plan, String successURL) {
    SuccessUrl s = new SuccessUrl();
    s.setValue(successURL);
    plan.setSuccessUrl(s);
  }

  public void setBypassHostedConfirmation(Plan plan, boolean bypassHostedConfirmation) {
    BypassHostedConfirmation b = new BypassHostedConfirmation();
    b.setType(BillingConstants.DATA_TYPE_BOOLEAN);
    b.setValue(Boolean.toString(bypassHostedConfirmation));
    plan.setBypassHostedConfirmation(b);
  }

  public void setUnitAmountInCents(Plan plan,
        boolean usd,
        boolean eur,
        Integer unitAmountInCentsForUSD,
        Integer unitAmountInCentsForEUR) {
    UnitAmountInCents amount = new UnitAmountInCents();
    if (usd) {
      USD u = new USD();
      u.setValue(unitAmountInCentsForUSD);
      amount.setUSD(u);
    }
    if (eur) {
      EUR e = new EUR();
      e.setValue(unitAmountInCentsForEUR);
      amount.setEUR(e);
    }
    plan.setUnitAmountInCents(amount);
  }

  public void setSetupFee(Plan plan, boolean usd, boolean eur, Integer setupFeeInCentsUSD, Integer setupFeeInCentsEUR) {
    SetupFeeInCents setupFee = new SetupFeeInCents();
    if (usd) {
      com.sciul.recurly.model.Plans.Plan.SetupFeeInCents.USD u =
            new com.sciul.recurly.model.Plans.Plan.SetupFeeInCents.USD();
      u.setValue(setupFeeInCentsUSD);
      setupFee.setUSD(u);
    }
    if (eur) {
      com.sciul.recurly.model.Plans.Plan.SetupFeeInCents.EUR e =
            new com.sciul.recurly.model.Plans.Plan.SetupFeeInCents.EUR();
      e.setValue(setupFeeInCentsEUR);
      setupFee.setEUR(e);
    }
    plan.setSetupFeeInCents(setupFee);
  }

  public void setTotalBillingCycles(Plan plan, Integer totalBillingCycles) {
    TotalBillingCycles cycles = new TotalBillingCycles();
    cycles.setValue(totalBillingCycles.toString());
    plan.setTotalBillingCycles(cycles);
  }

  public void setTaxExempt(Plan plan, boolean isTaxExempt) {
    TaxExempt t = new TaxExempt();
    t.setValue(Boolean.toString(isTaxExempt));
    plan.setTaxExempt(t);
  }

  public void setPlanCodeName(Plan plan, String name, String code) {
    plan.setPlanCode(name);
    plan.setName(code);
  }

}
