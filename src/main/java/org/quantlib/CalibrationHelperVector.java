/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CalibrationHelperVector extends java.util.AbstractList<CalibrationHelper> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CalibrationHelperVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CalibrationHelperVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CalibrationHelperVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CalibrationHelperVector(CalibrationHelper[] initialElements) {
    this();
    reserve(initialElements.length);

    for (CalibrationHelper element : initialElements) {
      add(element);
    }
  }

  public CalibrationHelperVector(Iterable<CalibrationHelper> initialElements) {
    this();
    for (CalibrationHelper element : initialElements) {
      add(element);
    }
  }

  public CalibrationHelper get(int index) {
    return doGet(index);
  }

  public CalibrationHelper set(int index, CalibrationHelper e) {
    return doSet(index, e);
  }

  public boolean add(CalibrationHelper e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, CalibrationHelper e) {
    modCount++;
    doAdd(index, e);
  }

  public CalibrationHelper remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public CalibrationHelperVector() {
    this(QuantLibJNI.new_CalibrationHelperVector__SWIG_0(), true);
  }

  public CalibrationHelperVector(CalibrationHelperVector other) {
    this(QuantLibJNI.new_CalibrationHelperVector__SWIG_1(CalibrationHelperVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.CalibrationHelperVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.CalibrationHelperVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.CalibrationHelperVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.CalibrationHelperVector_clear(swigCPtr, this);
  }

  public CalibrationHelperVector(int count, CalibrationHelper value) {
    this(QuantLibJNI.new_CalibrationHelperVector__SWIG_2(count, CalibrationHelper.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.CalibrationHelperVector_doSize(swigCPtr, this);
  }

  private void doAdd(CalibrationHelper x) {
    QuantLibJNI.CalibrationHelperVector_doAdd__SWIG_0(swigCPtr, this, CalibrationHelper.getCPtr(x), x);
  }

  private void doAdd(int index, CalibrationHelper x) {
    QuantLibJNI.CalibrationHelperVector_doAdd__SWIG_1(swigCPtr, this, index, CalibrationHelper.getCPtr(x), x);
  }

  private CalibrationHelper doRemove(int index) {
    long cPtr = QuantLibJNI.CalibrationHelperVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CalibrationHelper(cPtr, true);
  }

  private CalibrationHelper doGet(int index) {
    long cPtr = QuantLibJNI.CalibrationHelperVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CalibrationHelper(cPtr, true);
  }

  private CalibrationHelper doSet(int index, CalibrationHelper val) {
    long cPtr = QuantLibJNI.CalibrationHelperVector_doSet(swigCPtr, this, index, CalibrationHelper.getCPtr(val), val);
    return (cPtr == 0) ? null : new CalibrationHelper(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.CalibrationHelperVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
