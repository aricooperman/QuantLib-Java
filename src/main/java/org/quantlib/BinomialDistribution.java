/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BinomialDistribution {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BinomialDistribution(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BinomialDistribution obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_BinomialDistribution(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BinomialDistribution(double p, long n) {
    this(QuantLibJNI.new_BinomialDistribution(p, n), true);
  }

  public double getValue(long k) {
    return QuantLibJNI.BinomialDistribution_getValue(swigCPtr, this, k);
  }

}
