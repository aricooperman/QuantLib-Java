/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class InflationCoupon extends Coupon {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected InflationCoupon(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.InflationCoupon_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InflationCoupon obj) {
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
        QuantLibJNI.delete_InflationCoupon(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Date fixingDate() {
    return new Date(QuantLibJNI.InflationCoupon_fixingDate(swigCPtr, this), true);
  }

  public int fixingDays() {
    return QuantLibJNI.InflationCoupon_fixingDays(swigCPtr, this);
  }

  public Period observationLag() {
    return new Period(QuantLibJNI.InflationCoupon_observationLag(swigCPtr, this), true);
  }

  public double indexFixing() {
    return QuantLibJNI.InflationCoupon_indexFixing(swigCPtr, this);
  }

  public InflationIndex index() {
    long cPtr = QuantLibJNI.InflationCoupon_index(swigCPtr, this);
    return (cPtr == 0) ? null : new InflationIndex(cPtr, true);
  }

}