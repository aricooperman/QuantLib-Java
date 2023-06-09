/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MCLDEverestEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected MCLDEverestEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MCLDEverestEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MCLDEverestEngine obj) {
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
        QuantLibJNI.delete_MCLDEverestEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MCLDEverestEngine(StochasticProcessArray process, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) {
    this(QuantLibJNI.new_MCLDEverestEngine__SWIG_0(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed), true);
  }

  public MCLDEverestEngine(StochasticProcessArray process, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) {
    this(QuantLibJNI.new_MCLDEverestEngine__SWIG_1(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true);
  }

  public MCLDEverestEngine(StochasticProcessArray process, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples, double requiredTolerance) {
    this(QuantLibJNI.new_MCLDEverestEngine__SWIG_2(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples, requiredTolerance), true);
  }

  public MCLDEverestEngine(StochasticProcessArray process, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate, int requiredSamples) {
    this(QuantLibJNI.new_MCLDEverestEngine__SWIG_3(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate, requiredSamples), true);
  }

  public MCLDEverestEngine(StochasticProcessArray process, long timeSteps, long timeStepsPerYear, boolean brownianBridge, boolean antitheticVariate) {
    this(QuantLibJNI.new_MCLDEverestEngine__SWIG_4(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge, antitheticVariate), true);
  }

  public MCLDEverestEngine(StochasticProcessArray process, long timeSteps, long timeStepsPerYear, boolean brownianBridge) {
    this(QuantLibJNI.new_MCLDEverestEngine__SWIG_5(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear, brownianBridge), true);
  }

  public MCLDEverestEngine(StochasticProcessArray process, long timeSteps, long timeStepsPerYear) {
    this(QuantLibJNI.new_MCLDEverestEngine__SWIG_6(StochasticProcessArray.getCPtr(process), process, timeSteps, timeStepsPerYear), true);
  }

  public MCLDEverestEngine(StochasticProcessArray process, long timeSteps) {
    this(QuantLibJNI.new_MCLDEverestEngine__SWIG_7(StochasticProcessArray.getCPtr(process), process, timeSteps), true);
  }

  public MCLDEverestEngine(StochasticProcessArray process) {
    this(QuantLibJNI.new_MCLDEverestEngine__SWIG_8(StochasticProcessArray.getCPtr(process), process), true);
  }

}
