/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Euribor3W extends Euribor {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Euribor3W(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Euribor3W_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Euribor3W obj) {
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
        QuantLibJNI.delete_Euribor3W(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Euribor3W(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Euribor3W__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Euribor3W() {
    this(QuantLibJNI.new_Euribor3W__SWIG_1(), true);
  }

}
