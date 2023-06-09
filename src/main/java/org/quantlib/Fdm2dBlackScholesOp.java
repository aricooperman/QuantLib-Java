/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Fdm2dBlackScholesOp extends FdmLinearOpComposite {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Fdm2dBlackScholesOp(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Fdm2dBlackScholesOp_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Fdm2dBlackScholesOp obj) {
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
        QuantLibJNI.delete_Fdm2dBlackScholesOp(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Fdm2dBlackScholesOp(FdmMesher mesher, GeneralizedBlackScholesProcess p1, GeneralizedBlackScholesProcess p2, double correlation, double maturity, boolean localVol, double illegalLocalVolOverwrite) {
    this(QuantLibJNI.new_Fdm2dBlackScholesOp__SWIG_0(FdmMesher.getCPtr(mesher), mesher, GeneralizedBlackScholesProcess.getCPtr(p1), p1, GeneralizedBlackScholesProcess.getCPtr(p2), p2, correlation, maturity, localVol, illegalLocalVolOverwrite), true);
  }

  public Fdm2dBlackScholesOp(FdmMesher mesher, GeneralizedBlackScholesProcess p1, GeneralizedBlackScholesProcess p2, double correlation, double maturity, boolean localVol) {
    this(QuantLibJNI.new_Fdm2dBlackScholesOp__SWIG_1(FdmMesher.getCPtr(mesher), mesher, GeneralizedBlackScholesProcess.getCPtr(p1), p1, GeneralizedBlackScholesProcess.getCPtr(p2), p2, correlation, maturity, localVol), true);
  }

  public Fdm2dBlackScholesOp(FdmMesher mesher, GeneralizedBlackScholesProcess p1, GeneralizedBlackScholesProcess p2, double correlation, double maturity) {
    this(QuantLibJNI.new_Fdm2dBlackScholesOp__SWIG_2(FdmMesher.getCPtr(mesher), mesher, GeneralizedBlackScholesProcess.getCPtr(p1), p1, GeneralizedBlackScholesProcess.getCPtr(p2), p2, correlation, maturity), true);
  }

}
