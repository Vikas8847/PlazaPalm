package com.example.plazapalm.views.filter;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR(\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR(\u0010\"\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR4\u0010%\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0016 \u0017*\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f0\u000f0\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b\'\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/example/plazapalm/views/filter/FilterFragmentVM;", "Landroidx/lifecycle/ViewModel;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "(Lcom/example/plazapalm/datastore/DataStoreUtil;Lcom/example/plazapalm/pref/PreferenceFile;)V", "filterAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/SelectedDataModelList;", "getFilterAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "filterAdapter$delegate", "Lkotlin/Lazy;", "filterDataList", "Ljava/util/ArrayList;", "getFilterDataList", "()Ljava/util/ArrayList;", "setFilterDataList", "(Ljava/util/ArrayList;)V", "lat", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getLat", "()Landroidx/databinding/ObservableField;", "setLat", "(Landroidx/databinding/ObservableField;)V", "location", "getLocation", "setLocation", "long", "getLong", "setLong", "miles", "getMiles", "setMiles", "newfilterList", "getNewfilterList", "setNewfilterList", "onClicks", "", "view", "Landroid/view/View;", "app_debug"})
public final class FilterFragmentVM extends androidx.lifecycle.ViewModel {
    private com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    private com.example.plazapalm.pref.PreferenceFile pref;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> miles;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> location;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> lat;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.SelectedDataModelList> filterDataList;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.util.ArrayList<java.lang.String>> newfilterList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy filterAdapter$delegate = null;
    
    @javax.inject.Inject()
    public FilterFragmentVM(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile pref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getMiles() {
        return null;
    }
    
    public final void setMiles(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getLong() {
        return null;
    }
    
    public final void setLong(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getLat() {
        return null;
    }
    
    public final void setLat(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.SelectedDataModelList> getFilterDataList() {
        return null;
    }
    
    public final void setFilterDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.SelectedDataModelList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.util.ArrayList<java.lang.String>> getNewfilterList() {
        return null;
    }
    
    public final void setNewfilterList(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.util.ArrayList<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.SelectedDataModelList> getFilterAdapter() {
        return null;
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}