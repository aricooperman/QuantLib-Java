/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class VanillaSwap extends Swap {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected VanillaSwap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.VanillaSwap_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VanillaSwap obj) {
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
        QuantLibJNI.delete_VanillaSwap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VanillaSwap(Swap.Type type, double nominal, Schedule fixedSchedule, double fixedRate, DayCounter fixedDayCount, Schedule floatSchedule, IborIndex index, double spread, DayCounter floatingDayCount, OptionalBool withIndexedCoupons) {
    this(QuantLibJNI.new_VanillaSwap__SWIG_0(type.swigValue(), nominal, Schedule.getCPtr(fixedSchedule), fixedSchedule, fixedRate, DayCounter.getCPtr(fixedDayCount), fixedDayCount, Schedule.getCPtr(floatSchedule), floatSchedule, IborIndex.getCPtr(index), index, spread, DayCounter.getCPtr(floatingDayCount), floatingDayCount, OptionalBool.getCPtr(withIndexedCoupons), withIndexedCoupons), true);
  }

  public VanillaSwap(Swap.Type type, double nominal, Schedule fixedSchedule, double fixedRate, DayCounter fixedDayCount, Schedule floatSchedule, IborIndex index, double spread, DayCounter floatingDayCount) {
    this(QuantLibJNI.new_VanillaSwap__SWIG_1(type.swigValue(), nominal, Schedule.getCPtr(fixedSchedule), fixedSchedule, fixedRate, DayCounter.getCPtr(fixedDayCount), fixedDayCount, Schedule.getCPtr(floatSchedule), floatSchedule, IborIndex.getCPtr(index), index, spread, DayCounter.getCPtr(floatingDayCount), floatingDayCount), true);
  }

  public Swap.Type type() {
    return Swap.Type.swigToEnum(QuantLibJNI.VanillaSwap_type(swigCPtr, this));
  }

  public double fairRate() {
    return QuantLibJNI.VanillaSwap_fairRate(swigCPtr, this);
  }

  public double fairSpread() {
    return QuantLibJNI.VanillaSwap_fairSpread(swigCPtr, this);
  }

  public double fixedLegBPS() {
    return QuantLibJNI.VanillaSwap_fixedLegBPS(swigCPtr, this);
  }

  public double floatingLegBPS() {
    return QuantLibJNI.VanillaSwap_floatingLegBPS(swigCPtr, this);
  }

  public double fixedLegNPV() {
    return QuantLibJNI.VanillaSwap_fixedLegNPV(swigCPtr, this);
  }

  public double floatingLegNPV() {
    return QuantLibJNI.VanillaSwap_floatingLegNPV(swigCPtr, this);
  }

  public Leg fixedLeg() {
    return new Leg(QuantLibJNI.VanillaSwap_fixedLeg(swigCPtr, this), false);
  }

  public Leg floatingLeg() {
    return new Leg(QuantLibJNI.VanillaSwap_floatingLeg(swigCPtr, this), false);
  }

  public double nominal() {
    return QuantLibJNI.VanillaSwap_nominal(swigCPtr, this);
  }

  public Schedule fixedSchedule() {
    return new Schedule(QuantLibJNI.VanillaSwap_fixedSchedule(swigCPtr, this), false);
  }

  public Schedule floatingSchedule() {
    return new Schedule(QuantLibJNI.VanillaSwap_floatingSchedule(swigCPtr, this), false);
  }

  public double fixedRate() {
    return QuantLibJNI.VanillaSwap_fixedRate(swigCPtr, this);
  }

  public double spread() {
    return QuantLibJNI.VanillaSwap_spread(swigCPtr, this);
  }

  public DayCounter floatingDayCount() {
    return new DayCounter(QuantLibJNI.VanillaSwap_floatingDayCount(swigCPtr, this), false);
  }

  public DayCounter fixedDayCount() {
    return new DayCounter(QuantLibJNI.VanillaSwap_fixedDayCount(swigCPtr, this), false);
  }

}
