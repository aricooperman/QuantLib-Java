/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class RelinkableShortRateModelHandle extends ShortRateModelHandle {
  private transient long swigCPtr;

  protected RelinkableShortRateModelHandle(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.RelinkableShortRateModelHandle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RelinkableShortRateModelHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_RelinkableShortRateModelHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RelinkableShortRateModelHandle(ShortRateModel arg0) {
    this(QuantLibJNI.new_RelinkableShortRateModelHandle__SWIG_0(ShortRateModel.getCPtr(arg0), arg0), true);
  }

  public RelinkableShortRateModelHandle() {
    this(QuantLibJNI.new_RelinkableShortRateModelHandle__SWIG_1(), true);
  }

  public void linkTo(ShortRateModel arg0) {
    QuantLibJNI.RelinkableShortRateModelHandle_linkTo(swigCPtr, this, ShortRateModel.getCPtr(arg0), arg0);
  }

  public void reset() {
    QuantLibJNI.RelinkableShortRateModelHandle_reset(swigCPtr, this);
  }

}
