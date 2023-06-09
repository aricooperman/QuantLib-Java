/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GarmanKlassSigma3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GarmanKlassSigma3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GarmanKlassSigma3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GarmanKlassSigma3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GarmanKlassSigma3(double yearFraction, double marketOpenFraction) {
    this(QuantLibJNI.new_GarmanKlassSigma3(yearFraction, marketOpenFraction), true);
  }

  public RealTimeSeries calculate(IntervalPriceTimeSeries arg0) {
    return new RealTimeSeries(QuantLibJNI.GarmanKlassSigma3_calculate(swigCPtr, this, IntervalPriceTimeSeries.getCPtr(arg0), arg0), true);
  }

}
