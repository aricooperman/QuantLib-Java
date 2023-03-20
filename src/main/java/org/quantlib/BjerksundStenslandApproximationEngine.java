/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BjerksundStenslandApproximationEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BjerksundStenslandApproximationEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BjerksundStenslandApproximationEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BjerksundStenslandApproximationEngine obj) {
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
        QuantLibJNI.delete_BjerksundStenslandApproximationEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BjerksundStenslandApproximationEngine(GeneralizedBlackScholesProcess process) {
    this(QuantLibJNI.new_BjerksundStenslandApproximationEngine(GeneralizedBlackScholesProcess.getCPtr(process), process), true);
  }

}
