/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class NOKCurrency extends Currency {
  private transient long swigCPtr;

  protected NOKCurrency(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.NOKCurrency_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NOKCurrency obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_NOKCurrency(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NOKCurrency() {
    this(QuantLibJNI.new_NOKCurrency(), true);
  }

}
