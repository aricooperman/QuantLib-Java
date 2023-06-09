/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class RelinkableQuoteHandle extends QuoteHandle {
  private transient long swigCPtr;

  protected RelinkableQuoteHandle(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.RelinkableQuoteHandle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RelinkableQuoteHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_RelinkableQuoteHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RelinkableQuoteHandle(Quote arg0) {
    this(QuantLibJNI.new_RelinkableQuoteHandle__SWIG_0(Quote.getCPtr(arg0), arg0), true);
  }

  public RelinkableQuoteHandle() {
    this(QuantLibJNI.new_RelinkableQuoteHandle__SWIG_1(), true);
  }

  public void linkTo(Quote arg0) {
    QuantLibJNI.RelinkableQuoteHandle_linkTo(swigCPtr, this, Quote.getCPtr(arg0), arg0);
  }

  public void reset() {
    QuantLibJNI.RelinkableQuoteHandle_reset(swigCPtr, this);
  }

}
