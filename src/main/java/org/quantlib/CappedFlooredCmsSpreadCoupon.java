/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CappedFlooredCmsSpreadCoupon extends CappedFlooredCoupon {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected CappedFlooredCmsSpreadCoupon(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CappedFlooredCmsSpreadCoupon_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CappedFlooredCmsSpreadCoupon obj) {
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
        QuantLibJNI.delete_CappedFlooredCmsSpreadCoupon(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CappedFlooredCmsSpreadCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, long fixingDays, SwapSpreadIndex index, double gearing, double spread, double cap, double floor, Date refPeriodStart, Date refPeriodEnd, DayCounter dayCounter, boolean isInArrears, Date exCouponDate) {
    this(QuantLibJNI.new_CappedFlooredCmsSpreadCoupon__SWIG_0(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapSpreadIndex.getCPtr(index), index, gearing, spread, cap, floor, Date.getCPtr(refPeriodStart), refPeriodStart, Date.getCPtr(refPeriodEnd), refPeriodEnd, DayCounter.getCPtr(dayCounter), dayCounter, isInArrears, Date.getCPtr(exCouponDate), exCouponDate), true);
  }

  public CappedFlooredCmsSpreadCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, long fixingDays, SwapSpreadIndex index, double gearing, double spread, double cap, double floor, Date refPeriodStart, Date refPeriodEnd, DayCounter dayCounter, boolean isInArrears) {
    this(QuantLibJNI.new_CappedFlooredCmsSpreadCoupon__SWIG_1(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapSpreadIndex.getCPtr(index), index, gearing, spread, cap, floor, Date.getCPtr(refPeriodStart), refPeriodStart, Date.getCPtr(refPeriodEnd), refPeriodEnd, DayCounter.getCPtr(dayCounter), dayCounter, isInArrears), true);
  }

  public CappedFlooredCmsSpreadCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, long fixingDays, SwapSpreadIndex index, double gearing, double spread, double cap, double floor, Date refPeriodStart, Date refPeriodEnd, DayCounter dayCounter) {
    this(QuantLibJNI.new_CappedFlooredCmsSpreadCoupon__SWIG_2(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapSpreadIndex.getCPtr(index), index, gearing, spread, cap, floor, Date.getCPtr(refPeriodStart), refPeriodStart, Date.getCPtr(refPeriodEnd), refPeriodEnd, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public CappedFlooredCmsSpreadCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, long fixingDays, SwapSpreadIndex index, double gearing, double spread, double cap, double floor, Date refPeriodStart, Date refPeriodEnd) {
    this(QuantLibJNI.new_CappedFlooredCmsSpreadCoupon__SWIG_3(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapSpreadIndex.getCPtr(index), index, gearing, spread, cap, floor, Date.getCPtr(refPeriodStart), refPeriodStart, Date.getCPtr(refPeriodEnd), refPeriodEnd), true);
  }

  public CappedFlooredCmsSpreadCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, long fixingDays, SwapSpreadIndex index, double gearing, double spread, double cap, double floor, Date refPeriodStart) {
    this(QuantLibJNI.new_CappedFlooredCmsSpreadCoupon__SWIG_4(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapSpreadIndex.getCPtr(index), index, gearing, spread, cap, floor, Date.getCPtr(refPeriodStart), refPeriodStart), true);
  }

  public CappedFlooredCmsSpreadCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, long fixingDays, SwapSpreadIndex index, double gearing, double spread, double cap, double floor) {
    this(QuantLibJNI.new_CappedFlooredCmsSpreadCoupon__SWIG_5(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapSpreadIndex.getCPtr(index), index, gearing, spread, cap, floor), true);
  }

  public CappedFlooredCmsSpreadCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, long fixingDays, SwapSpreadIndex index, double gearing, double spread, double cap) {
    this(QuantLibJNI.new_CappedFlooredCmsSpreadCoupon__SWIG_6(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapSpreadIndex.getCPtr(index), index, gearing, spread, cap), true);
  }

  public CappedFlooredCmsSpreadCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, long fixingDays, SwapSpreadIndex index, double gearing, double spread) {
    this(QuantLibJNI.new_CappedFlooredCmsSpreadCoupon__SWIG_7(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapSpreadIndex.getCPtr(index), index, gearing, spread), true);
  }

  public CappedFlooredCmsSpreadCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, long fixingDays, SwapSpreadIndex index, double gearing) {
    this(QuantLibJNI.new_CappedFlooredCmsSpreadCoupon__SWIG_8(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapSpreadIndex.getCPtr(index), index, gearing), true);
  }

  public CappedFlooredCmsSpreadCoupon(Date paymentDate, double nominal, Date startDate, Date endDate, long fixingDays, SwapSpreadIndex index) {
    this(QuantLibJNI.new_CappedFlooredCmsSpreadCoupon__SWIG_9(Date.getCPtr(paymentDate), paymentDate, nominal, Date.getCPtr(startDate), startDate, Date.getCPtr(endDate), endDate, fixingDays, SwapSpreadIndex.getCPtr(index), index), true);
  }

}
