/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MonotonicParabolic {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MonotonicParabolic(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MonotonicParabolic obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_MonotonicParabolic(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MonotonicParabolic(Array x, Array y) {
    this(QuantLibJNI.new_MonotonicParabolic(Array.getCPtr(x), x, Array.getCPtr(y), y), true);
  }

  public double getValue(double x, boolean allowExtrapolation) {
    return QuantLibJNI.MonotonicParabolic_getValue__SWIG_0(swigCPtr, this, x, allowExtrapolation);
  }

  public double getValue(double x) {
    return QuantLibJNI.MonotonicParabolic_getValue__SWIG_1(swigCPtr, this, x);
  }

  public double derivative(double x, boolean extrapolate) {
    return QuantLibJNI.MonotonicParabolic_derivative__SWIG_0(swigCPtr, this, x, extrapolate);
  }

  public double derivative(double x) {
    return QuantLibJNI.MonotonicParabolic_derivative__SWIG_1(swigCPtr, this, x);
  }

  public double secondDerivative(double x, boolean extrapolate) {
    return QuantLibJNI.MonotonicParabolic_secondDerivative__SWIG_0(swigCPtr, this, x, extrapolate);
  }

  public double secondDerivative(double x) {
    return QuantLibJNI.MonotonicParabolic_secondDerivative__SWIG_1(swigCPtr, this, x);
  }

  public double primitive(double x, boolean extrapolate) {
    return QuantLibJNI.MonotonicParabolic_primitive__SWIG_0(swigCPtr, this, x, extrapolate);
  }

  public double primitive(double x) {
    return QuantLibJNI.MonotonicParabolic_primitive__SWIG_1(swigCPtr, this, x);
  }

}
