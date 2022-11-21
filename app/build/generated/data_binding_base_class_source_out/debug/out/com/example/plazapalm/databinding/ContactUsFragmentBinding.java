// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import com.example.plazapalm.views.contactus.ContactUsVM;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ContactUsFragmentBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnContactUsSave;

  @NonNull
  public final ConstraintLayout clConfirmPass;

  @NonNull
  public final ConstraintLayout clContactUs;

  @NonNull
  public final ConstraintLayout clCurrentPass;

  @NonNull
  public final ConstraintLayout clNewPass;

  @NonNull
  public final AppCompatEditText etContactUsEmail;

  @NonNull
  public final AppCompatEditText etContactUsMessage;

  @NonNull
  public final AppCompatEditText etContactUsSubject;

  @NonNull
  public final MaterialToolbar tbContactUs;

  @NonNull
  public final AppCompatTextView tvAppBarChangePassword;

  @NonNull
  public final AppCompatTextView tvContactUsEmail;

  @NonNull
  public final AppCompatTextView tvContactUsMessage;

  @NonNull
  public final AppCompatTextView tvContactusSubject;

  @Bindable
  protected ContactUsVM mVm;

  protected ContactUsFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnContactUsSave, ConstraintLayout clConfirmPass,
      ConstraintLayout clContactUs, ConstraintLayout clCurrentPass, ConstraintLayout clNewPass,
      AppCompatEditText etContactUsEmail, AppCompatEditText etContactUsMessage,
      AppCompatEditText etContactUsSubject, MaterialToolbar tbContactUs,
      AppCompatTextView tvAppBarChangePassword, AppCompatTextView tvContactUsEmail,
      AppCompatTextView tvContactUsMessage, AppCompatTextView tvContactusSubject) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnContactUsSave = btnContactUsSave;
    this.clConfirmPass = clConfirmPass;
    this.clContactUs = clContactUs;
    this.clCurrentPass = clCurrentPass;
    this.clNewPass = clNewPass;
    this.etContactUsEmail = etContactUsEmail;
    this.etContactUsMessage = etContactUsMessage;
    this.etContactUsSubject = etContactUsSubject;
    this.tbContactUs = tbContactUs;
    this.tvAppBarChangePassword = tvAppBarChangePassword;
    this.tvContactUsEmail = tvContactUsEmail;
    this.tvContactUsMessage = tvContactUsMessage;
    this.tvContactusSubject = tvContactusSubject;
  }

  public abstract void setVm(@Nullable ContactUsVM vm);

  @Nullable
  public ContactUsVM getVm() {
    return mVm;
  }

  @NonNull
  public static ContactUsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.contact_us_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ContactUsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ContactUsFragmentBinding>inflateInternal(inflater, R.layout.contact_us_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ContactUsFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.contact_us_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ContactUsFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ContactUsFragmentBinding>inflateInternal(inflater, R.layout.contact_us_fragment, null, false, component);
  }

  public static ContactUsFragmentBinding bind(@NonNull View view) {
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
  public static ContactUsFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ContactUsFragmentBinding)bind(component, view, R.layout.contact_us_fragment);
  }
}
