// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PicturesItemUploadImageVideosBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView tvPicturesUploadCancel;

  @NonNull
  public final AppCompatTextView tvPicturesUploadChooseOptions;

  @NonNull
  public final AppCompatTextView tvUploadImage;

  @NonNull
  public final AppCompatTextView tvUploadVideo;

  @NonNull
  public final View vPicturesChooseOptions;

  @NonNull
  public final View vPicturesUploadImage;

  @NonNull
  public final View vPicturesUploadVideo;

  protected PicturesItemUploadImageVideosBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatTextView tvPicturesUploadCancel,
      AppCompatTextView tvPicturesUploadChooseOptions, AppCompatTextView tvUploadImage,
      AppCompatTextView tvUploadVideo, View vPicturesChooseOptions, View vPicturesUploadImage,
      View vPicturesUploadVideo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvPicturesUploadCancel = tvPicturesUploadCancel;
    this.tvPicturesUploadChooseOptions = tvPicturesUploadChooseOptions;
    this.tvUploadImage = tvUploadImage;
    this.tvUploadVideo = tvUploadVideo;
    this.vPicturesChooseOptions = vPicturesChooseOptions;
    this.vPicturesUploadImage = vPicturesUploadImage;
    this.vPicturesUploadVideo = vPicturesUploadVideo;
  }

  @NonNull
  public static PicturesItemUploadImageVideosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.pictures_item_upload_image_videos, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PicturesItemUploadImageVideosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PicturesItemUploadImageVideosBinding>inflateInternal(inflater, R.layout.pictures_item_upload_image_videos, root, attachToRoot, component);
  }

  @NonNull
  public static PicturesItemUploadImageVideosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.pictures_item_upload_image_videos, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PicturesItemUploadImageVideosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PicturesItemUploadImageVideosBinding>inflateInternal(inflater, R.layout.pictures_item_upload_image_videos, null, false, component);
  }

  public static PicturesItemUploadImageVideosBinding bind(@NonNull View view) {
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
  public static PicturesItemUploadImageVideosBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (PicturesItemUploadImageVideosBinding)bind(component, view, R.layout.pictures_item_upload_image_videos);
  }
}
