/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class TypePayoff extends Payoff {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected TypePayoff(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.TypePayoff_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TypePayoff obj) {
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
        QuantLibJNI.delete_TypePayoff(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Option.Type optionType() {
    return Option.Type.swigToEnum(QuantLibJNI.TypePayoff_optionType(swigCPtr, this));
  }

}
