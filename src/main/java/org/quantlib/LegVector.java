/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class LegVector extends java.util.AbstractList<Leg> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LegVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LegVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_LegVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LegVector(Leg[] initialElements) {
    this();
    reserve(initialElements.length);

    for (Leg element : initialElements) {
      add(element);
    }
  }

  public LegVector(Iterable<Leg> initialElements) {
    this();
    for (Leg element : initialElements) {
      add(element);
    }
  }

  public Leg get(int index) {
    return doGet(index);
  }

  public Leg set(int index, Leg e) {
    return doSet(index, e);
  }

  public boolean add(Leg e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, Leg e) {
    modCount++;
    doAdd(index, e);
  }

  public Leg remove(int index) {
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

  public LegVector() {
    this(QuantLibJNI.new_LegVector__SWIG_0(), true);
  }

  public LegVector(LegVector other) {
    this(QuantLibJNI.new_LegVector__SWIG_1(LegVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.LegVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.LegVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.LegVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.LegVector_clear(swigCPtr, this);
  }

  public LegVector(int count, Leg value) {
    this(QuantLibJNI.new_LegVector__SWIG_2(count, Leg.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.LegVector_doSize(swigCPtr, this);
  }

  private void doAdd(Leg x) {
    QuantLibJNI.LegVector_doAdd__SWIG_0(swigCPtr, this, Leg.getCPtr(x), x);
  }

  private void doAdd(int index, Leg x) {
    QuantLibJNI.LegVector_doAdd__SWIG_1(swigCPtr, this, index, Leg.getCPtr(x), x);
  }

  private Leg doRemove(int index) {
    return new Leg(QuantLibJNI.LegVector_doRemove(swigCPtr, this, index), true);
  }

  private Leg doGet(int index) {
    return new Leg(QuantLibJNI.LegVector_doGet(swigCPtr, this, index), false);
  }

  private Leg doSet(int index, Leg val) {
    return new Leg(QuantLibJNI.LegVector_doSet(swigCPtr, this, index, Leg.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.LegVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
