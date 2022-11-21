// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.example.plazapalm.views.chat.ChatVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ChatFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout cLChatMain;

  @NonNull
  public final ConstraintLayout clChatSendMessage;

  @NonNull
  public final AppCompatImageView ivChat;

  @NonNull
  public final AppCompatImageView ivChatOpenBlock;

  @NonNull
  public final RecyclerView rvChats;

  @NonNull
  public final AppCompatTextView tvBlockUserBtn;

  @NonNull
  public final AppCompatTextView tvMessages;

  @Bindable
  protected ChatVM mVm;

  protected ChatFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout cLChatMain, ConstraintLayout clChatSendMessage, AppCompatImageView ivChat,
      AppCompatImageView ivChatOpenBlock, RecyclerView rvChats, AppCompatTextView tvBlockUserBtn,
      AppCompatTextView tvMessages) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cLChatMain = cLChatMain;
    this.clChatSendMessage = clChatSendMessage;
    this.ivChat = ivChat;
    this.ivChatOpenBlock = ivChatOpenBlock;
    this.rvChats = rvChats;
    this.tvBlockUserBtn = tvBlockUserBtn;
    this.tvMessages = tvMessages;
  }

  public abstract void setVm(@Nullable ChatVM vm);

  @Nullable
  public ChatVM getVm() {
    return mVm;
  }

  @NonNull
  public static ChatFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ChatFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ChatFragmentBinding>inflateInternal(inflater, R.layout.chat_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ChatFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ChatFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ChatFragmentBinding>inflateInternal(inflater, R.layout.chat_fragment, null, false, component);
  }

  public static ChatFragmentBinding bind(@NonNull View view) {
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
  public static ChatFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ChatFragmentBinding)bind(component, view, R.layout.chat_fragment);
  }
}
