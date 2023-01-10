package com.example.plazapalm.views.advancesettings.map;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006&"}, d2 = {"Lcom/example/plazapalm/views/advancesettings/map/AdvanceMapVM;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "(Lcom/example/plazapalm/networkcalls/Repository;Lcom/example/plazapalm/pref/PreferenceFile;)V", "gpsStatus", "", "getGpsStatus", "()Z", "setGpsStatus", "(Z)V", "isClicked", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "setClicked", "(Landroidx/databinding/ObservableBoolean;)V", "isDarkModeClicked", "setDarkModeClicked", "locationManager", "Landroid/location/LocationManager;", "getPref", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPref", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "getRepository", "()Lcom/example/plazapalm/networkcalls/Repository;", "setRepository", "(Lcom/example/plazapalm/networkcalls/Repository;)V", "CheckGpsStatus", "", "onClicks", "view", "Landroid/view/View;", "setMapThemeAPI", "Lkotlinx/coroutines/Job;", "istrue", "app_debug"})
public final class AdvanceMapVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.networkcalls.Repository repository;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.pref.PreferenceFile pref;
    private android.location.LocationManager locationManager;
    private boolean gpsStatus = false;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isDarkModeClicked;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isClicked;
    
    @javax.inject.Inject()
    public AdvanceMapVM(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository repository, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile pref) {
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
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void CheckGpsStatus() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job setMapThemeAPI(boolean istrue) {
        return null;
    }
}