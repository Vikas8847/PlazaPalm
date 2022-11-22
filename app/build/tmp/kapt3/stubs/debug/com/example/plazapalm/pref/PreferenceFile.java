package com.example.plazapalm.pref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0015\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\nJ&\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aJ\u0016\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fJ\u0016\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0014J\u000e\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\fJ!\u0010\u001e\u001a\u00020\b\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010 \u001a\u0002H\u001f\u00a2\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/plazapalm/pref/PreferenceFile;", "", "editor", "Landroid/content/SharedPreferences$Editor;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences$Editor;Landroid/content/SharedPreferences;)V", "clearPreference", "", "retrieveBoolKey", "", "key", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "retrieveImage", "retrieveKey", "retrieveLocarion", "retrieveResponse", "Lcom/example/plazapalm/models/SavePostProfileResponse;", "retvieLatlong", "", "storeBoolKey", "value", "storeImage", "Ljava/util/ArrayList;", "Lcom/example/plazapalm/models/AddPhoto;", "Lkotlin/collections/ArrayList;", "storeKey", "storeLatlong", "storeLocarion", "storeObject", "T", "data", "(Ljava/lang/String;Ljava/lang/Object;)V", "storeResponse", "body", "app_debug"})
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
    
    public final void storeResponse(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.models.SavePostProfileResponse body) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.plazapalm.models.SavePostProfileResponse retrieveResponse() {
        return null;
    }
    
    public final void storeLocarion(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void storeLatlong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float value) {
    }
    
    public final float retvieLatlong(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0.0F;
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