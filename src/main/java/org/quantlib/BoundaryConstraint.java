/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BoundaryConstraint extends Constraint {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BoundaryConstraint(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BoundaryConstraint_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BoundaryConstraint obj) {
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
        QuantLibJNI.delete_BoundaryConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BoundaryConstraint(double lower, double upper) {
    this(QuantLibJNI.new_BoundaryConstraint(lower, upper), true);
  }

}
