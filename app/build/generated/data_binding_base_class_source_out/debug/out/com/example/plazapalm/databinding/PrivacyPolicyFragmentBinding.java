// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import com.example.plazapalm.views.privacypolicy.PrivacyPolicyVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PrivacyPolicyFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clPrivacyPolicyMain;

  @NonNull
  public final AppCompatImageView ivPrivacyPolicyBtn;

  @NonNull
  public final AppCompatTextView tvPrivacyPolicy;

  @Bindable
  protected PrivacyPolicyVM mVm;

  protected PrivacyPolicyFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clPrivacyPolicyMain, AppCompatImageView ivPrivacyPolicyBtn,
      AppCompatTextView tvPrivacyPolicy) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clPrivacyPolicyMain = clPrivacyPolicyMain;
    this.ivPrivacyPolicyBtn = ivPrivacyPolicyBtn;
    this.tvPrivacyPolicy = tvPrivacyPolicy;
  }

  public abstract void setVm(@Nullable PrivacyPolicyVM vm);

  @Nullable
  public PrivacyPolicyVM getVm() {
    return mVm;
  }

  @NonNull
  public static PrivacyPolicyFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.privacy_policy_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PrivacyPolicyFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PrivacyPolicyFragmentBinding>inflateInternal(inflater, R.layout.privacy_policy_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static PrivacyPolicyFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.privacy_policy_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PrivacyPolicyFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PrivacyPolicyFragmentBinding>inflateInternal(inflater, R.layout.privacy_policy_fragment, null, false, component);
  }

  public static PrivacyPolicyFragmentBinding bind(@NonNull View view) {
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
  public static PrivacyPolicyFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (PrivacyPolicyFragmentBinding)bind(component, view, R.layout.privacy_policy_fragment);
  }
}
