/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class AmortizingFixedRateBond extends Bond {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected AmortizingFixedRateBond(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.AmortizingFixedRateBond_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AmortizingFixedRateBond obj) {
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
        QuantLibJNI.delete_AmortizingFixedRateBond(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, DoubleVector coupons, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, Date issueDate, Period exCouponPeriod, Calendar exCouponCalendar, BusinessDayConvention exCouponConvention, boolean exCouponEndOfMonth) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_0(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), Date.getCPtr(issueDate), issueDate, Period.getCPtr(exCouponPeriod), exCouponPeriod, Calendar.getCPtr(exCouponCalendar), exCouponCalendar, exCouponConvention.swigValue(), exCouponEndOfMonth), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, DoubleVector coupons, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, Date issueDate, Period exCouponPeriod, Calendar exCouponCalendar, BusinessDayConvention exCouponConvention) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_1(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), Date.getCPtr(issueDate), issueDate, Period.getCPtr(exCouponPeriod), exCouponPeriod, Calendar.getCPtr(exCouponCalendar), exCouponCalendar, exCouponConvention.swigValue()), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, DoubleVector coupons, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, Date issueDate, Period exCouponPeriod, Calendar exCouponCalendar) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_2(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), Date.getCPtr(issueDate), issueDate, Period.getCPtr(exCouponPeriod), exCouponPeriod, Calendar.getCPtr(exCouponCalendar), exCouponCalendar), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, DoubleVector coupons, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, Date issueDate, Period exCouponPeriod) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_3(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), Date.getCPtr(issueDate), issueDate, Period.getCPtr(exCouponPeriod), exCouponPeriod), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, DoubleVector coupons, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, Date issueDate) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_4(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), Date.getCPtr(issueDate), issueDate), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, DoubleVector coupons, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_5(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue()), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, DoubleVector coupons, DayCounter accrualDayCounter) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_6(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, DoubleVector.getCPtr(coupons), coupons, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter), true);
  }

  public AmortizingFixedRateBond(int settlementDays, Calendar paymentCalendar, double faceAmount, Date startDate, Period bondTenor, Frequency sinkingFrequency, double coupon, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, Date issueDate) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_7(settlementDays, Calendar.getCPtr(paymentCalendar), paymentCalendar, faceAmount, Date.getCPtr(startDate), startDate, Period.getCPtr(bondTenor), bondTenor, sinkingFrequency.swigValue(), coupon, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), Date.getCPtr(issueDate), issueDate), true);
  }

  public AmortizingFixedRateBond(int settlementDays, Calendar paymentCalendar, double faceAmount, Date startDate, Period bondTenor, Frequency sinkingFrequency, double coupon, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_8(settlementDays, Calendar.getCPtr(paymentCalendar), paymentCalendar, faceAmount, Date.getCPtr(startDate), startDate, Period.getCPtr(bondTenor), bondTenor, sinkingFrequency.swigValue(), coupon, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue()), true);
  }

  public AmortizingFixedRateBond(int settlementDays, Calendar paymentCalendar, double faceAmount, Date startDate, Period bondTenor, Frequency sinkingFrequency, double coupon, DayCounter accrualDayCounter) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_9(settlementDays, Calendar.getCPtr(paymentCalendar), paymentCalendar, faceAmount, Date.getCPtr(startDate), startDate, Period.getCPtr(bondTenor), bondTenor, sinkingFrequency.swigValue(), coupon, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, InterestRateVector coupons, BusinessDayConvention paymentConvention, Date issueDate, Calendar paymentCalendar, Period exCouponPeriod, Calendar exCouponCalendar, BusinessDayConvention exCouponConvention, boolean exCouponEndOfMonth) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_10(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, InterestRateVector.getCPtr(coupons), coupons, paymentConvention.swigValue(), Date.getCPtr(issueDate), issueDate, Calendar.getCPtr(paymentCalendar), paymentCalendar, Period.getCPtr(exCouponPeriod), exCouponPeriod, Calendar.getCPtr(exCouponCalendar), exCouponCalendar, exCouponConvention.swigValue(), exCouponEndOfMonth), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, InterestRateVector coupons, BusinessDayConvention paymentConvention, Date issueDate, Calendar paymentCalendar, Period exCouponPeriod, Calendar exCouponCalendar, BusinessDayConvention exCouponConvention) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_11(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, InterestRateVector.getCPtr(coupons), coupons, paymentConvention.swigValue(), Date.getCPtr(issueDate), issueDate, Calendar.getCPtr(paymentCalendar), paymentCalendar, Period.getCPtr(exCouponPeriod), exCouponPeriod, Calendar.getCPtr(exCouponCalendar), exCouponCalendar, exCouponConvention.swigValue()), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, InterestRateVector coupons, BusinessDayConvention paymentConvention, Date issueDate, Calendar paymentCalendar, Period exCouponPeriod, Calendar exCouponCalendar) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_12(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, InterestRateVector.getCPtr(coupons), coupons, paymentConvention.swigValue(), Date.getCPtr(issueDate), issueDate, Calendar.getCPtr(paymentCalendar), paymentCalendar, Period.getCPtr(exCouponPeriod), exCouponPeriod, Calendar.getCPtr(exCouponCalendar), exCouponCalendar), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, InterestRateVector coupons, BusinessDayConvention paymentConvention, Date issueDate, Calendar paymentCalendar, Period exCouponPeriod) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_13(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, InterestRateVector.getCPtr(coupons), coupons, paymentConvention.swigValue(), Date.getCPtr(issueDate), issueDate, Calendar.getCPtr(paymentCalendar), paymentCalendar, Period.getCPtr(exCouponPeriod), exCouponPeriod), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, InterestRateVector coupons, BusinessDayConvention paymentConvention, Date issueDate, Calendar paymentCalendar) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_14(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, InterestRateVector.getCPtr(coupons), coupons, paymentConvention.swigValue(), Date.getCPtr(issueDate), issueDate, Calendar.getCPtr(paymentCalendar), paymentCalendar), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, InterestRateVector coupons, BusinessDayConvention paymentConvention, Date issueDate) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_15(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, InterestRateVector.getCPtr(coupons), coupons, paymentConvention.swigValue(), Date.getCPtr(issueDate), issueDate), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, InterestRateVector coupons, BusinessDayConvention paymentConvention) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_16(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, InterestRateVector.getCPtr(coupons), coupons, paymentConvention.swigValue()), true);
  }

  public AmortizingFixedRateBond(int settlementDays, DoubleVector notionals, Schedule schedule, InterestRateVector coupons) {
    this(QuantLibJNI.new_AmortizingFixedRateBond__SWIG_17(settlementDays, DoubleVector.getCPtr(notionals), notionals, Schedule.getCPtr(schedule), schedule, InterestRateVector.getCPtr(coupons), coupons), true);
  }

  public Frequency frequency() {
    return Frequency.swigToEnum(QuantLibJNI.AmortizingFixedRateBond_frequency(swigCPtr, this));
  }

  public DayCounter dayCounter() {
    return new DayCounter(QuantLibJNI.AmortizingFixedRateBond_dayCounter(swigCPtr, this), true);
  }

}
