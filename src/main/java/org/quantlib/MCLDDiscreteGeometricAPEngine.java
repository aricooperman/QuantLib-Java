/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MCLDDiscreteGeometricAPEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected MCLDDiscreteGeometricAPEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MCLDDiscreteGeometricAPEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MCLDDiscreteGeometricAPEngine obj) {
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
        QuantLibJNI.delete_MCLDDiscreteGeometricAPEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MCLDDiscreteGeometricAPEngine(GeneralizedBlackScholesProcess process, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(process), process, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed), true);
  }

  public MCLDDiscreteGeometricAPEngine(GeneralizedBlackScholesProcess process, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(process), process, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true);
  }

  public MCLDDiscreteGeometricAPEngine(GeneralizedBlackScholesProcess process, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPEngine__SWIG_2(GeneralizedBlackScholesProcess.getCPtr(process), process, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance), true);
  }

  public MCLDDiscreteGeometricAPEngine(GeneralizedBlackScholesProcess process, boolean brownianBridge, boolean antitheticVariate, int requiredSamples) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPEngine__SWIG_3(GeneralizedBlackScholesProcess.getCPtr(process), process, brownianBridge, antitheticVariate, requiredSamples), true);
  }

  public MCLDDiscreteGeometricAPEngine(GeneralizedBlackScholesProcess process, boolean brownianBridge, boolean antitheticVariate) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPEngine__SWIG_4(GeneralizedBlackScholesProcess.getCPtr(process), process, brownianBridge, antitheticVariate), true);
  }

  public MCLDDiscreteGeometricAPEngine(GeneralizedBlackScholesProcess process, boolean brownianBridge) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPEngine__SWIG_5(GeneralizedBlackScholesProcess.getCPtr(process), process, brownianBridge), true);
  }

  public MCLDDiscreteGeometricAPEngine(GeneralizedBlackScholesProcess process) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPEngine__SWIG_6(GeneralizedBlackScholesProcess.getCPtr(process), process), true);
  }

}
