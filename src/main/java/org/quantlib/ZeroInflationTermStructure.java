/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ZeroInflationTermStructure extends InflationTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ZeroInflationTermStructure(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ZeroInflationTermStructure_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZeroInflationTermStructure obj) {
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
        QuantLibJNI.delete_ZeroInflationTermStructure(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public double zeroRate(Date d, Period instObsLag, boolean forceLinearInterpolation, boolean extrapolate) {
    return QuantLibJNI.ZeroInflationTermStructure_zeroRate__SWIG_0(swigCPtr, this, Date.getCPtr(d), d, Period.getCPtr(instObsLag), instObsLag, forceLinearInterpolation, extrapolate);
  }

  public double zeroRate(Date d, Period instObsLag, boolean forceLinearInterpolation) {
    return QuantLibJNI.ZeroInflationTermStructure_zeroRate__SWIG_1(swigCPtr, this, Date.getCPtr(d), d, Period.getCPtr(instObsLag), instObsLag, forceLinearInterpolation);
  }

  public double zeroRate(Date d, Period instObsLag) {
    return QuantLibJNI.ZeroInflationTermStructure_zeroRate__SWIG_2(swigCPtr, this, Date.getCPtr(d), d, Period.getCPtr(instObsLag), instObsLag);
  }

  public double zeroRate(Date d) {
    return QuantLibJNI.ZeroInflationTermStructure_zeroRate__SWIG_3(swigCPtr, this, Date.getCPtr(d), d);
  }

  public double zeroRate(double t, boolean extrapolate) {
    return QuantLibJNI.ZeroInflationTermStructure_zeroRate__SWIG_4(swigCPtr, this, t, extrapolate);
  }

  public double zeroRate(double t) {
    return QuantLibJNI.ZeroInflationTermStructure_zeroRate__SWIG_5(swigCPtr, this, t);
  }

}
