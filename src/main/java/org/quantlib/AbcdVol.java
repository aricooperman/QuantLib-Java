/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class AbcdVol extends MarketModel {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected AbcdVol(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.AbcdVol_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AbcdVol obj) {
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
        QuantLibJNI.delete_AbcdVol(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AbcdVol(double a, double b, double c, double d, DoubleVector ks, PiecewiseConstantCorrelation corr, EvolutionDescription evolution, long numberOfFactors, DoubleVector initialRates, DoubleVector displacements) {
    this(QuantLibJNI.new_AbcdVol(a, b, c, d, DoubleVector.getCPtr(ks), ks, PiecewiseConstantCorrelation.getCPtr(corr), corr, EvolutionDescription.getCPtr(evolution), evolution, numberOfFactors, DoubleVector.getCPtr(initialRates), initialRates, DoubleVector.getCPtr(displacements), displacements), true);
  }

}
