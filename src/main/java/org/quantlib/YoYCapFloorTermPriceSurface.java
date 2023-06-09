/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YoYCapFloorTermPriceSurface extends InflationTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected YoYCapFloorTermPriceSurface(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YoYCapFloorTermPriceSurface_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YoYCapFloorTermPriceSurface obj) {
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
        QuantLibJNI.delete_YoYCapFloorTermPriceSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PairDoubleVector atmYoYSwapTimeRates() {
    return new PairDoubleVector(QuantLibJNI.YoYCapFloorTermPriceSurface_atmYoYSwapTimeRates(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__pairT_std__vectorT_Date_t_std__vectorT_double_t_t atmYoYSwapDateRates() {
    return new SWIGTYPE_p_std__pairT_std__vectorT_Date_t_std__vectorT_double_t_t(QuantLibJNI.YoYCapFloorTermPriceSurface_atmYoYSwapDateRates(swigCPtr, this), true);
  }

  public YoYInflationTermStructure YoYTS() {
    long cPtr = QuantLibJNI.YoYCapFloorTermPriceSurface_YoYTS(swigCPtr, this);
    return (cPtr == 0) ? null : new YoYInflationTermStructure(cPtr, true);
  }

  public YoYInflationIndex yoyIndex() {
    long cPtr = QuantLibJNI.YoYCapFloorTermPriceSurface_yoyIndex(swigCPtr, this);
    return (cPtr == 0) ? null : new YoYInflationIndex(cPtr, true);
  }

  public BusinessDayConvention businessDayConvention() {
    return BusinessDayConvention.swigToEnum(QuantLibJNI.YoYCapFloorTermPriceSurface_businessDayConvention(swigCPtr, this));
  }

  public long fixingDays() {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_fixingDays(swigCPtr, this);
  }

  public double price(Date d, double k) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_price__SWIG_0(swigCPtr, this, Date.getCPtr(d), d, k);
  }

  public double capPrice(Date d, double k) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_capPrice__SWIG_0(swigCPtr, this, Date.getCPtr(d), d, k);
  }

  public double floorPrice(Date d, double k) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_floorPrice__SWIG_0(swigCPtr, this, Date.getCPtr(d), d, k);
  }

  public double atmYoYSwapRate(Date d, boolean extrapolate) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_atmYoYSwapRate__SWIG_0(swigCPtr, this, Date.getCPtr(d), d, extrapolate);
  }

  public double atmYoYSwapRate(Date d) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_atmYoYSwapRate__SWIG_1(swigCPtr, this, Date.getCPtr(d), d);
  }

  public double atmYoYRate(Date d, Period obsLag, boolean extrapolate) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_atmYoYRate__SWIG_0(swigCPtr, this, Date.getCPtr(d), d, Period.getCPtr(obsLag), obsLag, extrapolate);
  }

  public double atmYoYRate(Date d, Period obsLag) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_atmYoYRate__SWIG_1(swigCPtr, this, Date.getCPtr(d), d, Period.getCPtr(obsLag), obsLag);
  }

  public double atmYoYRate(Date d) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_atmYoYRate__SWIG_2(swigCPtr, this, Date.getCPtr(d), d);
  }

  public double price(Period d, double k) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_price__SWIG_1(swigCPtr, this, Period.getCPtr(d), d, k);
  }

  public double capPrice(Period d, double k) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_capPrice__SWIG_1(swigCPtr, this, Period.getCPtr(d), d, k);
  }

  public double floorPrice(Period d, double k) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_floorPrice__SWIG_1(swigCPtr, this, Period.getCPtr(d), d, k);
  }

  public double atmYoYSwapRate(Period d, boolean extrapolate) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_atmYoYSwapRate__SWIG_2(swigCPtr, this, Period.getCPtr(d), d, extrapolate);
  }

  public double atmYoYSwapRate(Period d) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_atmYoYSwapRate__SWIG_3(swigCPtr, this, Period.getCPtr(d), d);
  }

  public double atmYoYRate(Period d, Period obsLag, boolean extrapolate) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_atmYoYRate__SWIG_3(swigCPtr, this, Period.getCPtr(d), d, Period.getCPtr(obsLag), obsLag, extrapolate);
  }

  public double atmYoYRate(Period d, Period obsLag) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_atmYoYRate__SWIG_4(swigCPtr, this, Period.getCPtr(d), d, Period.getCPtr(obsLag), obsLag);
  }

  public double atmYoYRate(Period d) {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_atmYoYRate__SWIG_5(swigCPtr, this, Period.getCPtr(d), d);
  }

  public DoubleVector strikes() {
    return new DoubleVector(QuantLibJNI.YoYCapFloorTermPriceSurface_strikes(swigCPtr, this), true);
  }

  public DoubleVector capStrikes() {
    return new DoubleVector(QuantLibJNI.YoYCapFloorTermPriceSurface_capStrikes(swigCPtr, this), true);
  }

  public DoubleVector floorStrikes() {
    return new DoubleVector(QuantLibJNI.YoYCapFloorTermPriceSurface_floorStrikes(swigCPtr, this), true);
  }

  public PeriodVector maturities() {
    return new PeriodVector(QuantLibJNI.YoYCapFloorTermPriceSurface_maturities(swigCPtr, this), true);
  }

  public double minStrike() {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_minStrike(swigCPtr, this);
  }

  public double maxStrike() {
    return QuantLibJNI.YoYCapFloorTermPriceSurface_maxStrike(swigCPtr, this);
  }

  public Date minMaturity() {
    return new Date(QuantLibJNI.YoYCapFloorTermPriceSurface_minMaturity(swigCPtr, this), true);
  }

  public Date maxMaturity() {
    return new Date(QuantLibJNI.YoYCapFloorTermPriceSurface_maxMaturity(swigCPtr, this), true);
  }

  public Date yoyOptionDateFromTenor(Period p) {
    return new Date(QuantLibJNI.YoYCapFloorTermPriceSurface_yoyOptionDateFromTenor(swigCPtr, this, Period.getCPtr(p), p), true);
  }

}
