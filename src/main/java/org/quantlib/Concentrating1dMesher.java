/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Concentrating1dMesher extends Fdm1dMesher {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Concentrating1dMesher(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Concentrating1dMesher_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Concentrating1dMesher obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        QuantLibJNI.delete_Concentrating1dMesher(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Concentrating1dMesher(double start, double end, long size, DoublePair cPoints, boolean requireCPoint) {
    this(QuantLibJNI.new_Concentrating1dMesher__SWIG_0(start, end, size, DoublePair.getCPtr(cPoints), cPoints, requireCPoint), true);
  }

  public Concentrating1dMesher(double start, double end, long size, DoublePair cPoints) {
    this(QuantLibJNI.new_Concentrating1dMesher__SWIG_1(start, end, size, DoublePair.getCPtr(cPoints), cPoints), true);
  }

  public Concentrating1dMesher(double start, double end, long size) {
    this(QuantLibJNI.new_Concentrating1dMesher__SWIG_2(start, end, size), true);
  }

  public Concentrating1dMesher(double start, double end, long size, Concentrating1dMesherPointVector cPoints, double tol) {
    this(QuantLibJNI.new_Concentrating1dMesher__SWIG_3(start, end, size, Concentrating1dMesherPointVector.getCPtr(cPoints), cPoints, tol), true);
  }

  public Concentrating1dMesher(double start, double end, long size, Concentrating1dMesherPointVector cPoints) {
    this(QuantLibJNI.new_Concentrating1dMesher__SWIG_4(start, end, size, Concentrating1dMesherPointVector.getCPtr(cPoints), cPoints), true);
  }

}