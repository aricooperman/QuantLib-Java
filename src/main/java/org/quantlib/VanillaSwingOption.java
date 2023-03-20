/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class VanillaSwingOption extends OneAssetOption {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected VanillaSwingOption(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.VanillaSwingOption_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VanillaSwingOption obj) {
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
        QuantLibJNI.delete_VanillaSwingOption(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VanillaSwingOption(Payoff payoff, SwingExercise ex, long minExerciseRights, long maxExerciseRights) {
    this(QuantLibJNI.new_VanillaSwingOption(Payoff.getCPtr(payoff), payoff, SwingExercise.getCPtr(ex), ex, minExerciseRights, maxExerciseRights), true);
  }

}
