/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SoftCallability extends Callability {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected SoftCallability(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.SoftCallability_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SoftCallability obj) {
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
        QuantLibJNI.delete_SoftCallability(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SoftCallability(BondPrice price, Date date, double trigger) {
    this(QuantLibJNI.new_SoftCallability(BondPrice.getCPtr(price), price, Date.getCPtr(date), date, trigger), true);
  }

}
