// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import com.example.plazapalm.views.signup.SignupVM;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class SignupFragmentBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnSignup;

  @NonNull
  public final ConstraintLayout clSignup;

  @NonNull
  public final ConstraintLayout clSignupEmail;

  @NonNull
  public final ConstraintLayout clSignupFirstName;

  @NonNull
  public final ConstraintLayout clSignupLastName;

  @NonNull
  public final ConstraintLayout clsignupMain;

  @NonNull
  public final TextInputEditText etSignupConfirmPassword;

  @NonNull
  public final AppCompatEditText etSignupEmail;

  @NonNull
  public final AppCompatEditText etSignupFirstName;

  @NonNull
  public final AppCompatEditText etSignupLastName;

  @NonNull
  public final TextInputEditText etSignupPassword;

  @NonNull
  public final Guideline gLineSignUpWantLogin;

  @NonNull
  public final Guideline gLineSignup;

  @NonNull
  public final NestedScrollView nScrollSigUp;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final RadioButton rbNo;

  @NonNull
  public final RadioButton rbYes;

  @NonNull
  public final TextInputLayout tlSignupConfirmPass;

  @NonNull
  public final TextInputLayout tlSignupPass;

  @NonNull
  public final AppCompatTextView tvSignup;

  @NonNull
  public final AppCompatTextView tvSignupBusiness;

  @NonNull
  public final AppCompatTextView tvSignupConfirmPass;

  @NonNull
  public final AppCompatTextView tvSignupEmail;

  @NonNull
  public final AppCompatTextView tvSignupFirstName;

  @NonNull
  public final AppCompatTextView tvSignupLastName;

  @NonNull
  public final AppCompatTextView tvSignupPassword;

  @NonNull
  public final AppCompatTextView tvSignupWantLogin;

  @Bindable
  protected SignupVM mVm;

  protected SignupFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnSignup, ConstraintLayout clSignup, ConstraintLayout clSignupEmail,
      ConstraintLayout clSignupFirstName, ConstraintLayout clSignupLastName,
      ConstraintLayout clsignupMain, TextInputEditText etSignupConfirmPassword,
      AppCompatEditText etSignupEmail, AppCompatEditText etSignupFirstName,
      AppCompatEditText etSignupLastName, TextInputEditText etSignupPassword,
      Guideline gLineSignUpWantLogin, Guideline gLineSignup, NestedScrollView nScrollSigUp,
      RadioGroup radioGroup, RadioButton rbNo, RadioButton rbYes,
      TextInputLayout tlSignupConfirmPass, TextInputLayout tlSignupPass, AppCompatTextView tvSignup,
      AppCompatTextView tvSignupBusiness, AppCompatTextView tvSignupConfirmPass,
      AppCompatTextView tvSignupEmail, AppCompatTextView tvSignupFirstName,
      AppCompatTextView tvSignupLastName, AppCompatTextView tvSignupPassword,
      AppCompatTextView tvSignupWantLogin) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSignup = btnSignup;
    this.clSignup = clSignup;
    this.clSignupEmail = clSignupEmail;
    this.clSignupFirstName = clSignupFirstName;
    this.clSignupLastName = clSignupLastName;
    this.clsignupMain = clsignupMain;
    this.etSignupConfirmPassword = etSignupConfirmPassword;
    this.etSignupEmail = etSignupEmail;
    this.etSignupFirstName = etSignupFirstName;
    this.etSignupLastName = etSignupLastName;
    this.etSignupPassword = etSignupPassword;
    this.gLineSignUpWantLogin = gLineSignUpWantLogin;
    this.gLineSignup = gLineSignup;
    this.nScrollSigUp = nScrollSigUp;
    this.radioGroup = radioGroup;
    this.rbNo = rbNo;
    this.rbYes = rbYes;
    this.tlSignupConfirmPass = tlSignupConfirmPass;
    this.tlSignupPass = tlSignupPass;
    this.tvSignup = tvSignup;
    this.tvSignupBusiness = tvSignupBusiness;
    this.tvSignupConfirmPass = tvSignupConfirmPass;
    this.tvSignupEmail = tvSignupEmail;
    this.tvSignupFirstName = tvSignupFirstName;
    this.tvSignupLastName = tvSignupLastName;
    this.tvSignupPassword = tvSignupPassword;
    this.tvSignupWantLogin = tvSignupWantLogin;
  }

  public abstract void setVm(@Nullable SignupVM vm);

  @Nullable
  public SignupVM getVm() {
    return mVm;
  }

  @NonNull
  public static SignupFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.signup_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SignupFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SignupFragmentBinding>inflateInternal(inflater, R.layout.signup_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static SignupFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.signup_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SignupFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SignupFragmentBinding>inflateInternal(inflater, R.layout.signup_fragment, null, false, component);
  }

  public static SignupFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static SignupFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (SignupFragmentBinding)bind(component, view, R.layout.signup_fragment);
  }
}
