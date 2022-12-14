// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.example.plazapalm.views.verifyemailsecond.EmailVerifyVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class EmailVerifyFragmentBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnEmailVerify;

  @NonNull
  public final ConstraintLayout clEmailVerify;

  @NonNull
  public final ConstraintLayout clEmailVerifyMain;

  @NonNull
  public final AppCompatEditText etEmailVerify;

  @NonNull
  public final Guideline gLineEmailVerify;

  @NonNull
  public final NestedScrollView nScrollVerifyEmail;

  @NonNull
  public final AppCompatTextView tvEmailVerify;

  @NonNull
  public final AppCompatTextView tvEmailVerifyDes;

  @NonNull
  public final AppCompatTextView tvEmailVerifyResend;

  @NonNull
  public final AppCompatTextView tvVerifyEmailEnterCode;

  @Bindable
  protected EmailVerifyVM mVm;

  protected EmailVerifyFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnEmailVerify, ConstraintLayout clEmailVerify,
      ConstraintLayout clEmailVerifyMain, AppCompatEditText etEmailVerify,
      Guideline gLineEmailVerify, NestedScrollView nScrollVerifyEmail,
      AppCompatTextView tvEmailVerify, AppCompatTextView tvEmailVerifyDes,
      AppCompatTextView tvEmailVerifyResend, AppCompatTextView tvVerifyEmailEnterCode) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnEmailVerify = btnEmailVerify;
    this.clEmailVerify = clEmailVerify;
    this.clEmailVerifyMain = clEmailVerifyMain;
    this.etEmailVerify = etEmailVerify;
    this.gLineEmailVerify = gLineEmailVerify;
    this.nScrollVerifyEmail = nScrollVerifyEmail;
    this.tvEmailVerify = tvEmailVerify;
    this.tvEmailVerifyDes = tvEmailVerifyDes;
    this.tvEmailVerifyResend = tvEmailVerifyResend;
    this.tvVerifyEmailEnterCode = tvVerifyEmailEnterCode;
  }

  public abstract void setVm(@Nullable EmailVerifyVM vm);

  @Nullable
  public EmailVerifyVM getVm() {
    return mVm;
  }

  @NonNull
  public static EmailVerifyFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.email_verify_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EmailVerifyFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EmailVerifyFragmentBinding>inflateInternal(inflater, R.layout.email_verify_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static EmailVerifyFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.email_verify_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EmailVerifyFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EmailVerifyFragmentBinding>inflateInternal(inflater, R.layout.email_verify_fragment, null, false, component);
  }

  public static EmailVerifyFragmentBinding bind(@NonNull View view) {
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
  public static EmailVerifyFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (EmailVerifyFragmentBinding)bind(component, view, R.layout.email_verify_fragment);
  }
}
