/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Swap extends Instrument {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Swap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Swap_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Swap obj) {
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
        QuantLibJNI.delete_Swap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Swap(Leg firstLeg, Leg secondLeg) {
    this(QuantLibJNI.new_Swap__SWIG_0(Leg.getCPtr(firstLeg), firstLeg, Leg.getCPtr(secondLeg), secondLeg), true);
  }

  public Swap(LegVector legs, BoolVector payer) {
    this(QuantLibJNI.new_Swap__SWIG_1(LegVector.getCPtr(legs), legs, BoolVector.getCPtr(payer), payer), true);
  }

  public Date startDate() {
    return new Date(QuantLibJNI.Swap_startDate(swigCPtr, this), true);
  }

  public Date maturityDate() {
    return new Date(QuantLibJNI.Swap_maturityDate(swigCPtr, this), true);
  }

  public Leg leg(long i) {
    return new Leg(QuantLibJNI.Swap_leg(swigCPtr, this, i), false);
  }

  public double legNPV(long j) {
    return QuantLibJNI.Swap_legNPV(swigCPtr, this, j);
  }

  public double legBPS(long k) {
    return QuantLibJNI.Swap_legBPS(swigCPtr, this, k);
  }

  public final static class Type {
    public final static Swap.Type Receiver = new Swap.Type("Receiver", QuantLibJNI.Swap_Receiver_get());
    public final static Swap.Type Payer = new Swap.Type("Payer", QuantLibJNI.Swap_Payer_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Type swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    private Type(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Type(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Type(String swigName, Type swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Type[] swigValues = { Receiver, Payer };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
