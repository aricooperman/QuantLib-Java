/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class LinearInterpolation {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LinearInterpolation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LinearInterpolation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_LinearInterpolation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LinearInterpolation(Array x, Array y) {
    this(QuantLibJNI.new_LinearInterpolation(Array.getCPtr(x), x, Array.getCPtr(y), y), true);
  }

  public double getValue(double x, boolean allowExtrapolation) {
    return QuantLibJNI.LinearInterpolation_getValue__SWIG_0(swigCPtr, this, x, allowExtrapolation);
  }

  public double getValue(double x) {
    return QuantLibJNI.LinearInterpolation_getValue__SWIG_1(swigCPtr, this, x);
  }

}
