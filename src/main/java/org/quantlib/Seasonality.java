/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Seasonality {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected Seasonality(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Seasonality obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Seasonality(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public double correctZeroRate(Date d, double r, InflationTermStructure iTS) {
    return QuantLibJNI.Seasonality_correctZeroRate(swigCPtr, this, Date.getCPtr(d), d, r, InflationTermStructure.getCPtr(iTS), iTS);
  }

  public double correctYoYRate(Date d, double r, InflationTermStructure iTS) {
    return QuantLibJNI.Seasonality_correctYoYRate(swigCPtr, this, Date.getCPtr(d), d, r, InflationTermStructure.getCPtr(iTS), iTS);
  }

  public boolean isConsistent(InflationTermStructure iTS) {
    return QuantLibJNI.Seasonality_isConsistent(swigCPtr, this, InflationTermStructure.getCPtr(iTS), iTS);
  }

}
