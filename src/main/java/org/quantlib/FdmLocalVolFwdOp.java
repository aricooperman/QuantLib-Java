/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmLocalVolFwdOp extends FdmLinearOpComposite {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdmLocalVolFwdOp(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdmLocalVolFwdOp_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmLocalVolFwdOp obj) {
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
        QuantLibJNI.delete_FdmLocalVolFwdOp(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdmLocalVolFwdOp(FdmMesher mesher, Quote spot, YieldTermStructure rTS, YieldTermStructure qTS, LocalVolTermStructure localVol, long direction) {
    this(QuantLibJNI.new_FdmLocalVolFwdOp__SWIG_0(FdmMesher.getCPtr(mesher), mesher, Quote.getCPtr(spot), spot, YieldTermStructure.getCPtr(rTS), rTS, YieldTermStructure.getCPtr(qTS), qTS, LocalVolTermStructure.getCPtr(localVol), localVol, direction), true);
  }

  public FdmLocalVolFwdOp(FdmMesher mesher, Quote spot, YieldTermStructure rTS, YieldTermStructure qTS, LocalVolTermStructure localVol) {
    this(QuantLibJNI.new_FdmLocalVolFwdOp__SWIG_1(FdmMesher.getCPtr(mesher), mesher, Quote.getCPtr(spot), spot, YieldTermStructure.getCPtr(rTS), rTS, YieldTermStructure.getCPtr(qTS), qTS, LocalVolTermStructure.getCPtr(localVol), localVol), true);
  }

}
