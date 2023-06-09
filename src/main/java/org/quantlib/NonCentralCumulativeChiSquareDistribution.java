/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class NonCentralCumulativeChiSquareDistribution {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected NonCentralCumulativeChiSquareDistribution(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NonCentralCumulativeChiSquareDistribution obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_NonCentralCumulativeChiSquareDistribution(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public NonCentralCumulativeChiSquareDistribution(double df, double ncp) {
    this(QuantLibJNI.new_NonCentralCumulativeChiSquareDistribution(df, ncp), true);
  }

  public double getValue(double x) {
    return QuantLibJNI.NonCentralCumulativeChiSquareDistribution_getValue(swigCPtr, this, x);
  }

}
