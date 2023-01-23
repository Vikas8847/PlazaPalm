package com.example.plazapalm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/example/plazapalm/utils/AppController;", "Landroid/app/Application;", "()V", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "getDataStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "Companion", "app_debug"})
@dagger.hilt.android.HiltAndroidApp()
public final class AppController extends android.app.Application {
    @javax.inject.Inject()
    public com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.plazapalm.utils.AppController.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static android.content.Context appContext;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LANG = "en";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String language = "en";
    private static double CURRENT_LAT = 0.0;
    private static double CURRENT_LONG = 0.0;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String CURRENT_ADDRESS = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String LOC_ACCURACY = "";
    
    public AppController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.datastore.DataStoreUtil getDataStoreUtil() {
        return null;
    }
    
    public final void setDataStoreUtil(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil p0) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\b\u00a8\u0006\u001f"}, d2 = {"Lcom/example/plazapalm/utils/AppController$Companion;", "", "()V", "CURRENT_ADDRESS", "", "getCURRENT_ADDRESS", "()Ljava/lang/String;", "setCURRENT_ADDRESS", "(Ljava/lang/String;)V", "CURRENT_LAT", "", "getCURRENT_LAT", "()D", "setCURRENT_LAT", "(D)V", "CURRENT_LONG", "getCURRENT_LONG", "setCURRENT_LONG", "LANG", "LOC_ACCURACY", "getLOC_ACCURACY", "setLOC_ACCURACY", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "setAppContext", "(Landroid/content/Context;)V", "language", "getLanguage", "setLanguage", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Context getAppContext() {
            return null;
        }
        
        public final void setAppContext(@org.jetbrains.annotations.Nullable()
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLanguage() {
            return null;
        }
        
        public final void setLanguage(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final double getCURRENT_LAT() {
            return 0.0;
        }
        
        public final void setCURRENT_LAT(double p0) {
        }
        
        public final double getCURRENT_LONG() {
            return 0.0;
        }
        
        public final void setCURRENT_LONG(double p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCURRENT_ADDRESS() {
            return null;
        }
        
        public final void setCURRENT_ADDRESS(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLOC_ACCURACY() {
            return null;
        }
        
        public final void setLOC_ACCURACY(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}