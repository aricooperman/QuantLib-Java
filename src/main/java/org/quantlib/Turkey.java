/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Turkey extends Calendar {
  private transient long swigCPtr;

  protected Turkey(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Turkey_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Turkey obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Turkey(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Turkey() {
    this(QuantLibJNI.new_Turkey(), true);
  }

}
