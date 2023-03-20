/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdOrnsteinUhlenbeckVanillaEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdOrnsteinUhlenbeckVanillaEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdOrnsteinUhlenbeckVanillaEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdOrnsteinUhlenbeckVanillaEngine obj) {
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
        QuantLibJNI.delete_FdOrnsteinUhlenbeckVanillaEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdOrnsteinUhlenbeckVanillaEngine(OrnsteinUhlenbeckProcess arg0, YieldTermStructure rTS, long tGrid, long xGrid, long dampingSteps, double epsilon, FdmSchemeDesc schemeDesc) {
    this(QuantLibJNI.new_FdOrnsteinUhlenbeckVanillaEngine__SWIG_0(OrnsteinUhlenbeckProcess.getCPtr(arg0), arg0, YieldTermStructure.getCPtr(rTS), rTS, tGrid, xGrid, dampingSteps, epsilon, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc), true);
  }

  public FdOrnsteinUhlenbeckVanillaEngine(OrnsteinUhlenbeckProcess arg0, YieldTermStructure rTS, long tGrid, long xGrid, long dampingSteps, double epsilon) {
    this(QuantLibJNI.new_FdOrnsteinUhlenbeckVanillaEngine__SWIG_1(OrnsteinUhlenbeckProcess.getCPtr(arg0), arg0, YieldTermStructure.getCPtr(rTS), rTS, tGrid, xGrid, dampingSteps, epsilon), true);
  }

  public FdOrnsteinUhlenbeckVanillaEngine(OrnsteinUhlenbeckProcess arg0, YieldTermStructure rTS, long tGrid, long xGrid, long dampingSteps) {
    this(QuantLibJNI.new_FdOrnsteinUhlenbeckVanillaEngine__SWIG_2(OrnsteinUhlenbeckProcess.getCPtr(arg0), arg0, YieldTermStructure.getCPtr(rTS), rTS, tGrid, xGrid, dampingSteps), true);
  }

  public FdOrnsteinUhlenbeckVanillaEngine(OrnsteinUhlenbeckProcess arg0, YieldTermStructure rTS, long tGrid, long xGrid) {
    this(QuantLibJNI.new_FdOrnsteinUhlenbeckVanillaEngine__SWIG_3(OrnsteinUhlenbeckProcess.getCPtr(arg0), arg0, YieldTermStructure.getCPtr(rTS), rTS, tGrid, xGrid), true);
  }

  public FdOrnsteinUhlenbeckVanillaEngine(OrnsteinUhlenbeckProcess arg0, YieldTermStructure rTS, long tGrid) {
    this(QuantLibJNI.new_FdOrnsteinUhlenbeckVanillaEngine__SWIG_4(OrnsteinUhlenbeckProcess.getCPtr(arg0), arg0, YieldTermStructure.getCPtr(rTS), rTS, tGrid), true);
  }

  public FdOrnsteinUhlenbeckVanillaEngine(OrnsteinUhlenbeckProcess arg0, YieldTermStructure rTS) {
    this(QuantLibJNI.new_FdOrnsteinUhlenbeckVanillaEngine__SWIG_5(OrnsteinUhlenbeckProcess.getCPtr(arg0), arg0, YieldTermStructure.getCPtr(rTS), rTS), true);
  }

}
