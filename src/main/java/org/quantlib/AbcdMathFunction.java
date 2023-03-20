/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class AbcdMathFunction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AbcdMathFunction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AbcdMathFunction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_AbcdMathFunction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AbcdMathFunction(double a, double b, double c, double d) {
    this(QuantLibJNI.new_AbcdMathFunction__SWIG_0(a, b, c, d), true);
  }

  public AbcdMathFunction(double a, double b, double c) {
    this(QuantLibJNI.new_AbcdMathFunction__SWIG_1(a, b, c), true);
  }

  public AbcdMathFunction(double a, double b) {
    this(QuantLibJNI.new_AbcdMathFunction__SWIG_2(a, b), true);
  }

  public AbcdMathFunction(double a) {
    this(QuantLibJNI.new_AbcdMathFunction__SWIG_3(a), true);
  }

  public AbcdMathFunction() {
    this(QuantLibJNI.new_AbcdMathFunction__SWIG_4(), true);
  }

  public AbcdMathFunction(DoubleVector abcd) {
    this(QuantLibJNI.new_AbcdMathFunction__SWIG_5(DoubleVector.getCPtr(abcd), abcd), true);
  }

  public double getValue(double t) {
    return QuantLibJNI.AbcdMathFunction_getValue(swigCPtr, this, t);
  }

  public double maximumLocation() {
    return QuantLibJNI.AbcdMathFunction_maximumLocation(swigCPtr, this);
  }

  public double maximumValue() {
    return QuantLibJNI.AbcdMathFunction_maximumValue(swigCPtr, this);
  }

  public double longTermValue() {
    return QuantLibJNI.AbcdMathFunction_longTermValue(swigCPtr, this);
  }

  public double derivative(double t) {
    return QuantLibJNI.AbcdMathFunction_derivative(swigCPtr, this, t);
  }

  public double primitive(double t) {
    return QuantLibJNI.AbcdMathFunction_primitive(swigCPtr, this, t);
  }

  public double definiteIntegral(double t1, double t2) {
    return QuantLibJNI.AbcdMathFunction_definiteIntegral(swigCPtr, this, t1, t2);
  }

  public double a() {
    return QuantLibJNI.AbcdMathFunction_a(swigCPtr, this);
  }

  public double b() {
    return QuantLibJNI.AbcdMathFunction_b(swigCPtr, this);
  }

  public double c() {
    return QuantLibJNI.AbcdMathFunction_c(swigCPtr, this);
  }

  public double d() {
    return QuantLibJNI.AbcdMathFunction_d(swigCPtr, this);
  }

  public DoubleVector coefficients() {
    return new DoubleVector(QuantLibJNI.AbcdMathFunction_coefficients(swigCPtr, this), false);
  }

  public DoubleVector derivativeCoefficients() {
    return new DoubleVector(QuantLibJNI.AbcdMathFunction_derivativeCoefficients(swigCPtr, this), false);
  }

  public DoubleVector definiteIntegralCoefficients(double t, double t2) {
    return new DoubleVector(QuantLibJNI.AbcdMathFunction_definiteIntegralCoefficients(swigCPtr, this, t, t2), true);
  }

  public DoubleVector definiteDerivativeCoefficients(double t, double t2) {
    return new DoubleVector(QuantLibJNI.AbcdMathFunction_definiteDerivativeCoefficients(swigCPtr, this, t, t2), true);
  }

  public static void validate(double a, double b, double c, double d) {
    QuantLibJNI.AbcdMathFunction_validate(a, b, c, d);
  }

}
