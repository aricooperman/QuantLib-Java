/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BlackScholesMertonProcess extends GeneralizedBlackScholesProcess {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BlackScholesMertonProcess(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BlackScholesMertonProcess_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BlackScholesMertonProcess obj) {
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
        QuantLibJNI.delete_BlackScholesMertonProcess(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BlackScholesMertonProcess(QuoteHandle s0, YieldTermStructureHandle dividendTS, YieldTermStructureHandle riskFreeTS, BlackVolTermStructureHandle volTS) {
    this(QuantLibJNI.new_BlackScholesMertonProcess(QuoteHandle.getCPtr(s0), s0, YieldTermStructureHandle.getCPtr(dividendTS), dividendTS, YieldTermStructureHandle.getCPtr(riskFreeTS), riskFreeTS, BlackVolTermStructureHandle.getCPtr(volTS), volTS), true);
  }

}
