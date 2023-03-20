/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ShortRateModelHandle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ShortRateModelHandle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ShortRateModelHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_ShortRateModelHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ShortRateModelHandle(ShortRateModel arg0) {
    this(QuantLibJNI.new_ShortRateModelHandle__SWIG_0(ShortRateModel.getCPtr(arg0), arg0), true);
  }

  public ShortRateModelHandle() {
    this(QuantLibJNI.new_ShortRateModelHandle__SWIG_1(), true);
  }

  public ShortRateModel __deref__() {
    long cPtr = QuantLibJNI.ShortRateModelHandle___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new ShortRateModel(cPtr, true);
  }

  public ShortRateModel currentLink() {
    long cPtr = QuantLibJNI.ShortRateModelHandle_currentLink(swigCPtr, this);
    return (cPtr == 0) ? null : new ShortRateModel(cPtr, true);
  }

  public boolean empty() {
    return QuantLibJNI.ShortRateModelHandle_empty(swigCPtr, this);
  }

  public Observable asObservable() {
    long cPtr = QuantLibJNI.ShortRateModelHandle_asObservable(swigCPtr, this);
    return (cPtr == 0) ? null : new Observable(cPtr, true);
  }

  public Array params() {
    return new Array(QuantLibJNI.ShortRateModelHandle_params(swigCPtr, this), true);
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2, Constraint constraint, DoubleVector weights, BoolVector fixParameters) {
    QuantLibJNI.ShortRateModelHandle_calibrate__SWIG_0(swigCPtr, this, CalibrationHelperVector.getCPtr(arg0), arg0, OptimizationMethod.getCPtr(arg1), arg1, EndCriteria.getCPtr(arg2), arg2, Constraint.getCPtr(constraint), constraint, DoubleVector.getCPtr(weights), weights, BoolVector.getCPtr(fixParameters), fixParameters);
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2, Constraint constraint, DoubleVector weights) {
    QuantLibJNI.ShortRateModelHandle_calibrate__SWIG_1(swigCPtr, this, CalibrationHelperVector.getCPtr(arg0), arg0, OptimizationMethod.getCPtr(arg1), arg1, EndCriteria.getCPtr(arg2), arg2, Constraint.getCPtr(constraint), constraint, DoubleVector.getCPtr(weights), weights);
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2, Constraint constraint) {
    QuantLibJNI.ShortRateModelHandle_calibrate__SWIG_2(swigCPtr, this, CalibrationHelperVector.getCPtr(arg0), arg0, OptimizationMethod.getCPtr(arg1), arg1, EndCriteria.getCPtr(arg2), arg2, Constraint.getCPtr(constraint), constraint);
  }

  public void calibrate(CalibrationHelperVector arg0, OptimizationMethod arg1, EndCriteria arg2) {
    QuantLibJNI.ShortRateModelHandle_calibrate__SWIG_3(swigCPtr, this, CalibrationHelperVector.getCPtr(arg0), arg0, OptimizationMethod.getCPtr(arg1), arg1, EndCriteria.getCPtr(arg2), arg2);
  }

  public void setParams(Array params) {
    QuantLibJNI.ShortRateModelHandle_setParams(swigCPtr, this, Array.getCPtr(params), params);
  }

  public double value(Array params, CalibrationHelperVector arg1) {
    return QuantLibJNI.ShortRateModelHandle_value(swigCPtr, this, Array.getCPtr(params), params, CalibrationHelperVector.getCPtr(arg1), arg1);
  }

  public Constraint constraint() {
    long cPtr = QuantLibJNI.ShortRateModelHandle_constraint(swigCPtr, this);
    return (cPtr == 0) ? null : new Constraint(cPtr, true);
  }

  public EndCriteria.Type endCriteria() {
    return EndCriteria.Type.swigToEnum(QuantLibJNI.ShortRateModelHandle_endCriteria(swigCPtr, this));
  }

  public Array problemValues() {
    return new Array(QuantLibJNI.ShortRateModelHandle_problemValues(swigCPtr, this), false);
  }

  public int functionEvaluation() {
    return QuantLibJNI.ShortRateModelHandle_functionEvaluation(swigCPtr, this);
  }

}