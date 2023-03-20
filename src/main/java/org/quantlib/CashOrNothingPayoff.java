/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CashOrNothingPayoff extends StrikedTypePayoff {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected CashOrNothingPayoff(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CashOrNothingPayoff_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CashOrNothingPayoff obj) {
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
        QuantLibJNI.delete_CashOrNothingPayoff(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CashOrNothingPayoff(Option.Type type, double strike, double payoff) {
    this(QuantLibJNI.new_CashOrNothingPayoff(type.swigValue(), strike, payoff), true);
  }

}
