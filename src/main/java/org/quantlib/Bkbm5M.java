/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Bkbm5M extends Bkbm {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Bkbm5M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Bkbm5M_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Bkbm5M obj) {
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
        QuantLibJNI.delete_Bkbm5M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Bkbm5M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Bkbm5M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Bkbm5M() {
    this(QuantLibJNI.new_Bkbm5M__SWIG_1(), true);
  }

}
