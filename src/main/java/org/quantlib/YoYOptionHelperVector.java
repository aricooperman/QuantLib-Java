/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YoYOptionHelperVector extends java.util.AbstractList<YoYOptionHelper> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected YoYOptionHelperVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YoYOptionHelperVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_YoYOptionHelperVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public YoYOptionHelperVector(YoYOptionHelper[] initialElements) {
    this();
    reserve(initialElements.length);

    for (YoYOptionHelper element : initialElements) {
      add(element);
    }
  }

  public YoYOptionHelperVector(Iterable<YoYOptionHelper> initialElements) {
    this();
    for (YoYOptionHelper element : initialElements) {
      add(element);
    }
  }

  public YoYOptionHelper get(int index) {
    return doGet(index);
  }

  public YoYOptionHelper set(int index, YoYOptionHelper e) {
    return doSet(index, e);
  }

  public boolean add(YoYOptionHelper e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, YoYOptionHelper e) {
    modCount++;
    doAdd(index, e);
  }

  public YoYOptionHelper remove(int index) {
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

  public YoYOptionHelperVector() {
    this(QuantLibJNI.new_YoYOptionHelperVector__SWIG_0(), true);
  }

  public YoYOptionHelperVector(YoYOptionHelperVector other) {
    this(QuantLibJNI.new_YoYOptionHelperVector__SWIG_1(YoYOptionHelperVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.YoYOptionHelperVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.YoYOptionHelperVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.YoYOptionHelperVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.YoYOptionHelperVector_clear(swigCPtr, this);
  }

  public YoYOptionHelperVector(int count, YoYOptionHelper value) {
    this(QuantLibJNI.new_YoYOptionHelperVector__SWIG_2(count, YoYOptionHelper.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.YoYOptionHelperVector_doSize(swigCPtr, this);
  }

  private void doAdd(YoYOptionHelper x) {
    QuantLibJNI.YoYOptionHelperVector_doAdd__SWIG_0(swigCPtr, this, YoYOptionHelper.getCPtr(x), x);
  }

  private void doAdd(int index, YoYOptionHelper x) {
    QuantLibJNI.YoYOptionHelperVector_doAdd__SWIG_1(swigCPtr, this, index, YoYOptionHelper.getCPtr(x), x);
  }

  private YoYOptionHelper doRemove(int index) {
    long cPtr = QuantLibJNI.YoYOptionHelperVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new YoYOptionHelper(cPtr, true);
  }

  private YoYOptionHelper doGet(int index) {
    long cPtr = QuantLibJNI.YoYOptionHelperVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new YoYOptionHelper(cPtr, true);
  }

  private YoYOptionHelper doSet(int index, YoYOptionHelper val) {
    long cPtr = QuantLibJNI.YoYOptionHelperVector_doSet(swigCPtr, this, index, YoYOptionHelper.getCPtr(val), val);
    return (cPtr == 0) ? null : new YoYOptionHelper(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.YoYOptionHelperVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
