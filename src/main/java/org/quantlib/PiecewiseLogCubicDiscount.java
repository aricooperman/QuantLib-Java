/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class PiecewiseLogCubicDiscount extends YieldTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected PiecewiseLogCubicDiscount(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.PiecewiseLogCubicDiscount_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PiecewiseLogCubicDiscount obj) {
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
        QuantLibJNI.delete_PiecewiseLogCubicDiscount(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PiecewiseLogCubicDiscount(Date referenceDate, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps, DateVector jumpDates, MonotonicLogCubic i, IterativeBootstrap b) {
    this(QuantLibJNI.new_PiecewiseLogCubicDiscount__SWIG_0(Date.getCPtr(referenceDate), referenceDate, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps, DateVector.getCPtr(jumpDates), jumpDates, MonotonicLogCubic.getCPtr(i), i, IterativeBootstrap.getCPtr(b), b), true);
  }

  public PiecewiseLogCubicDiscount(Date referenceDate, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps, DateVector jumpDates, MonotonicLogCubic i) {
    this(QuantLibJNI.new_PiecewiseLogCubicDiscount__SWIG_1(Date.getCPtr(referenceDate), referenceDate, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps, DateVector.getCPtr(jumpDates), jumpDates, MonotonicLogCubic.getCPtr(i), i), true);
  }

  public PiecewiseLogCubicDiscount(Date referenceDate, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps, DateVector jumpDates) {
    this(QuantLibJNI.new_PiecewiseLogCubicDiscount__SWIG_2(Date.getCPtr(referenceDate), referenceDate, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps, DateVector.getCPtr(jumpDates), jumpDates), true);
  }

  public PiecewiseLogCubicDiscount(Date referenceDate, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps) {
    this(QuantLibJNI.new_PiecewiseLogCubicDiscount__SWIG_3(Date.getCPtr(referenceDate), referenceDate, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps), true);
  }

  public PiecewiseLogCubicDiscount(Date referenceDate, RateHelperVector instruments, DayCounter dayCounter) {
    this(QuantLibJNI.new_PiecewiseLogCubicDiscount__SWIG_4(Date.getCPtr(referenceDate), referenceDate, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public PiecewiseLogCubicDiscount(int settlementDays, Calendar calendar, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps, DateVector jumpDates, MonotonicLogCubic i, IterativeBootstrap b) {
    this(QuantLibJNI.new_PiecewiseLogCubicDiscount__SWIG_5(settlementDays, Calendar.getCPtr(calendar), calendar, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps, DateVector.getCPtr(jumpDates), jumpDates, MonotonicLogCubic.getCPtr(i), i, IterativeBootstrap.getCPtr(b), b), true);
  }

  public PiecewiseLogCubicDiscount(int settlementDays, Calendar calendar, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps, DateVector jumpDates, MonotonicLogCubic i) {
    this(QuantLibJNI.new_PiecewiseLogCubicDiscount__SWIG_6(settlementDays, Calendar.getCPtr(calendar), calendar, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps, DateVector.getCPtr(jumpDates), jumpDates, MonotonicLogCubic.getCPtr(i), i), true);
  }

  public PiecewiseLogCubicDiscount(int settlementDays, Calendar calendar, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps, DateVector jumpDates) {
    this(QuantLibJNI.new_PiecewiseLogCubicDiscount__SWIG_7(settlementDays, Calendar.getCPtr(calendar), calendar, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps, DateVector.getCPtr(jumpDates), jumpDates), true);
  }

  public PiecewiseLogCubicDiscount(int settlementDays, Calendar calendar, RateHelperVector instruments, DayCounter dayCounter, QuoteHandleVector jumps) {
    this(QuantLibJNI.new_PiecewiseLogCubicDiscount__SWIG_8(settlementDays, Calendar.getCPtr(calendar), calendar, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, QuoteHandleVector.getCPtr(jumps), jumps), true);
  }

  public PiecewiseLogCubicDiscount(int settlementDays, Calendar calendar, RateHelperVector instruments, DayCounter dayCounter) {
    this(QuantLibJNI.new_PiecewiseLogCubicDiscount__SWIG_9(settlementDays, Calendar.getCPtr(calendar), calendar, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public PiecewiseLogCubicDiscount(Date referenceDate, RateHelperVector instruments, DayCounter dayCounter, IterativeBootstrap b) {
    this(QuantLibJNI.new_PiecewiseLogCubicDiscount__SWIG_10(Date.getCPtr(referenceDate), referenceDate, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, IterativeBootstrap.getCPtr(b), b), true);
  }

  public PiecewiseLogCubicDiscount(int settlementDays, Calendar calendar, RateHelperVector instruments, DayCounter dayCounter, IterativeBootstrap b) {
    this(QuantLibJNI.new_PiecewiseLogCubicDiscount__SWIG_11(settlementDays, Calendar.getCPtr(calendar), calendar, RateHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, IterativeBootstrap.getCPtr(b), b), true);
  }

  public DateVector dates() {
    return new DateVector(QuantLibJNI.PiecewiseLogCubicDiscount_dates(swigCPtr, this), false);
  }

  public DoubleVector times() {
    return new DoubleVector(QuantLibJNI.PiecewiseLogCubicDiscount_times(swigCPtr, this), false);
  }

  public NodeVector nodes() {
    return new NodeVector(QuantLibJNI.PiecewiseLogCubicDiscount_nodes(swigCPtr, this), true);
  }

  public void recalculate() {
    QuantLibJNI.PiecewiseLogCubicDiscount_recalculate(swigCPtr, this);
  }

  public void freeze() {
    QuantLibJNI.PiecewiseLogCubicDiscount_freeze(swigCPtr, this);
  }

  public void unfreeze() {
    QuantLibJNI.PiecewiseLogCubicDiscount_unfreeze(swigCPtr, this);
  }

}
