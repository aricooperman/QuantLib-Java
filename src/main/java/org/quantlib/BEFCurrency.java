/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BEFCurrency extends Currency {
  private transient long swigCPtr;

  protected BEFCurrency(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BEFCurrency_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BEFCurrency obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_BEFCurrency(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BEFCurrency() {
    this(QuantLibJNI.new_BEFCurrency(), true);
  }

}
