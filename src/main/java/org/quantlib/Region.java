/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Region {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Region(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Region obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Region(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String name() {
    return QuantLibJNI.Region_name(swigCPtr, this);
  }

  public String code() {
    return QuantLibJNI.Region_code(swigCPtr, this);
  }

}
