/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class InvCumulativeHaltonGaussianRsg {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected InvCumulativeHaltonGaussianRsg(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InvCumulativeHaltonGaussianRsg obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_InvCumulativeHaltonGaussianRsg(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public InvCumulativeHaltonGaussianRsg(HaltonRsg uniformSequenceGenerator) {
    this(QuantLibJNI.new_InvCumulativeHaltonGaussianRsg__SWIG_0(HaltonRsg.getCPtr(uniformSequenceGenerator), uniformSequenceGenerator), true);
  }

  public InvCumulativeHaltonGaussianRsg(HaltonRsg uniformSequenceGenerator, InverseCumulativeNormal inverseCumulative) {
    this(QuantLibJNI.new_InvCumulativeHaltonGaussianRsg__SWIG_1(HaltonRsg.getCPtr(uniformSequenceGenerator), uniformSequenceGenerator, InverseCumulativeNormal.getCPtr(inverseCumulative), inverseCumulative), true);
  }

  public SampleRealVector nextSequence() {
    return new SampleRealVector(QuantLibJNI.InvCumulativeHaltonGaussianRsg_nextSequence(swigCPtr, this), false);
  }

  public long dimension() {
    return QuantLibJNI.InvCumulativeHaltonGaussianRsg_dimension(swigCPtr, this);
  }

}
