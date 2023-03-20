/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class PercentageStrikePayoff extends StrikedTypePayoff {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected PercentageStrikePayoff(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.PercentageStrikePayoff_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PercentageStrikePayoff obj) {
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
        QuantLibJNI.delete_PercentageStrikePayoff(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PercentageStrikePayoff(Option.Type type, double moneyness) {
    this(QuantLibJNI.new_PercentageStrikePayoff(type.swigValue(), moneyness), true);
  }

}
