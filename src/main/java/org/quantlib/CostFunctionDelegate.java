/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CostFunctionDelegate {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CostFunctionDelegate(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CostFunctionDelegate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CostFunctionDelegate(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    QuantLibJNI.CostFunctionDelegate_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    QuantLibJNI.CostFunctionDelegate_change_ownership(this, swigCPtr, true);
  }

  public double value(Array x) {
    return (getClass() == CostFunctionDelegate.class) ? QuantLibJNI.CostFunctionDelegate_value(swigCPtr, this, Array.getCPtr(x), x) : QuantLibJNI.CostFunctionDelegate_valueSwigExplicitCostFunctionDelegate(swigCPtr, this, Array.getCPtr(x), x);
  }

  public Array values(Array x) {
    return new Array((getClass() == CostFunctionDelegate.class) ? QuantLibJNI.CostFunctionDelegate_values(swigCPtr, this, Array.getCPtr(x), x) : QuantLibJNI.CostFunctionDelegate_valuesSwigExplicitCostFunctionDelegate(swigCPtr, this, Array.getCPtr(x), x), true);
  }

  public CostFunctionDelegate() {
    this(QuantLibJNI.new_CostFunctionDelegate(), true);
    QuantLibJNI.CostFunctionDelegate_director_connect(this, swigCPtr, true, true);
  }

}
