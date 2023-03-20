/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MCPRAmericanEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected MCPRAmericanEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MCPRAmericanEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MCPRAmericanEngine obj) {
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
        QuantLibJNI.delete_MCPRAmericanEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, boolean controlVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed, int polynomOrder, LsmBasisSystem.PolynomType polynomType, int nCalibrationSamples, OptionalBool antitheticVariateCalibration, long seedCalibration) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, controlVariate, requiredSamples, requiredTolerance, maxSamples, seed, polynomOrder, polynomType.swigValue(), nCalibrationSamples, OptionalBool.getCPtr(antitheticVariateCalibration), antitheticVariateCalibration, seedCalibration), true);
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, boolean controlVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed, int polynomOrder, LsmBasisSystem.PolynomType polynomType, int nCalibrationSamples, OptionalBool antitheticVariateCalibration) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, controlVariate, requiredSamples, requiredTolerance, maxSamples, seed, polynomOrder, polynomType.swigValue(), nCalibrationSamples, OptionalBool.getCPtr(antitheticVariateCalibration), antitheticVariateCalibration), true);
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, boolean controlVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed, int polynomOrder, LsmBasisSystem.PolynomType polynomType, int nCalibrationSamples) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_2(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, controlVariate, requiredSamples, requiredTolerance, maxSamples, seed, polynomOrder, polynomType.swigValue(), nCalibrationSamples), true);
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, boolean controlVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed, int polynomOrder, LsmBasisSystem.PolynomType polynomType) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_3(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, controlVariate, requiredSamples, requiredTolerance, maxSamples, seed, polynomOrder, polynomType.swigValue()), true);
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, boolean controlVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed, int polynomOrder) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_4(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, controlVariate, requiredSamples, requiredTolerance, maxSamples, seed, polynomOrder), true);
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, boolean controlVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_5(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, controlVariate, requiredSamples, requiredTolerance, maxSamples, seed), true);
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, boolean controlVariate, int requiredSamples, double requiredTolerance, int maxSamples) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_6(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, controlVariate, requiredSamples, requiredTolerance, maxSamples), true);
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, boolean controlVariate, int requiredSamples, double requiredTolerance) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_7(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, controlVariate, requiredSamples, requiredTolerance), true);
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, boolean controlVariate, int requiredSamples) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_8(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, controlVariate, requiredSamples), true);
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, boolean controlVariate) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_9(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, controlVariate), true);
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_10(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate), true);
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process, int timeSteps, int timeStepsPerYear) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_11(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps, timeStepsPerYear), true);
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process, int timeSteps) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_12(GeneralizedBlackScholesProcess.getCPtr(process), process, timeSteps), true);
  }

  public MCPRAmericanEngine(GeneralizedBlackScholesProcess process) {
    this(QuantLibJNI.new_MCPRAmericanEngine__SWIG_13(GeneralizedBlackScholesProcess.getCPtr(process), process), true);
  }

}
