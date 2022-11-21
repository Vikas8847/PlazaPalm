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
import com.budiyev.android.codescanner.CodeScannerView;
import com.example.plazapalm.R;
import com.example.plazapalm.views.myprofile.qrcodescanner.QrCodeScannerVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class QrCodeScannerFragmentBinding extends ViewDataBinding {
  @NonNull
  public final CodeScannerView scannerView;

  @Bindable
  protected QrCodeScannerVM mVm;

  protected QrCodeScannerFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CodeScannerView scannerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.scannerView = scannerView;
  }

  public abstract void setVm(@Nullable QrCodeScannerVM vm);

  @Nullable
  public QrCodeScannerVM getVm() {
    return mVm;
  }

  @NonNull
  public static QrCodeScannerFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.qr_code_scanner_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static QrCodeScannerFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<QrCodeScannerFragmentBinding>inflateInternal(inflater, R.layout.qr_code_scanner_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static QrCodeScannerFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.qr_code_scanner_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static QrCodeScannerFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<QrCodeScannerFragmentBinding>inflateInternal(inflater, R.layout.qr_code_scanner_fragment, null, false, component);
  }

  public static QrCodeScannerFragmentBinding bind(@NonNull View view) {
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
  public static QrCodeScannerFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (QrCodeScannerFragmentBinding)bind(component, view, R.layout.qr_code_scanner_fragment);
  }
}
