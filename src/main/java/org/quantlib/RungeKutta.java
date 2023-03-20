/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class RungeKutta {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RungeKutta(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RungeKutta obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_RungeKutta(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RungeKutta(double eps, double h1, double hmin) {
    this(QuantLibJNI.new_RungeKutta__SWIG_0(eps, h1, hmin), true);
  }

  public RungeKutta(double eps, double h1) {
    this(QuantLibJNI.new_RungeKutta__SWIG_1(eps, h1), true);
  }

  public RungeKutta(double eps) {
    this(QuantLibJNI.new_RungeKutta__SWIG_2(eps), true);
  }

  public RungeKutta() {
    this(QuantLibJNI.new_RungeKutta__SWIG_3(), true);
  }

  public double getValue(BinaryFunctionDelegate fct, double y1, double x1, double x2) {
    return QuantLibJNI.RungeKutta_getValue__SWIG_0(swigCPtr, this, BinaryFunctionDelegate.getCPtr(fct), fct, y1, x1, x2);
  }

  public DoubleVector getValue(OdeFctDelegate fct, DoubleVector y1, double x1, double x2) {
    return new DoubleVector(QuantLibJNI.RungeKutta_getValue__SWIG_1(swigCPtr, this, OdeFctDelegate.getCPtr(fct), fct, DoubleVector.getCPtr(y1), y1, x1, x2), true);
  }

}
