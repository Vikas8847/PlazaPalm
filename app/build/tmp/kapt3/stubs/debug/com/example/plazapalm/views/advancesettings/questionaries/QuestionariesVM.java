package com.example.plazapalm.views.advancesettings.questionaries;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010D\u001a\u00020E2\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u001eH\u0002J\u0018\u0010H\u001a\u00020E2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020\u0017H\u0002J\u000e\u0010J\u001a\u00020E2\u0006\u0010K\u001a\u00020\u001eJ\u000e\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OJ\u001e\u0010P\u001a\u00020M2\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u001eJ \u0010Q\u001a\u00020M2\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020605j\b\u0012\u0004\u0012\u000206`RH\u0003J\u0016\u0010S\u001a\u00020M2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R(\u0010+\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R\u001a\u0010.\u001a\u00020/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R \u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010;\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010!\"\u0004\b=\u0010#R!\u0010>\u001a\b\u0012\u0004\u0012\u0002060?8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b@\u0010AR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006T"}, d2 = {"Lcom/example/plazapalm/views/advancesettings/questionaries/QuestionariesVM;", "Landroidx/lifecycle/ViewModel;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "(Lcom/example/plazapalm/datastore/DataStoreUtil;Lcom/example/plazapalm/pref/PreferenceFile;Lcom/example/plazapalm/networkcalls/Repository;)V", "getDataStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "istrue", "Landroidx/databinding/ObservableBoolean;", "getIstrue", "()Landroidx/databinding/ObservableBoolean;", "setIstrue", "(Landroidx/databinding/ObservableBoolean;)V", "noData", "getNoData", "setNoData", "num", "", "getNum", "()I", "setNum", "(I)V", "p_id", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getP_id", "()Landroidx/databinding/ObservableField;", "setP_id", "(Landroidx/databinding/ObservableField;)V", "position", "getPosition", "setPosition", "getPref", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPref", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "q_id", "getQ_id", "setQ_id", "q_no", "Landroidx/databinding/ObservableInt;", "getQ_no", "()Landroidx/databinding/ObservableInt;", "setQ_no", "(Landroidx/databinding/ObservableInt;)V", "questionDataList", "Ljava/util/ArrayList;", "Lcom/example/plazapalm/models/QueData;", "getQuestionDataList", "()Ljava/util/ArrayList;", "setQuestionDataList", "(Ljava/util/ArrayList;)V", "questions", "getQuestions", "setQuestions", "questionsAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "getQuestionsAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "questionsAdapter$delegate", "Lkotlin/Lazy;", "addQuesApi", "Lkotlinx/coroutines/Job;", "addQues", "token", "deleteQuestionAPI", "pos", "getQuestionsListAPI", "p_Id", "onClicks", "", "view", "Landroid/view/View;", "openAddQuestionDialog", "setAdapter", "Lkotlin/collections/ArrayList;", "showSwipeDeleteAccountDialog", "app_debug"})
public final class QuestionariesVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.pref.PreferenceFile pref;
    private com.example.plazapalm.networkcalls.Repository repository;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.QueData> questionDataList;
    private int position = -1;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> p_id;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> q_id;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> questions;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean noData;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableInt q_no;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean istrue;
    private int num = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy questionsAdapter$delegate = null;
    
    @javax.inject.Inject()
    public QuestionariesVM(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile pref, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.datastore.DataStoreUtil getDataStoreUtil() {
        return null;
    }
    
    public final void setDataStoreUtil(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.pref.PreferenceFile getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.QueData> getQuestionDataList() {
        return null;
    }
    
    public final void setQuestionDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.QueData> p0) {
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getP_id() {
        return null;
    }
    
    public final void setP_id(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getQ_id() {
        return null;
    }
    
    public final void setQ_id(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getQuestions() {
        return null;
    }
    
    public final void setQuestions(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getNoData() {
        return null;
    }
    
    public final void setNoData(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableInt getQ_no() {
        return null;
    }
    
    public final void setQ_no(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableInt p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getIstrue() {
        return null;
    }
    
    public final void setIstrue(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    public final int getNum() {
        return 0;
    }
    
    public final void setNum(int p0) {
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.QueData> getQuestionsAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getQuestionsListAPI(@org.jetbrains.annotations.NotNull()
    java.lang.String p_Id) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void setAdapter(java.util.ArrayList<com.example.plazapalm.models.QueData> questionDataList) {
    }
    
    /**
     * Open Add question Alert ...
     */
    public final void openAddQuestionDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String p_id, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository repository, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    private final kotlinx.coroutines.Job addQuesApi(java.lang.String p_id, java.lang.String addQues, com.example.plazapalm.networkcalls.Repository repository, java.lang.String token) {
        return null;
    }
    
    public final void showSwipeDeleteAccountDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String q_id, int pos) {
    }
    
    private final kotlinx.coroutines.Job deleteQuestionAPI(java.lang.String q_id, int pos) {
        return null;
    }
}