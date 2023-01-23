package com.example.plazapalm.views.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0003J\b\u0010%\u001a\u00020$H\u0003J$\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00100\u001a\u00020$H\u0002J\u0006\u00101\u001a\u00020$J\b\u00102\u001a\u00020$H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u00a8\u00064"}, d2 = {"Lcom/example/plazapalm/views/filter/FilterFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/plazapalm/databinding/FilterFragmentBinding;", "getBinding", "()Lcom/example/plazapalm/databinding/FilterFragmentBinding;", "setBinding", "(Lcom/example/plazapalm/databinding/FilterFragmentBinding;)V", "categoryList", "Ljava/util/ArrayList;", "Lcom/example/plazapalm/models/SelectedDataModelList;", "Lkotlin/collections/ArrayList;", "getCategoryList", "()Ljava/util/ArrayList;", "setCategoryList", "(Ljava/util/ArrayList;)V", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "getDataStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "getPref", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPref", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "viewModel", "Lcom/example/plazapalm/views/filter/FilterFragmentVM;", "getViewModel", "()Lcom/example/plazapalm/views/filter/FilterFragmentVM;", "viewModel$delegate", "Lkotlin/Lazy;", "getBundleData", "", "getLocalData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setCategoryAdapter", "setLocation", "sliderCustomize", "GsonDeserializeExclusion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FilterFragment extends androidx.fragment.app.Fragment {
    public com.example.plazapalm.databinding.FilterFragmentBinding binding;
    @javax.inject.Inject()
    public com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    @javax.inject.Inject()
    public com.example.plazapalm.pref.PreferenceFile pref;
    public java.util.ArrayList<com.example.plazapalm.models.SelectedDataModelList> categoryList;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public FilterFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.databinding.FilterFragmentBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.databinding.FilterFragmentBinding p0) {
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
    public final java.util.ArrayList<com.example.plazapalm.models.SelectedDataModelList> getCategoryList() {
        return null;
    }
    
    public final void setCategoryList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.SelectedDataModelList> p0) {
    }
    
    private final com.example.plazapalm.views.filter.FilterFragmentVM getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void getLocalData() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void getBundleData() {
    }
    
    private final void setCategoryAdapter() {
    }
    
    private final void sliderCustomize() {
    }
    
    /**
     * Set Location
     */
    public final void setLocation() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/example/plazapalm/views/filter/FilterFragment$GsonDeserializeExclusion;", "Lcom/google/gson/ExclusionStrategy;", "()V", "shouldSkipClass", "", "clazz", "Ljava/lang/Class;", "shouldSkipField", "f", "Lcom/google/gson/FieldAttributes;", "app_debug"})
    public static final class GsonDeserializeExclusion implements com.google.gson.ExclusionStrategy {
        
        public GsonDeserializeExclusion() {
            super();
        }
        
        @java.lang.Override()
        public boolean shouldSkipField(@org.jetbrains.annotations.NotNull()
        com.google.gson.FieldAttributes f) {
            return false;
        }
        
        @java.lang.Override()
        public boolean shouldSkipClass(@org.jetbrains.annotations.Nullable()
        java.lang.Class<?> clazz) {
            return false;
        }
    }
}