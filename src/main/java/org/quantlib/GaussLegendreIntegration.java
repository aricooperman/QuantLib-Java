/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussLegendreIntegration extends GaussianQuadrature {
  private transient long swigCPtr;

  protected GaussLegendreIntegration(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.GaussLegendreIntegration_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussLegendreIntegration obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GaussLegendreIntegration(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GaussLegendreIntegration(long n) {
    this(QuantLibJNI.new_GaussLegendreIntegration(n), true);
  }

}
