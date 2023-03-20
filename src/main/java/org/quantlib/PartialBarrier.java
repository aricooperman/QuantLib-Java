/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class PartialBarrier extends Barrier {
  private transient long swigCPtr;

  protected PartialBarrier(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.PartialBarrier_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PartialBarrier obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_PartialBarrier(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PartialBarrier() {
    this(QuantLibJNI.new_PartialBarrier(), true);
  }

  public final static class Range {
    public final static PartialBarrier.Range Start = new PartialBarrier.Range("Start");
    public final static PartialBarrier.Range End = new PartialBarrier.Range("End");
    public final static PartialBarrier.Range EndB1 = new PartialBarrier.Range("EndB1");
    public final static PartialBarrier.Range EndB2 = new PartialBarrier.Range("EndB2");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Range swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Range.class + " with value " + swigValue);
    }

    private Range(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Range(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Range(String swigName, Range swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Range[] swigValues = { Start, End, EndB1, EndB2 };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
