/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class G2SwaptionEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected G2SwaptionEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.G2SwaptionEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(G2SwaptionEngine obj) {
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
        QuantLibJNI.delete_G2SwaptionEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public G2SwaptionEngine(G2 model, double range, long intervals) {
    this(QuantLibJNI.new_G2SwaptionEngine(G2.getCPtr(model), model, range, intervals), true);
  }

}
