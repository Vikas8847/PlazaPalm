package com.example.plazapalm.views.dashboard;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\\\u001a\u00020]J\u0006\u0010^\u001a\u00020]J\u000e\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020aJ\b\u0010b\u001a\u00020]H\u0003R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010(\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001f\u0010+\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0016R(\u0010-\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0016\"\u0004\b/\u0010\u0018R \u00100\u001a\b\u0012\u0004\u0012\u00020\u001a01X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u00106\u001a\b\u0012\u0004\u0012\u00020\n07X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R\u001a\u0010C\u001a\u00020DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001c\u0010P\u001a\u0004\u0018\u00010QX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010V\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0016\"\u0004\bX\u0010\u0018R(\u0010Y\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\n0\n0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0016\"\u0004\b[\u0010\u0018\u00a8\u0006c"}, d2 = {"Lcom/example/plazapalm/views/dashboard/DashBoardVM;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "(Lcom/example/plazapalm/networkcalls/Repository;Lcom/example/plazapalm/datastore/DataStoreUtil;Lcom/example/plazapalm/pref/PreferenceFile;)V", "_id", "", "adapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/ProfileCateData;", "getAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "calulatedDistance", "Landroidx/databinding/ObservableField;", "kotlin.jvm.PlatformType", "getCalulatedDistance", "()Landroidx/databinding/ObservableField;", "setCalulatedDistance", "(Landroidx/databinding/ObservableField;)V", "dashSelectedAdapter", "Lcom/example/plazapalm/models/CategoriesData;", "getDashSelectedAdapter", "dashSelectedAdapter$delegate", "getDataStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "destinationLat", "", "getDestinationLat", "()Ljava/lang/Double;", "setDestinationLat", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "destinationLong", "getDestinationLong", "setDestinationLong", "distance", "getDistance", "distanceCal", "getDistanceCal", "setDistanceCal", "idCategoriesData", "Landroidx/databinding/ObservableArrayList;", "getIdCategoriesData", "()Landroidx/databinding/ObservableArrayList;", "setIdCategoriesData", "(Landroidx/databinding/ObservableArrayList;)V", "idList", "Ljava/util/ArrayList;", "getIdList", "()Ljava/util/ArrayList;", "setIdList", "(Ljava/util/ArrayList;)V", "isClicked", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "setClicked", "(Landroidx/databinding/ObservableBoolean;)V", "isDataVisible", "setDataVisible", "lati", "Landroidx/databinding/ObservableDouble;", "getLati", "()Landroidx/databinding/ObservableDouble;", "setLati", "(Landroidx/databinding/ObservableDouble;)V", "longi", "getLongi", "setLongi", "getPref", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPref", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "recyclerSelectedEvents", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerSelectedEvents", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerSelectedEvents", "(Landroidx/recyclerview/widget/RecyclerView;)V", "status", "getStatus", "setStatus", "token", "getToken", "setToken", "calculateLatLngToMiles", "", "getProfileByCategory", "onClicks", "view", "Landroid/view/View;", "showSelectedCatAlert", "app_debug"})
public final class DashBoardVM extends androidx.lifecycle.ViewModel {
    private com.example.plazapalm.networkcalls.Repository repository;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.pref.PreferenceFile pref;
    private java.lang.String _id;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> calulatedDistance;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double destinationLong;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double destinationLat;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.RecyclerView recyclerSelectedEvents;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> idList;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> token;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> status;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableDouble lati;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableDouble longi;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isDataVisible;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> distanceCal;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isClicked;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> distance = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableArrayList<com.example.plazapalm.models.CategoriesData> idCategoriesData;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy adapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dashSelectedAdapter$delegate = null;
    
    @javax.inject.Inject()
    public DashBoardVM(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository repository, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile pref) {
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
    public final androidx.databinding.ObservableField<java.lang.String> getCalulatedDistance() {
        return null;
    }
    
    public final void setCalulatedDistance(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDestinationLong() {
        return null;
    }
    
    public final void setDestinationLong(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDestinationLat() {
        return null;
    }
    
    public final void setDestinationLat(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerSelectedEvents() {
        return null;
    }
    
    public final void setRecyclerSelectedEvents(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getIdList() {
        return null;
    }
    
    public final void setIdList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableDouble getLati() {
        return null;
    }
    
    public final void setLati(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableDouble p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableDouble getLongi() {
        return null;
    }
    
    public final void setLongi(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableDouble p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isDataVisible() {
        return null;
    }
    
    public final void setDataVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getDistanceCal() {
        return null;
    }
    
    public final void setDistanceCal(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isClicked() {
        return null;
    }
    
    public final void setClicked(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableArrayList<com.example.plazapalm.models.CategoriesData> getIdCategoriesData() {
        return null;
    }
    
    public final void setIdCategoriesData(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableArrayList<com.example.plazapalm.models.CategoriesData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.ProfileCateData> getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.CategoriesData> getDashSelectedAdapter() {
        return null;
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void showSelectedCatAlert() {
    }
    
    public final void getProfileByCategory() {
    }
    
    public final void calculateLatLngToMiles() {
    }
}