package com.example.plazapalm.pref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0015\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000fJ&\u0010\u0016\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019J\u0016\u0010\u001a\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u001b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bJ!\u0010\u001d\u001a\u00020\b\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u0002H\u001e\u00a2\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/plazapalm/pref/PreferenceFile;", "", "editor", "Landroid/content/SharedPreferences$Editor;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences$Editor;Landroid/content/SharedPreferences;)V", "clearPreference", "", "retrievLatLng", "key", "", "value", "", "retrieveBoolKey", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "retrieveImage", "retrieveKey", "retrieveLocarion", "retrivePostProfileId", "storeBoolKey", "storeImage", "Ljava/util/ArrayList;", "Lcom/example/plazapalm/models/AddPhoto;", "Lkotlin/collections/ArrayList;", "storeKey", "storeLatLng", "storeLocarion", "storeObject", "T", "data", "(Ljava/lang/String;Ljava/lang/Object;)V", "storePostProfileId", "app_debug"})
public final class PreferenceFile {
    private final android.content.SharedPreferences.Editor editor = null;
    private final android.content.SharedPreferences sharedPreferences = null;
    
    @javax.inject.Inject()
    public PreferenceFile(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor editor, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    public final void storeKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void storeBoolKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean retrieveBoolKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void storeLatLng(@org.jetbrains.annotations.NotNull()
    java.lang.String key, double value) {
    }
    
    public final void retrievLatLng(@org.jetbrains.annotations.NotNull()
    java.lang.String key, double value) {
    }
    
    public final void storeLocarion(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String retrieveLocarion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String retrieveKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void storePostProfileId(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String retrivePostProfileId(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void storeImage(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.AddPhoto> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String retrieveImage(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final <T extends java.lang.Object>void storeObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, T data) {
    }
    
    public final void clearPreference() {
    }
}