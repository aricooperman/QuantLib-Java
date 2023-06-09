/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class AmortizingFloatingRateBond extends Bond {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected AmortizingFloatingRateBond(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.AmortizingFloatingRateBond_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AmortizingFloatingRateBond obj) {
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
        QuantLibJNI.delete_AmortizingFloatingRateBond(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AmortizingFloatingRateBond(long settlementDays, DoubleVector notional, Schedule schedule, IborIndex index, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors, boolean inArrears, Date issueDate, Period exCouponPeriod, Calendar exCouponCalendar, BusinessDayConvention exCouponConvention, boolean exCouponEndOfMonth) {
    this(QuantLibJNI.new_AmortizingFloatingRateBond__SWIG_0(settlementDays, DoubleVector.getCPtr(notional), notional, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors, inArrears, Date.getCPtr(issueDate), issueDate, Period.getCPtr(exCouponPeriod), exCouponPeriod, Calendar.getCPtr(exCouponCalendar), exCouponCalendar, exCouponConvention.swigValue(), exCouponEndOfMonth), true);
  }

  public AmortizingFloatingRateBond(long settlementDays, DoubleVector notional, Schedule schedule, IborIndex index, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors, boolean inArrears, Date issueDate, Period exCouponPeriod, Calendar exCouponCalendar, BusinessDayConvention exCouponConvention) {
    this(QuantLibJNI.new_AmortizingFloatingRateBond__SWIG_1(settlementDays, DoubleVector.getCPtr(notional), notional, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors, inArrears, Date.getCPtr(issueDate), issueDate, Period.getCPtr(exCouponPeriod), exCouponPeriod, Calendar.getCPtr(exCouponCalendar), exCouponCalendar, exCouponConvention.swigValue()), true);
  }

  public AmortizingFloatingRateBond(long settlementDays, DoubleVector notional, Schedule schedule, IborIndex index, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors, boolean inArrears, Date issueDate, Period exCouponPeriod, Calendar exCouponCalendar) {
    this(QuantLibJNI.new_AmortizingFloatingRateBond__SWIG_2(settlementDays, DoubleVector.getCPtr(notional), notional, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors, inArrears, Date.getCPtr(issueDate), issueDate, Period.getCPtr(exCouponPeriod), exCouponPeriod, Calendar.getCPtr(exCouponCalendar), exCouponCalendar), true);
  }

  public AmortizingFloatingRateBond(long settlementDays, DoubleVector notional, Schedule schedule, IborIndex index, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors, boolean inArrears, Date issueDate, Period exCouponPeriod) {
    this(QuantLibJNI.new_AmortizingFloatingRateBond__SWIG_3(settlementDays, DoubleVector.getCPtr(notional), notional, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors, inArrears, Date.getCPtr(issueDate), issueDate, Period.getCPtr(exCouponPeriod), exCouponPeriod), true);
  }

  public AmortizingFloatingRateBond(long settlementDays, DoubleVector notional, Schedule schedule, IborIndex index, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors, boolean inArrears, Date issueDate) {
    this(QuantLibJNI.new_AmortizingFloatingRateBond__SWIG_4(settlementDays, DoubleVector.getCPtr(notional), notional, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors, inArrears, Date.getCPtr(issueDate), issueDate), true);
  }

  public AmortizingFloatingRateBond(long settlementDays, DoubleVector notional, Schedule schedule, IborIndex index, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors, boolean inArrears) {
    this(QuantLibJNI.new_AmortizingFloatingRateBond__SWIG_5(settlementDays, DoubleVector.getCPtr(notional), notional, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors, inArrears), true);
  }

  public AmortizingFloatingRateBond(long settlementDays, DoubleVector notional, Schedule schedule, IborIndex index, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors) {
    this(QuantLibJNI.new_AmortizingFloatingRateBond__SWIG_6(settlementDays, DoubleVector.getCPtr(notional), notional, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors), true);
  }

  public AmortizingFloatingRateBond(long settlementDays, DoubleVector notional, Schedule schedule, IborIndex index, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps) {
    this(QuantLibJNI.new_AmortizingFloatingRateBond__SWIG_7(settlementDays, DoubleVector.getCPtr(notional), notional, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps), true);
  }

  public AmortizingFloatingRateBond(long settlementDays, DoubleVector notional, Schedule schedule, IborIndex index, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads) {
    this(QuantLibJNI.new_AmortizingFloatingRateBond__SWIG_8(settlementDays, DoubleVector.getCPtr(notional), notional, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads), true);
  }

  public AmortizingFloatingRateBond(long settlementDays, DoubleVector notional, Schedule schedule, IborIndex index, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings) {
    this(QuantLibJNI.new_AmortizingFloatingRateBond__SWIG_9(settlementDays, DoubleVector.getCPtr(notional), notional, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings), true);
  }

  public AmortizingFloatingRateBond(long settlementDays, DoubleVector notional, Schedule schedule, IborIndex index, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention, long fixingDays) {
    this(QuantLibJNI.new_AmortizingFloatingRateBond__SWIG_10(settlementDays, DoubleVector.getCPtr(notional), notional, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue(), fixingDays), true);
  }

  public AmortizingFloatingRateBond(long settlementDays, DoubleVector notional, Schedule schedule, IborIndex index, DayCounter accrualDayCounter, BusinessDayConvention paymentConvention) {
    this(QuantLibJNI.new_AmortizingFloatingRateBond__SWIG_11(settlementDays, DoubleVector.getCPtr(notional), notional, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter, paymentConvention.swigValue()), true);
  }

  public AmortizingFloatingRateBond(long settlementDays, DoubleVector notional, Schedule schedule, IborIndex index, DayCounter accrualDayCounter) {
    this(QuantLibJNI.new_AmortizingFloatingRateBond__SWIG_12(settlementDays, DoubleVector.getCPtr(notional), notional, Schedule.getCPtr(schedule), schedule, IborIndex.getCPtr(index), index, DayCounter.getCPtr(accrualDayCounter), accrualDayCounter), true);
  }

}
