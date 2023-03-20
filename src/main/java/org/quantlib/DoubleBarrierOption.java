/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class DoubleBarrierOption extends OneAssetOption {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected DoubleBarrierOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.DoubleBarrierOption_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DoubleBarrierOption obj) {
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
        QuantLibJNI.delete_DoubleBarrierOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DoubleBarrierOption(DoubleBarrier.Type barrierType, double barrier_lo, double barrier_hi, double rebate, StrikedTypePayoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_DoubleBarrierOption(barrierType.swigValue(), barrier_lo, barrier_hi, rebate, StrikedTypePayoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

}
