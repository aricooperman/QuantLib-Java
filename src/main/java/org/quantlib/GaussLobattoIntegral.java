/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussLobattoIntegral {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GaussLobattoIntegral(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussLobattoIntegral obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GaussLobattoIntegral(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GaussLobattoIntegral(long maxIterations, double absAccuracy, double relAccuracy, boolean useConvergenceEstimate) {
    this(QuantLibJNI.new_GaussLobattoIntegral__SWIG_0(maxIterations, absAccuracy, relAccuracy, useConvergenceEstimate), true);
  }

  public GaussLobattoIntegral(long maxIterations, double absAccuracy, double relAccuracy) {
    this(QuantLibJNI.new_GaussLobattoIntegral__SWIG_1(maxIterations, absAccuracy, relAccuracy), true);
  }

  public GaussLobattoIntegral(long maxIterations, double absAccuracy) {
    this(QuantLibJNI.new_GaussLobattoIntegral__SWIG_2(maxIterations, absAccuracy), true);
  }

  public double calculate(UnaryFunctionDelegate f, double a, double b) {
    return QuantLibJNI.GaussLobattoIntegral_calculate(swigCPtr, this, UnaryFunctionDelegate.getCPtr(f), f, a, b);
  }

}
