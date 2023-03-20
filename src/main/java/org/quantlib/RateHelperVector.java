/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class RateHelperVector extends java.util.AbstractList<RateHelper> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RateHelperVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RateHelperVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_RateHelperVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RateHelperVector(RateHelper[] initialElements) {
    this();
    reserve(initialElements.length);

    for (RateHelper element : initialElements) {
      add(element);
    }
  }

  public RateHelperVector(Iterable<RateHelper> initialElements) {
    this();
    for (RateHelper element : initialElements) {
      add(element);
    }
  }

  public RateHelper get(int index) {
    return doGet(index);
  }

  public RateHelper set(int index, RateHelper e) {
    return doSet(index, e);
  }

  public boolean add(RateHelper e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, RateHelper e) {
    modCount++;
    doAdd(index, e);
  }

  public RateHelper remove(int index) {
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

  public RateHelperVector() {
    this(QuantLibJNI.new_RateHelperVector__SWIG_0(), true);
  }

  public RateHelperVector(RateHelperVector other) {
    this(QuantLibJNI.new_RateHelperVector__SWIG_1(RateHelperVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.RateHelperVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.RateHelperVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.RateHelperVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.RateHelperVector_clear(swigCPtr, this);
  }

  public RateHelperVector(int count, RateHelper value) {
    this(QuantLibJNI.new_RateHelperVector__SWIG_2(count, RateHelper.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.RateHelperVector_doSize(swigCPtr, this);
  }

  private void doAdd(RateHelper x) {
    QuantLibJNI.RateHelperVector_doAdd__SWIG_0(swigCPtr, this, RateHelper.getCPtr(x), x);
  }

  private void doAdd(int index, RateHelper x) {
    QuantLibJNI.RateHelperVector_doAdd__SWIG_1(swigCPtr, this, index, RateHelper.getCPtr(x), x);
  }

  private RateHelper doRemove(int index) {
    long cPtr = QuantLibJNI.RateHelperVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new RateHelper(cPtr, true);
  }

  private RateHelper doGet(int index) {
    long cPtr = QuantLibJNI.RateHelperVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new RateHelper(cPtr, true);
  }

  private RateHelper doSet(int index, RateHelper val) {
    long cPtr = QuantLibJNI.RateHelperVector_doSet(swigCPtr, this, index, RateHelper.getCPtr(val), val);
    return (cPtr == 0) ? null : new RateHelper(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.RateHelperVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
