/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class THBCurrency extends Currency {
  private transient long swigCPtr;

  protected THBCurrency(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.THBCurrency_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(THBCurrency obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_THBCurrency(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public THBCurrency() {
    this(QuantLibJNI.new_THBCurrency(), true);
  }

}
