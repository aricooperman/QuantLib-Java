/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MersenneTwisterUniformRsg {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MersenneTwisterUniformRsg(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MersenneTwisterUniformRsg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_MersenneTwisterUniformRsg(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MersenneTwisterUniformRsg(long dimensionality, MersenneTwisterUniformRng rng) {
    this(QuantLibJNI.new_MersenneTwisterUniformRsg__SWIG_0(dimensionality, MersenneTwisterUniformRng.getCPtr(rng), rng), true);
  }

  public MersenneTwisterUniformRsg(long dimensionality, long seed) {
    this(QuantLibJNI.new_MersenneTwisterUniformRsg__SWIG_1(dimensionality, seed), true);
  }

  public MersenneTwisterUniformRsg(long dimensionality) {
    this(QuantLibJNI.new_MersenneTwisterUniformRsg__SWIG_2(dimensionality), true);
  }

  public SampleRealVector nextSequence() {
    return new SampleRealVector(QuantLibJNI.MersenneTwisterUniformRsg_nextSequence(swigCPtr, this), false);
  }

  public long dimension() {
    return QuantLibJNI.MersenneTwisterUniformRsg_dimension(swigCPtr, this);
  }

}
