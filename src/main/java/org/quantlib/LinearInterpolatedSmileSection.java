/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class LinearInterpolatedSmileSection extends SmileSection {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected LinearInterpolatedSmileSection(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.LinearInterpolatedSmileSection_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LinearInterpolatedSmileSection obj) {
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
        QuantLibJNI.delete_LinearInterpolatedSmileSection(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public LinearInterpolatedSmileSection(double expiryTime, DoubleVector strikes, QuoteHandleVector stdDevHandles, QuoteHandle atmLevel, Linear interpolator, DayCounter dc, VolatilityType type, double shift) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_0(expiryTime, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVector.getCPtr(stdDevHandles), stdDevHandles, QuoteHandle.getCPtr(atmLevel), atmLevel, Linear.getCPtr(interpolator), interpolator, DayCounter.getCPtr(dc), dc, type.swigValue(), shift), true);
  }

  public LinearInterpolatedSmileSection(double expiryTime, DoubleVector strikes, QuoteHandleVector stdDevHandles, QuoteHandle atmLevel, Linear interpolator, DayCounter dc, VolatilityType type) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_1(expiryTime, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVector.getCPtr(stdDevHandles), stdDevHandles, QuoteHandle.getCPtr(atmLevel), atmLevel, Linear.getCPtr(interpolator), interpolator, DayCounter.getCPtr(dc), dc, type.swigValue()), true);
  }

  public LinearInterpolatedSmileSection(double expiryTime, DoubleVector strikes, QuoteHandleVector stdDevHandles, QuoteHandle atmLevel, Linear interpolator, DayCounter dc) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_2(expiryTime, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVector.getCPtr(stdDevHandles), stdDevHandles, QuoteHandle.getCPtr(atmLevel), atmLevel, Linear.getCPtr(interpolator), interpolator, DayCounter.getCPtr(dc), dc), true);
  }

  public LinearInterpolatedSmileSection(double expiryTime, DoubleVector strikes, QuoteHandleVector stdDevHandles, QuoteHandle atmLevel, Linear interpolator) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_3(expiryTime, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVector.getCPtr(stdDevHandles), stdDevHandles, QuoteHandle.getCPtr(atmLevel), atmLevel, Linear.getCPtr(interpolator), interpolator), true);
  }

  public LinearInterpolatedSmileSection(double expiryTime, DoubleVector strikes, QuoteHandleVector stdDevHandles, QuoteHandle atmLevel) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_4(expiryTime, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVector.getCPtr(stdDevHandles), stdDevHandles, QuoteHandle.getCPtr(atmLevel), atmLevel), true);
  }

  public LinearInterpolatedSmileSection(double expiryTime, DoubleVector strikes, DoubleVector stdDevs, double atmLevel, Linear interpolator, DayCounter dc, VolatilityType type, double shift) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_5(expiryTime, DoubleVector.getCPtr(strikes), strikes, DoubleVector.getCPtr(stdDevs), stdDevs, atmLevel, Linear.getCPtr(interpolator), interpolator, DayCounter.getCPtr(dc), dc, type.swigValue(), shift), true);
  }

  public LinearInterpolatedSmileSection(double expiryTime, DoubleVector strikes, DoubleVector stdDevs, double atmLevel, Linear interpolator, DayCounter dc, VolatilityType type) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_6(expiryTime, DoubleVector.getCPtr(strikes), strikes, DoubleVector.getCPtr(stdDevs), stdDevs, atmLevel, Linear.getCPtr(interpolator), interpolator, DayCounter.getCPtr(dc), dc, type.swigValue()), true);
  }

  public LinearInterpolatedSmileSection(double expiryTime, DoubleVector strikes, DoubleVector stdDevs, double atmLevel, Linear interpolator, DayCounter dc) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_7(expiryTime, DoubleVector.getCPtr(strikes), strikes, DoubleVector.getCPtr(stdDevs), stdDevs, atmLevel, Linear.getCPtr(interpolator), interpolator, DayCounter.getCPtr(dc), dc), true);
  }

  public LinearInterpolatedSmileSection(double expiryTime, DoubleVector strikes, DoubleVector stdDevs, double atmLevel, Linear interpolator) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_8(expiryTime, DoubleVector.getCPtr(strikes), strikes, DoubleVector.getCPtr(stdDevs), stdDevs, atmLevel, Linear.getCPtr(interpolator), interpolator), true);
  }

  public LinearInterpolatedSmileSection(double expiryTime, DoubleVector strikes, DoubleVector stdDevs, double atmLevel) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_9(expiryTime, DoubleVector.getCPtr(strikes), strikes, DoubleVector.getCPtr(stdDevs), stdDevs, atmLevel), true);
  }

  public LinearInterpolatedSmileSection(Date d, DoubleVector strikes, QuoteHandleVector stdDevHandles, QuoteHandle atmLevel, DayCounter dc, Linear interpolator, Date referenceDate, VolatilityType type, double shift) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_10(Date.getCPtr(d), d, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVector.getCPtr(stdDevHandles), stdDevHandles, QuoteHandle.getCPtr(atmLevel), atmLevel, DayCounter.getCPtr(dc), dc, Linear.getCPtr(interpolator), interpolator, Date.getCPtr(referenceDate), referenceDate, type.swigValue(), shift), true);
  }

  public LinearInterpolatedSmileSection(Date d, DoubleVector strikes, QuoteHandleVector stdDevHandles, QuoteHandle atmLevel, DayCounter dc, Linear interpolator, Date referenceDate, VolatilityType type) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_11(Date.getCPtr(d), d, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVector.getCPtr(stdDevHandles), stdDevHandles, QuoteHandle.getCPtr(atmLevel), atmLevel, DayCounter.getCPtr(dc), dc, Linear.getCPtr(interpolator), interpolator, Date.getCPtr(referenceDate), referenceDate, type.swigValue()), true);
  }

  public LinearInterpolatedSmileSection(Date d, DoubleVector strikes, QuoteHandleVector stdDevHandles, QuoteHandle atmLevel, DayCounter dc, Linear interpolator, Date referenceDate) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_12(Date.getCPtr(d), d, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVector.getCPtr(stdDevHandles), stdDevHandles, QuoteHandle.getCPtr(atmLevel), atmLevel, DayCounter.getCPtr(dc), dc, Linear.getCPtr(interpolator), interpolator, Date.getCPtr(referenceDate), referenceDate), true);
  }

  public LinearInterpolatedSmileSection(Date d, DoubleVector strikes, QuoteHandleVector stdDevHandles, QuoteHandle atmLevel, DayCounter dc, Linear interpolator) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_13(Date.getCPtr(d), d, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVector.getCPtr(stdDevHandles), stdDevHandles, QuoteHandle.getCPtr(atmLevel), atmLevel, DayCounter.getCPtr(dc), dc, Linear.getCPtr(interpolator), interpolator), true);
  }

  public LinearInterpolatedSmileSection(Date d, DoubleVector strikes, QuoteHandleVector stdDevHandles, QuoteHandle atmLevel, DayCounter dc) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_14(Date.getCPtr(d), d, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVector.getCPtr(stdDevHandles), stdDevHandles, QuoteHandle.getCPtr(atmLevel), atmLevel, DayCounter.getCPtr(dc), dc), true);
  }

  public LinearInterpolatedSmileSection(Date d, DoubleVector strikes, QuoteHandleVector stdDevHandles, QuoteHandle atmLevel) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_15(Date.getCPtr(d), d, DoubleVector.getCPtr(strikes), strikes, QuoteHandleVector.getCPtr(stdDevHandles), stdDevHandles, QuoteHandle.getCPtr(atmLevel), atmLevel), true);
  }

  public LinearInterpolatedSmileSection(Date d, DoubleVector strikes, DoubleVector stdDevs, double atmLevel, DayCounter dc, Linear interpolator, Date referenceDate, VolatilityType type, double shift) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_16(Date.getCPtr(d), d, DoubleVector.getCPtr(strikes), strikes, DoubleVector.getCPtr(stdDevs), stdDevs, atmLevel, DayCounter.getCPtr(dc), dc, Linear.getCPtr(interpolator), interpolator, Date.getCPtr(referenceDate), referenceDate, type.swigValue(), shift), true);
  }

  public LinearInterpolatedSmileSection(Date d, DoubleVector strikes, DoubleVector stdDevs, double atmLevel, DayCounter dc, Linear interpolator, Date referenceDate, VolatilityType type) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_17(Date.getCPtr(d), d, DoubleVector.getCPtr(strikes), strikes, DoubleVector.getCPtr(stdDevs), stdDevs, atmLevel, DayCounter.getCPtr(dc), dc, Linear.getCPtr(interpolator), interpolator, Date.getCPtr(referenceDate), referenceDate, type.swigValue()), true);
  }

  public LinearInterpolatedSmileSection(Date d, DoubleVector strikes, DoubleVector stdDevs, double atmLevel, DayCounter dc, Linear interpolator, Date referenceDate) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_18(Date.getCPtr(d), d, DoubleVector.getCPtr(strikes), strikes, DoubleVector.getCPtr(stdDevs), stdDevs, atmLevel, DayCounter.getCPtr(dc), dc, Linear.getCPtr(interpolator), interpolator, Date.getCPtr(referenceDate), referenceDate), true);
  }

  public LinearInterpolatedSmileSection(Date d, DoubleVector strikes, DoubleVector stdDevs, double atmLevel, DayCounter dc, Linear interpolator) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_19(Date.getCPtr(d), d, DoubleVector.getCPtr(strikes), strikes, DoubleVector.getCPtr(stdDevs), stdDevs, atmLevel, DayCounter.getCPtr(dc), dc, Linear.getCPtr(interpolator), interpolator), true);
  }

  public LinearInterpolatedSmileSection(Date d, DoubleVector strikes, DoubleVector stdDevs, double atmLevel, DayCounter dc) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_20(Date.getCPtr(d), d, DoubleVector.getCPtr(strikes), strikes, DoubleVector.getCPtr(stdDevs), stdDevs, atmLevel, DayCounter.getCPtr(dc), dc), true);
  }

  public LinearInterpolatedSmileSection(Date d, DoubleVector strikes, DoubleVector stdDevs, double atmLevel) {
    this(QuantLibJNI.new_LinearInterpolatedSmileSection__SWIG_21(Date.getCPtr(d), d, DoubleVector.getCPtr(strikes), strikes, DoubleVector.getCPtr(stdDevs), stdDevs, atmLevel), true);
  }

}
