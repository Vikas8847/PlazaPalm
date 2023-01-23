package com.example.plazapalm.views.favourites;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010-\u001a\u00020.2\u001a\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`0H\u0002J\u0006\u00101\u001a\u00020.J\u000e\u00102\u001a\u00020.2\u0006\u00103\u001a\u000204R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u00065"}, d2 = {"Lcom/example/plazapalm/views/favourites/FavouritesVM;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "preferenceFile", "Lcom/example/plazapalm/pref/PreferenceFile;", "storeUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "(Lcom/example/plazapalm/networkcalls/Repository;Lcom/example/plazapalm/pref/PreferenceFile;Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "favAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/FavData;", "getFavAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "favAdapter$delegate", "Lkotlin/Lazy;", "favouritesList", "Ljava/util/ArrayList;", "getFavouritesList", "()Ljava/util/ArrayList;", "setFavouritesList", "(Ljava/util/ArrayList;)V", "isFavorite", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "setFavorite", "(Landroid/os/Bundle;)V", "noData", "Landroidx/databinding/ObservableBoolean;", "getNoData", "()Landroidx/databinding/ObservableBoolean;", "setNoData", "(Landroidx/databinding/ObservableBoolean;)V", "getPreferenceFile", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPreferenceFile", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "getRepository", "()Lcom/example/plazapalm/networkcalls/Repository;", "setRepository", "(Lcom/example/plazapalm/networkcalls/Repository;)V", "getStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "data", "", "body", "Lkotlin/collections/ArrayList;", "getFavdata", "onClicks", "view", "Landroid/view/View;", "app_debug"})
public final class FavouritesVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.networkcalls.Repository repository;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.pref.PreferenceFile preferenceFile;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.datastore.DataStoreUtil storeUtil;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.FavData> favouritesList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy favAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private android.os.Bundle isFavorite;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean noData;
    
    @javax.inject.Inject()
    public FavouritesVM(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository repository, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile preferenceFile, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil storeUtil) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.networkcalls.Repository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.pref.PreferenceFile getPreferenceFile() {
        return null;
    }
    
    public final void setPreferenceFile(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.datastore.DataStoreUtil getStoreUtil() {
        return null;
    }
    
    public final void setStoreUtil(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.FavData> getFavouritesList() {
        return null;
    }
    
    public final void setFavouritesList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.FavData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.FavData> getFavAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Bundle isFavorite() {
        return null;
    }
    
    public final void setFavorite(@org.jetbrains.annotations.NotNull()
    android.os.Bundle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getNoData() {
        return null;
    }
    
    public final void setNoData(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void getFavdata() {
    }
    
    private final void data(java.util.ArrayList<com.example.plazapalm.models.FavData> body) {
    }
}