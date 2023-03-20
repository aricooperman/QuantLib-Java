/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussKronrodAdaptive {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GaussKronrodAdaptive(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussKronrodAdaptive obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GaussKronrodAdaptive(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GaussKronrodAdaptive(double tolerance, long maxFunctionEvaluations) {
    this(QuantLibJNI.new_GaussKronrodAdaptive__SWIG_0(tolerance, maxFunctionEvaluations), true);
  }

  public GaussKronrodAdaptive(double tolerance) {
    this(QuantLibJNI.new_GaussKronrodAdaptive__SWIG_1(tolerance), true);
  }

  public double calculate(UnaryFunctionDelegate f, double a, double b) {
    return QuantLibJNI.GaussKronrodAdaptive_calculate(swigCPtr, this, UnaryFunctionDelegate.getCPtr(f), f, a, b);
  }

}
