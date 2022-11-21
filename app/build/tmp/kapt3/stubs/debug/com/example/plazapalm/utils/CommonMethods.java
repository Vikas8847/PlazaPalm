package com.example.plazapalm.utils;

import java.lang.System;

@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u00108\u001a\u00020)J!\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\n2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00170;\u00a2\u0006\u0002\u0010<J\u001a\u0010=\u001a\u0004\u0018\u00010\u00172\u0006\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u0017H\u0002J\u0006\u0010@\u001a\u00020)J\u0006\u0010A\u001a\u00020BJ\u0016\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0017J\b\u0010G\u001a\u00020BH\u0007J\u0006\u0010H\u001a\u00020BJ\u0010\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010K\u001a\u00020JJ\u0006\u0010L\u001a\u00020BJ\u0016\u0010M\u001a\u00020B2\u0006\u0010\t\u001a\u00020N2\u0006\u0010>\u001a\u00020\u0017J\u0017\u0010O\u001a\u00020B2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010)\u00a2\u0006\u0002\u0010QR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00170\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00105\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\b\u00a8\u0006R"}, d2 = {"Lcom/example/plazapalm/utils/CommonMethods;", "", "()V", "advanceMap_Permission_ID", "", "getAdvanceMap_Permission_ID", "()I", "setAdvanceMap_Permission_ID", "(I)V", "context", "Landroid/app/Activity;", "getContext", "()Landroid/app/Activity;", "setContext", "(Landroid/app/Activity;)V", "currentLocation", "Lcom/google/android/gms/maps/model/LatLng;", "getCurrentLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "setCurrentLocation", "(Lcom/google/android/gms/maps/model/LatLng;)V", "deviceToken", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getDeviceToken", "()Landroidx/databinding/ObservableField;", "setDeviceToken", "(Landroidx/databinding/ObservableField;)V", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "email", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "isAdvanceMap", "", "()Z", "setAdvanceMap", "(Z)V", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getMFusedLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setMFusedLocationClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "pERMISSION_ID", "getPERMISSION_ID", "setPERMISSION_ID", "checkPermissions", "activity", "permission", "", "(Landroid/app/Activity;[Ljava/lang/String;)I", "getColoredSpanned", "text", "color", "isLocationEnabled", "openAddQuestionDialog", "", "persistImage", "bitmap", "Landroid/graphics/Bitmap;", "name", "requestNewLocationData", "requestPermissions", "saveBitmapToFile", "Ljava/io/File;", "file", "showSwipeDeleteAccountDialog", "showToast", "Landroid/content/Context;", "statusBar", "isWhite", "(Ljava/lang/Boolean;)V", "app_debug"})
public final class CommonMethods {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.plazapalm.utils.CommonMethods INSTANCE = null;
    private static int pERMISSION_ID = 42;
    
    /**
     * *This id is use for AdvanceMap Fragment
     */
    private static int advanceMap_Permission_ID = 45;
    private static boolean isAdvanceMap = false;
    @org.jetbrains.annotations.NotNull()
    private static android.app.Activity context;
    
    /**
     * *Delete Alert For Swipe to Delete class ...
     */
    @org.jetbrains.annotations.Nullable()
    private static android.app.Dialog dialog;
    public static com.google.android.gms.location.FusedLocationProviderClient mFusedLocationClient;
    public static com.google.android.gms.maps.model.LatLng currentLocation;
    private static final com.google.android.gms.location.LocationCallback mLocationCallback = null;
    @org.jetbrains.annotations.NotNull()
    private static androidx.databinding.ObservableField<java.lang.String> deviceToken;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String email;
    
    private CommonMethods() {
        super();
    }
    
    public final int getPERMISSION_ID() {
        return 0;
    }
    
    public final void setPERMISSION_ID(int p0) {
    }
    
    public final int getAdvanceMap_Permission_ID() {
        return 0;
    }
    
    public final void setAdvanceMap_Permission_ID(int p0) {
    }
    
    /**
     * status bar change according to screen requirement (primary color and white color)
     */
    public final void statusBar(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean isWhite) {
    }
    
    public final boolean isAdvanceMap() {
        return false;
    }
    
    public final void setAdvanceMap(boolean p0) {
    }
    
    /**
     * Common Toast Bar You can use every where in the application using context
     */
    public final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    private final java.lang.String getColoredSpanned(java.lang.String text, java.lang.String color) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Dialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    public final void showSwipeDeleteAccountDialog() {
    }
    
    /**
     * Open Add question Alert ...
     */
    public final void openAddQuestionDialog() {
    }
    
    public final int checkPermissions(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permission) {
        return 0;
    }
    
    public final boolean isLocationEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.FusedLocationProviderClient getMFusedLocationClient() {
        return null;
    }
    
    public final void setMFusedLocationClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void requestNewLocationData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getCurrentLocation() {
        return null;
    }
    
    public final void setCurrentLocation(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    public final boolean checkPermissions() {
        return false;
    }
    
    public final void requestPermissions() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File saveBitmapToFile(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    public final void persistImage(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getDeviceToken() {
        return null;
    }
    
    public final void setDeviceToken(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}