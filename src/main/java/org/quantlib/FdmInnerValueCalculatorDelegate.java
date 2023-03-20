/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmInnerValueCalculatorDelegate {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FdmInnerValueCalculatorDelegate(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmInnerValueCalculatorDelegate obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_FdmInnerValueCalculatorDelegate(swigCPtr);
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
    QuantLibJNI.FdmInnerValueCalculatorDelegate_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    QuantLibJNI.FdmInnerValueCalculatorDelegate_change_ownership(this, swigCPtr, true);
  }

  public double innerValue(FdmLinearOpIterator iter, double t) {
    return (getClass() == FdmInnerValueCalculatorDelegate.class) ? QuantLibJNI.FdmInnerValueCalculatorDelegate_innerValue(swigCPtr, this, FdmLinearOpIterator.getCPtr(iter), iter, t) : QuantLibJNI.FdmInnerValueCalculatorDelegate_innerValueSwigExplicitFdmInnerValueCalculatorDelegate(swigCPtr, this, FdmLinearOpIterator.getCPtr(iter), iter, t);
  }

  public double avgInnerValue(FdmLinearOpIterator iter, double t) {
    return (getClass() == FdmInnerValueCalculatorDelegate.class) ? QuantLibJNI.FdmInnerValueCalculatorDelegate_avgInnerValue(swigCPtr, this, FdmLinearOpIterator.getCPtr(iter), iter, t) : QuantLibJNI.FdmInnerValueCalculatorDelegate_avgInnerValueSwigExplicitFdmInnerValueCalculatorDelegate(swigCPtr, this, FdmLinearOpIterator.getCPtr(iter), iter, t);
  }

  public FdmInnerValueCalculatorDelegate() {
    this(QuantLibJNI.new_FdmInnerValueCalculatorDelegate(), true);
    QuantLibJNI.FdmInnerValueCalculatorDelegate_director_connect(this, swigCPtr, true, true);
  }

}
