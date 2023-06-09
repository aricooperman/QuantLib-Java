/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class OptionletVolatilityStructureHandle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OptionletVolatilityStructureHandle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OptionletVolatilityStructureHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_OptionletVolatilityStructureHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public OptionletVolatilityStructureHandle(OptionletVolatilityStructure arg0) {
    this(QuantLibJNI.new_OptionletVolatilityStructureHandle__SWIG_0(OptionletVolatilityStructure.getCPtr(arg0), arg0), true);
  }

  public OptionletVolatilityStructureHandle() {
    this(QuantLibJNI.new_OptionletVolatilityStructureHandle__SWIG_1(), true);
  }

  public OptionletVolatilityStructure __deref__() {
    long cPtr = QuantLibJNI.OptionletVolatilityStructureHandle___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new OptionletVolatilityStructure(cPtr, true);
  }

  public OptionletVolatilityStructure currentLink() {
    long cPtr = QuantLibJNI.OptionletVolatilityStructureHandle_currentLink(swigCPtr, this);
    return (cPtr == 0) ? null : new OptionletVolatilityStructure(cPtr, true);
  }

  public boolean empty() {
    return QuantLibJNI.OptionletVolatilityStructureHandle_empty(swigCPtr, this);
  }

  public Observable asObservable() {
    long cPtr = QuantLibJNI.OptionletVolatilityStructureHandle_asObservable(swigCPtr, this);
    return (cPtr == 0) ? null : new Observable(cPtr, true);
  }

  public double volatility(Date arg0, double strike, boolean extrapolate) {
    return QuantLibJNI.OptionletVolatilityStructureHandle_volatility__SWIG_0(swigCPtr, this, Date.getCPtr(arg0), arg0, strike, extrapolate);
  }

  public double volatility(Date arg0, double strike) {
    return QuantLibJNI.OptionletVolatilityStructureHandle_volatility__SWIG_1(swigCPtr, this, Date.getCPtr(arg0), arg0, strike);
  }

  public double volatility(double arg0, double strike, boolean extrapolate) {
    return QuantLibJNI.OptionletVolatilityStructureHandle_volatility__SWIG_2(swigCPtr, this, arg0, strike, extrapolate);
  }

  public double volatility(double arg0, double strike) {
    return QuantLibJNI.OptionletVolatilityStructureHandle_volatility__SWIG_3(swigCPtr, this, arg0, strike);
  }

  public double blackVariance(Date arg0, double strike, boolean extrapolate) {
    return QuantLibJNI.OptionletVolatilityStructureHandle_blackVariance__SWIG_0(swigCPtr, this, Date.getCPtr(arg0), arg0, strike, extrapolate);
  }

  public double blackVariance(Date arg0, double strike) {
    return QuantLibJNI.OptionletVolatilityStructureHandle_blackVariance__SWIG_1(swigCPtr, this, Date.getCPtr(arg0), arg0, strike);
  }

  public double blackVariance(double arg0, double strike, boolean extrapolate) {
    return QuantLibJNI.OptionletVolatilityStructureHandle_blackVariance__SWIG_2(swigCPtr, this, arg0, strike, extrapolate);
  }

  public double blackVariance(double arg0, double strike) {
    return QuantLibJNI.OptionletVolatilityStructureHandle_blackVariance__SWIG_3(swigCPtr, this, arg0, strike);
  }

  public double minStrike() {
    return QuantLibJNI.OptionletVolatilityStructureHandle_minStrike(swigCPtr, this);
  }

  public double maxStrike() {
    return QuantLibJNI.OptionletVolatilityStructureHandle_maxStrike(swigCPtr, this);
  }

  public DayCounter dayCounter() {
    return new DayCounter(QuantLibJNI.OptionletVolatilityStructureHandle_dayCounter(swigCPtr, this), true);
  }

  public double timeFromReference(Date date) {
    return QuantLibJNI.OptionletVolatilityStructureHandle_timeFromReference(swigCPtr, this, Date.getCPtr(date), date);
  }

  public Calendar calendar() {
    return new Calendar(QuantLibJNI.OptionletVolatilityStructureHandle_calendar(swigCPtr, this), true);
  }

  public Date referenceDate() {
    return new Date(QuantLibJNI.OptionletVolatilityStructureHandle_referenceDate(swigCPtr, this), true);
  }

  public Date maxDate() {
    return new Date(QuantLibJNI.OptionletVolatilityStructureHandle_maxDate(swigCPtr, this), true);
  }

  public double maxTime() {
    return QuantLibJNI.OptionletVolatilityStructureHandle_maxTime(swigCPtr, this);
  }

  public void enableExtrapolation() {
    QuantLibJNI.OptionletVolatilityStructureHandle_enableExtrapolation(swigCPtr, this);
  }

  public void disableExtrapolation() {
    QuantLibJNI.OptionletVolatilityStructureHandle_disableExtrapolation(swigCPtr, this);
  }

  public boolean allowsExtrapolation() {
    return QuantLibJNI.OptionletVolatilityStructureHandle_allowsExtrapolation(swigCPtr, this);
  }

}
