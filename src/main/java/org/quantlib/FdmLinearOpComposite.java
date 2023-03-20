/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmLinearOpComposite extends FdmLinearOp {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdmLinearOpComposite(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdmLinearOpComposite_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmLinearOpComposite obj) {
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
        QuantLibJNI.delete_FdmLinearOpComposite(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public long size() {
    return QuantLibJNI.FdmLinearOpComposite_size(swigCPtr, this);
  }

  public void setTime(double t1, double t2) {
    QuantLibJNI.FdmLinearOpComposite_setTime(swigCPtr, this, t1, t2);
  }

  public Array apply_mixed(Array r) {
    return new Array(QuantLibJNI.FdmLinearOpComposite_apply_mixed(swigCPtr, this, Array.getCPtr(r), r), true);
  }

  public Array apply_direction(long direction, Array r) {
    return new Array(QuantLibJNI.FdmLinearOpComposite_apply_direction(swigCPtr, this, direction, Array.getCPtr(r), r), true);
  }

  public Array solve_splitting(long direction, Array r, double s) {
    return new Array(QuantLibJNI.FdmLinearOpComposite_solve_splitting(swigCPtr, this, direction, Array.getCPtr(r), r, s), true);
  }

  public Array preconditioner(Array r, double s) {
    return new Array(QuantLibJNI.FdmLinearOpComposite_preconditioner(swigCPtr, this, Array.getCPtr(r), r, s), true);
  }

  public SparseMatrix to_sparse_matrix() {
    long cPtr = QuantLibJNI.FdmLinearOpComposite_to_sparse_matrix(swigCPtr, this);
    return (cPtr == 0) ? null : new SparseMatrix(cPtr, true);
  }

}
