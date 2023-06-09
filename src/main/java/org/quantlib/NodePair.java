/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class NodePair {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected NodePair(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NodePair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_NodePair(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public NodePair() {
    this(QuantLibJNI.new_NodePair__SWIG_0(), true);
  }

  public NodePair(Date first, double second) {
    this(QuantLibJNI.new_NodePair__SWIG_1(Date.getCPtr(first), first, second), true);
  }

  public NodePair(NodePair other) {
    this(QuantLibJNI.new_NodePair__SWIG_2(NodePair.getCPtr(other), other), true);
  }

  public void setFirst(Date value) {
    QuantLibJNI.NodePair_first_set(swigCPtr, this, Date.getCPtr(value), value);
  }

  public Date getFirst() {
    long cPtr = QuantLibJNI.NodePair_first_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Date(cPtr, false);
  }

  public void setSecond(double value) {
    QuantLibJNI.NodePair_second_set(swigCPtr, this, value);
  }

  public double getSecond() {
    return QuantLibJNI.NodePair_second_get(swigCPtr, this);
  }

}
