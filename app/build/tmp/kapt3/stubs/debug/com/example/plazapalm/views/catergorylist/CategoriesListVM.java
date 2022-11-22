package com.example.plazapalm.views.catergorylist;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010T\u001a\u00020UJ\u000e\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010*\"\u0004\b3\u0010,R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00107\"\u0004\b<\u00109R(\u0010=\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010>0>0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0017\"\u0004\b@\u0010\u0019R\u001a\u0010A\u001a\u00020>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR(\u0010N\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0017\"\u0004\bP\u0010\u0019R(\u0010Q\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0017\"\u0004\bS\u0010\u0019\u00a8\u0006Z"}, d2 = {"Lcom/example/plazapalm/views/catergorylist/CategoriesListVM;", "Landroidx/lifecycle/ViewModel;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "cacheUtil", "Lcom/example/plazapalm/networkcalls/CacheUtil;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "(Lcom/example/plazapalm/datastore/DataStoreUtil;Lcom/example/plazapalm/networkcalls/CacheUtil;Lcom/example/plazapalm/pref/PreferenceFile;Lcom/example/plazapalm/networkcalls/Repository;)V", "adapterCategories", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/CategoriesData;", "getAdapterCategories", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "adapterCategories$delegate", "Lkotlin/Lazy;", "address", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getAddress", "()Landroidx/databinding/ObservableField;", "setAddress", "(Landroidx/databinding/ObservableField;)V", "getCacheUtil", "()Lcom/example/plazapalm/networkcalls/CacheUtil;", "setCacheUtil", "(Lcom/example/plazapalm/networkcalls/CacheUtil;)V", "categoriesDataList", "Ljava/util/ArrayList;", "getCategoriesDataList", "()Ljava/util/ArrayList;", "setCategoriesDataList", "(Ljava/util/ArrayList;)V", "getDataStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "isChecked", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "setChecked", "(Landroidx/databinding/ObservableBoolean;)V", "isClicked", "", "()Z", "setClicked", "(Z)V", "isVisible", "setVisible", "latitude", "Landroidx/databinding/ObservableDouble;", "getLatitude", "()Landroidx/databinding/ObservableDouble;", "setLatitude", "(Landroidx/databinding/ObservableDouble;)V", "longitude", "getLongitude", "setLongitude", "page", "", "getPage", "setPage", "position", "getPosition", "()I", "setPosition", "(I)V", "getPref", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPref", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "getRepository", "()Lcom/example/plazapalm/networkcalls/Repository;", "setRepository", "(Lcom/example/plazapalm/networkcalls/Repository;)V", "searchText", "getSearchText", "setSearchText", "token", "getToken", "setToken", "getCategoriesApi", "Lkotlinx/coroutines/Job;", "onClicks", "", "view", "Landroid/view/View;", "app_debug"})
public final class CategoriesListVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.networkcalls.CacheUtil cacheUtil;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.pref.PreferenceFile pref;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.networkcalls.Repository repository;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.CategoriesData> categoriesDataList;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isVisible;
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
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy adapterCategories$delegate = null;
    
    @javax.inject.Inject()
    public CategoriesListVM(@org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.CategoriesData> getCategoriesDataList() {
        return null;
    }
    
    public final void setCategoriesDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.CategoriesData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isVisible() {
        return null;
    }
    
    public final void setVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.CategoriesData> getAdapterCategories() {
        return null;
    }
    
    /**
     * Clicks Implemented Here
     */
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCategoriesApi() {
        return null;
    }
}