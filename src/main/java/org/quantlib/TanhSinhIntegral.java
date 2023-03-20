/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class TanhSinhIntegral {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TanhSinhIntegral(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TanhSinhIntegral obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_TanhSinhIntegral(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TanhSinhIntegral(double relTolerance, long maxRefinements, double minComplement) {
    this(QuantLibJNI.new_TanhSinhIntegral__SWIG_0(relTolerance, maxRefinements, minComplement), true);
  }

  public TanhSinhIntegral(double relTolerance, long maxRefinements) {
    this(QuantLibJNI.new_TanhSinhIntegral__SWIG_1(relTolerance, maxRefinements), true);
  }

  public TanhSinhIntegral(double relTolerance) {
    this(QuantLibJNI.new_TanhSinhIntegral__SWIG_2(relTolerance), true);
  }

  public TanhSinhIntegral() {
    this(QuantLibJNI.new_TanhSinhIntegral__SWIG_3(), true);
  }

  public double calculate(UnaryFunctionDelegate f, double a, double b) {
    return QuantLibJNI.TanhSinhIntegral_calculate(swigCPtr, this, UnaryFunctionDelegate.getCPtr(f), f, a, b);
  }

}