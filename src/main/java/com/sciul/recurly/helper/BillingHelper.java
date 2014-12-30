package com.sciul.recurly.helper;

import org.springframework.stereotype.Component;

import com.sciul.recurly.model.Account;
import com.sciul.recurly.model.NetTerms;
import com.sciul.recurly.model.PoNumber;
import com.sciul.recurly.model.Subscription;
import com.sciul.recurly.model.SubscriptionAddOn;
import com.sciul.recurly.model.SubscriptionAddOns;
import com.sciul.recurly.model.generated.Plans.Plan;
import com.sciul.recurly.model.generated.Plans.Plan.BypassHostedConfirmation;
import com.sciul.recurly.model.generated.Plans.Plan.PlanIntervalLength;
import com.sciul.recurly.model.generated.Plans.Plan.SetupFeeInCents;
import com.sciul.recurly.model.generated.Plans.Plan.SuccessUrl;
import com.sciul.recurly.model.generated.Plans.Plan.TaxExempt;
import com.sciul.recurly.model.generated.Plans.Plan.TotalBillingCycles;
import com.sciul.recurly.model.generated.Plans.Plan.UnitAmountInCents;
import com.sciul.recurly.model.generated.Plans.Plan.UnitAmountInCents.EUR;
import com.sciul.recurly.model.generated.Plans.Plan.UnitAmountInCents.USD;

/**
 * The Class BillingHelper.
 * 
 * @author GauravChawla
 */
@Component
public class BillingHelper {

  /**
   * Sets the plan interval.
   * 
   * @param plan
   *          the plan
   * @param planIntervalLength
   *          the plan interval length
   * @param planIntervalUnit
   *          the plan interval unit
   */
  public void setPlanInterval(Plan plan, Integer planIntervalLength, String planIntervalUnit) {
    PlanIntervalLength interval = new PlanIntervalLength();
    interval.setType(BillingConstants.DATA_TYPE_INTEGER);
    interval.setValue(planIntervalLength);
    plan.setPlanIntervalUnit(planIntervalUnit);
    plan.setPlanIntervalLength(interval);
  }

  /**
   * Sets the success url.
   * 
   * @param plan
   *          the plan
   * @param successURL
   *          the success url
   */
  public void setSuccessURL(Plan plan, String successURL) {
    SuccessUrl s = new SuccessUrl();
    s.setValue(successURL);
    plan.setSuccessUrl(s);
  }

  /**
   * Sets the bypass hosted confirmation.
   * 
   * @param plan
   *          the plan
   * @param bypassHostedConfirmation
   *          the bypass hosted confirmation
   */
  public void setBypassHostedConfirmation(Plan plan, boolean bypassHostedConfirmation) {
    BypassHostedConfirmation b = new BypassHostedConfirmation();
    b.setType(BillingConstants.DATA_TYPE_BOOLEAN);
    b.setValue(Boolean.toString(bypassHostedConfirmation));
    plan.setBypassHostedConfirmation(b);
  }

  /**
   * Sets the unit amount in cents.
   * 
   * @param plan
   *          the plan
   * @param usd
   *          the usd
   * @param eur
   *          the eur
   * @param unitAmountInCentsForUSD
   *          the unit amount in cents for usd
   * @param unitAmountInCentsForEUR
   *          the unit amount in cents for eur
   */
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

  /**
   * Sets the setup fee.
   * 
   * @param plan
   *          the plan
   * @param usd
   *          the usd
   * @param eur
   *          the eur
   * @param setupFeeInCentsUSD
   *          the setup fee in cents usd
   * @param setupFeeInCentsEUR
   *          the setup fee in cents eur
   */
  public void setSetupFee(Plan plan, boolean usd, boolean eur, Integer setupFeeInCentsUSD, Integer setupFeeInCentsEUR) {
    SetupFeeInCents setupFee = new SetupFeeInCents();
    if (usd) {
      com.sciul.recurly.model.generated.Plans.Plan.SetupFeeInCents.USD u =
            new com.sciul.recurly.model.generated.Plans.Plan.SetupFeeInCents.USD();
      u.setValue(setupFeeInCentsUSD);
      setupFee.setUSD(u);
    }
    if (eur) {
      com.sciul.recurly.model.generated.Plans.Plan.SetupFeeInCents.EUR e =
            new com.sciul.recurly.model.generated.Plans.Plan.SetupFeeInCents.EUR();
      e.setValue(setupFeeInCentsEUR);
      setupFee.setEUR(e);
    }
    plan.setSetupFeeInCents(setupFee);
  }

  /**
   * Sets the total billing cycles.
   * 
   * @param plan
   *          the plan
   * @param totalBillingCycles
   *          the total billing cycles
   */
  public void setTotalBillingCycles(Plan plan, Integer totalBillingCycles) {
    TotalBillingCycles cycles = new TotalBillingCycles();
    cycles.setValue(totalBillingCycles.toString());
    plan.setTotalBillingCycles(cycles);
  }

  /**
   * Sets the tax exempt.
   * 
   * @param plan
   *          the plan
   * @param isTaxExempt
   *          the is tax exempt
   */
  public void setTaxExempt(Plan plan, boolean isTaxExempt) {
    TaxExempt t = new TaxExempt();
    t.setValue(Boolean.toString(isTaxExempt));
    plan.setTaxExempt(t);
  }

  /**
   * Sets the plan code name.
   * 
   * @param plan
   *          the plan
   * @param name
   *          the name
   * @param code
   *          the code
   */
  public void setPlanCodeName(Plan plan, String name, String code) {
    plan.setPlanCode(name);
    plan.setName(code);
  }

  /**
   * Sets the account details.
   * 
   * @param acct
   *          the acct
   * @param accountId
   *          the account id
   * @param emailId
   *          the email id
   */
  public void setAccountDetails(Account acct, String accountId, String emailId) {
    acct.setAccountCode(accountId);
    acct.setEmail(emailId);
  }

  /**
   * Sets the subscription with add on.
   * 
   * @param subscription
   *          the subscription
   * @param addOnCode
   *          the add on code
   * @param addOnAmountInCents
   *          the add on amount in cents
   * @param quantity
   *          the quantity
   */
  public void setSubscriptionWithAddOn(Subscription subscription,
        String addOnCode,
        Long addOnAmountInCents,
        Integer quantity) {
    SubscriptionAddOn addOn = new SubscriptionAddOn();
    addOn.setAddOnCode(addOnCode);
    addOn.setQuantity(quantity);
    addOn.setUnitAmountInCents(addOnAmountInCents);

    SubscriptionAddOns addOns = new SubscriptionAddOns();
    addOns.getSubscriptionAddOn().add(addOn);

    subscription.setSubscriptionAddOns(addOns);
  }

  /**
   * Sets the subscription with manual invoice.
   * 
   * @param subscription
   *          the subscription
   * @param netTerms
   *          the net terms
   * @param poNumber
   *          the po number
   */
  public void setSubscriptionWithManualInvoice(Subscription subscription, Integer netTerms, String poNumber) {
    subscription.setCollectionMethod("manual");
    NetTerms terms = new NetTerms();
    terms.setValue(netTerms);
    subscription.setNetTerms(terms);
    PoNumber p = new PoNumber();
    p.setValue(poNumber);
    subscription.setPoNumber(p);
  }

  /**
   * Sets the subscription plan.
   * 
   * @param subscription
   *          the subscription
   * @param planCode
   *          the plan code
   */
  public void setSubscriptionPlan(Subscription subscription, String planCode) {
    com.sciul.recurly.model.Plan plan = new com.sciul.recurly.model.Plan();
    plan.setPlanCode(planCode);
    subscription.setPlan(plan);
  }

}
