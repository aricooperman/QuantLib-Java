/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Bibor9M extends Bibor {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Bibor9M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Bibor9M_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Bibor9M obj) {
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
        QuantLibJNI.delete_Bibor9M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Bibor9M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Bibor9M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Bibor9M() {
    this(QuantLibJNI.new_Bibor9M__SWIG_1(), true);
  }

}
