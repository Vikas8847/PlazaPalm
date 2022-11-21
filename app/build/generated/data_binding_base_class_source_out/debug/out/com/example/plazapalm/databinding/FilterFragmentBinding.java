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
import androidx.recyclerview.widget.RecyclerView;
import com.example.plazapalm.R;
import com.example.plazapalm.views.filter.FilterFragmentVM;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.slider.Slider;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FilterFragmentBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnReportSubmit;

  @NonNull
  public final ConstraintLayout clFilterSecond;

  @NonNull
  public final AppCompatImageView ivFilterBackButton;

  @NonNull
  public final RecyclerView rvFilterCategory;

  @NonNull
  public final Slider sliderFilter;

  @NonNull
  public final MaterialToolbar tbFilter;

  @NonNull
  public final AppCompatTextView tvFilterAddCategories;

  @NonNull
  public final AppCompatTextView tvFilterCategories;

  @NonNull
  public final AppCompatTextView tvFilterLocation;

  @NonNull
  public final AppCompatTextView tvFilterLocationDescription;

  @NonNull
  public final AppCompatTextView tvFilterMiles;

  @NonNull
  public final AppCompatTextView tvFilterMilesValue;

  @NonNull
  public final AppCompatTextView tvToolBarFilter;

  @NonNull
  public final View vFilterSlider;

  @NonNull
  public final View viewFilterCategory;

  @NonNull
  public final View viewFilterLocation;

  @Bindable
  protected FilterFragmentVM mVm;

  protected FilterFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnReportSubmit, ConstraintLayout clFilterSecond,
      AppCompatImageView ivFilterBackButton, RecyclerView rvFilterCategory, Slider sliderFilter,
      MaterialToolbar tbFilter, AppCompatTextView tvFilterAddCategories,
      AppCompatTextView tvFilterCategories, AppCompatTextView tvFilterLocation,
      AppCompatTextView tvFilterLocationDescription, AppCompatTextView tvFilterMiles,
      AppCompatTextView tvFilterMilesValue, AppCompatTextView tvToolBarFilter, View vFilterSlider,
      View viewFilterCategory, View viewFilterLocation) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnReportSubmit = btnReportSubmit;
    this.clFilterSecond = clFilterSecond;
    this.ivFilterBackButton = ivFilterBackButton;
    this.rvFilterCategory = rvFilterCategory;
    this.sliderFilter = sliderFilter;
    this.tbFilter = tbFilter;
    this.tvFilterAddCategories = tvFilterAddCategories;
    this.tvFilterCategories = tvFilterCategories;
    this.tvFilterLocation = tvFilterLocation;
    this.tvFilterLocationDescription = tvFilterLocationDescription;
    this.tvFilterMiles = tvFilterMiles;
    this.tvFilterMilesValue = tvFilterMilesValue;
    this.tvToolBarFilter = tvToolBarFilter;
    this.vFilterSlider = vFilterSlider;
    this.viewFilterCategory = viewFilterCategory;
    this.viewFilterLocation = viewFilterLocation;
  }

  public abstract void setVm(@Nullable FilterFragmentVM vm);

  @Nullable
  public FilterFragmentVM getVm() {
    return mVm;
  }

  @NonNull
  public static FilterFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.filter_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FilterFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FilterFragmentBinding>inflateInternal(inflater, R.layout.filter_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static FilterFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.filter_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FilterFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FilterFragmentBinding>inflateInternal(inflater, R.layout.filter_fragment, null, false, component);
  }

  public static FilterFragmentBinding bind(@NonNull View view) {
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
  public static FilterFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (FilterFragmentBinding)bind(component, view, R.layout.filter_fragment);
  }
}
