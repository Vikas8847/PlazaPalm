package com.example.plazapalm.views.updatemail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R(\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012\u00a8\u0006$"}, d2 = {"Lcom/example/plazapalm/views/updatemail/UpdateEmailVM;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "cacheUtil", "Lcom/example/plazapalm/networkcalls/CacheUtil;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "(Lcom/example/plazapalm/networkcalls/Repository;Lcom/example/plazapalm/networkcalls/CacheUtil;Lcom/example/plazapalm/datastore/DataStoreUtil;Lcom/example/plazapalm/pref/PreferenceFile;)V", "currentEmail", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getCurrentEmail", "()Landroidx/databinding/ObservableField;", "setCurrentEmail", "(Landroidx/databinding/ObservableField;)V", "emailUpdateType", "getEmailUpdateType", "setEmailUpdateType", "newEmail", "getNewEmail", "setNewEmail", "token", "getToken", "setToken", "callUpdateEmail", "Lkotlinx/coroutines/Job;", "view", "Landroid/view/View;", "onClicks", "", "updateMailValidation", "", "app_debug"})
public final class UpdateEmailVM extends androidx.lifecycle.ViewModel {
    private com.example.plazapalm.networkcalls.Repository repository;
    private com.example.plazapalm.networkcalls.CacheUtil cacheUtil;
    private com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    private com.example.plazapalm.pref.PreferenceFile pref;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> currentEmail;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> newEmail;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> token;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> emailUpdateType;
    
    @javax.inject.Inject()
    public UpdateEmailVM(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository repository, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.CacheUtil cacheUtil, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile pref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getCurrentEmail() {
        return null;
    }
    
    public final void setCurrentEmail(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getNewEmail() {
        return null;
    }
    
    public final void setNewEmail(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getEmailUpdateType() {
        return null;
    }
    
    public final void setEmailUpdateType(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    /**
     * Validation
     */
    private final boolean updateMailValidation() {
        return false;
    }
    
    /**
     * call Update Email Api..
     */
    private final kotlinx.coroutines.Job callUpdateEmail(android.view.View view) {
        return null;
    }
}