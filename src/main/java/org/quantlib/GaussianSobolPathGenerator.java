/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussianSobolPathGenerator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GaussianSobolPathGenerator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussianSobolPathGenerator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GaussianSobolPathGenerator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GaussianSobolPathGenerator(StochasticProcess arg0, double length, long timeSteps, GaussianLowDiscrepancySequenceGenerator generator, boolean brownianBridge) {
    this(QuantLibJNI.new_GaussianSobolPathGenerator__SWIG_0(StochasticProcess.getCPtr(arg0), arg0, length, timeSteps, GaussianLowDiscrepancySequenceGenerator.getCPtr(generator), generator, brownianBridge), true);
  }

  public GaussianSobolPathGenerator(StochasticProcess arg0, TimeGrid timeGrid, GaussianLowDiscrepancySequenceGenerator generator, boolean brownianBridge) {
    this(QuantLibJNI.new_GaussianSobolPathGenerator__SWIG_1(StochasticProcess.getCPtr(arg0), arg0, TimeGrid.getCPtr(timeGrid), timeGrid, GaussianLowDiscrepancySequenceGenerator.getCPtr(generator), generator, brownianBridge), true);
  }

  public SamplePath next() {
    return new SamplePath(QuantLibJNI.GaussianSobolPathGenerator_next(swigCPtr, this), false);
  }

  public SamplePath antithetic() {
    return new SamplePath(QuantLibJNI.GaussianSobolPathGenerator_antithetic(swigCPtr, this), false);
  }

  public long size() {
    return QuantLibJNI.GaussianSobolPathGenerator_size(swigCPtr, this);
  }

  public TimeGrid timeGrid() {
    return new TimeGrid(QuantLibJNI.GaussianSobolPathGenerator_timeGrid(swigCPtr, this), false);
  }

}
