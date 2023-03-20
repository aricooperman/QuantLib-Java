/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BinomialEQPConvertibleEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BinomialEQPConvertibleEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BinomialEQPConvertibleEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BinomialEQPConvertibleEngine obj) {
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
        QuantLibJNI.delete_BinomialEQPConvertibleEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BinomialEQPConvertibleEngine(GeneralizedBlackScholesProcess arg0, long steps, QuoteHandle creditSpread, DividendSchedule dividends) {
    this(QuantLibJNI.new_BinomialEQPConvertibleEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(arg0), arg0, steps, QuoteHandle.getCPtr(creditSpread), creditSpread, DividendSchedule.getCPtr(dividends), dividends), true);
  }

  public BinomialEQPConvertibleEngine(GeneralizedBlackScholesProcess arg0, long steps, QuoteHandle creditSpread) {
    this(QuantLibJNI.new_BinomialEQPConvertibleEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(arg0), arg0, steps, QuoteHandle.getCPtr(creditSpread), creditSpread), true);
  }

}