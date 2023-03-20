/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ContinuousAveragingAsianOption extends OneAssetOption {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ContinuousAveragingAsianOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ContinuousAveragingAsianOption_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ContinuousAveragingAsianOption obj) {
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
        QuantLibJNI.delete_ContinuousAveragingAsianOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ContinuousAveragingAsianOption(Average.Type averageType, StrikedTypePayoff payoff, Exercise exercise) {
    this(QuantLibJNI.new_ContinuousAveragingAsianOption(averageType.swigValue(), StrikedTypePayoff.getCPtr(payoff), payoff, Exercise.getCPtr(exercise), exercise), true);
  }

}
