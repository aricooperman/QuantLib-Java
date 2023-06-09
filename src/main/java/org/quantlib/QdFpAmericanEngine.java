/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class QdFpAmericanEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected QdFpAmericanEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.QdFpAmericanEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(QdFpAmericanEngine obj) {
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
        QuantLibJNI.delete_QdFpAmericanEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public QdFpAmericanEngine(GeneralizedBlackScholesProcess bsProcess, QdFpIterationScheme iterationScheme, QdFpAmericanEngine.FixedPointEquation fpEquation) {
    this(QuantLibJNI.new_QdFpAmericanEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(bsProcess), bsProcess, QdFpIterationScheme.getCPtr(iterationScheme), iterationScheme, fpEquation.swigValue()), true);
  }

  public QdFpAmericanEngine(GeneralizedBlackScholesProcess bsProcess, QdFpIterationScheme iterationScheme) {
    this(QuantLibJNI.new_QdFpAmericanEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(bsProcess), bsProcess, QdFpIterationScheme.getCPtr(iterationScheme), iterationScheme), true);
  }

  public QdFpAmericanEngine(GeneralizedBlackScholesProcess bsProcess) {
    this(QuantLibJNI.new_QdFpAmericanEngine__SWIG_2(GeneralizedBlackScholesProcess.getCPtr(bsProcess), bsProcess), true);
  }

  public static QdFpIterationScheme fastScheme() {
    long cPtr = QuantLibJNI.QdFpAmericanEngine_fastScheme();
    return (cPtr == 0) ? null : new QdFpIterationScheme(cPtr, true);
  }

  public static QdFpIterationScheme accurateScheme() {
    long cPtr = QuantLibJNI.QdFpAmericanEngine_accurateScheme();
    return (cPtr == 0) ? null : new QdFpIterationScheme(cPtr, true);
  }

  public static QdFpIterationScheme highPrecisionScheme() {
    long cPtr = QuantLibJNI.QdFpAmericanEngine_highPrecisionScheme();
    return (cPtr == 0) ? null : new QdFpIterationScheme(cPtr, true);
  }

  public final static class FixedPointEquation {
    public final static QdFpAmericanEngine.FixedPointEquation FP_A = new QdFpAmericanEngine.FixedPointEquation("FP_A");
    public final static QdFpAmericanEngine.FixedPointEquation FP_B = new QdFpAmericanEngine.FixedPointEquation("FP_B");
    public final static QdFpAmericanEngine.FixedPointEquation Auto = new QdFpAmericanEngine.FixedPointEquation("Auto");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static FixedPointEquation swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + FixedPointEquation.class + " with value " + swigValue);
    }

    private FixedPointEquation(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private FixedPointEquation(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private FixedPointEquation(String swigName, FixedPointEquation swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static FixedPointEquation[] swigValues = { FP_A, FP_B, Auto };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
