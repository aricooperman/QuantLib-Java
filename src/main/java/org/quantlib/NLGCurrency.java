/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class NLGCurrency extends Currency {
  private transient long swigCPtr;

  protected NLGCurrency(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.NLGCurrency_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NLGCurrency obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_NLGCurrency(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NLGCurrency() {
    this(QuantLibJNI.new_NLGCurrency(), true);
  }

}
