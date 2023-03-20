/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class QuantoDoubleBarrierOption extends DoubleBarrierOption {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected QuantoDoubleBarrierOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.QuantoDoubleBarrierOption_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(QuantoDoubleBarrierOption obj) {
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
        QuantLibJNI.delete_QuantoDoubleBarrierOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public QuantoDoubleBarrierOption(DoubleBarrier.Type barrierType, double barrier_lo, double barrier_hi, double rebate, StrikedTypePayoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_QuantoDoubleBarrierOption(barrierType.swigValue(), barrier_lo, barrier_hi, rebate, StrikedTypePayoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

  public double qvega() {
    return QuantLibJNI.QuantoDoubleBarrierOption_qvega(swigCPtr, this);
  }

  public double qrho() {
    return QuantLibJNI.QuantoDoubleBarrierOption_qrho(swigCPtr, this);
  }

  public double qlambda() {
    return QuantLibJNI.QuantoDoubleBarrierOption_qlambda(swigCPtr, this);
  }

}
