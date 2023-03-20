/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class IterativeBootstrap {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IterativeBootstrap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IterativeBootstrap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_IterativeBootstrap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public IterativeBootstrap(double accuracy, double minValue, double maxValue) {
    this(QuantLibJNI.new_IterativeBootstrap__SWIG_0(accuracy, minValue, maxValue), true);
  }

  public IterativeBootstrap(double accuracy, double minValue) {
    this(QuantLibJNI.new_IterativeBootstrap__SWIG_1(accuracy, minValue), true);
  }

  public IterativeBootstrap(double accuracy) {
    this(QuantLibJNI.new_IterativeBootstrap__SWIG_2(accuracy), true);
  }

  public IterativeBootstrap() {
    this(QuantLibJNI.new_IterativeBootstrap__SWIG_3(), true);
  }

}
