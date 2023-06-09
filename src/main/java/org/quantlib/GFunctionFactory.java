/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GFunctionFactory {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GFunctionFactory(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GFunctionFactory obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_GFunctionFactory(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public final static class YieldCurveModel {
    public final static GFunctionFactory.YieldCurveModel Standard = new GFunctionFactory.YieldCurveModel("Standard");
    public final static GFunctionFactory.YieldCurveModel ExactYield = new GFunctionFactory.YieldCurveModel("ExactYield");
    public final static GFunctionFactory.YieldCurveModel ParallelShifts = new GFunctionFactory.YieldCurveModel("ParallelShifts");
    public final static GFunctionFactory.YieldCurveModel NonParallelShifts = new GFunctionFactory.YieldCurveModel("NonParallelShifts");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static YieldCurveModel swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + YieldCurveModel.class + " with value " + swigValue);
    }

    private YieldCurveModel(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private YieldCurveModel(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private YieldCurveModel(String swigName, YieldCurveModel swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static YieldCurveModel[] swigValues = { Standard, ExactYield, ParallelShifts, NonParallelShifts };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
