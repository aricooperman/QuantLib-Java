/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class EURLibor2W extends EURLibor {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected EURLibor2W(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.EURLibor2W_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EURLibor2W obj) {
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
        QuantLibJNI.delete_EURLibor2W(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EURLibor2W(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_EURLibor2W__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public EURLibor2W() {
    this(QuantLibJNI.new_EURLibor2W__SWIG_1(), true);
  }

}
