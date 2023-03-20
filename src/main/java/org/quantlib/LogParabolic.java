/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class LogParabolic {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LogParabolic(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LogParabolic obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_LogParabolic(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LogParabolic(Array x, Array y) {
    this(QuantLibJNI.new_LogParabolic(Array.getCPtr(x), x, Array.getCPtr(y), y), true);
  }

  public double getValue(double x, boolean allowExtrapolation) {
    return QuantLibJNI.LogParabolic_getValue__SWIG_0(swigCPtr, this, x, allowExtrapolation);
  }

  public double getValue(double x) {
    return QuantLibJNI.LogParabolic_getValue__SWIG_1(swigCPtr, this, x);
  }

  public double derivative(double x, boolean extrapolate) {
    return QuantLibJNI.LogParabolic_derivative__SWIG_0(swigCPtr, this, x, extrapolate);
  }

  public double derivative(double x) {
    return QuantLibJNI.LogParabolic_derivative__SWIG_1(swigCPtr, this, x);
  }

  public double secondDerivative(double x, boolean extrapolate) {
    return QuantLibJNI.LogParabolic_secondDerivative__SWIG_0(swigCPtr, this, x, extrapolate);
  }

  public double secondDerivative(double x) {
    return QuantLibJNI.LogParabolic_secondDerivative__SWIG_1(swigCPtr, this, x);
  }

  public double primitive(double x, boolean extrapolate) {
    return QuantLibJNI.LogParabolic_primitive__SWIG_0(swigCPtr, this, x, extrapolate);
  }

  public double primitive(double x) {
    return QuantLibJNI.LogParabolic_primitive__SWIG_1(swigCPtr, this, x);
  }

}
