/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class DiscreteAveragingAsianOption extends OneAssetOption {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected DiscreteAveragingAsianOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.DiscreteAveragingAsianOption_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DiscreteAveragingAsianOption obj) {
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
        QuantLibJNI.delete_DiscreteAveragingAsianOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DiscreteAveragingAsianOption(Average.Type averageType, double runningAccumulator, long pastFixings, DateVector fixingDates, StrikedTypePayoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_DiscreteAveragingAsianOption__SWIG_0(averageType.swigValue(), runningAccumulator, pastFixings, DateVector.getCPtr(fixingDates), fixingDates, StrikedTypePayoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

  public DiscreteAveragingAsianOption(Average.Type averageType, DateVector fixingDates, StrikedTypePayoff payoff, Exercise exercise, DoubleVector allPastFixings) {
    this(QuantLibJNI.new_DiscreteAveragingAsianOption__SWIG_1(averageType.swigValue(), DateVector.getCPtr(fixingDates), fixingDates, StrikedTypePayoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise, DoubleVector.getCPtr(allPastFixings), allPastFixings), true);
  }

  public DiscreteAveragingAsianOption(Average.Type averageType, DateVector fixingDates, StrikedTypePayoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_DiscreteAveragingAsianOption__SWIG_2(averageType.swigValue(), DateVector.getCPtr(fixingDates), fixingDates, StrikedTypePayoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

  public TimeGrid timeGrid() {
    return new TimeGrid(QuantLibJNI.DiscreteAveragingAsianOption_timeGrid(swigCPtr, this), true);
  }

}
