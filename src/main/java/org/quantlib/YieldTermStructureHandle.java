/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YieldTermStructureHandle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected YieldTermStructureHandle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YieldTermStructureHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_YieldTermStructureHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public YieldTermStructureHandle(YieldTermStructure arg0) {
    this(QuantLibJNI.new_YieldTermStructureHandle__SWIG_0(YieldTermStructure.getCPtr(arg0), arg0), true);
  }

  public YieldTermStructureHandle() {
    this(QuantLibJNI.new_YieldTermStructureHandle__SWIG_1(), true);
  }

  public YieldTermStructure __deref__() {
    long cPtr = QuantLibJNI.YieldTermStructureHandle___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new YieldTermStructure(cPtr, true);
  }

  public YieldTermStructure currentLink() {
    long cPtr = QuantLibJNI.YieldTermStructureHandle_currentLink(swigCPtr, this);
    return (cPtr == 0) ? null : new YieldTermStructure(cPtr, true);
  }

  public boolean empty() {
    return QuantLibJNI.YieldTermStructureHandle_empty(swigCPtr, this);
  }

  public Observable asObservable() {
    long cPtr = QuantLibJNI.YieldTermStructureHandle_asObservable(swigCPtr, this);
    return (cPtr == 0) ? null : new Observable(cPtr, true);
  }

  public double discount(Date arg0, boolean extrapolate) {
    return QuantLibJNI.YieldTermStructureHandle_discount__SWIG_0(swigCPtr, this, Date.getCPtr(arg0), arg0, extrapolate);
  }

  public double discount(Date arg0) {
    return QuantLibJNI.YieldTermStructureHandle_discount__SWIG_1(swigCPtr, this, Date.getCPtr(arg0), arg0);
  }

  public double discount(double arg0, boolean extrapolate) {
    return QuantLibJNI.YieldTermStructureHandle_discount__SWIG_2(swigCPtr, this, arg0, extrapolate);
  }

  public double discount(double arg0) {
    return QuantLibJNI.YieldTermStructureHandle_discount__SWIG_3(swigCPtr, this, arg0);
  }

  public InterestRate zeroRate(Date d, DayCounter arg1, Compounding arg2, Frequency f, boolean extrapolate) {
    return new InterestRate(QuantLibJNI.YieldTermStructureHandle_zeroRate__SWIG_0(swigCPtr, this, Date.getCPtr(d), d, DayCounter.getCPtr(arg1), arg1, arg2.swigValue(), f.swigValue(), extrapolate), true);
  }

  public InterestRate zeroRate(Date d, DayCounter arg1, Compounding arg2, Frequency f) {
    return new InterestRate(QuantLibJNI.YieldTermStructureHandle_zeroRate__SWIG_1(swigCPtr, this, Date.getCPtr(d), d, DayCounter.getCPtr(arg1), arg1, arg2.swigValue(), f.swigValue()), true);
  }

  public InterestRate zeroRate(Date d, DayCounter arg1, Compounding arg2) {
    return new InterestRate(QuantLibJNI.YieldTermStructureHandle_zeroRate__SWIG_2(swigCPtr, this, Date.getCPtr(d), d, DayCounter.getCPtr(arg1), arg1, arg2.swigValue()), true);
  }

  public InterestRate zeroRate(double t, Compounding arg1, Frequency f, boolean extrapolate) {
    return new InterestRate(QuantLibJNI.YieldTermStructureHandle_zeroRate__SWIG_3(swigCPtr, this, t, arg1.swigValue(), f.swigValue(), extrapolate), true);
  }

  public InterestRate zeroRate(double t, Compounding arg1, Frequency f) {
    return new InterestRate(QuantLibJNI.YieldTermStructureHandle_zeroRate__SWIG_4(swigCPtr, this, t, arg1.swigValue(), f.swigValue()), true);
  }

  public InterestRate zeroRate(double t, Compounding arg1) {
    return new InterestRate(QuantLibJNI.YieldTermStructureHandle_zeroRate__SWIG_5(swigCPtr, this, t, arg1.swigValue()), true);
  }

  public InterestRate forwardRate(Date d1, Date d2, DayCounter arg2, Compounding arg3, Frequency f, boolean extrapolate) {
    return new InterestRate(QuantLibJNI.YieldTermStructureHandle_forwardRate__SWIG_0(swigCPtr, this, Date.getCPtr(d1), d1, Date.getCPtr(d2), d2, DayCounter.getCPtr(arg2), arg2, arg3.swigValue(), f.swigValue(), extrapolate), true);
  }

  public InterestRate forwardRate(Date d1, Date d2, DayCounter arg2, Compounding arg3, Frequency f) {
    return new InterestRate(QuantLibJNI.YieldTermStructureHandle_forwardRate__SWIG_1(swigCPtr, this, Date.getCPtr(d1), d1, Date.getCPtr(d2), d2, DayCounter.getCPtr(arg2), arg2, arg3.swigValue(), f.swigValue()), true);
  }

  public InterestRate forwardRate(Date d1, Date d2, DayCounter arg2, Compounding arg3) {
    return new InterestRate(QuantLibJNI.YieldTermStructureHandle_forwardRate__SWIG_2(swigCPtr, this, Date.getCPtr(d1), d1, Date.getCPtr(d2), d2, DayCounter.getCPtr(arg2), arg2, arg3.swigValue()), true);
  }

  public InterestRate forwardRate(double t1, double t2, Compounding arg2, Frequency f, boolean extrapolate) {
    return new InterestRate(QuantLibJNI.YieldTermStructureHandle_forwardRate__SWIG_3(swigCPtr, this, t1, t2, arg2.swigValue(), f.swigValue(), extrapolate), true);
  }

  public InterestRate forwardRate(double t1, double t2, Compounding arg2, Frequency f) {
    return new InterestRate(QuantLibJNI.YieldTermStructureHandle_forwardRate__SWIG_4(swigCPtr, this, t1, t2, arg2.swigValue(), f.swigValue()), true);
  }

  public InterestRate forwardRate(double t1, double t2, Compounding arg2) {
    return new InterestRate(QuantLibJNI.YieldTermStructureHandle_forwardRate__SWIG_5(swigCPtr, this, t1, t2, arg2.swigValue()), true);
  }

  public DayCounter dayCounter() {
    return new DayCounter(QuantLibJNI.YieldTermStructureHandle_dayCounter(swigCPtr, this), true);
  }

  public double timeFromReference(Date date) {
    return QuantLibJNI.YieldTermStructureHandle_timeFromReference(swigCPtr, this, Date.getCPtr(date), date);
  }

  public Calendar calendar() {
    return new Calendar(QuantLibJNI.YieldTermStructureHandle_calendar(swigCPtr, this), true);
  }

  public Date referenceDate() {
    return new Date(QuantLibJNI.YieldTermStructureHandle_referenceDate(swigCPtr, this), true);
  }

  public Date maxDate() {
    return new Date(QuantLibJNI.YieldTermStructureHandle_maxDate(swigCPtr, this), true);
  }

  public double maxTime() {
    return QuantLibJNI.YieldTermStructureHandle_maxTime(swigCPtr, this);
  }

  public void enableExtrapolation() {
    QuantLibJNI.YieldTermStructureHandle_enableExtrapolation(swigCPtr, this);
  }

  public void disableExtrapolation() {
    QuantLibJNI.YieldTermStructureHandle_disableExtrapolation(swigCPtr, this);
  }

  public boolean allowsExtrapolation() {
    return QuantLibJNI.YieldTermStructureHandle_allowsExtrapolation(swigCPtr, this);
  }

}
