/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmZabrOp extends FdmLinearOpComposite {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdmZabrOp(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdmZabrOp_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmZabrOp obj) {
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
        QuantLibJNI.delete_FdmZabrOp(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdmZabrOp(FdmMesher mesher, double beta, double nu, double rho, double gamma) {
    this(QuantLibJNI.new_FdmZabrOp(FdmMesher.getCPtr(mesher), mesher, beta, nu, rho, gamma), true);
  }

}