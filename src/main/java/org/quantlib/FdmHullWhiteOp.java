/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmHullWhiteOp extends FdmLinearOpComposite {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdmHullWhiteOp(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdmHullWhiteOp_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmHullWhiteOp obj) {
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
        QuantLibJNI.delete_FdmHullWhiteOp(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdmHullWhiteOp(FdmMesher mesher, HullWhite model, long direction) {
    this(QuantLibJNI.new_FdmHullWhiteOp(FdmMesher.getCPtr(mesher), mesher, HullWhite.getCPtr(model), model, direction), true);
  }

}
