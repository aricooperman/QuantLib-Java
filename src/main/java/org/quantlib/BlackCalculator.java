/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BlackCalculator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BlackCalculator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BlackCalculator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_BlackCalculator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BlackCalculator(StrikedTypePayoff payoff, double forward, double stdDev, double discount) {
    this(QuantLibJNI.new_BlackCalculator__SWIG_0(StrikedTypePayoff.getCPtr(payoff), payoff, forward, stdDev, discount), true);
  }

  public BlackCalculator(StrikedTypePayoff payoff, double forward, double stdDev) {
    this(QuantLibJNI.new_BlackCalculator__SWIG_1(StrikedTypePayoff.getCPtr(payoff), payoff, forward, stdDev), true);
  }

  public double value() {
    return QuantLibJNI.BlackCalculator_value(swigCPtr, this);
  }

  public double deltaForward() {
    return QuantLibJNI.BlackCalculator_deltaForward(swigCPtr, this);
  }

  public double delta(double spot) {
    return QuantLibJNI.BlackCalculator_delta(swigCPtr, this, spot);
  }

  public double elasticityForward() {
    return QuantLibJNI.BlackCalculator_elasticityForward(swigCPtr, this);
  }

  public double elasticity(double spot) {
    return QuantLibJNI.BlackCalculator_elasticity(swigCPtr, this, spot);
  }

  public double gammaForward() {
    return QuantLibJNI.BlackCalculator_gammaForward(swigCPtr, this);
  }

  public double gamma(double spot) {
    return QuantLibJNI.BlackCalculator_gamma(swigCPtr, this, spot);
  }

  public double theta(double spot, double maturity) {
    return QuantLibJNI.BlackCalculator_theta(swigCPtr, this, spot, maturity);
  }

  public double thetaPerDay(double spot, double maturity) {
    return QuantLibJNI.BlackCalculator_thetaPerDay(swigCPtr, this, spot, maturity);
  }

  public double vega(double maturity) {
    return QuantLibJNI.BlackCalculator_vega(swigCPtr, this, maturity);
  }

  public double rho(double maturity) {
    return QuantLibJNI.BlackCalculator_rho(swigCPtr, this, maturity);
  }

  public double dividendRho(double maturity) {
    return QuantLibJNI.BlackCalculator_dividendRho(swigCPtr, this, maturity);
  }

  public double itmCashProbability() {
    return QuantLibJNI.BlackCalculator_itmCashProbability(swigCPtr, this);
  }

  public double itmAssetProbability() {
    return QuantLibJNI.BlackCalculator_itmAssetProbability(swigCPtr, this);
  }

  public double strikeSensitivity() {
    return QuantLibJNI.BlackCalculator_strikeSensitivity(swigCPtr, this);
  }

  public double alpha() {
    return QuantLibJNI.BlackCalculator_alpha(swigCPtr, this);
  }

  public double beta() {
    return QuantLibJNI.BlackCalculator_beta(swigCPtr, this);
  }

}
