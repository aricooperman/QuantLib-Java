/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussianRandomGenerator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GaussianRandomGenerator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussianRandomGenerator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GaussianRandomGenerator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GaussianRandomGenerator(UniformRandomGenerator rng) {
    this(QuantLibJNI.new_GaussianRandomGenerator(UniformRandomGenerator.getCPtr(rng), rng), true);
  }

  public SampleNumber next() {
    return new SampleNumber(QuantLibJNI.GaussianRandomGenerator_next(swigCPtr, this), true);
  }

  public double nextValue() {
    return QuantLibJNI.GaussianRandomGenerator_nextValue(swigCPtr, this);
  }

}
