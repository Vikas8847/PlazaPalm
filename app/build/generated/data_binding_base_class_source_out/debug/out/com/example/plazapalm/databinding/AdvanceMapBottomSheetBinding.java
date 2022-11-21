// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import com.example.plazapalm.views.advancesettings.map.AdvanceMapVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdvanceMapBottomSheetBinding extends ViewDataBinding {
  @NonNull
  public final SwitchCompat switchAdvanceMap;

  @NonNull
  public final SwitchCompat switchMapDummy;

  @NonNull
  public final SwitchCompat switchMapFollow;

  @NonNull
  public final SwitchCompat switchMapLocationOnOff;

  @NonNull
  public final AppCompatTextView tvAdvanceMapDummy;

  @NonNull
  public final AppCompatTextView tvAdvanceMapFollow;

  @NonNull
  public final AppCompatTextView tvMapDarkTheme;

  @NonNull
  public final AppCompatTextView tvMapLocationOnOff;

  @NonNull
  public final View vAdvanceMapDarkTheme;

  @NonNull
  public final View vAdvanceMapFollow;

  @NonNull
  public final View vAdvanceMapLocationOnOff;

  @Bindable
  protected AdvanceMapVM mVm;

  protected AdvanceMapBottomSheetBinding(Object _bindingComponent, View _root, int _localFieldCount,
      SwitchCompat switchAdvanceMap, SwitchCompat switchMapDummy, SwitchCompat switchMapFollow,
      SwitchCompat switchMapLocationOnOff, AppCompatTextView tvAdvanceMapDummy,
      AppCompatTextView tvAdvanceMapFollow, AppCompatTextView tvMapDarkTheme,
      AppCompatTextView tvMapLocationOnOff, View vAdvanceMapDarkTheme, View vAdvanceMapFollow,
      View vAdvanceMapLocationOnOff) {
    super(_bindingComponent, _root, _localFieldCount);
    this.switchAdvanceMap = switchAdvanceMap;
    this.switchMapDummy = switchMapDummy;
    this.switchMapFollow = switchMapFollow;
    this.switchMapLocationOnOff = switchMapLocationOnOff;
    this.tvAdvanceMapDummy = tvAdvanceMapDummy;
    this.tvAdvanceMapFollow = tvAdvanceMapFollow;
    this.tvMapDarkTheme = tvMapDarkTheme;
    this.tvMapLocationOnOff = tvMapLocationOnOff;
    this.vAdvanceMapDarkTheme = vAdvanceMapDarkTheme;
    this.vAdvanceMapFollow = vAdvanceMapFollow;
    this.vAdvanceMapLocationOnOff = vAdvanceMapLocationOnOff;
  }

  public abstract void setVm(@Nullable AdvanceMapVM vm);

  @Nullable
  public AdvanceMapVM getVm() {
    return mVm;
  }

  @NonNull
  public static AdvanceMapBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.advance_map_bottom_sheet, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdvanceMapBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdvanceMapBottomSheetBinding>inflateInternal(inflater, R.layout.advance_map_bottom_sheet, root, attachToRoot, component);
  }

  @NonNull
  public static AdvanceMapBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.advance_map_bottom_sheet, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdvanceMapBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdvanceMapBottomSheetBinding>inflateInternal(inflater, R.layout.advance_map_bottom_sheet, null, false, component);
  }

  public static AdvanceMapBottomSheetBinding bind(@NonNull View view) {
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
  public static AdvanceMapBottomSheetBinding bind(@NonNull View view, @Nullable Object component) {
    return (AdvanceMapBottomSheetBinding)bind(component, view, R.layout.advance_map_bottom_sheet);
  }
}
