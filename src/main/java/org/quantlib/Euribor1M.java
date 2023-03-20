/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Euribor1M extends Euribor {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Euribor1M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Euribor1M_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Euribor1M obj) {
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
        QuantLibJNI.delete_Euribor1M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Euribor1M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Euribor1M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Euribor1M() {
    this(QuantLibJNI.new_Euribor1M__SWIG_1(), true);
  }

}
