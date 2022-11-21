// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import com.example.plazapalm.models.AddPhoto;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AddImagesViewProfileBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView ivUsersImage;

  @NonNull
  public final CircleImageView removeImage;

  @Bindable
  protected AddPhoto mModel;

  protected AddImagesViewProfileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CircleImageView ivUsersImage, CircleImageView removeImage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivUsersImage = ivUsersImage;
    this.removeImage = removeImage;
  }

  public abstract void setModel(@Nullable AddPhoto model);

  @Nullable
  public AddPhoto getModel() {
    return mModel;
  }

  @NonNull
  public static AddImagesViewProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.add_images_view_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AddImagesViewProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AddImagesViewProfileBinding>inflateInternal(inflater, R.layout.add_images_view_profile, root, attachToRoot, component);
  }

  @NonNull
  public static AddImagesViewProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.add_images_view_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AddImagesViewProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AddImagesViewProfileBinding>inflateInternal(inflater, R.layout.add_images_view_profile, null, false, component);
  }

  public static AddImagesViewProfileBinding bind(@NonNull View view) {
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
  public static AddImagesViewProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (AddImagesViewProfileBinding)bind(component, view, R.layout.add_images_view_profile);
  }
}
