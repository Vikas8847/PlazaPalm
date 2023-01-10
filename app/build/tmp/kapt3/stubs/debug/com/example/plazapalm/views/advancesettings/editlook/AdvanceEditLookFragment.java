package com.example.plazapalm.views.advancesettings.editlook;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0003J\u0012\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0017J\b\u0010%\u001a\u00020\u001aH\u0017J\u001a\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0003J\b\u0010,\u001a\u00020\u001aH\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006-"}, d2 = {"Lcom/example/plazapalm/views/advancesettings/editlook/AdvanceEditLookFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/plazapalm/databinding/AdvanceEditLookFragmentBinding;", "checkApi", "Landroidx/databinding/ObservableBoolean;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "getDataStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "preferenceFile", "Lcom/example/plazapalm/pref/PreferenceFile;", "getPreferenceFile", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPreferenceFile", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "viewModel", "Lcom/example/plazapalm/views/advancesettings/editlook/AdvanceEditLookVM;", "getViewModel", "()Lcom/example/plazapalm/views/advancesettings/editlook/AdvanceEditLookVM;", "viewModel$delegate", "Lkotlin/Lazy;", "backPressedData", "", "getLocalData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onViewCreated", "view", "setBorderBackground", "layout", "color", "", "setbackground", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AdvanceEditLookFragment extends androidx.fragment.app.Fragment {
    private com.example.plazapalm.databinding.AdvanceEditLookFragmentBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private androidx.databinding.ObservableBoolean checkApi;
    @javax.inject.Inject()
    public com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    @javax.inject.Inject()
    public com.example.plazapalm.pref.PreferenceFile preferenceFile;
    
    public AdvanceEditLookFragment() {
        super();
    }
    
    private final com.example.plazapalm.views.advancesettings.editlook.AdvanceEditLookVM getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.datastore.DataStoreUtil getDataStoreUtil() {
        return null;
    }
    
    public final void setDataStoreUtil(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.pref.PreferenceFile getPreferenceFile() {
        return null;
    }
    
    public final void setPreferenceFile(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public void onResume() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final void getLocalData() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final void setbackground() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final void setBorderBackground(android.view.View layout, int color) {
    }
    
    public final void backPressedData() {
    }
}