/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MatrixMultiplicationDelegate {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MatrixMultiplicationDelegate(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MatrixMultiplicationDelegate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_MatrixMultiplicationDelegate(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Array apply(Array x) {
    return new Array(QuantLibJNI.MatrixMultiplicationDelegate_apply(swigCPtr, this, Array.getCPtr(x), x), true);
  }

  public MatrixMultiplicationDelegate() {
    this(QuantLibJNI.new_MatrixMultiplicationDelegate(), true);
  }

}
