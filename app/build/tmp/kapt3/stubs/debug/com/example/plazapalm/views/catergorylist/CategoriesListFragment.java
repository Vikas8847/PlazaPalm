package com.example.plazapalm.views.catergorylist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J+\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u00102\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u00101\u001a\u000202H\u0016\u00a2\u0006\u0002\u00103J\b\u00104\u001a\u00020\"H\u0016J\u001a\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00107\u001a\u00020\"H\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014\u00a8\u00068"}, d2 = {"Lcom/example/plazapalm/views/catergorylist/CategoriesListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/plazapalm/databinding/CategoriesListFragmentBinding;", "bottomNavigationView", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "getBottomNavigationView", "()Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "setBottomNavigationView", "(Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V", "loading", "", "mFusedLocation", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "pastVisiblesItems", "", "getPastVisiblesItems", "()I", "setPastVisiblesItems", "(I)V", "totalItemCount", "getTotalItemCount", "setTotalItemCount", "viewmodel", "Lcom/example/plazapalm/views/catergorylist/CategoriesListVM;", "getViewmodel", "()Lcom/example/plazapalm/views/catergorylist/CategoriesListVM;", "viewmodel$delegate", "Lkotlin/Lazy;", "visibleItemCount", "getVisibleItemCount", "setVisibleItemCount", "getData", "", "getLastLocation", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "showCategories", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CategoriesListFragment extends androidx.fragment.app.Fragment {
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocation;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.bottomnavigation.BottomNavigationView bottomNavigationView;
    private com.example.plazapalm.databinding.CategoriesListFragmentBinding binding;
    private final kotlin.Lazy viewmodel$delegate = null;
    private boolean loading = true;
    private int pastVisiblesItems = 0;
    private int visibleItemCount = 0;
    private int totalItemCount = 0;
    
    public CategoriesListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.bottomnavigation.BottomNavigationView getBottomNavigationView() {
        return null;
    }
    
    public final void setBottomNavigationView(@org.jetbrains.annotations.Nullable()
    com.google.android.material.bottomnavigation.BottomNavigationView p0) {
    }
    
    private final com.example.plazapalm.views.catergorylist.CategoriesListVM getViewmodel() {
        return null;
    }
    
    public final int getPastVisiblesItems() {
        return 0;
    }
    
    public final void setPastVisiblesItems(int p0) {
    }
    
    public final int getVisibleItemCount() {
        return 0;
    }
    
    public final void setVisibleItemCount(int p0) {
    }
    
    public final int getTotalItemCount() {
        return 0;
    }
    
    public final void setTotalItemCount(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
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
    private final void showCategories() {
    }
    
    /**
     * Get Type from previous screen using bundle
     */
    private final void getData() {
    }
    
    private final void getLastLocation() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
}