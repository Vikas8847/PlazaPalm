// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import com.example.plazapalm.views.verifymail.VerifyEmailVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class VerifyEmailFragmentBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnVerifyEmail;

  @NonNull
  public final ConstraintLayout clVerifyEmailEnterCode;

  @NonNull
  public final ConstraintLayout constMain;

  @NonNull
  public final AppCompatEditText etVerifyEmailEnterCode;

  @NonNull
  public final Guideline gLineVerifyEmail;

  @NonNull
  public final AppCompatImageView ivVerifyEmailBackBtn;

  @NonNull
  public final NestedScrollView nScrollVerifyEmail;

  @NonNull
  public final AppCompatTextView tvVerifyEmail;

  @NonNull
  public final AppCompatTextView tvVerifyEmailDescription;

  @NonNull
  public final AppCompatTextView tvVerifyEmailEnterCode;

  @NonNull
  public final AppCompatTextView tvVerifyEmailResendOtp;

  @Bindable
  protected VerifyEmailVM mVm;

  protected VerifyEmailFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnVerifyEmail, ConstraintLayout clVerifyEmailEnterCode,
      ConstraintLayout constMain, AppCompatEditText etVerifyEmailEnterCode,
      Guideline gLineVerifyEmail, AppCompatImageView ivVerifyEmailBackBtn,
      NestedScrollView nScrollVerifyEmail, AppCompatTextView tvVerifyEmail,
      AppCompatTextView tvVerifyEmailDescription, AppCompatTextView tvVerifyEmailEnterCode,
      AppCompatTextView tvVerifyEmailResendOtp) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnVerifyEmail = btnVerifyEmail;
    this.clVerifyEmailEnterCode = clVerifyEmailEnterCode;
    this.constMain = constMain;
    this.etVerifyEmailEnterCode = etVerifyEmailEnterCode;
    this.gLineVerifyEmail = gLineVerifyEmail;
    this.ivVerifyEmailBackBtn = ivVerifyEmailBackBtn;
    this.nScrollVerifyEmail = nScrollVerifyEmail;
    this.tvVerifyEmail = tvVerifyEmail;
    this.tvVerifyEmailDescription = tvVerifyEmailDescription;
    this.tvVerifyEmailEnterCode = tvVerifyEmailEnterCode;
    this.tvVerifyEmailResendOtp = tvVerifyEmailResendOtp;
  }

  public abstract void setVm(@Nullable VerifyEmailVM vm);

  @Nullable
  public VerifyEmailVM getVm() {
    return mVm;
  }

  @NonNull
  public static VerifyEmailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.verify_email_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VerifyEmailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VerifyEmailFragmentBinding>inflateInternal(inflater, R.layout.verify_email_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static VerifyEmailFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.verify_email_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VerifyEmailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VerifyEmailFragmentBinding>inflateInternal(inflater, R.layout.verify_email_fragment, null, false, component);
  }

  public static VerifyEmailFragmentBinding bind(@NonNull View view) {
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
  public static VerifyEmailFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (VerifyEmailFragmentBinding)bind(component, view, R.layout.verify_email_fragment);
  }
}
