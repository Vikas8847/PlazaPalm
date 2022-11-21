package com.example.plazapalm.views.selectcategory;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001e\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RJ\u000e\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VJ.\u0010W\u001a\u00020T2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020Z0Y2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020RH\u0003R(\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R(\u0010.\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010/0/0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010\u0012R\u001a\u00102\u001a\u00020/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010?\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0010\"\u0004\bA\u0010\u0012R\u001c\u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR(\u0010H\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0010\"\u0004\bJ\u0010\u0012\u00a8\u0006["}, d2 = {"Lcom/example/plazapalm/views/selectcategory/SelectCategoryViewModel;", "Landroidx/lifecycle/ViewModel;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "cacheUtil", "Lcom/example/plazapalm/networkcalls/CacheUtil;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "(Lcom/example/plazapalm/datastore/DataStoreUtil;Lcom/example/plazapalm/networkcalls/CacheUtil;Lcom/example/plazapalm/pref/PreferenceFile;Lcom/example/plazapalm/networkcalls/Repository;)V", "address", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getAddress", "()Landroidx/databinding/ObservableField;", "setAddress", "(Landroidx/databinding/ObservableField;)V", "getCacheUtil", "()Lcom/example/plazapalm/networkcalls/CacheUtil;", "setCacheUtil", "(Lcom/example/plazapalm/networkcalls/CacheUtil;)V", "getDataStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "isChecked", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "setChecked", "(Landroidx/databinding/ObservableBoolean;)V", "isClicked", "", "()Z", "setClicked", "(Z)V", "latitude", "Landroidx/databinding/ObservableDouble;", "getLatitude", "()Landroidx/databinding/ObservableDouble;", "setLatitude", "(Landroidx/databinding/ObservableDouble;)V", "longitude", "getLongitude", "setLongitude", "page", "", "getPage", "setPage", "position", "getPosition", "()I", "setPosition", "(I)V", "getPref", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPref", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "getRepository", "()Lcom/example/plazapalm/networkcalls/Repository;", "setRepository", "(Lcom/example/plazapalm/networkcalls/Repository;)V", "searchText", "getSearchText", "setSearchText", "selectCateAdapter", "Lcom/example/plazapalm/views/selectcategory/adapters/SelectCateAdapter;", "getSelectCateAdapter", "()Lcom/example/plazapalm/views/selectcategory/adapters/SelectCateAdapter;", "setSelectCateAdapter", "(Lcom/example/plazapalm/views/selectcategory/adapters/SelectCateAdapter;)V", "token", "getToken", "setToken", "getCategoriesApi", "Lkotlinx/coroutines/Job;", "rvCategoryLocation", "Landroidx/recyclerview/widget/RecyclerView;", "requireActivity", "Landroidx/fragment/app/FragmentActivity;", "clickItem", "Lcom/example/plazapalm/interfaces/clickItem;", "onClicks", "", "view", "Landroid/view/View;", "showCategories", "data", "", "Lcom/example/plazapalm/models/CategoriesData;", "app_debug"})
public final class SelectCategoryViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.networkcalls.CacheUtil cacheUtil;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.pref.PreferenceFile pref;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.networkcalls.Repository repository;
    private int position = -1;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isChecked;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> token;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Integer> page;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> searchText;
    private boolean isClicked = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableDouble latitude;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableDouble longitude;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> address;
    @org.jetbrains.annotations.Nullable()
    private com.example.plazapalm.views.selectcategory.adapters.SelectCateAdapter selectCateAdapter;
    
    @javax.inject.Inject()
    public SelectCategoryViewModel(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.CacheUtil cacheUtil, @org.jetbrains.annotations.NotNull()
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
    public final com.example.plazapalm.networkcalls.CacheUtil getCacheUtil() {
        return null;
    }
    
    public final void setCacheUtil(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.CacheUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.pref.PreferenceFile getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.networkcalls.Repository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository p0) {
    }
    
    public final int getPosition() {
        return 0;
    }
    
    public final void setPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isChecked() {
        return null;
    }
    
    public final void setChecked(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.Integer> getPage() {
        return null;
    }
    
    public final void setPage(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getSearchText() {
        return null;
    }
    
    public final void setSearchText(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    public final boolean isClicked() {
        return false;
    }
    
    public final void setClicked(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableDouble getLatitude() {
        return null;
    }
    
    public final void setLatitude(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableDouble p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableDouble getLongitude() {
        return null;
    }
    
    public final void setLongitude(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableDouble p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.plazapalm.views.selectcategory.adapters.SelectCateAdapter getSelectCateAdapter() {
        return null;
    }
    
    public final void setSelectCateAdapter(@org.jetbrains.annotations.Nullable()
    com.example.plazapalm.views.selectcategory.adapters.SelectCateAdapter p0) {
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCategoriesApi(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView rvCategoryLocation, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity requireActivity, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.interfaces.clickItem clickItem) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void showCategories(java.util.List<com.example.plazapalm.models.CategoriesData> data, androidx.recyclerview.widget.RecyclerView rvCategoryLocation, androidx.fragment.app.FragmentActivity requireActivity, com.example.plazapalm.interfaces.clickItem clickItem) {
    }
}