/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class DateGeneration {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DateGeneration(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DateGeneration obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_DateGeneration(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DateGeneration() {
    this(QuantLibJNI.new_DateGeneration(), true);
  }

  public final static class Rule {
    public final static DateGeneration.Rule Backward = new DateGeneration.Rule("Backward");
    public final static DateGeneration.Rule Forward = new DateGeneration.Rule("Forward");
    public final static DateGeneration.Rule Zero = new DateGeneration.Rule("Zero");
    public final static DateGeneration.Rule ThirdWednesday = new DateGeneration.Rule("ThirdWednesday");
    public final static DateGeneration.Rule ThirdWednesdayInclusive = new DateGeneration.Rule("ThirdWednesdayInclusive");
    public final static DateGeneration.Rule Twentieth = new DateGeneration.Rule("Twentieth");
    public final static DateGeneration.Rule TwentiethIMM = new DateGeneration.Rule("TwentiethIMM");
    public final static DateGeneration.Rule OldCDS = new DateGeneration.Rule("OldCDS");
    public final static DateGeneration.Rule CDS = new DateGeneration.Rule("CDS");
    public final static DateGeneration.Rule CDS2015 = new DateGeneration.Rule("CDS2015");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Rule swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Rule.class + " with value " + swigValue);
    }

    private Rule(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Rule(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Rule(String swigName, Rule swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Rule[] swigValues = { Backward, Forward, Zero, ThirdWednesday, ThirdWednesdayInclusive, Twentieth, TwentiethIMM, OldCDS, CDS, CDS2015 };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
