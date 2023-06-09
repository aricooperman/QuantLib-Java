/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MCLDEuropeanHestonEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected MCLDEuropeanHestonEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MCLDEuropeanHestonEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MCLDEuropeanHestonEngine obj) {
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
        QuantLibJNI.delete_MCLDEuropeanHestonEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MCLDEuropeanHestonEngine(HestonProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) {
    this(QuantLibJNI.new_MCLDEuropeanHestonEngine__SWIG_0(HestonProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed), true);
  }

  public MCLDEuropeanHestonEngine(HestonProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) {
    this(QuantLibJNI.new_MCLDEuropeanHestonEngine__SWIG_1(HestonProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true);
  }

  public MCLDEuropeanHestonEngine(HestonProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, int requiredSamples, double requiredTolerance) {
    this(QuantLibJNI.new_MCLDEuropeanHestonEngine__SWIG_2(HestonProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, requiredSamples, requiredTolerance), true);
  }

  public MCLDEuropeanHestonEngine(HestonProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, int requiredSamples) {
    this(QuantLibJNI.new_MCLDEuropeanHestonEngine__SWIG_3(HestonProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, requiredSamples), true);
  }

  public MCLDEuropeanHestonEngine(HestonProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate) {
    this(QuantLibJNI.new_MCLDEuropeanHestonEngine__SWIG_4(HestonProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate), true);
  }

  public MCLDEuropeanHestonEngine(HestonProcess process, int timeSteps, int timeStepsPerYear) {
    this(QuantLibJNI.new_MCLDEuropeanHestonEngine__SWIG_5(HestonProcess.getCPtr(process), process, timeSteps, timeStepsPerYear), true);
  }

  public MCLDEuropeanHestonEngine(HestonProcess process, int timeSteps) {
    this(QuantLibJNI.new_MCLDEuropeanHestonEngine__SWIG_6(HestonProcess.getCPtr(process), process, timeSteps), true);
  }

  public MCLDEuropeanHestonEngine(HestonProcess process) {
    this(QuantLibJNI.new_MCLDEuropeanHestonEngine__SWIG_7(HestonProcess.getCPtr(process), process), true);
  }

}
