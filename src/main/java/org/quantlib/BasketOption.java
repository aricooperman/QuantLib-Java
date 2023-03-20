/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BasketOption extends MultiAssetOption {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BasketOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BasketOption_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BasketOption obj) {
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
        QuantLibJNI.delete_BasketOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BasketOption(BasketPayoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_BasketOption(BasketPayoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

}
