/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SwaptionVolCube1 extends SwaptionVolatilityCube {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected SwaptionVolCube1(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.SwaptionVolCube1_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SwaptionVolCube1 obj) {
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
        QuantLibJNI.delete_SwaptionVolCube1(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SwaptionVolCube1(SwaptionVolatilityStructureHandle atmVolStructure, PeriodVector optionTenors, PeriodVector swapTenors, DoubleVector strikeSpreads, QuoteHandleVectorVector volSpreads, SwapIndex swapIndex, SwapIndex shortSwapIndex, boolean vegaWeightedSmileFit, QuoteHandleVectorVector parametersGuess, BoolVector isParameterFixed, boolean isAtmCalibrated, EndCriteria endCriteria, double maxErrorTolerance, OptimizationMethod optMethod, double errorAccept, boolean useMaxError, long maxGuesses, boolean backwardFlat, double cutoffStrike) {
    this(QuantLibJNI.new_SwaptionVolCube1__SWIG_0(SwaptionVolatilityStructureHandle.getCPtr(atmVolStructure), atmVolStructure, PeriodVector.getCPtr(optionTenors), optionTenors, PeriodVector.getCPtr(swapTenors), swapTenors, DoubleVector.getCPtr(strikeSpreads), strikeSpreads, QuoteHandleVectorVector.getCPtr(volSpreads), volSpreads, SwapIndex.getCPtr(swapIndex), swapIndex, SwapIndex.getCPtr(shortSwapIndex), shortSwapIndex, vegaWeightedSmileFit, QuoteHandleVectorVector.getCPtr(parametersGuess), parametersGuess, BoolVector.getCPtr(isParameterFixed), isParameterFixed, isAtmCalibrated, EndCriteria.getCPtr(endCriteria), endCriteria, maxErrorTolerance, OptimizationMethod.getCPtr(optMethod), optMethod, errorAccept, useMaxError, maxGuesses, backwardFlat, cutoffStrike), true);
  }

  public SwaptionVolCube1(SwaptionVolatilityStructureHandle atmVolStructure, PeriodVector optionTenors, PeriodVector swapTenors, DoubleVector strikeSpreads, QuoteHandleVectorVector volSpreads, SwapIndex swapIndex, SwapIndex shortSwapIndex, boolean vegaWeightedSmileFit, QuoteHandleVectorVector parametersGuess, BoolVector isParameterFixed, boolean isAtmCalibrated, EndCriteria endCriteria, double maxErrorTolerance, OptimizationMethod optMethod, double errorAccept, boolean useMaxError, long maxGuesses, boolean backwardFlat) {
    this(QuantLibJNI.new_SwaptionVolCube1__SWIG_1(SwaptionVolatilityStructureHandle.getCPtr(atmVolStructure), atmVolStructure, PeriodVector.getCPtr(optionTenors), optionTenors, PeriodVector.getCPtr(swapTenors), swapTenors, DoubleVector.getCPtr(strikeSpreads), strikeSpreads, QuoteHandleVectorVector.getCPtr(volSpreads), volSpreads, SwapIndex.getCPtr(swapIndex), swapIndex, SwapIndex.getCPtr(shortSwapIndex), shortSwapIndex, vegaWeightedSmileFit, QuoteHandleVectorVector.getCPtr(parametersGuess), parametersGuess, BoolVector.getCPtr(isParameterFixed), isParameterFixed, isAtmCalibrated, EndCriteria.getCPtr(endCriteria), endCriteria, maxErrorTolerance, OptimizationMethod.getCPtr(optMethod), optMethod, errorAccept, useMaxError, maxGuesses, backwardFlat), true);
  }

  public SwaptionVolCube1(SwaptionVolatilityStructureHandle atmVolStructure, PeriodVector optionTenors, PeriodVector swapTenors, DoubleVector strikeSpreads, QuoteHandleVectorVector volSpreads, SwapIndex swapIndex, SwapIndex shortSwapIndex, boolean vegaWeightedSmileFit, QuoteHandleVectorVector parametersGuess, BoolVector isParameterFixed, boolean isAtmCalibrated, EndCriteria endCriteria, double maxErrorTolerance, OptimizationMethod optMethod, double errorAccept, boolean useMaxError, long maxGuesses) {
    this(QuantLibJNI.new_SwaptionVolCube1__SWIG_2(SwaptionVolatilityStructureHandle.getCPtr(atmVolStructure), atmVolStructure, PeriodVector.getCPtr(optionTenors), optionTenors, PeriodVector.getCPtr(swapTenors), swapTenors, DoubleVector.getCPtr(strikeSpreads), strikeSpreads, QuoteHandleVectorVector.getCPtr(volSpreads), volSpreads, SwapIndex.getCPtr(swapIndex), swapIndex, SwapIndex.getCPtr(shortSwapIndex), shortSwapIndex, vegaWeightedSmileFit, QuoteHandleVectorVector.getCPtr(parametersGuess), parametersGuess, BoolVector.getCPtr(isParameterFixed), isParameterFixed, isAtmCalibrated, EndCriteria.getCPtr(endCriteria), endCriteria, maxErrorTolerance, OptimizationMethod.getCPtr(optMethod), optMethod, errorAccept, useMaxError, maxGuesses), true);
  }

  public SwaptionVolCube1(SwaptionVolatilityStructureHandle atmVolStructure, PeriodVector optionTenors, PeriodVector swapTenors, DoubleVector strikeSpreads, QuoteHandleVectorVector volSpreads, SwapIndex swapIndex, SwapIndex shortSwapIndex, boolean vegaWeightedSmileFit, QuoteHandleVectorVector parametersGuess, BoolVector isParameterFixed, boolean isAtmCalibrated, EndCriteria endCriteria, double maxErrorTolerance, OptimizationMethod optMethod, double errorAccept, boolean useMaxError) {
    this(QuantLibJNI.new_SwaptionVolCube1__SWIG_3(SwaptionVolatilityStructureHandle.getCPtr(atmVolStructure), atmVolStructure, PeriodVector.getCPtr(optionTenors), optionTenors, PeriodVector.getCPtr(swapTenors), swapTenors, DoubleVector.getCPtr(strikeSpreads), strikeSpreads, QuoteHandleVectorVector.getCPtr(volSpreads), volSpreads, SwapIndex.getCPtr(swapIndex), swapIndex, SwapIndex.getCPtr(shortSwapIndex), shortSwapIndex, vegaWeightedSmileFit, QuoteHandleVectorVector.getCPtr(parametersGuess), parametersGuess, BoolVector.getCPtr(isParameterFixed), isParameterFixed, isAtmCalibrated, EndCriteria.getCPtr(endCriteria), endCriteria, maxErrorTolerance, OptimizationMethod.getCPtr(optMethod), optMethod, errorAccept, useMaxError), true);
  }

  public SwaptionVolCube1(SwaptionVolatilityStructureHandle atmVolStructure, PeriodVector optionTenors, PeriodVector swapTenors, DoubleVector strikeSpreads, QuoteHandleVectorVector volSpreads, SwapIndex swapIndex, SwapIndex shortSwapIndex, boolean vegaWeightedSmileFit, QuoteHandleVectorVector parametersGuess, BoolVector isParameterFixed, boolean isAtmCalibrated, EndCriteria endCriteria, double maxErrorTolerance, OptimizationMethod optMethod, double errorAccept) {
    this(QuantLibJNI.new_SwaptionVolCube1__SWIG_4(SwaptionVolatilityStructureHandle.getCPtr(atmVolStructure), atmVolStructure, PeriodVector.getCPtr(optionTenors), optionTenors, PeriodVector.getCPtr(swapTenors), swapTenors, DoubleVector.getCPtr(strikeSpreads), strikeSpreads, QuoteHandleVectorVector.getCPtr(volSpreads), volSpreads, SwapIndex.getCPtr(swapIndex), swapIndex, SwapIndex.getCPtr(shortSwapIndex), shortSwapIndex, vegaWeightedSmileFit, QuoteHandleVectorVector.getCPtr(parametersGuess), parametersGuess, BoolVector.getCPtr(isParameterFixed), isParameterFixed, isAtmCalibrated, EndCriteria.getCPtr(endCriteria), endCriteria, maxErrorTolerance, OptimizationMethod.getCPtr(optMethod), optMethod, errorAccept), true);
  }

  public SwaptionVolCube1(SwaptionVolatilityStructureHandle atmVolStructure, PeriodVector optionTenors, PeriodVector swapTenors, DoubleVector strikeSpreads, QuoteHandleVectorVector volSpreads, SwapIndex swapIndex, SwapIndex shortSwapIndex, boolean vegaWeightedSmileFit, QuoteHandleVectorVector parametersGuess, BoolVector isParameterFixed, boolean isAtmCalibrated, EndCriteria endCriteria, double maxErrorTolerance, OptimizationMethod optMethod) {
    this(QuantLibJNI.new_SwaptionVolCube1__SWIG_5(SwaptionVolatilityStructureHandle.getCPtr(atmVolStructure), atmVolStructure, PeriodVector.getCPtr(optionTenors), optionTenors, PeriodVector.getCPtr(swapTenors), swapTenors, DoubleVector.getCPtr(strikeSpreads), strikeSpreads, QuoteHandleVectorVector.getCPtr(volSpreads), volSpreads, SwapIndex.getCPtr(swapIndex), swapIndex, SwapIndex.getCPtr(shortSwapIndex), shortSwapIndex, vegaWeightedSmileFit, QuoteHandleVectorVector.getCPtr(parametersGuess), parametersGuess, BoolVector.getCPtr(isParameterFixed), isParameterFixed, isAtmCalibrated, EndCriteria.getCPtr(endCriteria), endCriteria, maxErrorTolerance, OptimizationMethod.getCPtr(optMethod), optMethod), true);
  }

  public SwaptionVolCube1(SwaptionVolatilityStructureHandle atmVolStructure, PeriodVector optionTenors, PeriodVector swapTenors, DoubleVector strikeSpreads, QuoteHandleVectorVector volSpreads, SwapIndex swapIndex, SwapIndex shortSwapIndex, boolean vegaWeightedSmileFit, QuoteHandleVectorVector parametersGuess, BoolVector isParameterFixed, boolean isAtmCalibrated, EndCriteria endCriteria, double maxErrorTolerance) {
    this(QuantLibJNI.new_SwaptionVolCube1__SWIG_6(SwaptionVolatilityStructureHandle.getCPtr(atmVolStructure), atmVolStructure, PeriodVector.getCPtr(optionTenors), optionTenors, PeriodVector.getCPtr(swapTenors), swapTenors, DoubleVector.getCPtr(strikeSpreads), strikeSpreads, QuoteHandleVectorVector.getCPtr(volSpreads), volSpreads, SwapIndex.getCPtr(swapIndex), swapIndex, SwapIndex.getCPtr(shortSwapIndex), shortSwapIndex, vegaWeightedSmileFit, QuoteHandleVectorVector.getCPtr(parametersGuess), parametersGuess, BoolVector.getCPtr(isParameterFixed), isParameterFixed, isAtmCalibrated, EndCriteria.getCPtr(endCriteria), endCriteria, maxErrorTolerance), true);
  }

  public SwaptionVolCube1(SwaptionVolatilityStructureHandle atmVolStructure, PeriodVector optionTenors, PeriodVector swapTenors, DoubleVector strikeSpreads, QuoteHandleVectorVector volSpreads, SwapIndex swapIndex, SwapIndex shortSwapIndex, boolean vegaWeightedSmileFit, QuoteHandleVectorVector parametersGuess, BoolVector isParameterFixed, boolean isAtmCalibrated, EndCriteria endCriteria) {
    this(QuantLibJNI.new_SwaptionVolCube1__SWIG_7(SwaptionVolatilityStructureHandle.getCPtr(atmVolStructure), atmVolStructure, PeriodVector.getCPtr(optionTenors), optionTenors, PeriodVector.getCPtr(swapTenors), swapTenors, DoubleVector.getCPtr(strikeSpreads), strikeSpreads, QuoteHandleVectorVector.getCPtr(volSpreads), volSpreads, SwapIndex.getCPtr(swapIndex), swapIndex, SwapIndex.getCPtr(shortSwapIndex), shortSwapIndex, vegaWeightedSmileFit, QuoteHandleVectorVector.getCPtr(parametersGuess), parametersGuess, BoolVector.getCPtr(isParameterFixed), isParameterFixed, isAtmCalibrated, EndCriteria.getCPtr(endCriteria), endCriteria), true);
  }

  public SwaptionVolCube1(SwaptionVolatilityStructureHandle atmVolStructure, PeriodVector optionTenors, PeriodVector swapTenors, DoubleVector strikeSpreads, QuoteHandleVectorVector volSpreads, SwapIndex swapIndex, SwapIndex shortSwapIndex, boolean vegaWeightedSmileFit, QuoteHandleVectorVector parametersGuess, BoolVector isParameterFixed, boolean isAtmCalibrated) {
    this(QuantLibJNI.new_SwaptionVolCube1__SWIG_8(SwaptionVolatilityStructureHandle.getCPtr(atmVolStructure), atmVolStructure, PeriodVector.getCPtr(optionTenors), optionTenors, PeriodVector.getCPtr(swapTenors), swapTenors, DoubleVector.getCPtr(strikeSpreads), strikeSpreads, QuoteHandleVectorVector.getCPtr(volSpreads), volSpreads, SwapIndex.getCPtr(swapIndex), swapIndex, SwapIndex.getCPtr(shortSwapIndex), shortSwapIndex, vegaWeightedSmileFit, QuoteHandleVectorVector.getCPtr(parametersGuess), parametersGuess, BoolVector.getCPtr(isParameterFixed), isParameterFixed, isAtmCalibrated), true);
  }

  public Matrix sparseSabrParameters() {
    return new Matrix(QuantLibJNI.SwaptionVolCube1_sparseSabrParameters(swigCPtr, this), true);
  }

  public Matrix denseSabrParameters() {
    return new Matrix(QuantLibJNI.SwaptionVolCube1_denseSabrParameters(swigCPtr, this), true);
  }

  public Matrix marketVolCube() {
    return new Matrix(QuantLibJNI.SwaptionVolCube1_marketVolCube(swigCPtr, this), true);
  }

  public Matrix volCubeAtmCalibrated() {
    return new Matrix(QuantLibJNI.SwaptionVolCube1_volCubeAtmCalibrated(swigCPtr, this), true);
  }

  public SabrSmileSection smileSection(double optionTime, double swapLength, boolean extr) {
    long cPtr = QuantLibJNI.SwaptionVolCube1_smileSection__SWIG_0(swigCPtr, this, optionTime, swapLength, extr);
    return (cPtr == 0) ? null : new SabrSmileSection(cPtr, true);
  }

  public SabrSmileSection smileSection(double optionTime, double swapLength) {
    long cPtr = QuantLibJNI.SwaptionVolCube1_smileSection__SWIG_1(swigCPtr, this, optionTime, swapLength);
    return (cPtr == 0) ? null : new SabrSmileSection(cPtr, true);
  }

  public SabrSmileSection smileSection(Period optionTenor, Period swapTenor, boolean extr) {
    long cPtr = QuantLibJNI.SwaptionVolCube1_smileSection__SWIG_2(swigCPtr, this, Period.getCPtr(optionTenor), optionTenor, Period.getCPtr(swapTenor), swapTenor, extr);
    return (cPtr == 0) ? null : new SabrSmileSection(cPtr, true);
  }

  public SabrSmileSection smileSection(Period optionTenor, Period swapTenor) {
    long cPtr = QuantLibJNI.SwaptionVolCube1_smileSection__SWIG_3(swigCPtr, this, Period.getCPtr(optionTenor), optionTenor, Period.getCPtr(swapTenor), swapTenor);
    return (cPtr == 0) ? null : new SabrSmileSection(cPtr, true);
  }

}
