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
import com.example.plazapalm.views.editprofile.EditProfileVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class CameraAndGalleryEditProfileBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView tvChooseOptionTitle;

  @NonNull
  public final AppCompatTextView tvEditProfileCamera;

  @NonNull
  public final AppCompatTextView tvEditProfileCancel;

  @NonNull
  public final AppCompatTextView tvEditProfileGallery;

  @NonNull
  public final View vCancel;

  @NonNull
  public final View vEditProfileChooseOption;

  @NonNull
  public final View vEditProfileGallery;

  @Bindable
  protected EditProfileVM mVm;

  protected CameraAndGalleryEditProfileBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatTextView tvChooseOptionTitle,
      AppCompatTextView tvEditProfileCamera, AppCompatTextView tvEditProfileCancel,
      AppCompatTextView tvEditProfileGallery, View vCancel, View vEditProfileChooseOption,
      View vEditProfileGallery) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvChooseOptionTitle = tvChooseOptionTitle;
    this.tvEditProfileCamera = tvEditProfileCamera;
    this.tvEditProfileCancel = tvEditProfileCancel;
    this.tvEditProfileGallery = tvEditProfileGallery;
    this.vCancel = vCancel;
    this.vEditProfileChooseOption = vEditProfileChooseOption;
    this.vEditProfileGallery = vEditProfileGallery;
  }

  public abstract void setVm(@Nullable EditProfileVM vm);

  @Nullable
  public EditProfileVM getVm() {
    return mVm;
  }

  @NonNull
  public static CameraAndGalleryEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.camera_and_gallery_edit_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static CameraAndGalleryEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<CameraAndGalleryEditProfileBinding>inflateInternal(inflater, R.layout.camera_and_gallery_edit_profile, root, attachToRoot, component);
  }

  @NonNull
  public static CameraAndGalleryEditProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.camera_and_gallery_edit_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static CameraAndGalleryEditProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<CameraAndGalleryEditProfileBinding>inflateInternal(inflater, R.layout.camera_and_gallery_edit_profile, null, false, component);
  }

  public static CameraAndGalleryEditProfileBinding bind(@NonNull View view) {
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
  public static CameraAndGalleryEditProfileBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (CameraAndGalleryEditProfileBinding)bind(component, view, R.layout.camera_and_gallery_edit_profile);
  }
}
