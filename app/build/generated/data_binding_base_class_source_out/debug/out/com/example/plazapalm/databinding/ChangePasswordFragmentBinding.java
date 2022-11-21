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
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import com.example.plazapalm.views.changepass.ChangePassVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ChangePasswordFragmentBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnChangePassword;

  @NonNull
  public final ConstraintLayout clChangePassMain;

  @NonNull
  public final ConstraintLayout clConfirmPass;

  @NonNull
  public final ConstraintLayout clCurrentPass;

  @NonNull
  public final ConstraintLayout clNewPass;

  @NonNull
  public final AppCompatEditText etChangePass;

  @NonNull
  public final AppCompatEditText etConfirmPass;

  @NonNull
  public final AppCompatEditText etNewPass;

  @NonNull
  public final AppCompatImageView ivChangePassword;

  @NonNull
  public final AppCompatTextView tvChangeNewPass;

  @NonNull
  public final AppCompatTextView tvChangePassword;

  @NonNull
  public final AppCompatTextView tvConfirmPass;

  @NonNull
  public final AppCompatTextView tvSettingsChangePassword;

  @Bindable
  protected ChangePassVM mVm;

  protected ChangePasswordFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton btnChangePassword, ConstraintLayout clChangePassMain,
      ConstraintLayout clConfirmPass, ConstraintLayout clCurrentPass, ConstraintLayout clNewPass,
      AppCompatEditText etChangePass, AppCompatEditText etConfirmPass, AppCompatEditText etNewPass,
      AppCompatImageView ivChangePassword, AppCompatTextView tvChangeNewPass,
      AppCompatTextView tvChangePassword, AppCompatTextView tvConfirmPass,
      AppCompatTextView tvSettingsChangePassword) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnChangePassword = btnChangePassword;
    this.clChangePassMain = clChangePassMain;
    this.clConfirmPass = clConfirmPass;
    this.clCurrentPass = clCurrentPass;
    this.clNewPass = clNewPass;
    this.etChangePass = etChangePass;
    this.etConfirmPass = etConfirmPass;
    this.etNewPass = etNewPass;
    this.ivChangePassword = ivChangePassword;
    this.tvChangeNewPass = tvChangeNewPass;
    this.tvChangePassword = tvChangePassword;
    this.tvConfirmPass = tvConfirmPass;
    this.tvSettingsChangePassword = tvSettingsChangePassword;
  }

  public abstract void setVm(@Nullable ChangePassVM vm);

  @Nullable
  public ChangePassVM getVm() {
    return mVm;
  }

  @NonNull
  public static ChangePasswordFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.change_password_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ChangePasswordFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ChangePasswordFragmentBinding>inflateInternal(inflater, R.layout.change_password_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ChangePasswordFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.change_password_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ChangePasswordFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ChangePasswordFragmentBinding>inflateInternal(inflater, R.layout.change_password_fragment, null, false, component);
  }

  public static ChangePasswordFragmentBinding bind(@NonNull View view) {
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
  public static ChangePasswordFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ChangePasswordFragmentBinding)bind(component, view, R.layout.change_password_fragment);
  }
}
