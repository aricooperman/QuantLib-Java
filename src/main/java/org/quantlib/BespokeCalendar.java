/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BespokeCalendar extends Calendar {
  private transient long swigCPtr;

  protected BespokeCalendar(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BespokeCalendar_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BespokeCalendar obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_BespokeCalendar(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BespokeCalendar(String name) {
    this(QuantLibJNI.new_BespokeCalendar(name), true);
  }

  public void addWeekend(Weekday arg0) {
    QuantLibJNI.BespokeCalendar_addWeekend(swigCPtr, this, arg0.swigValue());
  }

}
