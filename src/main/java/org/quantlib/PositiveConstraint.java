/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class PositiveConstraint extends Constraint {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected PositiveConstraint(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.PositiveConstraint_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PositiveConstraint obj) {
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
        QuantLibJNI.delete_PositiveConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PositiveConstraint() {
    this(QuantLibJNI.new_PositiveConstraint(), true);
  }

}
