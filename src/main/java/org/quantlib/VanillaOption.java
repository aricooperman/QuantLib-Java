/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class VanillaOption extends OneAssetOption {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected VanillaOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.VanillaOption_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VanillaOption obj) {
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
        QuantLibJNI.delete_VanillaOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VanillaOption(StrikedTypePayoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_VanillaOption(StrikedTypePayoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

  public double impliedVolatility(double targetValue, GeneralizedBlackScholesProcess process, double accuracy, long maxEvaluations, double minVol, double maxVol) {
    return QuantLibJNI.VanillaOption_impliedVolatility__SWIG_0(swigCPtr, this, targetValue, GeneralizedBlackScholesProcess.getCPtr(process), process, accuracy, maxEvaluations, minVol, maxVol);
  }

  public double impliedVolatility(double targetValue, GeneralizedBlackScholesProcess process, double accuracy, long maxEvaluations, double minVol) {
    return QuantLibJNI.VanillaOption_impliedVolatility__SWIG_1(swigCPtr, this, targetValue, GeneralizedBlackScholesProcess.getCPtr(process), process, accuracy, maxEvaluations, minVol);
  }

  public double impliedVolatility(double targetValue, GeneralizedBlackScholesProcess process, double accuracy, long maxEvaluations) {
    return QuantLibJNI.VanillaOption_impliedVolatility__SWIG_2(swigCPtr, this, targetValue, GeneralizedBlackScholesProcess.getCPtr(process), process, accuracy, maxEvaluations);
  }

  public double impliedVolatility(double targetValue, GeneralizedBlackScholesProcess process, double accuracy) {
    return QuantLibJNI.VanillaOption_impliedVolatility__SWIG_3(swigCPtr, this, targetValue, GeneralizedBlackScholesProcess.getCPtr(process), process, accuracy);
  }

  public double impliedVolatility(double targetValue, GeneralizedBlackScholesProcess process) {
    return QuantLibJNI.VanillaOption_impliedVolatility__SWIG_4(swigCPtr, this, targetValue, GeneralizedBlackScholesProcess.getCPtr(process), process);
  }

  public SampledCurve priceCurve() {
    return new SampledCurve(QuantLibJNI.VanillaOption_priceCurve(swigCPtr, this), true);
  }

}
