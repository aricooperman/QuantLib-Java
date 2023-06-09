/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class USDLiborON extends DailyTenorLibor {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected USDLiborON(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.USDLiborON_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(USDLiborON obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        QuantLibJNI.delete_USDLiborON(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public USDLiborON(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_USDLiborON__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public USDLiborON() {
    this(QuantLibJNI.new_USDLiborON__SWIG_1(), true);
  }

}
