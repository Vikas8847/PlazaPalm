package com.example.plazapalm.views.advancesettings.questionaries;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020$H\u0016J\u001a\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00100\u001a\u00020$H\u0002J\b\u00101\u001a\u00020$H\u0002J\b\u00102\u001a\u00020$H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u00a8\u00063"}, d2 = {"Lcom/example/plazapalm/views/advancesettings/questionaries/QuestionariesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "SwipeToDeleteAdapter", "Lcom/example/plazapalm/views/advancesettings/questionaries/SwipeToDeleteAdapter;", "getSwipeToDeleteAdapter", "()Lcom/example/plazapalm/views/advancesettings/questionaries/SwipeToDeleteAdapter;", "setSwipeToDeleteAdapter", "(Lcom/example/plazapalm/views/advancesettings/questionaries/SwipeToDeleteAdapter;)V", "binding", "Lcom/example/plazapalm/databinding/QuestionariesFragmentBinding;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "getDataStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "getPref", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPref", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "swipeController", "Lcom/example/plazapalm/swipelayout/SwipeController;", "getSwipeController", "()Lcom/example/plazapalm/swipelayout/SwipeController;", "setSwipeController", "(Lcom/example/plazapalm/swipelayout/SwipeController;)V", "viewModel", "Lcom/example/plazapalm/views/advancesettings/questionaries/QuestionariesVM;", "getViewModel", "()Lcom/example/plazapalm/views/advancesettings/questionaries/QuestionariesVM;", "viewModel$delegate", "Lkotlin/Lazy;", "getLocalData", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "setQuestionAdapter", "setQuestionsAdapter", "swipeItem", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class QuestionariesFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    @javax.inject.Inject()
    public com.example.plazapalm.pref.PreferenceFile pref;
    @org.jetbrains.annotations.Nullable()
    private com.example.plazapalm.swipelayout.SwipeController swipeController;
    private com.example.plazapalm.databinding.QuestionariesFragmentBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    public com.example.plazapalm.views.advancesettings.questionaries.SwipeToDeleteAdapter SwipeToDeleteAdapter;
    
    public QuestionariesFragment() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.plazapalm.swipelayout.SwipeController getSwipeController() {
        return null;
    }
    
    public final void setSwipeController(@org.jetbrains.annotations.Nullable()
    com.example.plazapalm.swipelayout.SwipeController p0) {
    }
    
    private final com.example.plazapalm.views.advancesettings.questionaries.QuestionariesVM getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.views.advancesettings.questionaries.SwipeToDeleteAdapter getSwipeToDeleteAdapter() {
        return null;
    }
    
    public final void setSwipeToDeleteAdapter(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.views.advancesettings.questionaries.SwipeToDeleteAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void swipeItem() {
    }
    
    private final void getLocalData() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void setQuestionsAdapter() {
    }
    
    private final void setQuestionAdapter() {
    }
}