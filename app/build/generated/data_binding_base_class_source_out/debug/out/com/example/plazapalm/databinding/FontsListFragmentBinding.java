// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.plazapalm.R;
import com.example.plazapalm.views.advancesettings.editfontpage.EditFrontPageVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FontsListFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clChooseFont;

  @NonNull
  public final ConstraintLayout clRvFontLists;

  @NonNull
  public final AppCompatTextView etChooseFont;

  @NonNull
  public final View myview;

  @NonNull
  public final RecyclerView rvChooseFontRecent;

  @NonNull
  public final RecyclerView rvChooseFonts;

  @NonNull
  public final AppCompatTextView tvChooseFont;

  @NonNull
  public final AppCompatTextView tvChooseFontCancel;

  @NonNull
  public final AppCompatTextView tvChooseFontsRecent;

  @Bindable
  protected EditFrontPageVM mModel;

  protected FontsListFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clChooseFont, ConstraintLayout clRvFontLists, AppCompatTextView etChooseFont,
      View myview, RecyclerView rvChooseFontRecent, RecyclerView rvChooseFonts,
      AppCompatTextView tvChooseFont, AppCompatTextView tvChooseFontCancel,
      AppCompatTextView tvChooseFontsRecent) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clChooseFont = clChooseFont;
    this.clRvFontLists = clRvFontLists;
    this.etChooseFont = etChooseFont;
    this.myview = myview;
    this.rvChooseFontRecent = rvChooseFontRecent;
    this.rvChooseFonts = rvChooseFonts;
    this.tvChooseFont = tvChooseFont;
    this.tvChooseFontCancel = tvChooseFontCancel;
    this.tvChooseFontsRecent = tvChooseFontsRecent;
  }

  public abstract void setModel(@Nullable EditFrontPageVM model);

  @Nullable
  public EditFrontPageVM getModel() {
    return mModel;
  }

  @NonNull
  public static FontsListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fonts_list_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FontsListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FontsListFragmentBinding>inflateInternal(inflater, R.layout.fonts_list_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static FontsListFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fonts_list_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FontsListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FontsListFragmentBinding>inflateInternal(inflater, R.layout.fonts_list_fragment, null, false, component);
  }

  public static FontsListFragmentBinding bind(@NonNull View view) {
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
  public static FontsListFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (FontsListFragmentBinding)bind(component, view, R.layout.fonts_list_fragment);
  }
}
