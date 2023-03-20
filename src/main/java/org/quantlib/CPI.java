/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CPI {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CPI(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CPI obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CPI(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static double laggedFixing(ZeroInflationIndex index, Date date, Period observationLag, CPI.InterpolationType interpolationType) {
    return QuantLibJNI.CPI_laggedFixing(ZeroInflationIndex.getCPtr(index), index, Date.getCPtr(date), date, Period.getCPtr(observationLag), observationLag, interpolationType.swigValue());
  }

  public CPI() {
    this(QuantLibJNI.new_CPI(), true);
  }

  public final static class InterpolationType {
    public final static CPI.InterpolationType AsIndex = new CPI.InterpolationType("AsIndex");
    public final static CPI.InterpolationType Flat = new CPI.InterpolationType("Flat");
    public final static CPI.InterpolationType Linear = new CPI.InterpolationType("Linear");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static InterpolationType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + InterpolationType.class + " with value " + swigValue);
    }

    private InterpolationType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private InterpolationType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private InterpolationType(String swigName, InterpolationType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static InterpolationType[] swigValues = { AsIndex, Flat, Linear };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
