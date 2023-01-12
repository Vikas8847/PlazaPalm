// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.plazapalm.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ChatReceiverBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clReceiver;

  @NonNull
  public final TextView tvReceiver;

  @NonNull
  public final TextView tvReceiverDay;

  protected ChatReceiverBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clReceiver, TextView tvReceiver, TextView tvReceiverDay) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clReceiver = clReceiver;
    this.tvReceiver = tvReceiver;
    this.tvReceiverDay = tvReceiverDay;
  }

  @NonNull
  public static ChatReceiverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_receiver, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ChatReceiverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ChatReceiverBinding>inflateInternal(inflater, R.layout.chat_receiver, root, attachToRoot, component);
  }

  @NonNull
  public static ChatReceiverBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_receiver, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ChatReceiverBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ChatReceiverBinding>inflateInternal(inflater, R.layout.chat_receiver, null, false, component);
  }

  public static ChatReceiverBinding bind(@NonNull View view) {
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
  public static ChatReceiverBinding bind(@NonNull View view, @Nullable Object component) {
    return (ChatReceiverBinding)bind(component, view, R.layout.chat_receiver);
  }
}