/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MCLDDiscreteGeometricAPHestonEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected MCLDDiscreteGeometricAPHestonEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MCLDDiscreteGeometricAPHestonEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MCLDDiscreteGeometricAPHestonEngine obj) {
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
        QuantLibJNI.delete_MCLDDiscreteGeometricAPHestonEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MCLDDiscreteGeometricAPHestonEngine(HestonProcess process, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed, int timeSteps, int timeStepsPerYear) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPHestonEngine__SWIG_0(HestonProcess.getCPtr(process), process, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed, timeSteps, timeStepsPerYear), true);
  }

  public MCLDDiscreteGeometricAPHestonEngine(HestonProcess process, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed, int timeSteps) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPHestonEngine__SWIG_1(HestonProcess.getCPtr(process), process, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed, timeSteps), true);
  }

  public MCLDDiscreteGeometricAPHestonEngine(HestonProcess process, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPHestonEngine__SWIG_2(HestonProcess.getCPtr(process), process, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed), true);
  }

  public MCLDDiscreteGeometricAPHestonEngine(HestonProcess process, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPHestonEngine__SWIG_3(HestonProcess.getCPtr(process), process, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true);
  }

  public MCLDDiscreteGeometricAPHestonEngine(HestonProcess process, boolean antitheticVariate, int requiredSamples, double requiredTolerance) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPHestonEngine__SWIG_4(HestonProcess.getCPtr(process), process, antitheticVariate, requiredSamples, requiredTolerance), true);
  }

  public MCLDDiscreteGeometricAPHestonEngine(HestonProcess process, boolean antitheticVariate, int requiredSamples) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPHestonEngine__SWIG_5(HestonProcess.getCPtr(process), process, antitheticVariate, requiredSamples), true);
  }

  public MCLDDiscreteGeometricAPHestonEngine(HestonProcess process, boolean antitheticVariate) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPHestonEngine__SWIG_6(HestonProcess.getCPtr(process), process, antitheticVariate), true);
  }

  public MCLDDiscreteGeometricAPHestonEngine(HestonProcess process) {
    this(QuantLibJNI.new_MCLDDiscreteGeometricAPHestonEngine__SWIG_7(HestonProcess.getCPtr(process), process), true);
  }

}
