/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class QuantoBarrierOption extends BarrierOption {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected QuantoBarrierOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.QuantoBarrierOption_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(QuantoBarrierOption obj) {
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
        QuantLibJNI.delete_QuantoBarrierOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public QuantoBarrierOption(Barrier.Type barrierType, double barrier, double rebate, StrikedTypePayoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_QuantoBarrierOption(barrierType.swigValue(), barrier, rebate, StrikedTypePayoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

}
