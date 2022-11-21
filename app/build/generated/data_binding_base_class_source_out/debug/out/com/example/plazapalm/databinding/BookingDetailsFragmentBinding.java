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
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import com.example.plazapalm.views.bookingdetails.BookingDetailsVM;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BookingDetailsFragmentBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnBookingDetailsCancel;

  @NonNull
  public final ConstraintLayout clBookingDetailsCircular;

  @NonNull
  public final AppCompatImageView ivBookingDetailsBack;

  @NonNull
  public final CircleImageView ivEditBookingDetailsProfile;

  @NonNull
  public final AppCompatImageView ivFavDetailsOptions;

  @NonNull
  public final AppCompatTextView tvBookDetailsDescriptionValue;

  @NonNull
  public final AppCompatTextView tvBookingDetailDate;

  @NonNull
  public final AppCompatTextView tvBookingDetailTime;

  @NonNull
  public final AppCompatTextView tvBookingDetailViewProfile;

  @NonNull
  public final AppCompatTextView tvBookingDetailsDescription;

  @NonNull
  public final AppCompatTextView tvBookingDetailsLocation;

  @NonNull
  public final AppCompatTextView tvBookingDetailsLocationCity;

  @NonNull
  public final AppCompatTextView tvBookingDetailsName;

  @NonNull
  public final AppCompatTextView tvBookingDetailsProfession;

  @NonNull
  public final AppCompatTextView tvBookingStatus;

  @NonNull
  public final AppCompatTextView tvFavDetails;

  @NonNull
  public final View vBookingDetails;

  @Bindable
  protected BookingDetailsVM mVm;

  protected BookingDetailsFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, AppCompatButton btnBookingDetailsCancel,
      ConstraintLayout clBookingDetailsCircular, AppCompatImageView ivBookingDetailsBack,
      CircleImageView ivEditBookingDetailsProfile, AppCompatImageView ivFavDetailsOptions,
      AppCompatTextView tvBookDetailsDescriptionValue, AppCompatTextView tvBookingDetailDate,
      AppCompatTextView tvBookingDetailTime, AppCompatTextView tvBookingDetailViewProfile,
      AppCompatTextView tvBookingDetailsDescription, AppCompatTextView tvBookingDetailsLocation,
      AppCompatTextView tvBookingDetailsLocationCity, AppCompatTextView tvBookingDetailsName,
      AppCompatTextView tvBookingDetailsProfession, AppCompatTextView tvBookingStatus,
      AppCompatTextView tvFavDetails, View vBookingDetails) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnBookingDetailsCancel = btnBookingDetailsCancel;
    this.clBookingDetailsCircular = clBookingDetailsCircular;
    this.ivBookingDetailsBack = ivBookingDetailsBack;
    this.ivEditBookingDetailsProfile = ivEditBookingDetailsProfile;
    this.ivFavDetailsOptions = ivFavDetailsOptions;
    this.tvBookDetailsDescriptionValue = tvBookDetailsDescriptionValue;
    this.tvBookingDetailDate = tvBookingDetailDate;
    this.tvBookingDetailTime = tvBookingDetailTime;
    this.tvBookingDetailViewProfile = tvBookingDetailViewProfile;
    this.tvBookingDetailsDescription = tvBookingDetailsDescription;
    this.tvBookingDetailsLocation = tvBookingDetailsLocation;
    this.tvBookingDetailsLocationCity = tvBookingDetailsLocationCity;
    this.tvBookingDetailsName = tvBookingDetailsName;
    this.tvBookingDetailsProfession = tvBookingDetailsProfession;
    this.tvBookingStatus = tvBookingStatus;
    this.tvFavDetails = tvFavDetails;
    this.vBookingDetails = vBookingDetails;
  }

  public abstract void setVm(@Nullable BookingDetailsVM vm);

  @Nullable
  public BookingDetailsVM getVm() {
    return mVm;
  }

  @NonNull
  public static BookingDetailsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.booking_details_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BookingDetailsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BookingDetailsFragmentBinding>inflateInternal(inflater, R.layout.booking_details_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static BookingDetailsFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.booking_details_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BookingDetailsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BookingDetailsFragmentBinding>inflateInternal(inflater, R.layout.booking_details_fragment, null, false, component);
  }

  public static BookingDetailsFragmentBinding bind(@NonNull View view) {
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
  public static BookingDetailsFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (BookingDetailsFragmentBinding)bind(component, view, R.layout.booking_details_fragment);
  }
}
