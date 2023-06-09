/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class UnitDisplacedBlackYoYInflationCouponPricer extends YoYInflationCouponPricer {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected UnitDisplacedBlackYoYInflationCouponPricer(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.UnitDisplacedBlackYoYInflationCouponPricer_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UnitDisplacedBlackYoYInflationCouponPricer obj) {
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
        QuantLibJNI.delete_UnitDisplacedBlackYoYInflationCouponPricer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public UnitDisplacedBlackYoYInflationCouponPricer(YoYOptionletVolatilitySurfaceHandle capletVol, YieldTermStructureHandle nominalTermStructure) {
    this(QuantLibJNI.new_UnitDisplacedBlackYoYInflationCouponPricer(YoYOptionletVolatilitySurfaceHandle.getCPtr(capletVol), capletVol, YieldTermStructureHandle.getCPtr(nominalTermStructure), nominalTermStructure), true);
  }

}
