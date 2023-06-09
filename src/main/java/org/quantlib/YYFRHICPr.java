/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YYFRHICPr extends YoYInflationIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected YYFRHICPr(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YYFRHICPr_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YYFRHICPr obj) {
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
        QuantLibJNI.delete_YYFRHICPr(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public YYFRHICPr(boolean interpolated, YoYInflationTermStructureHandle h) {
    this(QuantLibJNI.new_YYFRHICPr__SWIG_0(interpolated, YoYInflationTermStructureHandle.getCPtr(h), h), true);
  }

  public YYFRHICPr(boolean interpolated) {
    this(QuantLibJNI.new_YYFRHICPr__SWIG_1(interpolated), true);
  }

}
