/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Cap extends CapFloor {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Cap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Cap_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Cap obj) {
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
        QuantLibJNI.delete_Cap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Cap(Leg leg, DoubleVector capRates) {
    this(QuantLibJNI.new_Cap(Leg.getCPtr(leg), leg, DoubleVector.getCPtr(capRates), capRates), true);
  }

}
