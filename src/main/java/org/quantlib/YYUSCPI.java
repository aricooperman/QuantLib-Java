/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YYUSCPI extends YoYInflationIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected YYUSCPI(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YYUSCPI_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YYUSCPI obj) {
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
        QuantLibJNI.delete_YYUSCPI(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public YYUSCPI(boolean interpolated, YoYInflationTermStructureHandle h) {
    this(QuantLibJNI.new_YYUSCPI__SWIG_0(interpolated, YoYInflationTermStructureHandle.getCPtr(h), h), true);
  }

  public YYUSCPI(boolean interpolated) {
    this(QuantLibJNI.new_YYUSCPI__SWIG_1(interpolated), true);
  }

}
