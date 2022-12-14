// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.plazapalm.R;
import com.example.plazapalm.views.favourites.FavouritesVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FavouritesFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final AppCompatImageView ivFavBackBtn;

  @NonNull
  public final TextView listemptyId;

  @NonNull
  public final RecyclerView rvFavourites;

  @NonNull
  public final AppCompatTextView tvFavouritesToolBar;

  @Bindable
  protected FavouritesVM mVm;

  protected FavouritesFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout constraintLayout, AppCompatImageView ivFavBackBtn, TextView listemptyId,
      RecyclerView rvFavourites, AppCompatTextView tvFavouritesToolBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.constraintLayout = constraintLayout;
    this.ivFavBackBtn = ivFavBackBtn;
    this.listemptyId = listemptyId;
    this.rvFavourites = rvFavourites;
    this.tvFavouritesToolBar = tvFavouritesToolBar;
  }

  public abstract void setVm(@Nullable FavouritesVM vm);

  @Nullable
  public FavouritesVM getVm() {
    return mVm;
  }

  @NonNull
  public static FavouritesFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.favourites_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FavouritesFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FavouritesFragmentBinding>inflateInternal(inflater, R.layout.favourites_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static FavouritesFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.favourites_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FavouritesFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FavouritesFragmentBinding>inflateInternal(inflater, R.layout.favourites_fragment, null, false, component);
  }

  public static FavouritesFragmentBinding bind(@NonNull View view) {
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
  public static FavouritesFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (FavouritesFragmentBinding)bind(component, view, R.layout.favourites_fragment);
  }
}
