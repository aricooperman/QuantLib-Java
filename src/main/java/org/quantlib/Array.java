/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Array {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Array(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Array obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Array(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Array() {
    this(QuantLibJNI.new_Array__SWIG_0(), true);
  }

  public Array(long n, double fill) {
    this(QuantLibJNI.new_Array__SWIG_1(n, fill), true);
  }

  public Array(long n) {
    this(QuantLibJNI.new_Array__SWIG_2(n), true);
  }

  public Array(Array arg0) {
    this(QuantLibJNI.new_Array__SWIG_3(Array.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return QuantLibJNI.Array_size(swigCPtr, this);
  }

  public String toString() {
    return QuantLibJNI.Array_toString(swigCPtr, this);
  }

  public double get(long i) {
    return QuantLibJNI.Array_get(swigCPtr, this, i);
  }

  public void set(long i, double x) {
    QuantLibJNI.Array_set(swigCPtr, this, i, x);
  }

}
