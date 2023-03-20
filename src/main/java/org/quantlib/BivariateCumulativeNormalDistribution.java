/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BivariateCumulativeNormalDistribution {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BivariateCumulativeNormalDistribution(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BivariateCumulativeNormalDistribution obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_BivariateCumulativeNormalDistribution(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BivariateCumulativeNormalDistribution(double rho) {
    this(QuantLibJNI.new_BivariateCumulativeNormalDistribution(rho), true);
  }

  public double getValue(double x, double y) {
    return QuantLibJNI.BivariateCumulativeNormalDistribution_getValue(swigCPtr, this, x, y);
  }

}
