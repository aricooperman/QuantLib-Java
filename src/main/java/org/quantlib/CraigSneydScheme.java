/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CraigSneydScheme {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected CraigSneydScheme(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CraigSneydScheme obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CraigSneydScheme(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CraigSneydScheme(double theta, double mu, FdmLinearOpComposite map, FdmBoundaryConditionSet bcSet) {
    this(QuantLibJNI.new_CraigSneydScheme__SWIG_0(theta, mu, FdmLinearOpComposite.getCPtr(map), map, FdmBoundaryConditionSet.getCPtr(bcSet), bcSet), true);
  }

  public CraigSneydScheme(double theta, double mu, FdmLinearOpComposite map) {
    this(QuantLibJNI.new_CraigSneydScheme__SWIG_1(theta, mu, FdmLinearOpComposite.getCPtr(map), map), true);
  }

  public void step(Array a, double t) {
    QuantLibJNI.CraigSneydScheme_step(swigCPtr, this, Array.getCPtr(a), a, t);
  }

  public void setStep(double dt) {
    QuantLibJNI.CraigSneydScheme_setStep(swigCPtr, this, dt);
  }

}
