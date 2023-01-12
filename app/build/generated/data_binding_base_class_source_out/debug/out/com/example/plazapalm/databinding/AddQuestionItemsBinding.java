// Generated by data binding compiler. Do not edit!
package com.example.plazapalm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.apachat.swipereveallayout.core.SwipeLayout;
import com.example.plazapalm.R;
import com.example.plazapalm.models.GetQueData;
import com.example.plazapalm.models.QueData;
import com.example.plazapalm.views.advancesettings.questionaries.QuestionariesVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AddQuestionItemsBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout deletereturn;

  @NonNull
  public final SwipeLayout slDeleteQuestions;

  @NonNull
  public final AppCompatTextView tvQuestionCounts;

  @NonNull
  public final AppCompatTextView tvQuestionValue;

  @NonNull
  public final View vAddQuestion;

  @Bindable
  protected QueData mModel;

  @Bindable
  protected GetQueData mGetmodel;

  @Bindable
  protected QuestionariesVM mVmi;

  protected AddQuestionItemsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout deletereturn, SwipeLayout slDeleteQuestions, AppCompatTextView tvQuestionCounts,
      AppCompatTextView tvQuestionValue, View vAddQuestion) {
    super(_bindingComponent, _root, _localFieldCount);
    this.deletereturn = deletereturn;
    this.slDeleteQuestions = slDeleteQuestions;
    this.tvQuestionCounts = tvQuestionCounts;
    this.tvQuestionValue = tvQuestionValue;
    this.vAddQuestion = vAddQuestion;
  }

  public abstract void setModel(@Nullable QueData model);

  @Nullable
  public QueData getModel() {
    return mModel;
  }

  public abstract void setGetmodel(@Nullable GetQueData getmodel);

  @Nullable
  public GetQueData getGetmodel() {
    return mGetmodel;
  }

  public abstract void setVmi(@Nullable QuestionariesVM vmi);

  @Nullable
  public QuestionariesVM getVmi() {
    return mVmi;
  }

  @NonNull
  public static AddQuestionItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.add_question_items, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AddQuestionItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AddQuestionItemsBinding>inflateInternal(inflater, R.layout.add_question_items, root, attachToRoot, component);
  }

  @NonNull
  public static AddQuestionItemsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.add_question_items, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AddQuestionItemsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AddQuestionItemsBinding>inflateInternal(inflater, R.layout.add_question_items, null, false, component);
  }

  public static AddQuestionItemsBinding bind(@NonNull View view) {
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
  public static AddQuestionItemsBinding bind(@NonNull View view, @Nullable Object component) {
    return (AddQuestionItemsBinding)bind(component, view, R.layout.add_question_items);
  }
}