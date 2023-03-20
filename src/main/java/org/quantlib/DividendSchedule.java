/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class DividendSchedule extends java.util.AbstractList<Dividend> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DividendSchedule(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DividendSchedule obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_DividendSchedule(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DividendSchedule(Dividend[] initialElements) {
    this();
    reserve(initialElements.length);

    for (Dividend element : initialElements) {
      add(element);
    }
  }

  public DividendSchedule(Iterable<Dividend> initialElements) {
    this();
    for (Dividend element : initialElements) {
      add(element);
    }
  }

  public Dividend get(int index) {
    return doGet(index);
  }

  public Dividend set(int index, Dividend e) {
    return doSet(index, e);
  }

  public boolean add(Dividend e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, Dividend e) {
    modCount++;
    doAdd(index, e);
  }

  public Dividend remove(int index) {
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

  public DividendSchedule() {
    this(QuantLibJNI.new_DividendSchedule__SWIG_0(), true);
  }

  public DividendSchedule(DividendSchedule other) {
    this(QuantLibJNI.new_DividendSchedule__SWIG_1(DividendSchedule.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.DividendSchedule_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.DividendSchedule_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.DividendSchedule_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.DividendSchedule_clear(swigCPtr, this);
  }

  public DividendSchedule(int count, Dividend value) {
    this(QuantLibJNI.new_DividendSchedule__SWIG_2(count, Dividend.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.DividendSchedule_doSize(swigCPtr, this);
  }

  private void doAdd(Dividend x) {
    QuantLibJNI.DividendSchedule_doAdd__SWIG_0(swigCPtr, this, Dividend.getCPtr(x), x);
  }

  private void doAdd(int index, Dividend x) {
    QuantLibJNI.DividendSchedule_doAdd__SWIG_1(swigCPtr, this, index, Dividend.getCPtr(x), x);
  }

  private Dividend doRemove(int index) {
    long cPtr = QuantLibJNI.DividendSchedule_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Dividend(cPtr, true);
  }

  private Dividend doGet(int index) {
    long cPtr = QuantLibJNI.DividendSchedule_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Dividend(cPtr, true);
  }

  private Dividend doSet(int index, Dividend val) {
    long cPtr = QuantLibJNI.DividendSchedule_doSet(swigCPtr, this, index, Dividend.getCPtr(val), val);
    return (cPtr == 0) ? null : new Dividend(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.DividendSchedule_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
