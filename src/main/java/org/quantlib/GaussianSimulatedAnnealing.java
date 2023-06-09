/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussianSimulatedAnnealing extends OptimizationMethod {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected GaussianSimulatedAnnealing(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.GaussianSimulatedAnnealing_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussianSimulatedAnnealing obj) {
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
        QuantLibJNI.delete_GaussianSimulatedAnnealing(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GaussianSimulatedAnnealing(SamplerGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature, long reAnnealSteps, GaussianSimulatedAnnealing.ResetScheme resetScheme, long resetSteps) {
    this(QuantLibJNI.new_GaussianSimulatedAnnealing__SWIG_0(SamplerGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature, endTemperature, reAnnealSteps, resetScheme.swigValue(), resetSteps), true);
  }

  public GaussianSimulatedAnnealing(SamplerGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature, long reAnnealSteps, GaussianSimulatedAnnealing.ResetScheme resetScheme) {
    this(QuantLibJNI.new_GaussianSimulatedAnnealing__SWIG_1(SamplerGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature, endTemperature, reAnnealSteps, resetScheme.swigValue()), true);
  }

  public GaussianSimulatedAnnealing(SamplerGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature, long reAnnealSteps) {
    this(QuantLibJNI.new_GaussianSimulatedAnnealing__SWIG_2(SamplerGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature, endTemperature, reAnnealSteps), true);
  }

  public GaussianSimulatedAnnealing(SamplerGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature, double endTemperature) {
    this(QuantLibJNI.new_GaussianSimulatedAnnealing__SWIG_3(SamplerGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature, endTemperature), true);
  }

  public GaussianSimulatedAnnealing(SamplerGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing, double startTemperature) {
    this(QuantLibJNI.new_GaussianSimulatedAnnealing__SWIG_4(SamplerGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing, startTemperature), true);
  }

  public GaussianSimulatedAnnealing(SamplerGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature, ReannealingTrivial reannealing) {
    this(QuantLibJNI.new_GaussianSimulatedAnnealing__SWIG_5(SamplerGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature, ReannealingTrivial.getCPtr(reannealing), reannealing), true);
  }

  public GaussianSimulatedAnnealing(SamplerGaussian sampler, ProbabilityBoltzmannDownhill probability, TemperatureExponential temperature) {
    this(QuantLibJNI.new_GaussianSimulatedAnnealing__SWIG_6(SamplerGaussian.getCPtr(sampler), sampler, ProbabilityBoltzmannDownhill.getCPtr(probability), probability, TemperatureExponential.getCPtr(temperature), temperature), true);
  }

  public final static class ResetScheme {
    public final static GaussianSimulatedAnnealing.ResetScheme NoResetScheme = new GaussianSimulatedAnnealing.ResetScheme("NoResetScheme");
    public final static GaussianSimulatedAnnealing.ResetScheme ResetToBestPoint = new GaussianSimulatedAnnealing.ResetScheme("ResetToBestPoint");
    public final static GaussianSimulatedAnnealing.ResetScheme ResetToOrigin = new GaussianSimulatedAnnealing.ResetScheme("ResetToOrigin");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ResetScheme swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ResetScheme.class + " with value " + swigValue);
    }

    private ResetScheme(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ResetScheme(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ResetScheme(String swigName, ResetScheme swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ResetScheme[] swigValues = { NoResetScheme, ResetToBestPoint, ResetToOrigin };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
