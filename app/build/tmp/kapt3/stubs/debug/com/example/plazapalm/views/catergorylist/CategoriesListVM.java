package com.example.plazapalm.views.catergorylist;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\u00142\u0006\u0010i\u001a\u00020=J\u000e\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020mJ\u000e\u0010n\u001a\u00020k2\u0006\u0010o\u001a\u00020pR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010-\"\u0004\bC\u0010/R\u001a\u0010D\u001a\u00020+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010-\"\u0004\bF\u0010/R(\u0010G\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010H0H0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0017\"\u0004\bJ\u0010\u0019R\u001a\u0010K\u001a\u00020HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR(\u0010X\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0017\"\u0004\bZ\u0010\u0019R\u001a\u0010[\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R \u0010`\u001a\b\u0012\u0004\u0012\u00020\u00140\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010!\"\u0004\bb\u0010#R(\u0010c\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0017\"\u0004\be\u0010\u0019\u00a8\u0006q"}, d2 = {"Lcom/example/plazapalm/views/catergorylist/CategoriesListVM;", "Landroidx/lifecycle/ViewModel;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "cacheUtil", "Lcom/example/plazapalm/networkcalls/CacheUtil;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "(Lcom/example/plazapalm/datastore/DataStoreUtil;Lcom/example/plazapalm/networkcalls/CacheUtil;Lcom/example/plazapalm/pref/PreferenceFile;Lcom/example/plazapalm/networkcalls/Repository;)V", "adapterCategories", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/CategoriesData;", "getAdapterCategories", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "adapterCategories$delegate", "Lkotlin/Lazy;", "address", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getAddress", "()Landroidx/databinding/ObservableField;", "setAddress", "(Landroidx/databinding/ObservableField;)V", "getCacheUtil", "()Lcom/example/plazapalm/networkcalls/CacheUtil;", "setCacheUtil", "(Lcom/example/plazapalm/networkcalls/CacheUtil;)V", "categoriesDataList", "Ljava/util/ArrayList;", "getCategoriesDataList", "()Ljava/util/ArrayList;", "setCategoriesDataList", "(Ljava/util/ArrayList;)V", "checkBox", "Landroidx/appcompat/widget/AppCompatCheckBox;", "getCheckBox", "()Landroidx/appcompat/widget/AppCompatCheckBox;", "setCheckBox", "(Landroidx/appcompat/widget/AppCompatCheckBox;)V", "currentLatitude", "Landroidx/databinding/ObservableDouble;", "getCurrentLatitude", "()Landroidx/databinding/ObservableDouble;", "setCurrentLatitude", "(Landroidx/databinding/ObservableDouble;)V", "currentLongitude", "getCurrentLongitude", "setCurrentLongitude", "getDataStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "isChecked", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "setChecked", "(Landroidx/databinding/ObservableBoolean;)V", "isClicked", "", "()Z", "setClicked", "(Z)V", "latitude", "getLatitude", "setLatitude", "longitude", "getLongitude", "setLongitude", "page", "", "getPage", "setPage", "position", "getPosition", "()I", "setPosition", "(I)V", "getPref", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPref", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "getRepository", "()Lcom/example/plazapalm/networkcalls/Repository;", "setRepository", "(Lcom/example/plazapalm/networkcalls/Repository;)V", "searchItems", "getSearchItems", "setSearchItems", "selectedCategory", "getSelectedCategory", "()Ljava/lang/String;", "setSelectedCategory", "(Ljava/lang/String;)V", "selectedList", "getSelectedList", "setSelectedList", "token", "getToken", "setToken", "getCategoriesApi", "Lkotlinx/coroutines/Job;", "search", "showLoader", "onClicks", "", "view", "Landroid/view/View;", "onTextChange", "editable", "Landroid/text/Editable;", "app_debug"})
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
    private java.util.ArrayList<java.lang.String> selectedList;
    @org.jetbrains.annotations.NotNull()
    private androidx.appcompat.widget.AppCompatCheckBox checkBox;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> searchItems;
    private int position = -1;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isChecked;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> token;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.Integer> page;
    private boolean isClicked = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableDouble latitude;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableDouble longitude;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> address;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String selectedCategory = "";
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableDouble currentLatitude;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableDouble currentLongitude;
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
    public final java.util.ArrayList<java.lang.String> getSelectedList() {
        return null;
    }
    
    public final void setSelectedList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.AppCompatCheckBox getCheckBox() {
        return null;
    }
    
    public final void setCheckBox(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.AppCompatCheckBox p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getSearchItems() {
        return null;
    }
    
    public final void setSearchItems(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
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
    public final java.lang.String getSelectedCategory() {
        return null;
    }
    
    public final void setSelectedCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableDouble getCurrentLatitude() {
        return null;
    }
    
    public final void setCurrentLatitude(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableDouble p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableDouble getCurrentLongitude() {
        return null;
    }
    
    public final void setCurrentLongitude(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableDouble p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.CategoriesData> getAdapterCategories() {
        return null;
    }
    
    /**
     * Search items
     */
    public final void onTextChange(@org.jetbrains.annotations.NotNull()
    android.text.Editable editable) {
    }
    
    /**
     * Clicks Implemented Here
     */
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCategoriesApi(@org.jetbrains.annotations.NotNull()
    java.lang.String search, boolean showLoader) {
        return null;
    }
}