/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class LecuyerUniformRng {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LecuyerUniformRng(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LecuyerUniformRng obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_LecuyerUniformRng(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LecuyerUniformRng(int seed) {
    this(QuantLibJNI.new_LecuyerUniformRng__SWIG_0(seed), true);
  }

  public LecuyerUniformRng() {
    this(QuantLibJNI.new_LecuyerUniformRng__SWIG_1(), true);
  }

  public SampleNumber next() {
    return new SampleNumber(QuantLibJNI.LecuyerUniformRng_next(swigCPtr, this), true);
  }

}
