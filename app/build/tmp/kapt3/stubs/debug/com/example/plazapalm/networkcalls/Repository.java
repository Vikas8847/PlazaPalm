package com.example.plazapalm.networkcalls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0002JF\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\u0012*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\u001b0\u001aJ\b\u0010\u001c\u001a\u00020\u0010H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/plazapalm/networkcalls/Repository;", "", "retrofitApi", "Lcom/example/plazapalm/networkcalls/RetrofitApi;", "cacheUtil", "Lcom/example/plazapalm/networkcalls/CacheUtil;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "(Lcom/example/plazapalm/networkcalls/RetrofitApi;Lcom/example/plazapalm/networkcalls/CacheUtil;Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "aD", "Landroid/app/AlertDialog$Builder;", "getAD", "()Landroid/app/AlertDialog$Builder;", "setAD", "(Landroid/app/AlertDialog$Builder;)V", "getRefreshToken", "", "makeCall", "T", "apiKey", "Lcom/example/plazapalm/networkcalls/ApiEnums;", "loader", "", "saveInCache", "getFromCache", "requestProcessor", "Lcom/example/plazapalm/networkcalls/ApiProcessor;", "Lretrofit2/Response;", "showErrorDialog", "app_debug"})
public final class Repository {
    private final com.example.plazapalm.networkcalls.RetrofitApi retrofitApi = null;
    private final com.example.plazapalm.networkcalls.CacheUtil cacheUtil = null;
    private final com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil = null;
    @org.jetbrains.annotations.Nullable()
    private android.app.AlertDialog.Builder aD;
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.RetrofitApi retrofitApi, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.CacheUtil cacheUtil, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.AlertDialog.Builder getAD() {
        return null;
    }
    
    public final void setAD(@org.jetbrains.annotations.Nullable()
    android.app.AlertDialog.Builder p0) {
    }
    
    public final <T extends java.lang.Object>void makeCall(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.ApiEnums apiKey, boolean loader, boolean saveInCache, boolean getFromCache, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.ApiProcessor<retrofit2.Response<T>> requestProcessor) {
    }
    
    private final void getRefreshToken() {
    }
    
    private final void showErrorDialog() {
    }
}