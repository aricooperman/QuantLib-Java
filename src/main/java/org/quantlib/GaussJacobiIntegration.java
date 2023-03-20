/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussJacobiIntegration extends GaussianQuadrature {
  private transient long swigCPtr;

  protected GaussJacobiIntegration(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.GaussJacobiIntegration_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussJacobiIntegration obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GaussJacobiIntegration(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GaussJacobiIntegration(long n, double alpha, double beta) {
    this(QuantLibJNI.new_GaussJacobiIntegration(n, alpha, beta), true);
  }

}