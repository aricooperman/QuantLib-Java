/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdSimpleExtOUJumpSwingEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdSimpleExtOUJumpSwingEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdSimpleExtOUJumpSwingEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdSimpleExtOUJumpSwingEngine obj) {
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
        QuantLibJNI.delete_FdSimpleExtOUJumpSwingEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdSimpleExtOUJumpSwingEngine(ExtOUWithJumpsProcess process, YieldTermStructure rTS, long tGrid, long xGrid, long yGrid, DoublePairVector shape, FdmSchemeDesc schemeDesc) {
    this(QuantLibJNI.new_FdSimpleExtOUJumpSwingEngine__SWIG_0(ExtOUWithJumpsProcess.getCPtr(process), process, YieldTermStructure.getCPtr(rTS), rTS, tGrid, xGrid, yGrid, DoublePairVector.getCPtr(shape), shape, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc), true);
  }

  public FdSimpleExtOUJumpSwingEngine(ExtOUWithJumpsProcess process, YieldTermStructure rTS, long tGrid, long xGrid, long yGrid, DoublePairVector shape) {
    this(QuantLibJNI.new_FdSimpleExtOUJumpSwingEngine__SWIG_1(ExtOUWithJumpsProcess.getCPtr(process), process, YieldTermStructure.getCPtr(rTS), rTS, tGrid, xGrid, yGrid, DoublePairVector.getCPtr(shape), shape), true);
  }

  public FdSimpleExtOUJumpSwingEngine(ExtOUWithJumpsProcess process, YieldTermStructure rTS, long tGrid, long xGrid, long yGrid) {
    this(QuantLibJNI.new_FdSimpleExtOUJumpSwingEngine__SWIG_2(ExtOUWithJumpsProcess.getCPtr(process), process, YieldTermStructure.getCPtr(rTS), rTS, tGrid, xGrid, yGrid), true);
  }

  public FdSimpleExtOUJumpSwingEngine(ExtOUWithJumpsProcess process, YieldTermStructure rTS, long tGrid, long xGrid) {
    this(QuantLibJNI.new_FdSimpleExtOUJumpSwingEngine__SWIG_3(ExtOUWithJumpsProcess.getCPtr(process), process, YieldTermStructure.getCPtr(rTS), rTS, tGrid, xGrid), true);
  }

  public FdSimpleExtOUJumpSwingEngine(ExtOUWithJumpsProcess process, YieldTermStructure rTS, long tGrid) {
    this(QuantLibJNI.new_FdSimpleExtOUJumpSwingEngine__SWIG_4(ExtOUWithJumpsProcess.getCPtr(process), process, YieldTermStructure.getCPtr(rTS), rTS, tGrid), true);
  }

  public FdSimpleExtOUJumpSwingEngine(ExtOUWithJumpsProcess process, YieldTermStructure rTS) {
    this(QuantLibJNI.new_FdSimpleExtOUJumpSwingEngine__SWIG_5(ExtOUWithJumpsProcess.getCPtr(process), process, YieldTermStructure.getCPtr(rTS), rTS), true);
  }

}
