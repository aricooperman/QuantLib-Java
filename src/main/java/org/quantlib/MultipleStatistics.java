/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MultipleStatistics {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MultipleStatistics(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MultipleStatistics obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_MultipleStatistics(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MultipleStatistics(long dimension) {
    this(QuantLibJNI.new_MultipleStatistics(dimension), true);
  }

  public long size() {
    return QuantLibJNI.MultipleStatistics_size(swigCPtr, this);
  }

  public long samples() {
    return QuantLibJNI.MultipleStatistics_samples(swigCPtr, this);
  }

  public double weightSum() {
    return QuantLibJNI.MultipleStatistics_weightSum(swigCPtr, this);
  }

  public DoubleVector mean() {
    return new DoubleVector(QuantLibJNI.MultipleStatistics_mean(swigCPtr, this), true);
  }

  public DoubleVector variance() {
    return new DoubleVector(QuantLibJNI.MultipleStatistics_variance(swigCPtr, this), true);
  }

  public DoubleVector standardDeviation() {
    return new DoubleVector(QuantLibJNI.MultipleStatistics_standardDeviation(swigCPtr, this), true);
  }

  public DoubleVector errorEstimate() {
    return new DoubleVector(QuantLibJNI.MultipleStatistics_errorEstimate(swigCPtr, this), true);
  }

  public DoubleVector skewness() {
    return new DoubleVector(QuantLibJNI.MultipleStatistics_skewness(swigCPtr, this), true);
  }

  public DoubleVector kurtosis() {
    return new DoubleVector(QuantLibJNI.MultipleStatistics_kurtosis(swigCPtr, this), true);
  }

  public DoubleVector min() {
    return new DoubleVector(QuantLibJNI.MultipleStatistics_min(swigCPtr, this), true);
  }

  public DoubleVector max() {
    return new DoubleVector(QuantLibJNI.MultipleStatistics_max(swigCPtr, this), true);
  }

  public Matrix covariance() {
    return new Matrix(QuantLibJNI.MultipleStatistics_covariance(swigCPtr, this), true);
  }

  public Matrix correlation() {
    return new Matrix(QuantLibJNI.MultipleStatistics_correlation(swigCPtr, this), true);
  }

  public void reset() {
    QuantLibJNI.MultipleStatistics_reset(swigCPtr, this);
  }

  public void add(DoubleVector value, double weight) {
    QuantLibJNI.MultipleStatistics_add__SWIG_0(swigCPtr, this, DoubleVector.getCPtr(value), value, weight);
  }

  public void add(DoubleVector value) {
    QuantLibJNI.MultipleStatistics_add__SWIG_1(swigCPtr, this, DoubleVector.getCPtr(value), value);
  }

  public void add(Array value, double weight) {
    QuantLibJNI.MultipleStatistics_add__SWIG_2(swigCPtr, this, Array.getCPtr(value), value, weight);
  }

  public void add(Array value) {
    QuantLibJNI.MultipleStatistics_add__SWIG_3(swigCPtr, this, Array.getCPtr(value), value);
  }

}
