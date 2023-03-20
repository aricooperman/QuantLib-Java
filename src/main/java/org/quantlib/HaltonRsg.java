/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class HaltonRsg {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HaltonRsg(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HaltonRsg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_HaltonRsg(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HaltonRsg(long dimensionality, long seed, boolean randomStart, boolean randomShift) {
    this(QuantLibJNI.new_HaltonRsg__SWIG_0(dimensionality, seed, randomStart, randomShift), true);
  }

  public HaltonRsg(long dimensionality, long seed, boolean randomStart) {
    this(QuantLibJNI.new_HaltonRsg__SWIG_1(dimensionality, seed, randomStart), true);
  }

  public HaltonRsg(long dimensionality, long seed) {
    this(QuantLibJNI.new_HaltonRsg__SWIG_2(dimensionality, seed), true);
  }

  public HaltonRsg(long dimensionality) {
    this(QuantLibJNI.new_HaltonRsg__SWIG_3(dimensionality), true);
  }

  public SampleRealVector nextSequence() {
    return new SampleRealVector(QuantLibJNI.HaltonRsg_nextSequence(swigCPtr, this), false);
  }

  public SampleRealVector lastSequence() {
    return new SampleRealVector(QuantLibJNI.HaltonRsg_lastSequence(swigCPtr, this), false);
  }

  public long dimension() {
    return QuantLibJNI.HaltonRsg_dimension(swigCPtr, this);
  }

}
