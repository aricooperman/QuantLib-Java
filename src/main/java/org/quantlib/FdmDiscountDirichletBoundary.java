/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmDiscountDirichletBoundary extends FdmBoundaryCondition {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdmDiscountDirichletBoundary(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdmDiscountDirichletBoundary_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmDiscountDirichletBoundary obj) {
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
        QuantLibJNI.delete_FdmDiscountDirichletBoundary(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdmDiscountDirichletBoundary(FdmMesher mesher, YieldTermStructure rTS, double maturityTime, double valueOnBoundary, long direction, FdmBoundaryCondition.Side side) {
    this(QuantLibJNI.new_FdmDiscountDirichletBoundary(FdmMesher.getCPtr(mesher), mesher, YieldTermStructure.getCPtr(rTS), rTS, maturityTime, valueOnBoundary, direction, side.swigValue()), true);
  }

}