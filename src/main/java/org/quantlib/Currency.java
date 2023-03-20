/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Currency {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Currency(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Currency obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Currency(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Currency() {
    this(QuantLibJNI.new_Currency__SWIG_0(), true);
  }

  public Currency(String name, String code, int numericCode, String symbol, String fractionSymbol, int fractionsPerUnit, Rounding rounding, String formatString, Currency triangulationCurrency) {
    this(QuantLibJNI.new_Currency__SWIG_1(name, code, numericCode, symbol, fractionSymbol, fractionsPerUnit, Rounding.getCPtr(rounding), rounding, formatString, Currency.getCPtr(triangulationCurrency), triangulationCurrency), true);
  }

  public Currency(String name, String code, int numericCode, String symbol, String fractionSymbol, int fractionsPerUnit, Rounding rounding, String formatString) {
    this(QuantLibJNI.new_Currency__SWIG_2(name, code, numericCode, symbol, fractionSymbol, fractionsPerUnit, Rounding.getCPtr(rounding), rounding, formatString), true);
  }

  public String name() {
    return QuantLibJNI.Currency_name(swigCPtr, this);
  }

  public String code() {
    return QuantLibJNI.Currency_code(swigCPtr, this);
  }

  public int numericCode() {
    return QuantLibJNI.Currency_numericCode(swigCPtr, this);
  }

  public String symbol() {
    return QuantLibJNI.Currency_symbol(swigCPtr, this);
  }

  public String fractionSymbol() {
    return QuantLibJNI.Currency_fractionSymbol(swigCPtr, this);
  }

  public int fractionsPerUnit() {
    return QuantLibJNI.Currency_fractionsPerUnit(swigCPtr, this);
  }

  public Rounding rounding() {
    return new Rounding(QuantLibJNI.Currency_rounding(swigCPtr, this), false);
  }

  public String format() {
    return QuantLibJNI.Currency_format(swigCPtr, this);
  }

  public boolean empty() {
    return QuantLibJNI.Currency_empty(swigCPtr, this);
  }

  public Currency triangulationCurrency() {
    return new Currency(QuantLibJNI.Currency_triangulationCurrency(swigCPtr, this), false);
  }

  public String toString() {
    return QuantLibJNI.Currency_toString(swigCPtr, this);
  }

  public boolean equals(Currency other) {
    return QuantLibJNI.Currency_equals(swigCPtr, this, Currency.getCPtr(other), other);
  }

  public boolean unEquals(Currency other) {
    return QuantLibJNI.Currency_unEquals(swigCPtr, this, Currency.getCPtr(other), other);
  }

}