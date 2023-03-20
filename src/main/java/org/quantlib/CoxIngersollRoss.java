/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CoxIngersollRoss extends ShortRateModel {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected CoxIngersollRoss(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CoxIngersollRoss_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CoxIngersollRoss obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        QuantLibJNI.delete_CoxIngersollRoss(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CoxIngersollRoss(double r0, double theta, double k, double sigma) {
    this(QuantLibJNI.new_CoxIngersollRoss__SWIG_0(r0, theta, k, sigma), true);
  }

  public CoxIngersollRoss(double r0, double theta, double k) {
    this(QuantLibJNI.new_CoxIngersollRoss__SWIG_1(r0, theta, k), true);
  }

  public CoxIngersollRoss(double r0, double theta) {
    this(QuantLibJNI.new_CoxIngersollRoss__SWIG_2(r0, theta), true);
  }

  public CoxIngersollRoss(double r0) {
    this(QuantLibJNI.new_CoxIngersollRoss__SWIG_3(r0), true);
  }

  public CoxIngersollRoss() {
    this(QuantLibJNI.new_CoxIngersollRoss__SWIG_4(), true);
  }

  public double discount(double t) {
    return QuantLibJNI.CoxIngersollRoss_discount(swigCPtr, this, t);
  }

}