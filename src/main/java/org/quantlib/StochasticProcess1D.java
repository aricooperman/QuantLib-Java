/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class StochasticProcess1D extends StochasticProcess {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected StochasticProcess1D(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.StochasticProcess1D_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StochasticProcess1D obj) {
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
        QuantLibJNI.delete_StochasticProcess1D(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public double x0() {
    return QuantLibJNI.StochasticProcess1D_x0(swigCPtr, this);
  }

  public double drift(double t, double x) {
    return QuantLibJNI.StochasticProcess1D_drift(swigCPtr, this, t, x);
  }

  public double diffusion(double t, double x) {
    return QuantLibJNI.StochasticProcess1D_diffusion(swigCPtr, this, t, x);
  }

  public double expectation(double t0, double x0, double dt) {
    return QuantLibJNI.StochasticProcess1D_expectation(swigCPtr, this, t0, x0, dt);
  }

  public double stdDeviation(double t0, double x0, double dt) {
    return QuantLibJNI.StochasticProcess1D_stdDeviation(swigCPtr, this, t0, x0, dt);
  }

  public double variance(double t0, double x0, double dt) {
    return QuantLibJNI.StochasticProcess1D_variance(swigCPtr, this, t0, x0, dt);
  }

  public double evolve(double t0, double x0, double dt, double dw) {
    return QuantLibJNI.StochasticProcess1D_evolve(swigCPtr, this, t0, x0, dt, dw);
  }

  public double apply(double x0, double dx) {
    return QuantLibJNI.StochasticProcess1D_apply(swigCPtr, this, x0, dx);
  }

}
