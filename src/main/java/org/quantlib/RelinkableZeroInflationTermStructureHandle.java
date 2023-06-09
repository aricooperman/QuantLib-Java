/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class RelinkableZeroInflationTermStructureHandle extends ZeroInflationTermStructureHandle {
  private transient long swigCPtr;

  protected RelinkableZeroInflationTermStructureHandle(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.RelinkableZeroInflationTermStructureHandle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RelinkableZeroInflationTermStructureHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_RelinkableZeroInflationTermStructureHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RelinkableZeroInflationTermStructureHandle(ZeroInflationTermStructure arg0) {
    this(QuantLibJNI.new_RelinkableZeroInflationTermStructureHandle__SWIG_0(ZeroInflationTermStructure.getCPtr(arg0), arg0), true);
  }

  public RelinkableZeroInflationTermStructureHandle() {
    this(QuantLibJNI.new_RelinkableZeroInflationTermStructureHandle__SWIG_1(), true);
  }

  public void linkTo(ZeroInflationTermStructure arg0) {
    QuantLibJNI.RelinkableZeroInflationTermStructureHandle_linkTo(swigCPtr, this, ZeroInflationTermStructure.getCPtr(arg0), arg0);
  }

  public void reset() {
    QuantLibJNI.RelinkableZeroInflationTermStructureHandle_reset(swigCPtr, this);
  }

}
