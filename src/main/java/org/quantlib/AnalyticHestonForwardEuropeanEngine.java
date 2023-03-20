/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class AnalyticHestonForwardEuropeanEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected AnalyticHestonForwardEuropeanEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.AnalyticHestonForwardEuropeanEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AnalyticHestonForwardEuropeanEngine obj) {
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
        QuantLibJNI.delete_AnalyticHestonForwardEuropeanEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AnalyticHestonForwardEuropeanEngine(HestonProcess process, long integrationOrder) {
    this(QuantLibJNI.new_AnalyticHestonForwardEuropeanEngine__SWIG_0(HestonProcess.getCPtr(process), process, integrationOrder), true);
  }

  public AnalyticHestonForwardEuropeanEngine(HestonProcess process) {
    this(QuantLibJNI.new_AnalyticHestonForwardEuropeanEngine__SWIG_1(HestonProcess.getCPtr(process), process), true);
  }

}
