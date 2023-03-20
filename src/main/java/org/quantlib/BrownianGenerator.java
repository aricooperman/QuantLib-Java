/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BrownianGenerator {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected BrownianGenerator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BrownianGenerator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_BrownianGenerator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public double nextStep(DoubleVector arg0) {
    return QuantLibJNI.BrownianGenerator_nextStep(swigCPtr, this, DoubleVector.getCPtr(arg0), arg0);
  }

  public double nextPath() {
    return QuantLibJNI.BrownianGenerator_nextPath(swigCPtr, this);
  }

  public long numberOfFactors() {
    return QuantLibJNI.BrownianGenerator_numberOfFactors(swigCPtr, this);
  }

  public long numberOfSteps() {
    return QuantLibJNI.BrownianGenerator_numberOfSteps(swigCPtr, this);
  }

}