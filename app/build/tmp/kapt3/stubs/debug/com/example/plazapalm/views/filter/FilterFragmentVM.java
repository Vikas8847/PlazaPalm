package com.example.plazapalm.views.filter;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001c"}, d2 = {"Lcom/example/plazapalm/views/filter/FilterFragmentVM;", "Landroidx/lifecycle/ViewModel;", "()V", "filterAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/FilterDataModel;", "getFilterAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "filterAdapter$delegate", "Lkotlin/Lazy;", "filterDataList", "Ljava/util/ArrayList;", "getFilterDataList", "()Ljava/util/ArrayList;", "setFilterDataList", "(Ljava/util/ArrayList;)V", "miles", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getMiles", "()Landroidx/databinding/ObservableField;", "setMiles", "(Landroidx/databinding/ObservableField;)V", "onClicks", "", "view", "Landroid/view/View;", "app_debug"})
public final class FilterFragmentVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> miles;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.FilterDataModel> filterDataList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy filterAdapter$delegate = null;
    
    @javax.inject.Inject()
    public FilterFragmentVM() {
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
    public final java.util.ArrayList<com.example.plazapalm.models.FilterDataModel> getFilterDataList() {
        return null;
    }
    
    public final void setFilterDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.FilterDataModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.FilterDataModel> getFilterAdapter() {
        return null;
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}