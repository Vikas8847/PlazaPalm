package com.example.plazapalm.views.selectcategory.opencategeroy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J9\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0016\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J+\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170+2\u0006\u0010,\u001a\u00020-H\u0016\u00a2\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0015H\u0016J\u001a\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u00062"}, d2 = {"Lcom/example/plazapalm/views/selectcategory/opencategeroy/OpenCategeroyFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/plazapalm/interfaces/clickItem;", "()V", "binding", "Lcom/example/plazapalm/databinding/FragmentOpenCategeroyBinding;", "mFusedLocation", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "getPref", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPref", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "viewmodel", "Lcom/example/plazapalm/views/selectcategory/opencategeroy/OpenCategeroyViewModel;", "getViewmodel", "()Lcom/example/plazapalm/views/selectcategory/opencategeroy/OpenCategeroyViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "click", "", "categoryName", "", "position", "", "c_id", "s", "color", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getLastLocation", "getdata", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class OpenCategeroyFragment extends androidx.fragment.app.Fragment implements com.example.plazapalm.interfaces.clickItem {
    private com.example.plazapalm.databinding.FragmentOpenCategeroyBinding binding;
    private final kotlin.Lazy viewmodel$delegate = null;
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocation;
    @javax.inject.Inject()
    public com.example.plazapalm.pref.PreferenceFile pref;
    
    public OpenCategeroyFragment() {
        super();
    }
    
    private final com.example.plazapalm.views.selectcategory.opencategeroy.OpenCategeroyViewModel getViewmodel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.pref.PreferenceFile getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile p0) {
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
    
    private final void getdata() {
    }
    
    @java.lang.Override()
    public void click(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, int position, @org.jetbrains.annotations.Nullable()
    java.lang.String c_id, @org.jetbrains.annotations.NotNull()
    java.lang.String s, @org.jetbrains.annotations.Nullable()
    java.lang.Integer color) {
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