/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ExponentialSplinesFitting extends FittingMethod {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ExponentialSplinesFitting(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ExponentialSplinesFitting_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExponentialSplinesFitting obj) {
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
        QuantLibJNI.delete_ExponentialSplinesFitting(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ExponentialSplinesFitting(boolean constrainAtZero, Array weights, Array l2, double minCutoffTime, double maxCutoffTime, long numCoeffs, double fixedKappa) {
    this(QuantLibJNI.new_ExponentialSplinesFitting__SWIG_0(constrainAtZero, Array.getCPtr(weights), weights, Array.getCPtr(l2), l2, minCutoffTime, maxCutoffTime, numCoeffs, fixedKappa), true);
  }

  public ExponentialSplinesFitting(boolean constrainAtZero, Array weights, Array l2, double minCutoffTime, double maxCutoffTime, long numCoeffs) {
    this(QuantLibJNI.new_ExponentialSplinesFitting__SWIG_1(constrainAtZero, Array.getCPtr(weights), weights, Array.getCPtr(l2), l2, minCutoffTime, maxCutoffTime, numCoeffs), true);
  }

  public ExponentialSplinesFitting(boolean constrainAtZero, Array weights, Array l2, double minCutoffTime, double maxCutoffTime) {
    this(QuantLibJNI.new_ExponentialSplinesFitting__SWIG_2(constrainAtZero, Array.getCPtr(weights), weights, Array.getCPtr(l2), l2, minCutoffTime, maxCutoffTime), true);
  }

  public ExponentialSplinesFitting(boolean constrainAtZero, Array weights, Array l2, double minCutoffTime) {
    this(QuantLibJNI.new_ExponentialSplinesFitting__SWIG_3(constrainAtZero, Array.getCPtr(weights), weights, Array.getCPtr(l2), l2, minCutoffTime), true);
  }

  public ExponentialSplinesFitting(boolean constrainAtZero, Array weights, Array l2) {
    this(QuantLibJNI.new_ExponentialSplinesFitting__SWIG_4(constrainAtZero, Array.getCPtr(weights), weights, Array.getCPtr(l2), l2), true);
  }

  public ExponentialSplinesFitting(boolean constrainAtZero, Array weights) {
    this(QuantLibJNI.new_ExponentialSplinesFitting__SWIG_5(constrainAtZero, Array.getCPtr(weights), weights), true);
  }

  public ExponentialSplinesFitting(boolean constrainAtZero) {
    this(QuantLibJNI.new_ExponentialSplinesFitting__SWIG_6(constrainAtZero), true);
  }

  public ExponentialSplinesFitting() {
    this(QuantLibJNI.new_ExponentialSplinesFitting__SWIG_7(), true);
  }

}
