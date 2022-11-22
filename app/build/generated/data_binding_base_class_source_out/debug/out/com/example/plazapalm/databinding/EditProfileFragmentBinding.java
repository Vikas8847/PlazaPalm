// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import com.example.plazapalm.views.editprofile.EditProfileVM;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class EditProfileFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clEditLastName;

  @NonNull
  public final ConstraintLayout clEditProfile;

  @NonNull
  public final ConstraintLayout clEditProfileCircular;

  @NonNull
  public final ConstraintLayout clEditProfileMain;

  @NonNull
  public final Guideline gLineEditProfile;

  @NonNull
  public final Guideline gLineEditProfileJi;

  @NonNull
  public final CircleImageView ivEditProfile;

  @NonNull
  public final AppCompatImageView ivEditProfileBackBtn;

  @NonNull
  public final AppCompatImageView ivEditProfileCamera;

  @NonNull
  public final AppCompatImageView ivEditSettingBtn;

  @NonNull
  public final AppCompatButton tvBtnUpdateProfile;

  @NonNull
  public final AppCompatTextView tvEditFirstName;

  @NonNull
  public final AppCompatTextView tvEditLastName;

  @NonNull
  public final AppCompatTextView tvEditProfile;

  @Bindable
  protected EditProfileVM mVm;

  protected EditProfileFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clEditLastName, ConstraintLayout clEditProfile,
      ConstraintLayout clEditProfileCircular, ConstraintLayout clEditProfileMain,
      Guideline gLineEditProfile, Guideline gLineEditProfileJi, CircleImageView ivEditProfile,
      AppCompatImageView ivEditProfileBackBtn, AppCompatImageView ivEditProfileCamera,
      AppCompatImageView ivEditSettingBtn, AppCompatButton tvBtnUpdateProfile,
      AppCompatTextView tvEditFirstName, AppCompatTextView tvEditLastName,
      AppCompatTextView tvEditProfile) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clEditLastName = clEditLastName;
    this.clEditProfile = clEditProfile;
    this.clEditProfileCircular = clEditProfileCircular;
    this.clEditProfileMain = clEditProfileMain;
    this.gLineEditProfile = gLineEditProfile;
    this.gLineEditProfileJi = gLineEditProfileJi;
    this.ivEditProfile = ivEditProfile;
    this.ivEditProfileBackBtn = ivEditProfileBackBtn;
    this.ivEditProfileCamera = ivEditProfileCamera;
    this.ivEditSettingBtn = ivEditSettingBtn;
    this.tvBtnUpdateProfile = tvBtnUpdateProfile;
    this.tvEditFirstName = tvEditFirstName;
    this.tvEditLastName = tvEditLastName;
    this.tvEditProfile = tvEditProfile;
  }

  public abstract void setVm(@Nullable EditProfileVM vm);

  @Nullable
  public EditProfileVM getVm() {
    return mVm;
  }

  @NonNull
  public static EditProfileFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.edit_profile_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EditProfileFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EditProfileFragmentBinding>inflateInternal(inflater, R.layout.edit_profile_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static EditProfileFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.edit_profile_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EditProfileFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EditProfileFragmentBinding>inflateInternal(inflater, R.layout.edit_profile_fragment, null, false, component);
  }

  public static EditProfileFragmentBinding bind(@NonNull View view) {
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
  public static EditProfileFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (EditProfileFragmentBinding)bind(component, view, R.layout.edit_profile_fragment);
  }
}
