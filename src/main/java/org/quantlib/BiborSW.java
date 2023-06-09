/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BiborSW extends Bibor {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BiborSW(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BiborSW_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BiborSW obj) {
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
        QuantLibJNI.delete_BiborSW(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BiborSW(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_BiborSW__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public BiborSW() {
    this(QuantLibJNI.new_BiborSW__SWIG_1(), true);
  }

}
