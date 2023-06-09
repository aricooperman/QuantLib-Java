/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class DefaultProbabilityTermStructure extends TermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected DefaultProbabilityTermStructure(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.DefaultProbabilityTermStructure_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DefaultProbabilityTermStructure obj) {
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
        QuantLibJNI.delete_DefaultProbabilityTermStructure(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public double defaultProbability(Date arg0, boolean extrapolate) {
    return QuantLibJNI.DefaultProbabilityTermStructure_defaultProbability__SWIG_0(swigCPtr, this, Date.getCPtr(arg0), arg0, extrapolate);
  }

  public double defaultProbability(Date arg0) {
    return QuantLibJNI.DefaultProbabilityTermStructure_defaultProbability__SWIG_1(swigCPtr, this, Date.getCPtr(arg0), arg0);
  }

  public double defaultProbability(double arg0, boolean extrapolate) {
    return QuantLibJNI.DefaultProbabilityTermStructure_defaultProbability__SWIG_2(swigCPtr, this, arg0, extrapolate);
  }

  public double defaultProbability(double arg0) {
    return QuantLibJNI.DefaultProbabilityTermStructure_defaultProbability__SWIG_3(swigCPtr, this, arg0);
  }

  public double defaultProbability(Date arg0, Date arg1, boolean extrapolate) {
    return QuantLibJNI.DefaultProbabilityTermStructure_defaultProbability__SWIG_4(swigCPtr, this, Date.getCPtr(arg0), arg0, Date.getCPtr(arg1), arg1, extrapolate);
  }

  public double defaultProbability(Date arg0, Date arg1) {
    return QuantLibJNI.DefaultProbabilityTermStructure_defaultProbability__SWIG_5(swigCPtr, this, Date.getCPtr(arg0), arg0, Date.getCPtr(arg1), arg1);
  }

  public double defaultProbability(double arg0, double arg1, boolean extrapolate) {
    return QuantLibJNI.DefaultProbabilityTermStructure_defaultProbability__SWIG_6(swigCPtr, this, arg0, arg1, extrapolate);
  }

  public double defaultProbability(double arg0, double arg1) {
    return QuantLibJNI.DefaultProbabilityTermStructure_defaultProbability__SWIG_7(swigCPtr, this, arg0, arg1);
  }

  public double survivalProbability(Date arg0, boolean extrapolate) {
    return QuantLibJNI.DefaultProbabilityTermStructure_survivalProbability__SWIG_0(swigCPtr, this, Date.getCPtr(arg0), arg0, extrapolate);
  }

  public double survivalProbability(Date arg0) {
    return QuantLibJNI.DefaultProbabilityTermStructure_survivalProbability__SWIG_1(swigCPtr, this, Date.getCPtr(arg0), arg0);
  }

  public double survivalProbability(double arg0, boolean extrapolate) {
    return QuantLibJNI.DefaultProbabilityTermStructure_survivalProbability__SWIG_2(swigCPtr, this, arg0, extrapolate);
  }

  public double survivalProbability(double arg0) {
    return QuantLibJNI.DefaultProbabilityTermStructure_survivalProbability__SWIG_3(swigCPtr, this, arg0);
  }

  public double defaultDensity(Date arg0, boolean extrapolate) {
    return QuantLibJNI.DefaultProbabilityTermStructure_defaultDensity__SWIG_0(swigCPtr, this, Date.getCPtr(arg0), arg0, extrapolate);
  }

  public double defaultDensity(Date arg0) {
    return QuantLibJNI.DefaultProbabilityTermStructure_defaultDensity__SWIG_1(swigCPtr, this, Date.getCPtr(arg0), arg0);
  }

  public double defaultDensity(double arg0, boolean extrapolate) {
    return QuantLibJNI.DefaultProbabilityTermStructure_defaultDensity__SWIG_2(swigCPtr, this, arg0, extrapolate);
  }

  public double defaultDensity(double arg0) {
    return QuantLibJNI.DefaultProbabilityTermStructure_defaultDensity__SWIG_3(swigCPtr, this, arg0);
  }

  public double hazardRate(Date arg0, boolean extrapolate) {
    return QuantLibJNI.DefaultProbabilityTermStructure_hazardRate__SWIG_0(swigCPtr, this, Date.getCPtr(arg0), arg0, extrapolate);
  }

  public double hazardRate(Date arg0) {
    return QuantLibJNI.DefaultProbabilityTermStructure_hazardRate__SWIG_1(swigCPtr, this, Date.getCPtr(arg0), arg0);
  }

  public double hazardRate(double arg0, boolean extrapolate) {
    return QuantLibJNI.DefaultProbabilityTermStructure_hazardRate__SWIG_2(swigCPtr, this, arg0, extrapolate);
  }

  public double hazardRate(double arg0) {
    return QuantLibJNI.DefaultProbabilityTermStructure_hazardRate__SWIG_3(swigCPtr, this, arg0);
  }

}
