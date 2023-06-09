/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ClosestRounding extends Rounding {
  private transient long swigCPtr;

  protected ClosestRounding(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ClosestRounding_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ClosestRounding obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ClosestRounding(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ClosestRounding(int precision, int digit) {
    this(QuantLibJNI.new_ClosestRounding__SWIG_0(precision, digit), true);
  }

  public ClosestRounding(int precision) {
    this(QuantLibJNI.new_ClosestRounding__SWIG_1(precision), true);
  }

}
