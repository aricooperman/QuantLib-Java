/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class UpRounding extends Rounding {
  private transient long swigCPtr;

  protected UpRounding(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.UpRounding_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UpRounding obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_UpRounding(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public UpRounding(int precision, int digit) {
    this(QuantLibJNI.new_UpRounding__SWIG_0(precision, digit), true);
  }

  public UpRounding(int precision) {
    this(QuantLibJNI.new_UpRounding__SWIG_1(precision), true);
  }

}
