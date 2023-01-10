package com.example.plazapalm.views.dashboard;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010w\u001a\u00020xJ9\u0010y\u001a\u00020x2\u0006\u0010z\u001a\u00020\u000b2\u0006\u0010{\u001a\u00020|2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010}\u001a\u00020\u000b2\b\u0010~\u001a\u0004\u0018\u00010|H\u0016\u00a2\u0006\u0002\u0010\u007fJ\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\u001a\u0010\u0082\u0001\u001a\u00020x2\u0007\u0010\u0083\u0001\u001a\u00020\u000b2\b\u0010\u0084\u0001\u001a\u00030\u0085\u0001J\u0011\u0010\u0086\u0001\u001a\u00020x2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00020x2\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001J\u001d\u0010\u008c\u0001\u001a\u00020x2\b\u0010\u0087\u0001\u001a\u00030\u0088\u00012\b\u0010\u008d\u0001\u001a\u00030\u0085\u0001H\u0002J\t\u0010\u008e\u0001\u001a\u00020xH\u0003R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u000b0\u000b0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001c\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010\'R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001f\u00101\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u000b0\u000b0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0017R(\u00103\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u000b0\u000b0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019R \u00106\u001a\b\u0012\u0004\u0012\u00020807X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010E\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010E\"\u0004\bI\u0010GR\u001a\u0010J\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010%\"\u0004\bL\u0010\'R!\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000b0N8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bQ\u0010\u0012\u001a\u0004\bO\u0010PR!\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0N8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bT\u0010\u0012\u001a\u0004\bS\u0010PR\u001a\u0010U\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010%\"\u0004\bW\u0010\'R \u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b0>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010@\"\u0004\bZ\u0010BR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R \u0010_\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010e\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u000b0\u000b0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u0017\"\u0004\bg\u0010\u0019R \u0010h\u001a\b\u0012\u0004\u0012\u00020\u001b0>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010@\"\u0004\bj\u0010BR \u0010k\u001a\b\u0012\u0004\u0012\u00020\u001b0>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010@\"\u0004\bm\u0010BR(\u0010n\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u000b0\u000b0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\u0017\"\u0004\bp\u0010\u0019R(\u0010q\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u000b0\u000b0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010\u0017\"\u0004\bs\u0010\u0019R(\u0010t\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u000b0\u000b0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010\u0017\"\u0004\bv\u0010\u0019\u00a8\u0006\u008f\u0001"}, d2 = {"Lcom/example/plazapalm/views/dashboard/DashBoardVM;", "Landroidx/lifecycle/ViewModel;", "Lcom/example/plazapalm/interfaces/clickItem;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "(Lcom/example/plazapalm/networkcalls/Repository;Lcom/example/plazapalm/datastore/DataStoreUtil;Lcom/example/plazapalm/pref/PreferenceFile;)V", "_id", "", "adapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/ProfileCateData;", "getAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "calulatedDistance", "Landroidx/databinding/ObservableField;", "kotlin.jvm.PlatformType", "getCalulatedDistance", "()Landroidx/databinding/ObservableField;", "setCalulatedDistance", "(Landroidx/databinding/ObservableField;)V", "dashSelectedAdapter", "Lcom/example/plazapalm/models/SelectedDataModelList;", "getDashSelectedAdapter", "dashSelectedAdapter$delegate", "getDataStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "destinationLat", "Landroidx/databinding/ObservableDouble;", "getDestinationLat", "()Landroidx/databinding/ObservableDouble;", "setDestinationLat", "(Landroidx/databinding/ObservableDouble;)V", "destinationLong", "getDestinationLong", "setDestinationLong", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "distance", "getDistance", "distanceCal", "getDistanceCal", "setDistanceCal", "idCategoriesData", "Landroidx/databinding/ObservableArrayList;", "Lcom/example/plazapalm/models/CategoriesData;", "getIdCategoriesData", "()Landroidx/databinding/ObservableArrayList;", "setIdCategoriesData", "(Landroidx/databinding/ObservableArrayList;)V", "idList", "Ljava/util/ArrayList;", "getIdList", "()Ljava/util/ArrayList;", "setIdList", "(Ljava/util/ArrayList;)V", "isClicked", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "setClicked", "(Landroidx/databinding/ObservableBoolean;)V", "isDataVisible", "setDataVisible", "lati", "getLati", "setLati", "list_CateName", "Landroidx/datastore/preferences/core/Preferences$Key;", "getList_CateName", "()Landroidx/datastore/preferences/core/Preferences$Key;", "list_CateName$delegate", "list_Name", "getList_Name", "list_Name$delegate", "longi", "getLongi", "setLongi", "nameList", "getNameList", "setNameList", "getPref", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPref", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "recyclerSelectedEvents", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerSelectedEvents", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerSelectedEvents", "(Landroidx/recyclerview/widget/RecyclerView;)V", "searchItems", "getSearchItems", "setSearchItems", "selectedCategoriesList", "getSelectedCategoriesList", "setSelectedCategoriesList", "selectedCategoriesLists", "getSelectedCategoriesLists", "setSelectedCategoriesLists", "status", "getStatus", "setStatus", "token", "getToken", "setToken", "userMiles", "getUserMiles", "setUserMiles", "calculateLatLngToMiles", "", "click", "categoryName", "position", "", "s", "color", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getProfile", "Lkotlinx/coroutines/Job;", "getProfileByCategory", "search", "showLoader", "", "onClicks", "view", "Landroid/view/View;", "onTextChange", "editable", "Landroid/text/Editable;", "showFavDetailsDialog", "isfav", "showSelectedCatAlert", "app_debug"})
public final class DashBoardVM extends androidx.lifecycle.ViewModel implements com.example.plazapalm.interfaces.clickItem {
    private com.example.plazapalm.networkcalls.Repository repository;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.pref.PreferenceFile pref;
    private java.lang.String _id;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> calulatedDistance;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableDouble destinationLat;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableDouble destinationLong;
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private androidx.recyclerview.widget.RecyclerView recyclerSelectedEvents;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> idList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> nameList;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> token;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> status;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> searchItems;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableDouble lati;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableDouble longi;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> userMiles;
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
    private java.util.ArrayList<com.example.plazapalm.models.SelectedDataModelList> selectedCategoriesList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.SelectedDataModelList> selectedCategoriesLists;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy dashSelectedAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy list_Name$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy list_CateName$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog dialog;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableDouble getDestinationLat() {
        return null;
    }
    
    public final void setDestinationLat(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableDouble p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableDouble getDestinationLong() {
        return null;
    }
    
    public final void setDestinationLong(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableDouble p0) {
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
    public final java.util.ArrayList<java.lang.String> getNameList() {
        return null;
    }
    
    public final void setNameList(@org.jetbrains.annotations.NotNull()
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
    public final androidx.databinding.ObservableField<java.lang.String> getSearchItems() {
        return null;
    }
    
    public final void setSearchItems(@org.jetbrains.annotations.NotNull()
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
    public final androidx.databinding.ObservableField<java.lang.String> getUserMiles() {
        return null;
    }
    
    public final void setUserMiles(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
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
    public final java.util.ArrayList<com.example.plazapalm.models.SelectedDataModelList> getSelectedCategoriesList() {
        return null;
    }
    
    public final void setSelectedCategoriesList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.SelectedDataModelList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.SelectedDataModelList> getSelectedCategoriesLists() {
        return null;
    }
    
    public final void setSelectedCategoriesLists(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.SelectedDataModelList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.SelectedDataModelList> getDashSelectedAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getList_Name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> getList_CateName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Dialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    public final void onTextChange(@org.jetbrains.annotations.NotNull()
    android.text.Editable editable) {
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void showSelectedCatAlert() {
    }
    
    public final void getProfileByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String search, boolean showLoader) {
    }
    
    public final void calculateLatLngToMiles() {
    }
    
    private final void showFavDetailsDialog(android.view.View view, boolean isfav) {
    }
    
    @java.lang.Override()
    public void click(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, int position, @org.jetbrains.annotations.Nullable()
    java.lang.String _id, @org.jetbrains.annotations.NotNull()
    java.lang.String s, @org.jetbrains.annotations.Nullable()
    java.lang.Integer color) {
    }
    
    /**
     * call Get Profile Api..
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getProfile() {
        return null;
    }
}