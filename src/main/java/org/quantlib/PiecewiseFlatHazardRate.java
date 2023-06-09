/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class PiecewiseFlatHazardRate extends DefaultProbabilityTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected PiecewiseFlatHazardRate(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.PiecewiseFlatHazardRate_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PiecewiseFlatHazardRate obj) {
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
        QuantLibJNI.delete_PiecewiseFlatHazardRate(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PiecewiseFlatHazardRate(Date referenceDate, DefaultProbabilityHelperVector instruments, DayCounter dayCounter, BackwardFlat i, IterativeBootstrap b) {
    this(QuantLibJNI.new_PiecewiseFlatHazardRate__SWIG_0(Date.getCPtr(referenceDate), referenceDate, DefaultProbabilityHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, BackwardFlat.getCPtr(i), i, IterativeBootstrap.getCPtr(b), b), true);
  }

  public PiecewiseFlatHazardRate(Date referenceDate, DefaultProbabilityHelperVector instruments, DayCounter dayCounter, BackwardFlat i) {
    this(QuantLibJNI.new_PiecewiseFlatHazardRate__SWIG_1(Date.getCPtr(referenceDate), referenceDate, DefaultProbabilityHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, BackwardFlat.getCPtr(i), i), true);
  }

  public PiecewiseFlatHazardRate(Date referenceDate, DefaultProbabilityHelperVector instruments, DayCounter dayCounter) {
    this(QuantLibJNI.new_PiecewiseFlatHazardRate__SWIG_2(Date.getCPtr(referenceDate), referenceDate, DefaultProbabilityHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public PiecewiseFlatHazardRate(int settlementDays, Calendar calendar, DefaultProbabilityHelperVector instruments, DayCounter dayCounter, BackwardFlat i, IterativeBootstrap b) {
    this(QuantLibJNI.new_PiecewiseFlatHazardRate__SWIG_3(settlementDays, Calendar.getCPtr(calendar), calendar, DefaultProbabilityHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, BackwardFlat.getCPtr(i), i, IterativeBootstrap.getCPtr(b), b), true);
  }

  public PiecewiseFlatHazardRate(int settlementDays, Calendar calendar, DefaultProbabilityHelperVector instruments, DayCounter dayCounter, BackwardFlat i) {
    this(QuantLibJNI.new_PiecewiseFlatHazardRate__SWIG_4(settlementDays, Calendar.getCPtr(calendar), calendar, DefaultProbabilityHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, BackwardFlat.getCPtr(i), i), true);
  }

  public PiecewiseFlatHazardRate(int settlementDays, Calendar calendar, DefaultProbabilityHelperVector instruments, DayCounter dayCounter) {
    this(QuantLibJNI.new_PiecewiseFlatHazardRate__SWIG_5(settlementDays, Calendar.getCPtr(calendar), calendar, DefaultProbabilityHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public PiecewiseFlatHazardRate(Date referenceDate, DefaultProbabilityHelperVector instruments, DayCounter dayCounter, IterativeBootstrap b) {
    this(QuantLibJNI.new_PiecewiseFlatHazardRate__SWIG_6(Date.getCPtr(referenceDate), referenceDate, DefaultProbabilityHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, IterativeBootstrap.getCPtr(b), b), true);
  }

  public PiecewiseFlatHazardRate(int settlementDays, Calendar calendar, DefaultProbabilityHelperVector instruments, DayCounter dayCounter, IterativeBootstrap b) {
    this(QuantLibJNI.new_PiecewiseFlatHazardRate__SWIG_7(settlementDays, Calendar.getCPtr(calendar), calendar, DefaultProbabilityHelperVector.getCPtr(instruments), instruments, DayCounter.getCPtr(dayCounter), dayCounter, IterativeBootstrap.getCPtr(b), b), true);
  }

  public DateVector dates() {
    return new DateVector(QuantLibJNI.PiecewiseFlatHazardRate_dates(swigCPtr, this), false);
  }

  public DoubleVector times() {
    return new DoubleVector(QuantLibJNI.PiecewiseFlatHazardRate_times(swigCPtr, this), false);
  }

  public NodeVector nodes() {
    return new NodeVector(QuantLibJNI.PiecewiseFlatHazardRate_nodes(swigCPtr, this), true);
  }

}
