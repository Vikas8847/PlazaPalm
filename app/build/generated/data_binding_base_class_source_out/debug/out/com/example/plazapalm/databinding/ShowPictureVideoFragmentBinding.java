// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import com.example.plazapalm.views.advancesettings.pictures.ShowPictureVideoVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ShowPictureVideoFragmentBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView ivPlayBtn;

  @NonNull
  public final AppCompatTextView tvClose;

  @NonNull
  public final VideoView vPlayer;

  @Bindable
  protected ShowPictureVideoVM mVm;

  protected ShowPictureVideoFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView ivPlayBtn, AppCompatTextView tvClose,
      VideoView vPlayer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivPlayBtn = ivPlayBtn;
    this.tvClose = tvClose;
    this.vPlayer = vPlayer;
  }

  public abstract void setVm(@Nullable ShowPictureVideoVM vm);

  @Nullable
  public ShowPictureVideoVM getVm() {
    return mVm;
  }

  @NonNull
  public static ShowPictureVideoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.show_picture_video_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ShowPictureVideoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ShowPictureVideoFragmentBinding>inflateInternal(inflater, R.layout.show_picture_video_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ShowPictureVideoFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.show_picture_video_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ShowPictureVideoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ShowPictureVideoFragmentBinding>inflateInternal(inflater, R.layout.show_picture_video_fragment, null, false, component);
  }

  public static ShowPictureVideoFragmentBinding bind(@NonNull View view) {
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
  public static ShowPictureVideoFragmentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ShowPictureVideoFragmentBinding)bind(component, view, R.layout.show_picture_video_fragment);
  }
}
