/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GBPCurrency extends Currency {
  private transient long swigCPtr;

  protected GBPCurrency(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.GBPCurrency_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GBPCurrency obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GBPCurrency(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GBPCurrency() {
    this(QuantLibJNI.new_GBPCurrency(), true);
  }

}
