package com.example.plazapalm.views.advancesettings.map;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u00109\u001a\u00020:J\u0006\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020?J\u001e\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\u0011R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001a\u0010 \u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010\'\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\f\"\u0004\b(\u0010\u000eR\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u00a8\u0006D"}, d2 = {"Lcom/example/plazapalm/views/advancesettings/map/AdvanceMapVM;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "(Lcom/example/plazapalm/networkcalls/Repository;Lcom/example/plazapalm/pref/PreferenceFile;Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "darkTheme", "Landroidx/databinding/ObservableBoolean;", "getDarkTheme", "()Landroidx/databinding/ObservableBoolean;", "setDarkTheme", "(Landroidx/databinding/ObservableBoolean;)V", "darkThemeLive", "Landroidx/lifecycle/MutableLiveData;", "", "getDarkThemeLive", "()Landroidx/lifecycle/MutableLiveData;", "setDarkThemeLive", "(Landroidx/lifecycle/MutableLiveData;)V", "getDataStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "follow", "getFollow", "setFollow", "followLive", "getFollowLive", "setFollowLive", "gpsStatus", "getGpsStatus", "()Z", "setGpsStatus", "(Z)V", "isClicked", "setClicked", "isDarkModeClicked", "setDarkModeClicked", "locationManager", "Landroid/location/LocationManager;", "locationOnOF", "getLocationOnOF", "setLocationOnOF", "locationOnOFLive", "getLocationOnOFLive", "setLocationOnOFLive", "getPref", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPref", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "getRepository", "()Lcom/example/plazapalm/networkcalls/Repository;", "setRepository", "(Lcom/example/plazapalm/networkcalls/Repository;)V", "CheckGpsStatus", "", "mapFeatureGet", "Lkotlinx/coroutines/Job;", "onClicks", "view", "Landroid/view/View;", "setMapThemeAPI", "isdark", "islocation", "isfollow", "app_debug"})
public final class AdvanceMapVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.networkcalls.Repository repository;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.pref.PreferenceFile pref;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    private android.location.LocationManager locationManager;
    private boolean gpsStatus = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isDarkModeClicked;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isClicked;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean darkTheme;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean locationOnOF;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean follow;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> darkThemeLive;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> locationOnOFLive;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> followLive;
    
    @javax.inject.Inject()
    public AdvanceMapVM(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository repository, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile pref, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil) {
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
    public final com.example.plazapalm.pref.PreferenceFile getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.datastore.DataStoreUtil getDataStoreUtil() {
        return null;
    }
    
    public final void setDataStoreUtil(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil p0) {
    }
    
    public final boolean getGpsStatus() {
        return false;
    }
    
    public final void setGpsStatus(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isDarkModeClicked() {
        return null;
    }
    
    public final void setDarkModeClicked(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isClicked() {
        return null;
    }
    
    public final void setClicked(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getDarkTheme() {
        return null;
    }
    
    public final void setDarkTheme(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getLocationOnOF() {
        return null;
    }
    
    public final void setLocationOnOF(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getFollow() {
        return null;
    }
    
    public final void setFollow(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDarkThemeLive() {
        return null;
    }
    
    public final void setDarkThemeLive(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLocationOnOFLive() {
        return null;
    }
    
    public final void setLocationOnOFLive(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFollowLive() {
        return null;
    }
    
    public final void setFollowLive(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void CheckGpsStatus() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job setMapThemeAPI(boolean isdark, boolean islocation, boolean isfollow) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job mapFeatureGet() {
        return null;
    }
}