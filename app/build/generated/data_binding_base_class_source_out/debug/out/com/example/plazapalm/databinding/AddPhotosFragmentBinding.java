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
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.plazapalm.R;
import com.example.plazapalm.views.addphotos.AddPhotosVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AddPhotosFragmentBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnAddPhotos;

  @NonNull
  public final AppCompatImageView ivAddPhotosBackBtn;

  @NonNull
  public final RecyclerView rvAddPhotos;

  @NonNull
  public final AppCompatTextView tvAddPhotos;

  @Bindable
  protected AddPhotosVM mVm;

  protected AddPhotosFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnAddPhotos, AppCompatImageView ivAddPhotosBackBtn, RecyclerView rvAddPhotos,
      AppCompatTextView tvAddPhotos) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnAddPhotos = btnAddPhotos;
    this.ivAddPhotosBackBtn = ivAddPhotosBackBtn;
    this.rvAddPhotos = rvAddPhotos;
    this.tvAddPhotos = tvAddPhotos;
  }

  public abstract void setVm(@Nullable AddPhotosVM vm);

  @Nullable
  public AddPhotosVM getVm() {
    return mVm;
  }

  @NonNull
  public static AddPhotosFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.add_photos_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AddPhotosFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AddPhotosFragmentBinding>inflateInternal(inflater, R.layout.add_photos_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static AddPhotosFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.add_photos_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AddPhotosFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AddPhotosFragmentBinding>inflateInternal(inflater, R.layout.add_photos_fragment, null, false, component);
  }

  public static AddPhotosFragmentBinding bind(@NonNull View view) {
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
  public static AddPhotosFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (AddPhotosFragmentBinding)bind(component, view, R.layout.add_photos_fragment);
  }
}
