package com.example.plazapalm.datastore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bJ4\u0010\r\u001a\u00020\t\"\b\b\u0000\u0010\u000e*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u000e\u0012\u0004\u0012\u00020\t0\u000bJ>\u0010\u0011\u001a\u00020\t\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00142\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u000e\u0012\u0004\u0012\u00020\t0\u000bJ.\u0010\u0015\u001a\u00020\t\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bJ\'\u0010\u0017\u001a\u00020\t\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\u0006\u0010\u0018\u001a\u0002H\u000e\u00a2\u0006\u0002\u0010\u0019J\'\u0010\u001a\u001a\u00020\t\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0018\u001a\u0002H\u000e\u00a2\u0006\u0002\u0010\u0019J\'\u0010\u001b\u001a\u00020\t\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\u0006\u0010\u0018\u001a\u0002H\u000e\u00a2\u0006\u0002\u0010\u0019J4\u0010\u001c\u001a\u00020\t\"\b\b\u0000\u0010\u000e*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u000e\u0012\u0004\u0012\u00020\t0\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/plazapalm/datastore/DataStoreUtil;", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "coRoutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "(Landroidx/datastore/core/DataStore;Lkotlinx/coroutines/CoroutineExceptionHandler;)V", "clearDataStore", "", "valueIs", "Lkotlin/Function1;", "", "readData", "T", "key", "Landroidx/datastore/preferences/core/Preferences$Key;", "readObject", "", "clazz", "Ljava/lang/Class;", "removeKey", "onRemove", "saveData", "value", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "saveObject", "savephoto", "showPhoto", "app_debug"})
public final class DataStoreUtil {
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler coRoutineExceptionHandler = null;
    
    @javax.inject.Inject()
    public DataStoreUtil(@org.jetbrains.annotations.NotNull()
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineExceptionHandler coRoutineExceptionHandler) {
        super();
    }
    
    /**
     * dataStore
     */
    public final <T extends java.lang.Object>void saveData(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<T> key, T value) {
    }
    
    /**
     * SavePhoto
     */
    public final <T extends java.lang.Object>void savephoto(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<T> key, T value) {
    }
    
    public final <T extends java.lang.Object>void showPhoto(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<T> key, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> valueIs) {
    }
    
    public final <T extends java.lang.Object>void readData(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<T> key, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> valueIs) {
    }
    
    public final <T extends java.lang.Object>void saveObject(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<java.lang.String> key, T value) {
    }
    
    public final <T extends java.lang.Object>void readObject(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<java.lang.String> key, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> valueIs) {
    }
    
    public final void clearDataStore(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> valueIs) {
    }
    
    public final <T extends java.lang.Object>void removeKey(@org.jetbrains.annotations.NotNull()
    androidx.datastore.preferences.core.Preferences.Key<T> key, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onRemove) {
    }
}