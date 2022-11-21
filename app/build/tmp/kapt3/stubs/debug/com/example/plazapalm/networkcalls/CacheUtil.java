package com.example.plazapalm.networkcalls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J6\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0014J\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0014\u00a8\u0006\u0011"}, d2 = {"Lcom/example/plazapalm/networkcalls/CacheUtil;", "Landroidx/collection/LruCache;", "Lcom/example/plazapalm/networkcalls/ApiEnums;", "Lretrofit2/Response;", "", "maxSize", "", "(I)V", "entryRemoved", "", "evicted", "", "key", "oldValue", "newValue", "sizeOf", "value", "app_debug"})
public final class CacheUtil extends androidx.collection.LruCache<com.example.plazapalm.networkcalls.ApiEnums, retrofit2.Response<java.lang.Object>> {
    
    public CacheUtil() {
        super(0);
    }
    
    public CacheUtil(int maxSize) {
        super(0);
    }
    
    @java.lang.Override()
    protected void entryRemoved(boolean evicted, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.ApiEnums key, @org.jetbrains.annotations.NotNull()
    retrofit2.Response<java.lang.Object> oldValue, @org.jetbrains.annotations.Nullable()
    retrofit2.Response<java.lang.Object> newValue) {
    }
    
    @java.lang.Override()
    protected int sizeOf(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.ApiEnums key, @org.jetbrains.annotations.NotNull()
    retrofit2.Response<java.lang.Object> value) {
        return 0;
    }
}