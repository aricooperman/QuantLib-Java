/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussKronrodNonAdaptive {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GaussKronrodNonAdaptive(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussKronrodNonAdaptive obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GaussKronrodNonAdaptive(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GaussKronrodNonAdaptive(double absoluteAccuracy, long maxEvaluations, double relativeAccuracy) {
    this(QuantLibJNI.new_GaussKronrodNonAdaptive(absoluteAccuracy, maxEvaluations, relativeAccuracy), true);
  }

  public double calculate(UnaryFunctionDelegate f, double a, double b) {
    return QuantLibJNI.GaussKronrodNonAdaptive_calculate(swigCPtr, this, UnaryFunctionDelegate.getCPtr(f), f, a, b);
  }

}