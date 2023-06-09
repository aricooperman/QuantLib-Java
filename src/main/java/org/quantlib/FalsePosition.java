/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FalsePosition {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FalsePosition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FalsePosition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_FalsePosition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMaxEvaluations(long evaluations) {
    QuantLibJNI.FalsePosition_setMaxEvaluations(swigCPtr, this, evaluations);
  }

  public void setLowerBound(double lowerBound) {
    QuantLibJNI.FalsePosition_setLowerBound(swigCPtr, this, lowerBound);
  }

  public void setUpperBound(double upperBound) {
    QuantLibJNI.FalsePosition_setUpperBound(swigCPtr, this, upperBound);
  }

  public double solve(UnaryFunctionDelegate function, double xAccuracy, double guess, double step) {
    return QuantLibJNI.FalsePosition_solve__SWIG_0(swigCPtr, this, UnaryFunctionDelegate.getCPtr(function), function, xAccuracy, guess, step);
  }

  public double solve(UnaryFunctionDelegate function, double xAccuracy, double guess, double xMin, double xMax) {
    return QuantLibJNI.FalsePosition_solve__SWIG_1(swigCPtr, this, UnaryFunctionDelegate.getCPtr(function), function, xAccuracy, guess, xMin, xMax);
  }

  public FalsePosition() {
    this(QuantLibJNI.new_FalsePosition(), true);
  }

}
