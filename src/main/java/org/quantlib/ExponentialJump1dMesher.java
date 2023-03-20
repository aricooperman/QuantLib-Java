/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ExponentialJump1dMesher extends Fdm1dMesher {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ExponentialJump1dMesher(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ExponentialJump1dMesher_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ExponentialJump1dMesher obj) {
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
        QuantLibJNI.delete_ExponentialJump1dMesher(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ExponentialJump1dMesher(long steps, double beta, double jumpIntensity, double eta, double eps) {
    this(QuantLibJNI.new_ExponentialJump1dMesher__SWIG_0(steps, beta, jumpIntensity, eta, eps), true);
  }

  public ExponentialJump1dMesher(long steps, double beta, double jumpIntensity, double eta) {
    this(QuantLibJNI.new_ExponentialJump1dMesher__SWIG_1(steps, beta, jumpIntensity, eta), true);
  }

}
