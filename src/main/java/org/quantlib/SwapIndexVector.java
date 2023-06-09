/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SwapIndexVector extends java.util.AbstractList<SwapIndex> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SwapIndexVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SwapIndexVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_SwapIndexVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SwapIndexVector(SwapIndex[] initialElements) {
    this();
    reserve(initialElements.length);

    for (SwapIndex element : initialElements) {
      add(element);
    }
  }

  public SwapIndexVector(Iterable<SwapIndex> initialElements) {
    this();
    for (SwapIndex element : initialElements) {
      add(element);
    }
  }

  public SwapIndex get(int index) {
    return doGet(index);
  }

  public SwapIndex set(int index, SwapIndex e) {
    return doSet(index, e);
  }

  public boolean add(SwapIndex e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, SwapIndex e) {
    modCount++;
    doAdd(index, e);
  }

  public SwapIndex remove(int index) {
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

  public SwapIndexVector() {
    this(QuantLibJNI.new_SwapIndexVector__SWIG_0(), true);
  }

  public SwapIndexVector(SwapIndexVector other) {
    this(QuantLibJNI.new_SwapIndexVector__SWIG_1(SwapIndexVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.SwapIndexVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.SwapIndexVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.SwapIndexVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.SwapIndexVector_clear(swigCPtr, this);
  }

  public SwapIndexVector(int count, SwapIndex value) {
    this(QuantLibJNI.new_SwapIndexVector__SWIG_2(count, SwapIndex.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.SwapIndexVector_doSize(swigCPtr, this);
  }

  private void doAdd(SwapIndex x) {
    QuantLibJNI.SwapIndexVector_doAdd__SWIG_0(swigCPtr, this, SwapIndex.getCPtr(x), x);
  }

  private void doAdd(int index, SwapIndex x) {
    QuantLibJNI.SwapIndexVector_doAdd__SWIG_1(swigCPtr, this, index, SwapIndex.getCPtr(x), x);
  }

  private SwapIndex doRemove(int index) {
    long cPtr = QuantLibJNI.SwapIndexVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SwapIndex(cPtr, true);
  }

  private SwapIndex doGet(int index) {
    long cPtr = QuantLibJNI.SwapIndexVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SwapIndex(cPtr, true);
  }

  private SwapIndex doSet(int index, SwapIndex val) {
    long cPtr = QuantLibJNI.SwapIndexVector_doSet(swigCPtr, this, index, SwapIndex.getCPtr(val), val);
    return (cPtr == 0) ? null : new SwapIndex(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.SwapIndexVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
