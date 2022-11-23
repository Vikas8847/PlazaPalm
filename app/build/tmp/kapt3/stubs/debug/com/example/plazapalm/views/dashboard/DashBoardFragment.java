package com.example.plazapalm.views.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\"\u001a\u00020\u0014H\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006#"}, d2 = {"Lcom/example/plazapalm/views/dashboard/DashBoardFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/plazapalm/databinding/DashBoardFragmentBinding;", "dataStore", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "getDataStore", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStore", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "mFusedLocation", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "viewModel", "Lcom/example/plazapalm/views/dashboard/DashBoardVM;", "getViewModel", "()Lcom/example/plazapalm/views/dashboard/DashBoardVM;", "viewModel$delegate", "Lkotlin/Lazy;", "getCategoriesListAndID", "", "getLastLocation", "getdata", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "setAdapter", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DashBoardFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public com.example.plazapalm.datastore.DataStoreUtil dataStore;
    private com.example.plazapalm.databinding.DashBoardFragmentBinding binding;
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocation;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public DashBoardFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.datastore.DataStoreUtil getDataStore() {
        return null;
    }
    
    public final void setDataStore(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil p0) {
    }
    
    private final com.example.plazapalm.views.dashboard.DashBoardVM getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void getdata() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void setAdapter() {
    }
    
    private final void getCategoriesListAndID() {
    }
    
    private final void getLastLocation() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
}