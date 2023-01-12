// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import com.example.plazapalm.views.login.LoginVM;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LoginFragmentBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnConfirmBooking;

  @NonNull
  public final AppCompatButton btnLogin;

  @NonNull
  public final AppCompatButton btnLoginCategories;

  @NonNull
  public final ConstraintLayout clLoginEmail;

  @NonNull
  public final ConstraintLayout clMainLogin;

  @NonNull
  public final TextInputEditText etLoginPassword;

  @NonNull
  public final Guideline gLineLoginWantSignup;

  @NonNull
  public final Guideline guideline9;

  @NonNull
  public final NestedScrollView nScrollLogin;

  @NonNull
  public final TextInputLayout tlLoginPassword;

  @NonNull
  public final AppCompatTextView tvLogin;

  @NonNull
  public final AppCompatTextView tvLoginEmail;

  @NonNull
  public final AppCompatTextView tvLoginForgotPass;

  @NonNull
  public final AppCompatTextView tvLoginPassword;

  @NonNull
  public final AppCompatTextView tvLoginWantSignup;

  @Bindable
  protected LoginVM mVm;

  protected LoginFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnConfirmBooking, AppCompatButton btnLogin,
      AppCompatButton btnLoginCategories, ConstraintLayout clLoginEmail,
      ConstraintLayout clMainLogin, TextInputEditText etLoginPassword,
      Guideline gLineLoginWantSignup, Guideline guideline9, NestedScrollView nScrollLogin,
      TextInputLayout tlLoginPassword, AppCompatTextView tvLogin, AppCompatTextView tvLoginEmail,
      AppCompatTextView tvLoginForgotPass, AppCompatTextView tvLoginPassword,
      AppCompatTextView tvLoginWantSignup) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnConfirmBooking = btnConfirmBooking;
    this.btnLogin = btnLogin;
    this.btnLoginCategories = btnLoginCategories;
    this.clLoginEmail = clLoginEmail;
    this.clMainLogin = clMainLogin;
    this.etLoginPassword = etLoginPassword;
    this.gLineLoginWantSignup = gLineLoginWantSignup;
    this.guideline9 = guideline9;
    this.nScrollLogin = nScrollLogin;
    this.tlLoginPassword = tlLoginPassword;
    this.tvLogin = tvLogin;
    this.tvLoginEmail = tvLoginEmail;
    this.tvLoginForgotPass = tvLoginForgotPass;
    this.tvLoginPassword = tvLoginPassword;
    this.tvLoginWantSignup = tvLoginWantSignup;
  }

  public abstract void setVm(@Nullable LoginVM vm);

  @Nullable
  public LoginVM getVm() {
    return mVm;
  }

  @NonNull
  public static LoginFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.login_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LoginFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LoginFragmentBinding>inflateInternal(inflater, R.layout.login_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static LoginFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.login_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LoginFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LoginFragmentBinding>inflateInternal(inflater, R.layout.login_fragment, null, false, component);
  }

  public static LoginFragmentBinding bind(@NonNull View view) {
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
  public static LoginFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (LoginFragmentBinding)bind(component, view, R.layout.login_fragment);
  }
}