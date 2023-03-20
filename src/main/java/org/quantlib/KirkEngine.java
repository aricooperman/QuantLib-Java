/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class KirkEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected KirkEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.KirkEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(KirkEngine obj) {
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
        QuantLibJNI.delete_KirkEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public KirkEngine(BlackProcess process1, BlackProcess process2, double correlation) {
    this(QuantLibJNI.new_KirkEngine(BlackProcess.getCPtr(process1), process1, BlackProcess.getCPtr(process2), process2, correlation), true);
  }

}