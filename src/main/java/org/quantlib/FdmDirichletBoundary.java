/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmDirichletBoundary extends FdmBoundaryCondition {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdmDirichletBoundary(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdmDirichletBoundary_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmDirichletBoundary obj) {
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
        QuantLibJNI.delete_FdmDirichletBoundary(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdmDirichletBoundary(FdmMesher mesher, double valueOnBoundary, long direction, FdmBoundaryCondition.Side side) {
    this(QuantLibJNI.new_FdmDirichletBoundary(FdmMesher.getCPtr(mesher), mesher, valueOnBoundary, direction, side.swigValue()), true);
  }

  public void applyAfterApplying(Array arg0) {
    QuantLibJNI.FdmDirichletBoundary_applyAfterApplying__SWIG_0(swigCPtr, this, Array.getCPtr(arg0), arg0);
  }

  public double applyAfterApplying(double x, double value) {
    return QuantLibJNI.FdmDirichletBoundary_applyAfterApplying__SWIG_1(swigCPtr, this, x, value);
  }

}
