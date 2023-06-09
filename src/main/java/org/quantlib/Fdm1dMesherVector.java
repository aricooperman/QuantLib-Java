/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Fdm1dMesherVector extends java.util.AbstractList<Fdm1dMesher> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Fdm1dMesherVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Fdm1dMesherVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Fdm1dMesherVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Fdm1dMesherVector(Fdm1dMesher[] initialElements) {
    this();
    reserve(initialElements.length);

    for (Fdm1dMesher element : initialElements) {
      add(element);
    }
  }

  public Fdm1dMesherVector(Iterable<Fdm1dMesher> initialElements) {
    this();
    for (Fdm1dMesher element : initialElements) {
      add(element);
    }
  }

  public Fdm1dMesher get(int index) {
    return doGet(index);
  }

  public Fdm1dMesher set(int index, Fdm1dMesher e) {
    return doSet(index, e);
  }

  public boolean add(Fdm1dMesher e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, Fdm1dMesher e) {
    modCount++;
    doAdd(index, e);
  }

  public Fdm1dMesher remove(int index) {
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

  public Fdm1dMesherVector() {
    this(QuantLibJNI.new_Fdm1dMesherVector__SWIG_0(), true);
  }

  public Fdm1dMesherVector(Fdm1dMesherVector other) {
    this(QuantLibJNI.new_Fdm1dMesherVector__SWIG_1(Fdm1dMesherVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.Fdm1dMesherVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.Fdm1dMesherVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.Fdm1dMesherVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.Fdm1dMesherVector_clear(swigCPtr, this);
  }

  public Fdm1dMesherVector(int count, Fdm1dMesher value) {
    this(QuantLibJNI.new_Fdm1dMesherVector__SWIG_2(count, Fdm1dMesher.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.Fdm1dMesherVector_doSize(swigCPtr, this);
  }

  private void doAdd(Fdm1dMesher x) {
    QuantLibJNI.Fdm1dMesherVector_doAdd__SWIG_0(swigCPtr, this, Fdm1dMesher.getCPtr(x), x);
  }

  private void doAdd(int index, Fdm1dMesher x) {
    QuantLibJNI.Fdm1dMesherVector_doAdd__SWIG_1(swigCPtr, this, index, Fdm1dMesher.getCPtr(x), x);
  }

  private Fdm1dMesher doRemove(int index) {
    long cPtr = QuantLibJNI.Fdm1dMesherVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Fdm1dMesher(cPtr, true);
  }

  private Fdm1dMesher doGet(int index) {
    long cPtr = QuantLibJNI.Fdm1dMesherVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Fdm1dMesher(cPtr, true);
  }

  private Fdm1dMesher doSet(int index, Fdm1dMesher val) {
    long cPtr = QuantLibJNI.Fdm1dMesherVector_doSet(swigCPtr, this, index, Fdm1dMesher.getCPtr(val), val);
    return (cPtr == 0) ? null : new Fdm1dMesher(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.Fdm1dMesherVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
