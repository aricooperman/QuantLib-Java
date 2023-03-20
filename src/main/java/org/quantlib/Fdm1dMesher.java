/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Fdm1dMesher {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected Fdm1dMesher(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Fdm1dMesher obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Fdm1dMesher(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Fdm1dMesher(long size) {
    this(QuantLibJNI.new_Fdm1dMesher(size), true);
  }

  public long size() {
    return QuantLibJNI.Fdm1dMesher_size(swigCPtr, this);
  }

  public double dplus(long index) {
    return QuantLibJNI.Fdm1dMesher_dplus(swigCPtr, this, index);
  }

  public double dminus(long index) {
    return QuantLibJNI.Fdm1dMesher_dminus(swigCPtr, this, index);
  }

  public double location(long index) {
    return QuantLibJNI.Fdm1dMesher_location(swigCPtr, this, index);
  }

  public DoubleVector locations() {
    return new DoubleVector(QuantLibJNI.Fdm1dMesher_locations(swigCPtr, this), false);
  }

}
