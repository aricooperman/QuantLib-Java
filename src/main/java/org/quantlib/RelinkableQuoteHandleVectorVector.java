/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class RelinkableQuoteHandleVectorVector extends java.util.AbstractList<RelinkableQuoteHandleVector> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RelinkableQuoteHandleVectorVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RelinkableQuoteHandleVectorVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_RelinkableQuoteHandleVectorVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RelinkableQuoteHandleVectorVector(RelinkableQuoteHandleVector[] initialElements) {
    this();
    reserve(initialElements.length);

    for (RelinkableQuoteHandleVector element : initialElements) {
      add(element);
    }
  }

  public RelinkableQuoteHandleVectorVector(Iterable<RelinkableQuoteHandleVector> initialElements) {
    this();
    for (RelinkableQuoteHandleVector element : initialElements) {
      add(element);
    }
  }

  public RelinkableQuoteHandleVector get(int index) {
    return doGet(index);
  }

  public RelinkableQuoteHandleVector set(int index, RelinkableQuoteHandleVector e) {
    return doSet(index, e);
  }

  public boolean add(RelinkableQuoteHandleVector e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, RelinkableQuoteHandleVector e) {
    modCount++;
    doAdd(index, e);
  }

  public RelinkableQuoteHandleVector remove(int index) {
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

  public RelinkableQuoteHandleVectorVector() {
    this(QuantLibJNI.new_RelinkableQuoteHandleVectorVector__SWIG_0(), true);
  }

  public RelinkableQuoteHandleVectorVector(RelinkableQuoteHandleVectorVector other) {
    this(QuantLibJNI.new_RelinkableQuoteHandleVectorVector__SWIG_1(RelinkableQuoteHandleVectorVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.RelinkableQuoteHandleVectorVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.RelinkableQuoteHandleVectorVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.RelinkableQuoteHandleVectorVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.RelinkableQuoteHandleVectorVector_clear(swigCPtr, this);
  }

  public RelinkableQuoteHandleVectorVector(int count, RelinkableQuoteHandleVector value) {
    this(QuantLibJNI.new_RelinkableQuoteHandleVectorVector__SWIG_2(count, RelinkableQuoteHandleVector.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.RelinkableQuoteHandleVectorVector_doSize(swigCPtr, this);
  }

  private void doAdd(RelinkableQuoteHandleVector x) {
    QuantLibJNI.RelinkableQuoteHandleVectorVector_doAdd__SWIG_0(swigCPtr, this, RelinkableQuoteHandleVector.getCPtr(x), x);
  }

  private void doAdd(int index, RelinkableQuoteHandleVector x) {
    QuantLibJNI.RelinkableQuoteHandleVectorVector_doAdd__SWIG_1(swigCPtr, this, index, RelinkableQuoteHandleVector.getCPtr(x), x);
  }

  private RelinkableQuoteHandleVector doRemove(int index) {
    return new RelinkableQuoteHandleVector(QuantLibJNI.RelinkableQuoteHandleVectorVector_doRemove(swigCPtr, this, index), true);
  }

  private RelinkableQuoteHandleVector doGet(int index) {
    return new RelinkableQuoteHandleVector(QuantLibJNI.RelinkableQuoteHandleVectorVector_doGet(swigCPtr, this, index), false);
  }

  private RelinkableQuoteHandleVector doSet(int index, RelinkableQuoteHandleVector val) {
    return new RelinkableQuoteHandleVector(QuantLibJNI.RelinkableQuoteHandleVectorVector_doSet(swigCPtr, this, index, RelinkableQuoteHandleVector.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.RelinkableQuoteHandleVectorVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}