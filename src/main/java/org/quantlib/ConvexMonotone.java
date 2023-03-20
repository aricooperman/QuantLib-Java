/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ConvexMonotone {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ConvexMonotone(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConvexMonotone obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ConvexMonotone(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ConvexMonotone(double quadraticity, double monotonicity, boolean forcePositive) {
    this(QuantLibJNI.new_ConvexMonotone__SWIG_0(quadraticity, monotonicity, forcePositive), true);
  }

  public ConvexMonotone(double quadraticity, double monotonicity) {
    this(QuantLibJNI.new_ConvexMonotone__SWIG_1(quadraticity, monotonicity), true);
  }

  public ConvexMonotone(double quadraticity) {
    this(QuantLibJNI.new_ConvexMonotone__SWIG_2(quadraticity), true);
  }

  public ConvexMonotone() {
    this(QuantLibJNI.new_ConvexMonotone__SWIG_3(), true);
  }

}
