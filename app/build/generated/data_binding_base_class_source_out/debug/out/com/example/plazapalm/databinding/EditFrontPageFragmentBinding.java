// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import com.example.plazapalm.views.advancesettings.editfontpage.EditFrontPageVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class EditFrontPageFragmentBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnEditFrontLookAttach;

  @NonNull
  public final AppCompatButton btnEditFrontPageView;

  @NonNull
  public final AppCompatCheckBox checkBottomTextFrontPage;

  @NonNull
  public final AppCompatCheckBox checkEditFrontPageTopText;

  @NonNull
  public final AppCompatImageView ivAdvanceEditFrontPage;

  @NonNull
  public final ConstraintLayout scrollAdvanceEditLook;

  @NonNull
  public final AppCompatTextView tvAdvanceEditFrontPage;

  @NonNull
  public final AppCompatTextView tvAdvanceEditFrontPageFont;

  @NonNull
  public final AppCompatTextView tvAdvanceEditFrontPageFontColor;

  @NonNull
  public final AppCompatTextView tvAdvanceEditFrontPageFontValue;

  @NonNull
  public final View viewBoxLookingBGColor;

  @NonNull
  public final View viewEditBottomTextFrontPage;

  @NonNull
  public final View viewEditFontColor;

  @NonNull
  public final View viewEditFontPage;

  @NonNull
  public final View viewEditTopTextFrontPage;

  @Bindable
  protected EditFrontPageVM mVm;

  protected EditFrontPageFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnEditFrontLookAttach, AppCompatButton btnEditFrontPageView,
      AppCompatCheckBox checkBottomTextFrontPage, AppCompatCheckBox checkEditFrontPageTopText,
      AppCompatImageView ivAdvanceEditFrontPage, ConstraintLayout scrollAdvanceEditLook,
      AppCompatTextView tvAdvanceEditFrontPage, AppCompatTextView tvAdvanceEditFrontPageFont,
      AppCompatTextView tvAdvanceEditFrontPageFontColor,
      AppCompatTextView tvAdvanceEditFrontPageFontValue, View viewBoxLookingBGColor,
      View viewEditBottomTextFrontPage, View viewEditFontColor, View viewEditFontPage,
      View viewEditTopTextFrontPage) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnEditFrontLookAttach = btnEditFrontLookAttach;
    this.btnEditFrontPageView = btnEditFrontPageView;
    this.checkBottomTextFrontPage = checkBottomTextFrontPage;
    this.checkEditFrontPageTopText = checkEditFrontPageTopText;
    this.ivAdvanceEditFrontPage = ivAdvanceEditFrontPage;
    this.scrollAdvanceEditLook = scrollAdvanceEditLook;
    this.tvAdvanceEditFrontPage = tvAdvanceEditFrontPage;
    this.tvAdvanceEditFrontPageFont = tvAdvanceEditFrontPageFont;
    this.tvAdvanceEditFrontPageFontColor = tvAdvanceEditFrontPageFontColor;
    this.tvAdvanceEditFrontPageFontValue = tvAdvanceEditFrontPageFontValue;
    this.viewBoxLookingBGColor = viewBoxLookingBGColor;
    this.viewEditBottomTextFrontPage = viewEditBottomTextFrontPage;
    this.viewEditFontColor = viewEditFontColor;
    this.viewEditFontPage = viewEditFontPage;
    this.viewEditTopTextFrontPage = viewEditTopTextFrontPage;
  }

  public abstract void setVm(@Nullable EditFrontPageVM vm);

  @Nullable
  public EditFrontPageVM getVm() {
    return mVm;
  }

  @NonNull
  public static EditFrontPageFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.edit_front_page_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static EditFrontPageFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<EditFrontPageFragmentBinding>inflateInternal(inflater, R.layout.edit_front_page_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static EditFrontPageFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.edit_front_page_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static EditFrontPageFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<EditFrontPageFragmentBinding>inflateInternal(inflater, R.layout.edit_front_page_fragment, null, false, component);
  }

  public static EditFrontPageFragmentBinding bind(@NonNull View view) {
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
  public static EditFrontPageFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (EditFrontPageFragmentBinding)bind(component, view, R.layout.edit_front_page_fragment);
  }
}