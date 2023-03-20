/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BinaryFunction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BinaryFunction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BinaryFunction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_BinaryFunction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BinaryFunction(BinaryFunctionDelegate arg0) {
    this(QuantLibJNI.new_BinaryFunction(BinaryFunctionDelegate.getCPtr(arg0), arg0), true);
  }

  public double getValue(double arg0, double arg1) {
    return QuantLibJNI.BinaryFunction_getValue(swigCPtr, this, arg0, arg1);
  }

}