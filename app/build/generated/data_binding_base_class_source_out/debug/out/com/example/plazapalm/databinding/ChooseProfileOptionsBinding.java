// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import com.example.plazapalm.views.myprofile.postprofile.PostProfileVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ChooseProfileOptionsBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView tvChooseOptCancel;

  @NonNull
  public final AppCompatTextView tvChooseOptDeleteProfile;

  @NonNull
  public final AppCompatTextView tvChooseOptEditProfile;

  @NonNull
  public final AppCompatTextView tvChooseOptionTitle;

  @NonNull
  public final View vChooseOptCancel;

  @NonNull
  public final View vChooseOptEditProfile;

  @NonNull
  public final View vChooseOption;

  @Bindable
  protected PostProfileVM mVm;

  protected ChooseProfileOptionsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView tvChooseOptCancel, AppCompatTextView tvChooseOptDeleteProfile,
      AppCompatTextView tvChooseOptEditProfile, AppCompatTextView tvChooseOptionTitle,
      View vChooseOptCancel, View vChooseOptEditProfile, View vChooseOption) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvChooseOptCancel = tvChooseOptCancel;
    this.tvChooseOptDeleteProfile = tvChooseOptDeleteProfile;
    this.tvChooseOptEditProfile = tvChooseOptEditProfile;
    this.tvChooseOptionTitle = tvChooseOptionTitle;
    this.vChooseOptCancel = vChooseOptCancel;
    this.vChooseOptEditProfile = vChooseOptEditProfile;
    this.vChooseOption = vChooseOption;
  }

  public abstract void setVm(@Nullable PostProfileVM vm);

  @Nullable
  public PostProfileVM getVm() {
    return mVm;
  }

  @NonNull
  public static ChooseProfileOptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.choose_profile_options, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ChooseProfileOptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ChooseProfileOptionsBinding>inflateInternal(inflater, R.layout.choose_profile_options, root, attachToRoot, component);
  }

  @NonNull
  public static ChooseProfileOptionsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.choose_profile_options, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ChooseProfileOptionsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ChooseProfileOptionsBinding>inflateInternal(inflater, R.layout.choose_profile_options, null, false, component);
  }

  public static ChooseProfileOptionsBinding bind(@NonNull View view) {
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
  public static ChooseProfileOptionsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ChooseProfileOptionsBinding)bind(component, view, R.layout.choose_profile_options);
  }
}
