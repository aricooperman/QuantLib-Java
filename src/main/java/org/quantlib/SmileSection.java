/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SmileSection extends Observable {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected SmileSection(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.SmileSection_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SmileSection obj) {
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
        QuantLibJNI.delete_SmileSection(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public double minStrike() {
    return QuantLibJNI.SmileSection_minStrike(swigCPtr, this);
  }

  public double maxStrike() {
    return QuantLibJNI.SmileSection_maxStrike(swigCPtr, this);
  }

  public double atmLevel() {
    return QuantLibJNI.SmileSection_atmLevel(swigCPtr, this);
  }

  public double variance(double strike) {
    return QuantLibJNI.SmileSection_variance(swigCPtr, this, strike);
  }

  public double volatility(double strike) {
    return QuantLibJNI.SmileSection_volatility__SWIG_0(swigCPtr, this, strike);
  }

  public Date exerciseDate() {
    return new Date(QuantLibJNI.SmileSection_exerciseDate(swigCPtr, this), false);
  }

  public VolatilityType volatilityType() {
    return VolatilityType.swigToEnum(QuantLibJNI.SmileSection_volatilityType(swigCPtr, this));
  }

  public double shift() {
    return QuantLibJNI.SmileSection_shift(swigCPtr, this);
  }

  public Date referenceDate() {
    return new Date(QuantLibJNI.SmileSection_referenceDate(swigCPtr, this), false);
  }

  public double exerciseTime() {
    return QuantLibJNI.SmileSection_exerciseTime(swigCPtr, this);
  }

  public DayCounter dayCounter() {
    return new DayCounter(QuantLibJNI.SmileSection_dayCounter(swigCPtr, this), false);
  }

  public double optionPrice(double strike, Option.Type type, double discount) {
    return QuantLibJNI.SmileSection_optionPrice__SWIG_0(swigCPtr, this, strike, type.swigValue(), discount);
  }

  public double optionPrice(double strike, Option.Type type) {
    return QuantLibJNI.SmileSection_optionPrice__SWIG_1(swigCPtr, this, strike, type.swigValue());
  }

  public double optionPrice(double strike) {
    return QuantLibJNI.SmileSection_optionPrice__SWIG_2(swigCPtr, this, strike);
  }

  public double digitalOptionPrice(double strike, Option.Type type, double discount, double gap) {
    return QuantLibJNI.SmileSection_digitalOptionPrice__SWIG_0(swigCPtr, this, strike, type.swigValue(), discount, gap);
  }

  public double digitalOptionPrice(double strike, Option.Type type, double discount) {
    return QuantLibJNI.SmileSection_digitalOptionPrice__SWIG_1(swigCPtr, this, strike, type.swigValue(), discount);
  }

  public double digitalOptionPrice(double strike, Option.Type type) {
    return QuantLibJNI.SmileSection_digitalOptionPrice__SWIG_2(swigCPtr, this, strike, type.swigValue());
  }

  public double digitalOptionPrice(double strike) {
    return QuantLibJNI.SmileSection_digitalOptionPrice__SWIG_3(swigCPtr, this, strike);
  }

  public double vega(double strike, double discount) {
    return QuantLibJNI.SmileSection_vega__SWIG_0(swigCPtr, this, strike, discount);
  }

  public double vega(double strike) {
    return QuantLibJNI.SmileSection_vega__SWIG_1(swigCPtr, this, strike);
  }

  public double density(double strike, double discount, double gap) {
    return QuantLibJNI.SmileSection_density__SWIG_0(swigCPtr, this, strike, discount, gap);
  }

  public double density(double strike, double discount) {
    return QuantLibJNI.SmileSection_density__SWIG_1(swigCPtr, this, strike, discount);
  }

  public double density(double strike) {
    return QuantLibJNI.SmileSection_density__SWIG_2(swigCPtr, this, strike);
  }

  public double volatility(double strike, VolatilityType type, double shift) {
    return QuantLibJNI.SmileSection_volatility__SWIG_1(swigCPtr, this, strike, type.swigValue(), shift);
  }

  public double volatility(double strike, VolatilityType type) {
    return QuantLibJNI.SmileSection_volatility__SWIG_2(swigCPtr, this, strike, type.swigValue());
  }

}
