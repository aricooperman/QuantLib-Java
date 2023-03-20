/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GJRGARCHModel extends CalibratedModel {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected GJRGARCHModel(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.GJRGARCHModel_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GJRGARCHModel obj) {
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
        QuantLibJNI.delete_GJRGARCHModel(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GJRGARCHModel(GJRGARCHProcess process) {
    this(QuantLibJNI.new_GJRGARCHModel(GJRGARCHProcess.getCPtr(process), process), true);
  }

  public double omega() {
    return QuantLibJNI.GJRGARCHModel_omega(swigCPtr, this);
  }

  public double alpha() {
    return QuantLibJNI.GJRGARCHModel_alpha(swigCPtr, this);
  }

  public double beta() {
    return QuantLibJNI.GJRGARCHModel_beta(swigCPtr, this);
  }

  public double gamma() {
    return QuantLibJNI.GJRGARCHModel_gamma(swigCPtr, this);
  }

  public double lambda() {
    return QuantLibJNI.GJRGARCHModel_lambda(swigCPtr, this);
  }

  public double v0() {
    return QuantLibJNI.GJRGARCHModel_v0(swigCPtr, this);
  }

}