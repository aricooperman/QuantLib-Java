/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BlackCdsOptionEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BlackCdsOptionEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BlackCdsOptionEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BlackCdsOptionEngine obj) {
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
        QuantLibJNI.delete_BlackCdsOptionEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BlackCdsOptionEngine(DefaultProbabilityTermStructureHandle arg0, double recoveryRate, YieldTermStructureHandle termStructure, QuoteHandle vol) {
    this(QuantLibJNI.new_BlackCdsOptionEngine(DefaultProbabilityTermStructureHandle.getCPtr(arg0), arg0, recoveryRate, YieldTermStructureHandle.getCPtr(termStructure), termStructure, QuoteHandle.getCPtr(vol), vol), true);
  }

  public YieldTermStructureHandle termStructure() {
    return new YieldTermStructureHandle(QuantLibJNI.BlackCdsOptionEngine_termStructure(swigCPtr, this), true);
  }

  public QuoteHandle volatility() {
    return new QuoteHandle(QuantLibJNI.BlackCdsOptionEngine_volatility(swigCPtr, this), true);
  }

}
