/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class RelinkableYoYOptionletVolatilitySurfaceHandle extends YoYOptionletVolatilitySurfaceHandle {
  private transient long swigCPtr;

  protected RelinkableYoYOptionletVolatilitySurfaceHandle(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.RelinkableYoYOptionletVolatilitySurfaceHandle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RelinkableYoYOptionletVolatilitySurfaceHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_RelinkableYoYOptionletVolatilitySurfaceHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RelinkableYoYOptionletVolatilitySurfaceHandle(YoYOptionletVolatilitySurface arg0) {
    this(QuantLibJNI.new_RelinkableYoYOptionletVolatilitySurfaceHandle__SWIG_0(YoYOptionletVolatilitySurface.getCPtr(arg0), arg0), true);
  }

  public RelinkableYoYOptionletVolatilitySurfaceHandle() {
    this(QuantLibJNI.new_RelinkableYoYOptionletVolatilitySurfaceHandle__SWIG_1(), true);
  }

  public void linkTo(YoYOptionletVolatilitySurface arg0) {
    QuantLibJNI.RelinkableYoYOptionletVolatilitySurfaceHandle_linkTo(swigCPtr, this, YoYOptionletVolatilitySurface.getCPtr(arg0), arg0);
  }

  public void reset() {
    QuantLibJNI.RelinkableYoYOptionletVolatilitySurfaceHandle_reset(swigCPtr, this);
  }

}
