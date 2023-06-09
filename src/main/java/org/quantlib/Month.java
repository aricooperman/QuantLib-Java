/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public final class Month {
  public final static Month January = new Month("January", 1);
  public final static Month February = new Month("February", 2);
  public final static Month March = new Month("March", 3);
  public final static Month April = new Month("April", 4);
  public final static Month May = new Month("May", 5);
  public final static Month June = new Month("June", 6);
  public final static Month July = new Month("July", 7);
  public final static Month August = new Month("August", 8);
  public final static Month September = new Month("September", 9);
  public final static Month October = new Month("October", 10);
  public final static Month November = new Month("November", 11);
  public final static Month December = new Month("December", 12);

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static Month swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + Month.class + " with value " + swigValue);
  }

  private Month(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private Month(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private Month(String swigName, Month swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static Month[] swigValues = { January, February, March, April, May, June, July, August, September, October, November, December };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

