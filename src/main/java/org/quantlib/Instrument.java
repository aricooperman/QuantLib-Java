/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Instrument extends Observable {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Instrument(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Instrument_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Instrument obj) {
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
        QuantLibJNI.delete_Instrument(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public double NPV() {
    return QuantLibJNI.Instrument_NPV(swigCPtr, this);
  }

  public double errorEstimate() {
    return QuantLibJNI.Instrument_errorEstimate(swigCPtr, this);
  }

  public boolean isExpired() {
    return QuantLibJNI.Instrument_isExpired(swigCPtr, this);
  }

  public void setPricingEngine(PricingEngine arg0) {
    QuantLibJNI.Instrument_setPricingEngine(swigCPtr, this, PricingEngine.getCPtr(arg0), arg0);
  }

  public void recalculate() {
    QuantLibJNI.Instrument_recalculate(swigCPtr, this);
  }

  public void freeze() {
    QuantLibJNI.Instrument_freeze(swigCPtr, this);
  }

  public void unfreeze() {
    QuantLibJNI.Instrument_unfreeze(swigCPtr, this);
  }

}
