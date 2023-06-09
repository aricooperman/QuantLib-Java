/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ZeroCurve extends YieldTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ZeroCurve(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ZeroCurve_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZeroCurve obj) {
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
        QuantLibJNI.delete_ZeroCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter, Calendar calendar, Linear i, Compounding compounding, Frequency frequency) {
    this(QuantLibJNI.new_ZeroCurve__SWIG_0(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, Linear.getCPtr(i), i, compounding.swigValue(), frequency.swigValue()), true);
  }

  public ZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter, Calendar calendar, Linear i, Compounding compounding) {
    this(QuantLibJNI.new_ZeroCurve__SWIG_1(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, Linear.getCPtr(i), i, compounding.swigValue()), true);
  }

  public ZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter, Calendar calendar, Linear i) {
    this(QuantLibJNI.new_ZeroCurve__SWIG_2(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, Linear.getCPtr(i), i), true);
  }

  public ZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter, Calendar calendar) {
    this(QuantLibJNI.new_ZeroCurve__SWIG_3(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar), true);
  }

  public ZeroCurve(DateVector dates, DoubleVector yields, DayCounter dayCounter) {
    this(QuantLibJNI.new_ZeroCurve__SWIG_4(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(yields), yields, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public DoubleVector times() {
    return new DoubleVector(QuantLibJNI.ZeroCurve_times(swigCPtr, this), false);
  }

  public DoubleVector data() {
    return new DoubleVector(QuantLibJNI.ZeroCurve_data(swigCPtr, this), false);
  }

  public DateVector dates() {
    return new DateVector(QuantLibJNI.ZeroCurve_dates(swigCPtr, this), false);
  }

  public DoubleVector zeroRates() {
    return new DoubleVector(QuantLibJNI.ZeroCurve_zeroRates(swigCPtr, this), false);
  }

  public NodeVector nodes() {
    return new NodeVector(QuantLibJNI.ZeroCurve_nodes(swigCPtr, this), true);
  }

}
