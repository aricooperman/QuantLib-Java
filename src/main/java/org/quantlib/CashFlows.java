/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CashFlows {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CashFlows(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CashFlows obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CashFlows(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static Date startDate(Leg arg0) {
    return new Date(QuantLibJNI.CashFlows_startDate(Leg.getCPtr(arg0), arg0), true);
  }

  public static Date maturityDate(Leg arg0) {
    return new Date(QuantLibJNI.CashFlows_maturityDate(Leg.getCPtr(arg0), arg0), true);
  }

  public static Date previousCashFlowDate(Leg leg, boolean includeSettlementDateFlows, Date settlementDate) {
    return new Date(QuantLibJNI.CashFlows_previousCashFlowDate__SWIG_0(Leg.getCPtr(leg), leg, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate), true);
  }

  public static Date previousCashFlowDate(Leg leg, boolean includeSettlementDateFlows) {
    return new Date(QuantLibJNI.CashFlows_previousCashFlowDate__SWIG_1(Leg.getCPtr(leg), leg, includeSettlementDateFlows), true);
  }

  public static Date nextCashFlowDate(Leg leg, boolean includeSettlementDateFlows, Date settlementDate) {
    return new Date(QuantLibJNI.CashFlows_nextCashFlowDate__SWIG_0(Leg.getCPtr(leg), leg, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate), true);
  }

  public static Date nextCashFlowDate(Leg leg, boolean includeSettlementDateFlows) {
    return new Date(QuantLibJNI.CashFlows_nextCashFlowDate__SWIG_1(Leg.getCPtr(leg), leg, includeSettlementDateFlows), true);
  }

  public static double previousCashFlowAmount(Leg leg, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_previousCashFlowAmount__SWIG_0(Leg.getCPtr(leg), leg, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double previousCashFlowAmount(Leg leg, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_previousCashFlowAmount__SWIG_1(Leg.getCPtr(leg), leg, includeSettlementDateFlows);
  }

  public static double nextCashFlowAmount(Leg leg, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_nextCashFlowAmount__SWIG_0(Leg.getCPtr(leg), leg, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double nextCashFlowAmount(Leg leg, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_nextCashFlowAmount__SWIG_1(Leg.getCPtr(leg), leg, includeSettlementDateFlows);
  }

  public static CashFlow previousCashFlow(Leg leg, boolean includeSettlementDateFlows, Date settlementDate) {
    long cPtr = QuantLibJNI.CashFlows_previousCashFlow__SWIG_0(Leg.getCPtr(leg), leg, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
    return (cPtr == 0) ? null : new CashFlow(cPtr, true);
  }

  public static CashFlow previousCashFlow(Leg leg, boolean includeSettlementDateFlows) {
    long cPtr = QuantLibJNI.CashFlows_previousCashFlow__SWIG_1(Leg.getCPtr(leg), leg, includeSettlementDateFlows);
    return (cPtr == 0) ? null : new CashFlow(cPtr, true);
  }

  public static CashFlow nextCashFlow(Leg leg, boolean includeSettlementDateFlows, Date settlementDate) {
    long cPtr = QuantLibJNI.CashFlows_nextCashFlow__SWIG_0(Leg.getCPtr(leg), leg, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
    return (cPtr == 0) ? null : new CashFlow(cPtr, true);
  }

  public static CashFlow nextCashFlow(Leg leg, boolean includeSettlementDateFlows) {
    long cPtr = QuantLibJNI.CashFlows_nextCashFlow__SWIG_1(Leg.getCPtr(leg), leg, includeSettlementDateFlows);
    return (cPtr == 0) ? null : new CashFlow(cPtr, true);
  }

  public static double npv(Leg leg, YieldTermStructure discountCurve, double zSpread, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_npv__SWIG_0(Leg.getCPtr(leg), leg, YieldTermStructure.getCPtr(discountCurve), discountCurve, zSpread, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double npv(Leg leg, YieldTermStructure discountCurve, double zSpread, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_npv__SWIG_1(Leg.getCPtr(leg), leg, YieldTermStructure.getCPtr(discountCurve), discountCurve, zSpread, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double npv(Leg leg, YieldTermStructure discountCurve, double zSpread, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_npv__SWIG_2(Leg.getCPtr(leg), leg, YieldTermStructure.getCPtr(discountCurve), discountCurve, zSpread, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows);
  }

  public static double npv(Leg leg, YieldTermStructureHandle discountCurve, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_npv__SWIG_3(Leg.getCPtr(leg), leg, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double npv(Leg leg, YieldTermStructureHandle discountCurve, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_npv__SWIG_4(Leg.getCPtr(leg), leg, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double npv(Leg leg, YieldTermStructureHandle discountCurve, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_npv__SWIG_5(Leg.getCPtr(leg), leg, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows);
  }

  public static double npv(Leg arg0, InterestRate arg1, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_npv__SWIG_6(Leg.getCPtr(arg0), arg0, InterestRate.getCPtr(arg1), arg1, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double npv(Leg arg0, InterestRate arg1, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_npv__SWIG_7(Leg.getCPtr(arg0), arg0, InterestRate.getCPtr(arg1), arg1, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double npv(Leg arg0, InterestRate arg1, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_npv__SWIG_8(Leg.getCPtr(arg0), arg0, InterestRate.getCPtr(arg1), arg1, includeSettlementDateFlows);
  }

  public static double npv(Leg arg0, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_npv__SWIG_9(Leg.getCPtr(arg0), arg0, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double npv(Leg arg0, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_npv__SWIG_10(Leg.getCPtr(arg0), arg0, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double npv(Leg arg0, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_npv__SWIG_11(Leg.getCPtr(arg0), arg0, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows);
  }

  public static double bps(Leg leg, YieldTermStructure discountCurve, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_bps__SWIG_0(Leg.getCPtr(leg), leg, YieldTermStructure.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double bps(Leg leg, YieldTermStructure discountCurve, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_bps__SWIG_1(Leg.getCPtr(leg), leg, YieldTermStructure.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double bps(Leg leg, YieldTermStructure discountCurve, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_bps__SWIG_2(Leg.getCPtr(leg), leg, YieldTermStructure.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows);
  }

  public static double bps(Leg leg, YieldTermStructureHandle discountCurve, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_bps__SWIG_3(Leg.getCPtr(leg), leg, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double bps(Leg leg, YieldTermStructureHandle discountCurve, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_bps__SWIG_4(Leg.getCPtr(leg), leg, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double bps(Leg leg, YieldTermStructureHandle discountCurve, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_bps__SWIG_5(Leg.getCPtr(leg), leg, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows);
  }

  public static double bps(Leg arg0, InterestRate arg1, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_bps__SWIG_6(Leg.getCPtr(arg0), arg0, InterestRate.getCPtr(arg1), arg1, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double bps(Leg arg0, InterestRate arg1, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_bps__SWIG_7(Leg.getCPtr(arg0), arg0, InterestRate.getCPtr(arg1), arg1, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double bps(Leg arg0, InterestRate arg1, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_bps__SWIG_8(Leg.getCPtr(arg0), arg0, InterestRate.getCPtr(arg1), arg1, includeSettlementDateFlows);
  }

  public static double bps(Leg arg0, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_bps__SWIG_9(Leg.getCPtr(arg0), arg0, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double bps(Leg arg0, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_bps__SWIG_10(Leg.getCPtr(arg0), arg0, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double bps(Leg arg0, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_bps__SWIG_11(Leg.getCPtr(arg0), arg0, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows);
  }

  public static DoublePair npvbps(Leg leg, YieldTermStructure discountCurve, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return new DoublePair(QuantLibJNI.CashFlows_npvbps__SWIG_0(Leg.getCPtr(leg), leg, YieldTermStructure.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate), true);
  }

  public static DoublePair npvbps(Leg leg, YieldTermStructure discountCurve, boolean includeSettlementDateFlows, Date settlementDate) {
    return new DoublePair(QuantLibJNI.CashFlows_npvbps__SWIG_1(Leg.getCPtr(leg), leg, YieldTermStructure.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate), true);
  }

  public static DoublePair npvbps(Leg leg, YieldTermStructure discountCurve, boolean includeSettlementDateFlows) {
    return new DoublePair(QuantLibJNI.CashFlows_npvbps__SWIG_2(Leg.getCPtr(leg), leg, YieldTermStructure.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows), true);
  }

  public static DoublePair npvbps(Leg leg, YieldTermStructureHandle discountCurve, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return new DoublePair(QuantLibJNI.CashFlows_npvbps__SWIG_3(Leg.getCPtr(leg), leg, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate), true);
  }

  public static DoublePair npvbps(Leg leg, YieldTermStructureHandle discountCurve, boolean includeSettlementDateFlows, Date settlementDate) {
    return new DoublePair(QuantLibJNI.CashFlows_npvbps__SWIG_4(Leg.getCPtr(leg), leg, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate), true);
  }

  public static DoublePair npvbps(Leg leg, YieldTermStructureHandle discountCurve, boolean includeSettlementDateFlows) {
    return new DoublePair(QuantLibJNI.CashFlows_npvbps__SWIG_5(Leg.getCPtr(leg), leg, YieldTermStructureHandle.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows), true);
  }

  public static double atmRate(Leg leg, YieldTermStructure discountCurve, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate, double npv) {
    return QuantLibJNI.CashFlows_atmRate__SWIG_0(Leg.getCPtr(leg), leg, YieldTermStructure.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate, npv);
  }

  public static double atmRate(Leg leg, YieldTermStructure discountCurve, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_atmRate__SWIG_1(Leg.getCPtr(leg), leg, YieldTermStructure.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double atmRate(Leg leg, YieldTermStructure discountCurve, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_atmRate__SWIG_2(Leg.getCPtr(leg), leg, YieldTermStructure.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double atmRate(Leg leg, YieldTermStructure discountCurve, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_atmRate__SWIG_3(Leg.getCPtr(leg), leg, YieldTermStructure.getCPtr(discountCurve), discountCurve, includeSettlementDateFlows);
  }

  public static double yield(Leg arg0, double npv, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate, double accuracy, long maxIterations, double guess) {
    return QuantLibJNI.CashFlows_yield__SWIG_0(Leg.getCPtr(arg0), arg0, npv, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate, accuracy, maxIterations, guess);
  }

  public static double yield(Leg arg0, double npv, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate, double accuracy, long maxIterations) {
    return QuantLibJNI.CashFlows_yield__SWIG_1(Leg.getCPtr(arg0), arg0, npv, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate, accuracy, maxIterations);
  }

  public static double yield(Leg arg0, double npv, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate, double accuracy) {
    return QuantLibJNI.CashFlows_yield__SWIG_2(Leg.getCPtr(arg0), arg0, npv, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate, accuracy);
  }

  public static double yield(Leg arg0, double npv, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_yield__SWIG_3(Leg.getCPtr(arg0), arg0, npv, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double yield(Leg arg0, double npv, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_yield__SWIG_4(Leg.getCPtr(arg0), arg0, npv, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double yield(Leg arg0, double npv, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_yield__SWIG_5(Leg.getCPtr(arg0), arg0, npv, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows);
  }

  public static double duration(Leg arg0, InterestRate arg1, Duration.Type type, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_duration__SWIG_0(Leg.getCPtr(arg0), arg0, InterestRate.getCPtr(arg1), arg1, type.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double duration(Leg arg0, InterestRate arg1, Duration.Type type, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_duration__SWIG_1(Leg.getCPtr(arg0), arg0, InterestRate.getCPtr(arg1), arg1, type.swigValue(), includeSettlementDateFlows);
  }

  public static double duration(Leg arg0, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, Duration.Type type, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_duration__SWIG_2(Leg.getCPtr(arg0), arg0, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), type.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double duration(Leg arg0, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, Duration.Type type, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_duration__SWIG_3(Leg.getCPtr(arg0), arg0, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), type.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double duration(Leg arg0, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, Duration.Type type, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_duration__SWIG_4(Leg.getCPtr(arg0), arg0, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), type.swigValue(), includeSettlementDateFlows);
  }

  public static double convexity(Leg arg0, InterestRate arg1, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_convexity__SWIG_0(Leg.getCPtr(arg0), arg0, InterestRate.getCPtr(arg1), arg1, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double convexity(Leg arg0, InterestRate arg1, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_convexity__SWIG_1(Leg.getCPtr(arg0), arg0, InterestRate.getCPtr(arg1), arg1, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double convexity(Leg arg0, InterestRate arg1, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_convexity__SWIG_2(Leg.getCPtr(arg0), arg0, InterestRate.getCPtr(arg1), arg1, includeSettlementDateFlows);
  }

  public static double convexity(Leg arg0, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_convexity__SWIG_3(Leg.getCPtr(arg0), arg0, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double convexity(Leg arg0, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_convexity__SWIG_4(Leg.getCPtr(arg0), arg0, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double convexity(Leg arg0, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_convexity__SWIG_5(Leg.getCPtr(arg0), arg0, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows);
  }

  public static double basisPointValue(Leg leg, InterestRate yield, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_basisPointValue__SWIG_0(Leg.getCPtr(leg), leg, InterestRate.getCPtr(yield), yield, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double basisPointValue(Leg leg, InterestRate yield, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_basisPointValue__SWIG_1(Leg.getCPtr(leg), leg, InterestRate.getCPtr(yield), yield, includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double basisPointValue(Leg leg, InterestRate yield, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_basisPointValue__SWIG_2(Leg.getCPtr(leg), leg, InterestRate.getCPtr(yield), yield, includeSettlementDateFlows);
  }

  public static double basisPointValue(Leg leg, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_basisPointValue__SWIG_3(Leg.getCPtr(leg), leg, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double basisPointValue(Leg leg, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_basisPointValue__SWIG_4(Leg.getCPtr(leg), leg, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double basisPointValue(Leg leg, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_basisPointValue__SWIG_5(Leg.getCPtr(leg), leg, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows);
  }

  public static double zSpread(Leg leg, double npv, YieldTermStructure arg2, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate, double accuracy, long maxIterations, double guess) {
    return QuantLibJNI.CashFlows_zSpread__SWIG_0(Leg.getCPtr(leg), leg, npv, YieldTermStructure.getCPtr(arg2), arg2, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate, accuracy, maxIterations, guess);
  }

  public static double zSpread(Leg leg, double npv, YieldTermStructure arg2, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate, double accuracy, long maxIterations) {
    return QuantLibJNI.CashFlows_zSpread__SWIG_1(Leg.getCPtr(leg), leg, npv, YieldTermStructure.getCPtr(arg2), arg2, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate, accuracy, maxIterations);
  }

  public static double zSpread(Leg leg, double npv, YieldTermStructure arg2, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate, double accuracy) {
    return QuantLibJNI.CashFlows_zSpread__SWIG_2(Leg.getCPtr(leg), leg, npv, YieldTermStructure.getCPtr(arg2), arg2, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate, accuracy);
  }

  public static double zSpread(Leg leg, double npv, YieldTermStructure arg2, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate, Date npvDate) {
    return QuantLibJNI.CashFlows_zSpread__SWIG_3(Leg.getCPtr(leg), leg, npv, YieldTermStructure.getCPtr(arg2), arg2, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate, Date.getCPtr(npvDate), npvDate);
  }

  public static double zSpread(Leg leg, double npv, YieldTermStructure arg2, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows, Date settlementDate) {
    return QuantLibJNI.CashFlows_zSpread__SWIG_4(Leg.getCPtr(leg), leg, npv, YieldTermStructure.getCPtr(arg2), arg2, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double zSpread(Leg leg, double npv, YieldTermStructure arg2, DayCounter dayCounter, Compounding compounding, Frequency frequency, boolean includeSettlementDateFlows) {
    return QuantLibJNI.CashFlows_zSpread__SWIG_5(Leg.getCPtr(leg), leg, npv, YieldTermStructure.getCPtr(arg2), arg2, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), includeSettlementDateFlows);
  }

}
