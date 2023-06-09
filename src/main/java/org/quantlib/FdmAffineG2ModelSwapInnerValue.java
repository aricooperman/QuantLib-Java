/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmAffineG2ModelSwapInnerValue extends FdmInnerValueCalculator {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdmAffineG2ModelSwapInnerValue(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdmAffineG2ModelSwapInnerValue_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmAffineG2ModelSwapInnerValue obj) {
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
        QuantLibJNI.delete_FdmAffineG2ModelSwapInnerValue(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdmAffineG2ModelSwapInnerValue(G2 disModel, G2 fwdModel, VanillaSwap swap, DoubleVector exerciseTimes, DateVector exerciseDates, FdmMesher mesher, long direction) {
    this(QuantLibJNI.new_FdmAffineG2ModelSwapInnerValue(G2.getCPtr(disModel), disModel, G2.getCPtr(fwdModel), fwdModel, VanillaSwap.getCPtr(swap), swap, DoubleVector.getCPtr(exerciseTimes), exerciseTimes, DateVector.getCPtr(exerciseDates), exerciseDates, FdmMesher.getCPtr(mesher), mesher, direction), true);
  }

}
