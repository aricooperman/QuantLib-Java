/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ZeroCouponInflationSwap extends Swap {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ZeroCouponInflationSwap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ZeroCouponInflationSwap_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZeroCouponInflationSwap obj) {
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
        QuantLibJNI.delete_ZeroCouponInflationSwap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ZeroCouponInflationSwap(Swap.Type type, double nominal, Date start, Date maturity, Calendar calendar, BusinessDayConvention convention, DayCounter dayCounter, double fixedRate, ZeroInflationIndex index, Period lag, CPI.InterpolationType observationInterpolation, boolean adjustInfObsDates, Calendar infCalendar, BusinessDayConvention infConvention) {
    this(QuantLibJNI.new_ZeroCouponInflationSwap__SWIG_0(type.swigValue(), nominal, Date.getCPtr(start), start, Date.getCPtr(maturity), maturity, Calendar.getCPtr(calendar), calendar, convention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, fixedRate, ZeroInflationIndex.getCPtr(index), index, Period.getCPtr(lag), lag, observationInterpolation.swigValue(), adjustInfObsDates, Calendar.getCPtr(infCalendar), infCalendar, infConvention.swigValue()), true);
  }

  public ZeroCouponInflationSwap(Swap.Type type, double nominal, Date start, Date maturity, Calendar calendar, BusinessDayConvention convention, DayCounter dayCounter, double fixedRate, ZeroInflationIndex index, Period lag, CPI.InterpolationType observationInterpolation, boolean adjustInfObsDates, Calendar infCalendar) {
    this(QuantLibJNI.new_ZeroCouponInflationSwap__SWIG_1(type.swigValue(), nominal, Date.getCPtr(start), start, Date.getCPtr(maturity), maturity, Calendar.getCPtr(calendar), calendar, convention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, fixedRate, ZeroInflationIndex.getCPtr(index), index, Period.getCPtr(lag), lag, observationInterpolation.swigValue(), adjustInfObsDates, Calendar.getCPtr(infCalendar), infCalendar), true);
  }

  public ZeroCouponInflationSwap(Swap.Type type, double nominal, Date start, Date maturity, Calendar calendar, BusinessDayConvention convention, DayCounter dayCounter, double fixedRate, ZeroInflationIndex index, Period lag, CPI.InterpolationType observationInterpolation, boolean adjustInfObsDates) {
    this(QuantLibJNI.new_ZeroCouponInflationSwap__SWIG_2(type.swigValue(), nominal, Date.getCPtr(start), start, Date.getCPtr(maturity), maturity, Calendar.getCPtr(calendar), calendar, convention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, fixedRate, ZeroInflationIndex.getCPtr(index), index, Period.getCPtr(lag), lag, observationInterpolation.swigValue(), adjustInfObsDates), true);
  }

  public ZeroCouponInflationSwap(Swap.Type type, double nominal, Date start, Date maturity, Calendar calendar, BusinessDayConvention convention, DayCounter dayCounter, double fixedRate, ZeroInflationIndex index, Period lag, CPI.InterpolationType observationInterpolation) {
    this(QuantLibJNI.new_ZeroCouponInflationSwap__SWIG_3(type.swigValue(), nominal, Date.getCPtr(start), start, Date.getCPtr(maturity), maturity, Calendar.getCPtr(calendar), calendar, convention.swigValue(), DayCounter.getCPtr(dayCounter), dayCounter, fixedRate, ZeroInflationIndex.getCPtr(index), index, Period.getCPtr(lag), lag, observationInterpolation.swigValue()), true);
  }

  public double fairRate() {
    return QuantLibJNI.ZeroCouponInflationSwap_fairRate(swigCPtr, this);
  }

  public double fixedLegNPV() {
    return QuantLibJNI.ZeroCouponInflationSwap_fixedLegNPV(swigCPtr, this);
  }

  public double inflationLegNPV() {
    return QuantLibJNI.ZeroCouponInflationSwap_inflationLegNPV(swigCPtr, this);
  }

  public Leg fixedLeg() {
    return new Leg(QuantLibJNI.ZeroCouponInflationSwap_fixedLeg(swigCPtr, this), true);
  }

  public Leg inflationLeg() {
    return new Leg(QuantLibJNI.ZeroCouponInflationSwap_inflationLeg(swigCPtr, this), true);
  }

  public Swap.Type type() {
    return Swap.Type.swigToEnum(QuantLibJNI.ZeroCouponInflationSwap_type(swigCPtr, this));
  }

}