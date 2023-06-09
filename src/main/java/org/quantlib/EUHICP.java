/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class EUHICP extends ZeroInflationIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected EUHICP(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.EUHICP_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EUHICP obj) {
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
        QuantLibJNI.delete_EUHICP(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EUHICP(ZeroInflationTermStructureHandle h) {
    this(QuantLibJNI.new_EUHICP__SWIG_0(ZeroInflationTermStructureHandle.getCPtr(h), h), true);
  }

  public EUHICP() {
    this(QuantLibJNI.new_EUHICP__SWIG_1(), true);
  }

  public EUHICP(boolean interpolated, ZeroInflationTermStructureHandle h) {
    this(QuantLibJNI.new_EUHICP__SWIG_2(interpolated, ZeroInflationTermStructureHandle.getCPtr(h), h), true);
  }

  public EUHICP(boolean interpolated) {
    this(QuantLibJNI.new_EUHICP__SWIG_3(interpolated), true);
  }

}
