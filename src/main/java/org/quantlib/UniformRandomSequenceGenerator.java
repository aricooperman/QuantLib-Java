/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class UniformRandomSequenceGenerator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected UniformRandomSequenceGenerator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UniformRandomSequenceGenerator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_UniformRandomSequenceGenerator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UniformRandomSequenceGenerator(long dimensionality, UniformRandomGenerator rng) {
    this(QuantLibJNI.new_UniformRandomSequenceGenerator(dimensionality, UniformRandomGenerator.getCPtr(rng), rng), true);
  }

  public SampleRealVector nextSequence() {
    return new SampleRealVector(QuantLibJNI.UniformRandomSequenceGenerator_nextSequence(swigCPtr, this), false);
  }

  public long dimension() {
    return QuantLibJNI.UniformRandomSequenceGenerator_dimension(swigCPtr, this);
  }

}
