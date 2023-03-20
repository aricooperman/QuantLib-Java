/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Actual360 extends DayCounter {
  private transient long swigCPtr;

  protected Actual360(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Actual360_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Actual360 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Actual360(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Actual360(boolean includeLastDay) {
    this(QuantLibJNI.new_Actual360__SWIG_0(includeLastDay), true);
  }

  public Actual360() {
    this(QuantLibJNI.new_Actual360__SWIG_1(), true);
  }

}
