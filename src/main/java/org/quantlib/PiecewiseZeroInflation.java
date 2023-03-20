/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class PiecewiseZeroInflation extends ZeroInflationTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected PiecewiseZeroInflation(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.PiecewiseZeroInflation_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PiecewiseZeroInflation obj) {
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
        QuantLibJNI.delete_PiecewiseZeroInflation(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PiecewiseZeroInflation(Date referenceDate, Calendar calendar, DayCounter dayCounter, Period lag, Frequency frequency, double baseRate, ZeroHelperVector instruments, double accuracy, Linear i) {
    this(QuantLibJNI.new_PiecewiseZeroInflation__SWIG_0(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(calendar), calendar, DayCounter.getCPtr(dayCounter), dayCounter, Period.getCPtr(lag), lag, frequency.swigValue(), baseRate, ZeroHelperVector.getCPtr(instruments), instruments, accuracy, Linear.getCPtr(i), i), true);
  }

  public PiecewiseZeroInflation(Date referenceDate, Calendar calendar, DayCounter dayCounter, Period lag, Frequency frequency, double baseRate, ZeroHelperVector instruments, double accuracy) {
    this(QuantLibJNI.new_PiecewiseZeroInflation__SWIG_1(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(calendar), calendar, DayCounter.getCPtr(dayCounter), dayCounter, Period.getCPtr(lag), lag, frequency.swigValue(), baseRate, ZeroHelperVector.getCPtr(instruments), instruments, accuracy), true);
  }

  public PiecewiseZeroInflation(Date referenceDate, Calendar calendar, DayCounter dayCounter, Period lag, Frequency frequency, double baseRate, ZeroHelperVector instruments) {
    this(QuantLibJNI.new_PiecewiseZeroInflation__SWIG_2(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(calendar), calendar, DayCounter.getCPtr(dayCounter), dayCounter, Period.getCPtr(lag), lag, frequency.swigValue(), baseRate, ZeroHelperVector.getCPtr(instruments), instruments), true);
  }

  public PiecewiseZeroInflation(Date referenceDate, Calendar calendar, DayCounter dayCounter, Period lag, Frequency frequency, boolean indexIsInterpolated, double baseRate, ZeroHelperVector instruments, double accuracy, Linear i) {
    this(QuantLibJNI.new_PiecewiseZeroInflation__SWIG_3(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(calendar), calendar, DayCounter.getCPtr(dayCounter), dayCounter, Period.getCPtr(lag), lag, frequency.swigValue(), indexIsInterpolated, baseRate, ZeroHelperVector.getCPtr(instruments), instruments, accuracy, Linear.getCPtr(i), i), true);
  }

  public PiecewiseZeroInflation(Date referenceDate, Calendar calendar, DayCounter dayCounter, Period lag, Frequency frequency, boolean indexIsInterpolated, double baseRate, ZeroHelperVector instruments, double accuracy) {
    this(QuantLibJNI.new_PiecewiseZeroInflation__SWIG_4(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(calendar), calendar, DayCounter.getCPtr(dayCounter), dayCounter, Period.getCPtr(lag), lag, frequency.swigValue(), indexIsInterpolated, baseRate, ZeroHelperVector.getCPtr(instruments), instruments, accuracy), true);
  }

  public PiecewiseZeroInflation(Date referenceDate, Calendar calendar, DayCounter dayCounter, Period lag, Frequency frequency, boolean indexIsInterpolated, double baseRate, ZeroHelperVector instruments) {
    this(QuantLibJNI.new_PiecewiseZeroInflation__SWIG_5(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(calendar), calendar, DayCounter.getCPtr(dayCounter), dayCounter, Period.getCPtr(lag), lag, frequency.swigValue(), indexIsInterpolated, baseRate, ZeroHelperVector.getCPtr(instruments), instruments), true);
  }

  public DateVector dates() {
    return new DateVector(QuantLibJNI.PiecewiseZeroInflation_dates(swigCPtr, this), false);
  }

  public DoubleVector times() {
    return new DoubleVector(QuantLibJNI.PiecewiseZeroInflation_times(swigCPtr, this), false);
  }

  public NodeVector nodes() {
    return new NodeVector(QuantLibJNI.PiecewiseZeroInflation_nodes(swigCPtr, this), true);
  }

}
