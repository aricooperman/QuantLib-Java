/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Zibor extends IborIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Zibor(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Zibor_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Zibor obj) {
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
        QuantLibJNI.delete_Zibor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Zibor(Period tenor, YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Zibor__SWIG_0(Period.getCPtr(tenor), tenor, YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Zibor(Period tenor) {
    this(QuantLibJNI.new_Zibor__SWIG_1(Period.getCPtr(tenor), tenor), true);
  }

}