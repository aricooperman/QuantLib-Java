/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class IborIndex extends InterestRateIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected IborIndex(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.IborIndex_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IborIndex obj) {
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
        QuantLibJNI.delete_IborIndex(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IborIndex(String familyName, Period tenor, int settlementDays, Currency currency, Calendar calendar, BusinessDayConvention convention, boolean endOfMonth, DayCounter dayCounter, YieldTermStructureHandle h) {
    this(QuantLibJNI.new_IborIndex__SWIG_0(familyName, Period.getCPtr(tenor), tenor, settlementDays, Currency.getCPtr(currency), currency, Calendar.getCPtr(calendar), calendar, convention.swigValue(), endOfMonth, DayCounter.getCPtr(dayCounter), dayCounter, YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public IborIndex(String familyName, Period tenor, int settlementDays, Currency currency, Calendar calendar, BusinessDayConvention convention, boolean endOfMonth, DayCounter dayCounter) {
    this(QuantLibJNI.new_IborIndex__SWIG_1(familyName, Period.getCPtr(tenor), tenor, settlementDays, Currency.getCPtr(currency), currency, Calendar.getCPtr(calendar), calendar, convention.swigValue(), endOfMonth, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public BusinessDayConvention businessDayConvention() {
    return BusinessDayConvention.swigToEnum(QuantLibJNI.IborIndex_businessDayConvention(swigCPtr, this));
  }

  public boolean endOfMonth() {
    return QuantLibJNI.IborIndex_endOfMonth(swigCPtr, this);
  }

  public YieldTermStructureHandle forwardingTermStructure() {
    return new YieldTermStructureHandle(QuantLibJNI.IborIndex_forwardingTermStructure(swigCPtr, this), true);
  }

  public IborIndex clone(YieldTermStructureHandle arg0) {
    long cPtr = QuantLibJNI.IborIndex_clone(swigCPtr, this, YieldTermStructureHandle.getCPtr(arg0), arg0);
    return (cPtr == 0) ? null : new IborIndex(cPtr, true);
  }

}
