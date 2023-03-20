/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class HestonBlackVolSurface extends BlackVolTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected HestonBlackVolSurface(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.HestonBlackVolSurface_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HestonBlackVolSurface obj) {
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
        QuantLibJNI.delete_HestonBlackVolSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HestonBlackVolSurface(HestonModelHandle hestonModel, AnalyticHestonEngine.ComplexLogFormula cpxLogFormula, AnalyticHestonEngine_Integration integration) {
    this(QuantLibJNI.new_HestonBlackVolSurface__SWIG_0(HestonModelHandle.getCPtr(hestonModel), hestonModel, cpxLogFormula.swigValue(), AnalyticHestonEngine_Integration.getCPtr(integration), integration), true);
  }

  public HestonBlackVolSurface(HestonModelHandle hestonModel, AnalyticHestonEngine.ComplexLogFormula cpxLogFormula) {
    this(QuantLibJNI.new_HestonBlackVolSurface__SWIG_1(HestonModelHandle.getCPtr(hestonModel), hestonModel, cpxLogFormula.swigValue()), true);
  }

  public HestonBlackVolSurface(HestonModelHandle hestonModel) {
    this(QuantLibJNI.new_HestonBlackVolSurface__SWIG_2(HestonModelHandle.getCPtr(hestonModel), hestonModel), true);
  }

}
