/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SobolBrownianGenerator extends BrownianGenerator {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected SobolBrownianGenerator(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.SobolBrownianGenerator_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SobolBrownianGenerator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        QuantLibJNI.delete_SobolBrownianGenerator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SobolBrownianGenerator(long factors, long steps, SobolBrownianGenerator.Ordering ordering, long seed, SobolRsg.DirectionIntegers directionIntegers) {
    this(QuantLibJNI.new_SobolBrownianGenerator__SWIG_0(factors, steps, ordering.swigValue(), seed, directionIntegers.swigValue()), true);
  }

  public SobolBrownianGenerator(long factors, long steps, SobolBrownianGenerator.Ordering ordering, long seed) {
    this(QuantLibJNI.new_SobolBrownianGenerator__SWIG_1(factors, steps, ordering.swigValue(), seed), true);
  }

  public SobolBrownianGenerator(long factors, long steps, SobolBrownianGenerator.Ordering ordering) {
    this(QuantLibJNI.new_SobolBrownianGenerator__SWIG_2(factors, steps, ordering.swigValue()), true);
  }

  public final static class Ordering {
    public final static SobolBrownianGenerator.Ordering Factors = new SobolBrownianGenerator.Ordering("Factors");
    public final static SobolBrownianGenerator.Ordering Steps = new SobolBrownianGenerator.Ordering("Steps");
    public final static SobolBrownianGenerator.Ordering Diagonal = new SobolBrownianGenerator.Ordering("Diagonal");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Ordering swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Ordering.class + " with value " + swigValue);
    }

    private Ordering(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Ordering(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Ordering(String swigName, Ordering swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Ordering[] swigValues = { Factors, Steps, Diagonal };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
