/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BlackVarianceCurve extends BlackVolTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BlackVarianceCurve(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BlackVarianceCurve_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BlackVarianceCurve obj) {
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
        QuantLibJNI.delete_BlackVarianceCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BlackVarianceCurve(Date referenceDate, DateVector dates, DoubleVector volatilities, DayCounter dayCounter, boolean forceMonotoneVariance) {
    this(QuantLibJNI.new_BlackVarianceCurve__SWIG_0(Date.getCPtr(referenceDate), referenceDate, DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(volatilities), volatilities, DayCounter.getCPtr(dayCounter), dayCounter, forceMonotoneVariance), true);
  }

  public BlackVarianceCurve(Date referenceDate, DateVector dates, DoubleVector volatilities, DayCounter dayCounter) {
    this(QuantLibJNI.new_BlackVarianceCurve__SWIG_1(Date.getCPtr(referenceDate), referenceDate, DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(volatilities), volatilities, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

}
