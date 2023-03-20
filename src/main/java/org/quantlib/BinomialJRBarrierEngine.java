/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BinomialJRBarrierEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BinomialJRBarrierEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BinomialJRBarrierEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BinomialJRBarrierEngine obj) {
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
        QuantLibJNI.delete_BinomialJRBarrierEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BinomialJRBarrierEngine(GeneralizedBlackScholesProcess arg0, long steps, long max_steps) {
    this(QuantLibJNI.new_BinomialJRBarrierEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(arg0), arg0, steps, max_steps), true);
  }

  public BinomialJRBarrierEngine(GeneralizedBlackScholesProcess arg0, long steps) {
    this(QuantLibJNI.new_BinomialJRBarrierEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(arg0), arg0, steps), true);
  }

}
