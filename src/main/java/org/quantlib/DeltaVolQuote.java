/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class DeltaVolQuote extends Quote {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected DeltaVolQuote(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.DeltaVolQuote_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DeltaVolQuote obj) {
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
        QuantLibJNI.delete_DeltaVolQuote(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DeltaVolQuote(double delta, QuoteHandle vol, double maturity, DeltaVolQuote.DeltaType deltaType) {
    this(QuantLibJNI.new_DeltaVolQuote__SWIG_0(delta, QuoteHandle.getCPtr(vol), vol, maturity, deltaType.swigValue()), true);
  }

  public DeltaVolQuote(QuoteHandle vol, DeltaVolQuote.DeltaType deltaType, double maturity, DeltaVolQuote.AtmType atmType) {
    this(QuantLibJNI.new_DeltaVolQuote__SWIG_1(QuoteHandle.getCPtr(vol), vol, deltaType.swigValue(), maturity, atmType.swigValue()), true);
  }

  public double delta() {
    return QuantLibJNI.DeltaVolQuote_delta(swigCPtr, this);
  }

  public double maturity() {
    return QuantLibJNI.DeltaVolQuote_maturity(swigCPtr, this);
  }

  public DeltaVolQuote.AtmType atmType() {
    return DeltaVolQuote.AtmType.swigToEnum(QuantLibJNI.DeltaVolQuote_atmType(swigCPtr, this));
  }

  public DeltaVolQuote.DeltaType deltaType() {
    return DeltaVolQuote.DeltaType.swigToEnum(QuantLibJNI.DeltaVolQuote_deltaType(swigCPtr, this));
  }

  public final static class DeltaType {
    public final static DeltaVolQuote.DeltaType Spot = new DeltaVolQuote.DeltaType("Spot");
    public final static DeltaVolQuote.DeltaType Fwd = new DeltaVolQuote.DeltaType("Fwd");
    public final static DeltaVolQuote.DeltaType PaSpot = new DeltaVolQuote.DeltaType("PaSpot");
    public final static DeltaVolQuote.DeltaType PaFwd = new DeltaVolQuote.DeltaType("PaFwd");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static DeltaType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + DeltaType.class + " with value " + swigValue);
    }

    private DeltaType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private DeltaType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private DeltaType(String swigName, DeltaType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static DeltaType[] swigValues = { Spot, Fwd, PaSpot, PaFwd };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class AtmType {
    public final static DeltaVolQuote.AtmType AtmNull = new DeltaVolQuote.AtmType("AtmNull");
    public final static DeltaVolQuote.AtmType AtmSpot = new DeltaVolQuote.AtmType("AtmSpot");
    public final static DeltaVolQuote.AtmType AtmFwd = new DeltaVolQuote.AtmType("AtmFwd");
    public final static DeltaVolQuote.AtmType AtmDeltaNeutral = new DeltaVolQuote.AtmType("AtmDeltaNeutral");
    public final static DeltaVolQuote.AtmType AtmVegaMax = new DeltaVolQuote.AtmType("AtmVegaMax");
    public final static DeltaVolQuote.AtmType AtmGammaMax = new DeltaVolQuote.AtmType("AtmGammaMax");
    public final static DeltaVolQuote.AtmType AtmPutCall50 = new DeltaVolQuote.AtmType("AtmPutCall50");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static AtmType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + AtmType.class + " with value " + swigValue);
    }

    private AtmType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private AtmType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private AtmType(String swigName, AtmType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static AtmType[] swigValues = { AtmNull, AtmSpot, AtmFwd, AtmDeltaNeutral, AtmVegaMax, AtmGammaMax, AtmPutCall50 };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
