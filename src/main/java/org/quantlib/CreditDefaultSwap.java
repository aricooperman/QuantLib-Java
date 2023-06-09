/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CreditDefaultSwap extends Instrument {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected CreditDefaultSwap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CreditDefaultSwap_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CreditDefaultSwap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        QuantLibJNI.delete_CreditDefaultSwap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime, Date protectionStart, Claim claim, DayCounter lastPeriodDayCounter, boolean rebatesAccrual, Date tradeDate, long cashSettlementDays) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_0(side.swigValue(), notional, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime, Date.getCPtr(protectionStart), protectionStart, Claim.getCPtr(claim), claim, DayCounter.getCPtr(lastPeriodDayCounter), lastPeriodDayCounter, rebatesAccrual, Date.getCPtr(tradeDate), tradeDate, cashSettlementDays), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime, Date protectionStart, Claim claim, DayCounter lastPeriodDayCounter, boolean rebatesAccrual, Date tradeDate) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_1(side.swigValue(), notional, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime, Date.getCPtr(protectionStart), protectionStart, Claim.getCPtr(claim), claim, DayCounter.getCPtr(lastPeriodDayCounter), lastPeriodDayCounter, rebatesAccrual, Date.getCPtr(tradeDate), tradeDate), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime, Date protectionStart, Claim claim, DayCounter lastPeriodDayCounter, boolean rebatesAccrual) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_2(side.swigValue(), notional, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime, Date.getCPtr(protectionStart), protectionStart, Claim.getCPtr(claim), claim, DayCounter.getCPtr(lastPeriodDayCounter), lastPeriodDayCounter, rebatesAccrual), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime, Date protectionStart, Claim claim, DayCounter lastPeriodDayCounter) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_3(side.swigValue(), notional, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime, Date.getCPtr(protectionStart), protectionStart, Claim.getCPtr(claim), claim, DayCounter.getCPtr(lastPeriodDayCounter), lastPeriodDayCounter), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime, Date protectionStart, Claim claim) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_4(side.swigValue(), notional, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime, Date.getCPtr(protectionStart), protectionStart, Claim.getCPtr(claim), claim), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime, Date protectionStart) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_5(side.swigValue(), notional, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime, Date.getCPtr(protectionStart), protectionStart), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_6(side.swigValue(), notional, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_7(side.swigValue(), notional, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_8(side.swigValue(), notional, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double upfront, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime, Date protectionStart, Date upfrontDate, Claim claim, DayCounter lastPeriodDayCounter, boolean rebatesAccrual, Date tradeDate, long cashSettlementDays) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_9(side.swigValue(), notional, upfront, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime, Date.getCPtr(protectionStart), protectionStart, Date.getCPtr(upfrontDate), upfrontDate, Claim.getCPtr(claim), claim, DayCounter.getCPtr(lastPeriodDayCounter), lastPeriodDayCounter, rebatesAccrual, Date.getCPtr(tradeDate), tradeDate, cashSettlementDays), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double upfront, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime, Date protectionStart, Date upfrontDate, Claim claim, DayCounter lastPeriodDayCounter, boolean rebatesAccrual, Date tradeDate) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_10(side.swigValue(), notional, upfront, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime, Date.getCPtr(protectionStart), protectionStart, Date.getCPtr(upfrontDate), upfrontDate, Claim.getCPtr(claim), claim, DayCounter.getCPtr(lastPeriodDayCounter), lastPeriodDayCounter, rebatesAccrual, Date.getCPtr(tradeDate), tradeDate), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double upfront, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime, Date protectionStart, Date upfrontDate, Claim claim, DayCounter lastPeriodDayCounter, boolean rebatesAccrual) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_11(side.swigValue(), notional, upfront, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime, Date.getCPtr(protectionStart), protectionStart, Date.getCPtr(upfrontDate), upfrontDate, Claim.getCPtr(claim), claim, DayCounter.getCPtr(lastPeriodDayCounter), lastPeriodDayCounter, rebatesAccrual), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double upfront, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime, Date protectionStart, Date upfrontDate, Claim claim, DayCounter lastPeriodDayCounter) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_12(side.swigValue(), notional, upfront, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime, Date.getCPtr(protectionStart), protectionStart, Date.getCPtr(upfrontDate), upfrontDate, Claim.getCPtr(claim), claim, DayCounter.getCPtr(lastPeriodDayCounter), lastPeriodDayCounter), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double upfront, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime, Date protectionStart, Date upfrontDate, Claim claim) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_13(side.swigValue(), notional, upfront, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime, Date.getCPtr(protectionStart), protectionStart, Date.getCPtr(upfrontDate), upfrontDate, Claim.getCPtr(claim), claim), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double upfront, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime, Date protectionStart, Date upfrontDate) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_14(side.swigValue(), notional, upfront, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime, Date.getCPtr(protectionStart), protectionStart, Date.getCPtr(upfrontDate), upfrontDate), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double upfront, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime, Date protectionStart) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_15(side.swigValue(), notional, upfront, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime, Date.getCPtr(protectionStart), protectionStart), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double upfront, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual, boolean paysAtDefaultTime) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_16(side.swigValue(), notional, upfront, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual, paysAtDefaultTime), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double upfront, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter, boolean settlesAccrual) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_17(side.swigValue(), notional, upfront, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, settlesAccrual), true);
  }

  public CreditDefaultSwap(Protection.Side side, double notional, double upfront, double spread, Schedule schedule, BusinessDayConvention paymentConvention, DayCounter dayCounter) {
    this(QuantLibJNI.new_CreditDefaultSwap__SWIG_18(side.swigValue(), notional, upfront, spread, Schedule.getCPtr(schedule), schedule, paymentConvention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public Protection.Side side() {
    return Protection.Side.swigToEnum(QuantLibJNI.CreditDefaultSwap_side(swigCPtr, this));
  }

  public double notional() {
    return QuantLibJNI.CreditDefaultSwap_notional(swigCPtr, this);
  }

  public double runningSpread() {
    return QuantLibJNI.CreditDefaultSwap_runningSpread(swigCPtr, this);
  }

  public double upfront() {
    return QuantLibJNI.CreditDefaultSwap_upfront(swigCPtr, this);
  }

  public boolean settlesAccrual() {
    return QuantLibJNI.CreditDefaultSwap_settlesAccrual(swigCPtr, this);
  }

  public boolean paysAtDefaultTime() {
    return QuantLibJNI.CreditDefaultSwap_paysAtDefaultTime(swigCPtr, this);
  }

  public Leg coupons() {
    return new Leg(QuantLibJNI.CreditDefaultSwap_coupons(swigCPtr, this), true);
  }

  public Date protectionStartDate() {
    return new Date(QuantLibJNI.CreditDefaultSwap_protectionStartDate(swigCPtr, this), false);
  }

  public Date protectionEndDate() {
    return new Date(QuantLibJNI.CreditDefaultSwap_protectionEndDate(swigCPtr, this), false);
  }

  public boolean rebatesAccrual() {
    return QuantLibJNI.CreditDefaultSwap_rebatesAccrual(swigCPtr, this);
  }

  public CashFlow upfrontPayment() {
    long cPtr = QuantLibJNI.CreditDefaultSwap_upfrontPayment(swigCPtr, this);
    return (cPtr == 0) ? null : new CashFlow(cPtr, true);
  }

  public CashFlow accrualRebate() {
    long cPtr = QuantLibJNI.CreditDefaultSwap_accrualRebate(swigCPtr, this);
    return (cPtr == 0) ? null : new CashFlow(cPtr, true);
  }

  public Date tradeDate() {
    return new Date(QuantLibJNI.CreditDefaultSwap_tradeDate(swigCPtr, this), false);
  }

  public long cashSettlementDays() {
    return QuantLibJNI.CreditDefaultSwap_cashSettlementDays(swigCPtr, this);
  }

  public double fairUpfront() {
    return QuantLibJNI.CreditDefaultSwap_fairUpfront(swigCPtr, this);
  }

  public double fairSpread() {
    return QuantLibJNI.CreditDefaultSwap_fairSpread(swigCPtr, this);
  }

  public double couponLegBPS() {
    return QuantLibJNI.CreditDefaultSwap_couponLegBPS(swigCPtr, this);
  }

  public double upfrontBPS() {
    return QuantLibJNI.CreditDefaultSwap_upfrontBPS(swigCPtr, this);
  }

  public double couponLegNPV() {
    return QuantLibJNI.CreditDefaultSwap_couponLegNPV(swigCPtr, this);
  }

  public double defaultLegNPV() {
    return QuantLibJNI.CreditDefaultSwap_defaultLegNPV(swigCPtr, this);
  }

  public double upfrontNPV() {
    return QuantLibJNI.CreditDefaultSwap_upfrontNPV(swigCPtr, this);
  }

  public double accrualRebateNPV() {
    return QuantLibJNI.CreditDefaultSwap_accrualRebateNPV(swigCPtr, this);
  }

  public double impliedHazardRate(double targetNPV, YieldTermStructureHandle discountCurve, DayCounter dayCounter, double recoveryRate, double accuracy, CreditDefaultSwap.PricingModel model) {
    return QuantLibJNI.CreditDefaultSwap_impliedHazardRate__SWIG_0(swigCPtr, this, targetNPV, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, DayCounter.getCPtr(dayCounter), dayCounter, recoveryRate, accuracy, model.swigValue());
  }

  public double impliedHazardRate(double targetNPV, YieldTermStructureHandle discountCurve, DayCounter dayCounter, double recoveryRate, double accuracy) {
    return QuantLibJNI.CreditDefaultSwap_impliedHazardRate__SWIG_1(swigCPtr, this, targetNPV, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, DayCounter.getCPtr(dayCounter), dayCounter, recoveryRate, accuracy);
  }

  public double impliedHazardRate(double targetNPV, YieldTermStructureHandle discountCurve, DayCounter dayCounter, double recoveryRate) {
    return QuantLibJNI.CreditDefaultSwap_impliedHazardRate__SWIG_2(swigCPtr, this, targetNPV, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, DayCounter.getCPtr(dayCounter), dayCounter, recoveryRate);
  }

  public double impliedHazardRate(double targetNPV, YieldTermStructureHandle discountCurve, DayCounter dayCounter) {
    return QuantLibJNI.CreditDefaultSwap_impliedHazardRate__SWIG_3(swigCPtr, this, targetNPV, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, DayCounter.getCPtr(dayCounter), dayCounter);
  }

  public double conventionalSpread(double conventionalRecovery, YieldTermStructureHandle discountCurve, DayCounter dayCounter, CreditDefaultSwap.PricingModel model) {
    return QuantLibJNI.CreditDefaultSwap_conventionalSpread__SWIG_0(swigCPtr, this, conventionalRecovery, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, DayCounter.getCPtr(dayCounter), dayCounter, model.swigValue());
  }

  public double conventionalSpread(double conventionalRecovery, YieldTermStructureHandle discountCurve, DayCounter dayCounter) {
    return QuantLibJNI.CreditDefaultSwap_conventionalSpread__SWIG_1(swigCPtr, this, conventionalRecovery, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, DayCounter.getCPtr(dayCounter), dayCounter);
  }

  public final static class PricingModel {
    public final static CreditDefaultSwap.PricingModel Midpoint = new CreditDefaultSwap.PricingModel("Midpoint");
    public final static CreditDefaultSwap.PricingModel ISDA = new CreditDefaultSwap.PricingModel("ISDA");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static PricingModel swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + PricingModel.class + " with value " + swigValue);
    }

    private PricingModel(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private PricingModel(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private PricingModel(String swigName, PricingModel swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static PricingModel[] swigValues = { Midpoint, ISDA };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
