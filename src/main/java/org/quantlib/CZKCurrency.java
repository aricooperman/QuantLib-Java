/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CZKCurrency extends Currency {
  private transient long swigCPtr;

  protected CZKCurrency(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CZKCurrency_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CZKCurrency obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CZKCurrency(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CZKCurrency() {
    this(QuantLibJNI.new_CZKCurrency(), true);
  }

}
