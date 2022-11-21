package com.example.plazapalm.views.myprofile;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u00102\u001a\u000203J\b\u00104\u001a\u000205H\u0002J\u0006\u00106\u001a\u000205J\u000e\u00107\u001a\u0002052\u0006\u00108\u001a\u000209R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010(\u001a\u0004\b%\u0010&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010)\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0016\"\u0004\b+\u0010\u0018R(\u0010,\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R(\u0010/\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u0018\u00a8\u0006:"}, d2 = {"Lcom/example/plazapalm/views/myprofile/MyProfileVM;", "Landroidx/lifecycle/ViewModel;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "cacheUtil", "Lcom/example/plazapalm/networkcalls/CacheUtil;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "(Lcom/example/plazapalm/datastore/DataStoreUtil;Lcom/example/plazapalm/networkcalls/Repository;Lcom/example/plazapalm/networkcalls/CacheUtil;Lcom/example/plazapalm/pref/PreferenceFile;)V", "changestatus", "Landroidx/databinding/ObservableBoolean;", "getChangestatus", "()Landroidx/databinding/ObservableBoolean;", "setChangestatus", "(Landroidx/databinding/ObservableBoolean;)V", "firstName", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getFirstName", "()Landroidx/databinding/ObservableField;", "setFirstName", "(Landroidx/databinding/ObservableField;)V", "loginData", "getLoginData", "setLoginData", "premium", "", "getPremium", "()Ljava/lang/Integer;", "setPremium", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "qrCodeScanner", "Lcom/example/plazapalm/views/myprofile/qrcodescanner/QrCodeScannerFragment;", "getQrCodeScanner", "()Lcom/example/plazapalm/views/myprofile/qrcodescanner/QrCodeScannerFragment;", "qrCodeScanner$delegate", "Lkotlin/Lazy;", "status", "getStatus", "setStatus", "storedImageUrl", "getStoredImageUrl", "setStoredImageUrl", "token", "getToken", "setToken", "getProfile", "Lkotlinx/coroutines/Job;", "getProfileImageUrl", "", "myProfileData", "onClick", "view", "Landroid/view/View;", "app_debug"})
public final class MyProfileVM extends androidx.lifecycle.ViewModel {
    private com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    private com.example.plazapalm.networkcalls.Repository repository;
    private com.example.plazapalm.networkcalls.CacheUtil cacheUtil;
    private com.example.plazapalm.pref.PreferenceFile pref;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer premium;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> loginData;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> firstName;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> storedImageUrl;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy qrCodeScanner$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> token;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> status;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean changestatus;
    
    @javax.inject.Inject()
    public MyProfileVM(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository repository, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.CacheUtil cacheUtil, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile pref) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPremium() {
        return null;
    }
    
    public final void setPremium(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getLoginData() {
        return null;
    }
    
    public final void setLoginData(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getStoredImageUrl() {
        return null;
    }
    
    public final void setStoredImageUrl(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.views.myprofile.qrcodescanner.QrCodeScannerFragment getQrCodeScanner() {
        return null;
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
    public final androidx.databinding.ObservableBoolean getChangestatus() {
        return null;
    }
    
    public final void setChangestatus(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    /**
     * Click Implementing Here
     */
    public final void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    /**
     * call Get Profile Api..
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getProfile() {
        return null;
    }
    
    private final void getProfileImageUrl() {
    }
    
    public final void myProfileData() {
    }
}