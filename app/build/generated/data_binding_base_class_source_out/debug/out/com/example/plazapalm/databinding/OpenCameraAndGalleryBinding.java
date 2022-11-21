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
import com.example.plazapalm.views.addphotos.AddPhotosVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class OpenCameraAndGalleryBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView tvCancelBtn;

  @NonNull
  public final AppCompatTextView tvChooseOptionTitle;

  @NonNull
  public final AppCompatTextView tvTakePhotoBtn;

  @NonNull
  public final AppCompatTextView tvTakePhotoGalleryBtn;

  @NonNull
  public final View vCancel;

  @NonNull
  public final View vChooseOption;

  @NonNull
  public final View vChoosePhoto;

  @Bindable
  protected AddPhotosVM mVm;

  protected OpenCameraAndGalleryBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatTextView tvCancelBtn, AppCompatTextView tvChooseOptionTitle,
      AppCompatTextView tvTakePhotoBtn, AppCompatTextView tvTakePhotoGalleryBtn, View vCancel,
      View vChooseOption, View vChoosePhoto) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvCancelBtn = tvCancelBtn;
    this.tvChooseOptionTitle = tvChooseOptionTitle;
    this.tvTakePhotoBtn = tvTakePhotoBtn;
    this.tvTakePhotoGalleryBtn = tvTakePhotoGalleryBtn;
    this.vCancel = vCancel;
    this.vChooseOption = vChooseOption;
    this.vChoosePhoto = vChoosePhoto;
  }

  public abstract void setVm(@Nullable AddPhotosVM vm);

  @Nullable
  public AddPhotosVM getVm() {
    return mVm;
  }

  @NonNull
  public static OpenCameraAndGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.open_camera_and_gallery, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static OpenCameraAndGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<OpenCameraAndGalleryBinding>inflateInternal(inflater, R.layout.open_camera_and_gallery, root, attachToRoot, component);
  }

  @NonNull
  public static OpenCameraAndGalleryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.open_camera_and_gallery, null, false, component)
   */
  @NonNull
  @Deprecated
  public static OpenCameraAndGalleryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<OpenCameraAndGalleryBinding>inflateInternal(inflater, R.layout.open_camera_and_gallery, null, false, component);
  }

  public static OpenCameraAndGalleryBinding bind(@NonNull View view) {
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
  public static OpenCameraAndGalleryBinding bind(@NonNull View view, @Nullable Object component) {
    return (OpenCameraAndGalleryBinding)bind(component, view, R.layout.open_camera_and_gallery);
  }
}
