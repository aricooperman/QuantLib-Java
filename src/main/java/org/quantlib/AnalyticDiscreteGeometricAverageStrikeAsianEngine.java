/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class AnalyticDiscreteGeometricAverageStrikeAsianEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected AnalyticDiscreteGeometricAverageStrikeAsianEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.AnalyticDiscreteGeometricAverageStrikeAsianEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AnalyticDiscreteGeometricAverageStrikeAsianEngine obj) {
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
        QuantLibJNI.delete_AnalyticDiscreteGeometricAverageStrikeAsianEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AnalyticDiscreteGeometricAverageStrikeAsianEngine(GeneralizedBlackScholesProcess process) {
    this(QuantLibJNI.new_AnalyticDiscreteGeometricAverageStrikeAsianEngine(GeneralizedBlackScholesProcess.getCPtr(process), process), true);
  }

}