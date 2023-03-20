/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class InverseNonCentralCumulativeChiSquareDistribution {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected InverseNonCentralCumulativeChiSquareDistribution(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InverseNonCentralCumulativeChiSquareDistribution obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_InverseNonCentralCumulativeChiSquareDistribution(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public InverseNonCentralCumulativeChiSquareDistribution(double df, double ncp, long maxEvaluations, double accuracy) {
    this(QuantLibJNI.new_InverseNonCentralCumulativeChiSquareDistribution__SWIG_0(df, ncp, maxEvaluations, accuracy), true);
  }

  public InverseNonCentralCumulativeChiSquareDistribution(double df, double ncp, long maxEvaluations) {
    this(QuantLibJNI.new_InverseNonCentralCumulativeChiSquareDistribution__SWIG_1(df, ncp, maxEvaluations), true);
  }

  public InverseNonCentralCumulativeChiSquareDistribution(double df, double ncp) {
    this(QuantLibJNI.new_InverseNonCentralCumulativeChiSquareDistribution__SWIG_2(df, ncp), true);
  }

  public double getValue(double x) {
    return QuantLibJNI.InverseNonCentralCumulativeChiSquareDistribution_getValue(swigCPtr, this, x);
  }

}
