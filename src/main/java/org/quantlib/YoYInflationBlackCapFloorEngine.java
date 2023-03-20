/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YoYInflationBlackCapFloorEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected YoYInflationBlackCapFloorEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YoYInflationBlackCapFloorEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YoYInflationBlackCapFloorEngine obj) {
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
        QuantLibJNI.delete_YoYInflationBlackCapFloorEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public YoYInflationBlackCapFloorEngine(YoYInflationIndex arg0, YoYOptionletVolatilitySurfaceHandle vol, YieldTermStructureHandle nominalTermStructure) {
    this(QuantLibJNI.new_YoYInflationBlackCapFloorEngine(YoYInflationIndex.getCPtr(arg0), arg0, YoYOptionletVolatilitySurfaceHandle.getCPtr(vol), vol, YieldTermStructureHandle.getCPtr(nominalTermStructure), nominalTermStructure), true);
  }

}
