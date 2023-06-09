/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmHestonVarianceMesher extends Fdm1dMesher {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdmHestonVarianceMesher(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdmHestonVarianceMesher_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmHestonVarianceMesher obj) {
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
        QuantLibJNI.delete_FdmHestonVarianceMesher(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdmHestonVarianceMesher(long size, HestonProcess process, double maturity, long tAvgSteps, double epsilon) {
    this(QuantLibJNI.new_FdmHestonVarianceMesher__SWIG_0(size, HestonProcess.getCPtr(process), process, maturity, tAvgSteps, epsilon), true);
  }

  public FdmHestonVarianceMesher(long size, HestonProcess process, double maturity, long tAvgSteps) {
    this(QuantLibJNI.new_FdmHestonVarianceMesher__SWIG_1(size, HestonProcess.getCPtr(process), process, maturity, tAvgSteps), true);
  }

  public FdmHestonVarianceMesher(long size, HestonProcess process, double maturity) {
    this(QuantLibJNI.new_FdmHestonVarianceMesher__SWIG_2(size, HestonProcess.getCPtr(process), process, maturity), true);
  }

  public double volaEstimate() {
    return QuantLibJNI.FdmHestonVarianceMesher_volaEstimate(swigCPtr, this);
  }

}
