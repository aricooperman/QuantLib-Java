/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class DefaultProbabilityHelperVector extends java.util.AbstractList<DefaultProbabilityHelper> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DefaultProbabilityHelperVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DefaultProbabilityHelperVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_DefaultProbabilityHelperVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DefaultProbabilityHelperVector(DefaultProbabilityHelper[] initialElements) {
    this();
    reserve(initialElements.length);

    for (DefaultProbabilityHelper element : initialElements) {
      add(element);
    }
  }

  public DefaultProbabilityHelperVector(Iterable<DefaultProbabilityHelper> initialElements) {
    this();
    for (DefaultProbabilityHelper element : initialElements) {
      add(element);
    }
  }

  public DefaultProbabilityHelper get(int index) {
    return doGet(index);
  }

  public DefaultProbabilityHelper set(int index, DefaultProbabilityHelper e) {
    return doSet(index, e);
  }

  public boolean add(DefaultProbabilityHelper e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, DefaultProbabilityHelper e) {
    modCount++;
    doAdd(index, e);
  }

  public DefaultProbabilityHelper remove(int index) {
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

  public DefaultProbabilityHelperVector() {
    this(QuantLibJNI.new_DefaultProbabilityHelperVector__SWIG_0(), true);
  }

  public DefaultProbabilityHelperVector(DefaultProbabilityHelperVector other) {
    this(QuantLibJNI.new_DefaultProbabilityHelperVector__SWIG_1(DefaultProbabilityHelperVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.DefaultProbabilityHelperVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.DefaultProbabilityHelperVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.DefaultProbabilityHelperVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.DefaultProbabilityHelperVector_clear(swigCPtr, this);
  }

  public DefaultProbabilityHelperVector(int count, DefaultProbabilityHelper value) {
    this(QuantLibJNI.new_DefaultProbabilityHelperVector__SWIG_2(count, DefaultProbabilityHelper.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.DefaultProbabilityHelperVector_doSize(swigCPtr, this);
  }

  private void doAdd(DefaultProbabilityHelper x) {
    QuantLibJNI.DefaultProbabilityHelperVector_doAdd__SWIG_0(swigCPtr, this, DefaultProbabilityHelper.getCPtr(x), x);
  }

  private void doAdd(int index, DefaultProbabilityHelper x) {
    QuantLibJNI.DefaultProbabilityHelperVector_doAdd__SWIG_1(swigCPtr, this, index, DefaultProbabilityHelper.getCPtr(x), x);
  }

  private DefaultProbabilityHelper doRemove(int index) {
    long cPtr = QuantLibJNI.DefaultProbabilityHelperVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new DefaultProbabilityHelper(cPtr, true);
  }

  private DefaultProbabilityHelper doGet(int index) {
    long cPtr = QuantLibJNI.DefaultProbabilityHelperVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new DefaultProbabilityHelper(cPtr, true);
  }

  private DefaultProbabilityHelper doSet(int index, DefaultProbabilityHelper val) {
    long cPtr = QuantLibJNI.DefaultProbabilityHelperVector_doSet(swigCPtr, this, index, DefaultProbabilityHelper.getCPtr(val), val);
    return (cPtr == 0) ? null : new DefaultProbabilityHelper(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.DefaultProbabilityHelperVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
