/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public final class TimeUnit {
  public final static TimeUnit Days = new TimeUnit("Days");
  public final static TimeUnit Weeks = new TimeUnit("Weeks");
  public final static TimeUnit Months = new TimeUnit("Months");
  public final static TimeUnit Years = new TimeUnit("Years");
  public final static TimeUnit Hours = new TimeUnit("Hours");
  public final static TimeUnit Minutes = new TimeUnit("Minutes");
  public final static TimeUnit Seconds = new TimeUnit("Seconds");
  public final static TimeUnit Milliseconds = new TimeUnit("Milliseconds");
  public final static TimeUnit Microseconds = new TimeUnit("Microseconds");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static TimeUnit swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + TimeUnit.class + " with value " + swigValue);
  }

  private TimeUnit(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private TimeUnit(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private TimeUnit(String swigName, TimeUnit swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static TimeUnit[] swigValues = { Days, Weeks, Months, Years, Hours, Minutes, Seconds, Milliseconds, Microseconds };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

