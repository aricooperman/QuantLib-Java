/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class USDCurrency extends Currency {
  private transient long swigCPtr;

  protected USDCurrency(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.USDCurrency_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(USDCurrency obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_USDCurrency(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public USDCurrency() {
    this(QuantLibJNI.new_USDCurrency(), true);
  }

}
