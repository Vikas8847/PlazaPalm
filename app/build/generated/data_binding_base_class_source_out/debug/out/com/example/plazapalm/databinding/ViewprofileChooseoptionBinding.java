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
import com.example.plazapalm.views.favourites.favdetails.FavDetailsVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ViewprofileChooseoptionBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatTextView tvChooseOptAddToCalFavDetails;

  @NonNull
  public final AppCompatTextView tvChooseOptFavDetails;

  @NonNull
  public final AppCompatTextView tvChooseOptRemoveFavDetails;

  @NonNull
  public final AppCompatTextView tvDeleteProfile;

  @NonNull
  public final AppCompatTextView tvEditProfile;

  @NonNull
  public final AppCompatTextView tvFavDetailsCancel;

  @NonNull
  public final View vChooseOptCancel;

  @NonNull
  public final View vChooseOptEditProfile;

  @NonNull
  public final View vChooseOption;

  @NonNull
  public final View vFavChooseCancel;

  @NonNull
  public final View vFavChooseReport;

  @Bindable
  protected FavDetailsVM mVm;

  protected ViewprofileChooseoptionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatTextView tvChooseOptAddToCalFavDetails,
      AppCompatTextView tvChooseOptFavDetails, AppCompatTextView tvChooseOptRemoveFavDetails,
      AppCompatTextView tvDeleteProfile, AppCompatTextView tvEditProfile,
      AppCompatTextView tvFavDetailsCancel, View vChooseOptCancel, View vChooseOptEditProfile,
      View vChooseOption, View vFavChooseCancel, View vFavChooseReport) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tvChooseOptAddToCalFavDetails = tvChooseOptAddToCalFavDetails;
    this.tvChooseOptFavDetails = tvChooseOptFavDetails;
    this.tvChooseOptRemoveFavDetails = tvChooseOptRemoveFavDetails;
    this.tvDeleteProfile = tvDeleteProfile;
    this.tvEditProfile = tvEditProfile;
    this.tvFavDetailsCancel = tvFavDetailsCancel;
    this.vChooseOptCancel = vChooseOptCancel;
    this.vChooseOptEditProfile = vChooseOptEditProfile;
    this.vChooseOption = vChooseOption;
    this.vFavChooseCancel = vFavChooseCancel;
    this.vFavChooseReport = vFavChooseReport;
  }

  public abstract void setVm(@Nullable FavDetailsVM vm);

  @Nullable
  public FavDetailsVM getVm() {
    return mVm;
  }

  @NonNull
  public static ViewprofileChooseoptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.viewprofile_chooseoption, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ViewprofileChooseoptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ViewprofileChooseoptionBinding>inflateInternal(inflater, R.layout.viewprofile_chooseoption, root, attachToRoot, component);
  }

  @NonNull
  public static ViewprofileChooseoptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.viewprofile_chooseoption, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ViewprofileChooseoptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ViewprofileChooseoptionBinding>inflateInternal(inflater, R.layout.viewprofile_chooseoption, null, false, component);
  }

  public static ViewprofileChooseoptionBinding bind(@NonNull View view) {
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
  public static ViewprofileChooseoptionBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ViewprofileChooseoptionBinding)bind(component, view, R.layout.viewprofile_chooseoption);
  }
}
