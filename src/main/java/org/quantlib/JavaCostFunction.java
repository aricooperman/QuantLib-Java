/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class JavaCostFunction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected JavaCostFunction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(JavaCostFunction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_JavaCostFunction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public JavaCostFunction(CostFunctionDelegate delegate) {
    this(QuantLibJNI.new_JavaCostFunction(CostFunctionDelegate.getCPtr(delegate), delegate), true);
  }

  public double value(Array x) {
    return QuantLibJNI.JavaCostFunction_value(swigCPtr, this, Array.getCPtr(x), x);
  }

  public Array values(Array x) {
    return new Array(QuantLibJNI.JavaCostFunction_values(swigCPtr, this, Array.getCPtr(x), x), true);
  }

}
