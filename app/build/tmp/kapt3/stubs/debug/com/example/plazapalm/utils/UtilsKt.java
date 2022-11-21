package com.example.plazapalm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000j\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0012\u0010\u0003\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001a \u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001a\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010\u0011\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0001H\u0007\u001a\u0012\u0010\u001a\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0001\u001a\u0012\u0010\u001b\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u001c\u001a\u00020\u001d*\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0001H\u0007\u001a\n\u0010\u001f\u001a\u00020\u001d*\u00020\u0018\u001a\n\u0010 \u001a\u00020!*\u00020\u0018\u001a\u001c\u0010\"\u001a\u00020\u001d*\u00020\u00182\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&\u001a\u001c\u0010\'\u001a\u00020\u001d*\u00020\u00182\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&\u001a\u001a\u0010(\u001a\u00020\u001d*\u00020\u00182\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020!\u001a\u001a\u0010,\u001a\u00020\u001d*\u00020\u00182\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0006\u001a\n\u00100\u001a\u00020\u001d*\u00020\u0018\u001a\u001c\u00101\u001a\u00020\u001d*\u00020\u00182\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&\u001a\u0018\u00102\u001a\u00020\u001d*\u00020\u00182\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000104\u001a\u0012\u00105\u001a\u00020\u001d*\u00020\u00182\u0006\u00106\u001a\u00020\u0006\u001a\u0012\u00107\u001a\u00020\u001d*\u00020\u00182\u0006\u00108\u001a\u00020\u0001\u001a\u0012\u00109\u001a\u00020\u001d*\u00020\u00182\u0006\u00108\u001a\u00020\u0001\u00a8\u0006:"}, d2 = {"changeTimeFormat", "", "input", "getDateBooking", "getMonthName", "int", "", "getPartFromFile", "Lokhttp3/MultipartBody$Part;", "file", "Ljava/io/File;", "param", "contentType", "getPartFromFileLocal", "string", "getPartRequestBody", "Lokhttp3/RequestBody;", "getTimeAgo", "date", "getTimeBooking", "getTimeStampFromMillis", "milliSec", "", "changeDateFormat", "Landroid/content/Context;", "changeDateFormatReorder", "changeDateFormatSchedule", "changeDecimalPlaces", "changeLang", "", "lang", "goBack", "isNetworkAvailable", "", "loadFragment", "fragment", "Landroidx/fragment/app/Fragment;", "bundle", "Landroid/os/Bundle;", "loadFragmentAndClearStack", "openActivity", "intent", "Landroid/content/Intent;", "finishAffinity", "playAnim", "view", "Landroid/view/View;", "anim", "pop", "popCurrentAndLoad", "selectDate", "observableField", "Landroidx/databinding/ObservableField;", "setStatusBarColor", "color", "showNegativeAlerter", "message", "showPositiveAlerter", "app_debug"})
public final class UtilsKt {
    
    /**
     * Fragment Transaction
     */
    public static final void loadFragment(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$loadFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    public static final void pop(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$pop) {
    }
    
    public static final void loadFragmentAndClearStack(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$loadFragmentAndClearStack, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    public static final void popCurrentAndLoad(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$popCurrentAndLoad, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    /**
     * ActivityTransaction
     */
    public static final void openActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openActivity, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent, boolean finishAffinity) {
    }
    
    /**
     * backPress
     */
    public static final void goBack(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$goBack) {
    }
    
    /**
     * monthName
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getMonthName(int p0_52215) {
        return null;
    }
    
    /**
     * Status Bar Color Changer
     */
    public static final void setStatusBarColor(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$setStatusBarColor, int color) {
    }
    
    /**
     * Internet Connection Detector
     */
    public static final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isNetworkAvailable) {
        return false;
    }
    
    /**
     * Positive Alerter
     */
    public static final void showNegativeAlerter(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showNegativeAlerter, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * Negative Alerter
     */
    public static final void showPositiveAlerter(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showPositiveAlerter, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * Animation Util
     */
    public static final void playAnim(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$playAnim, @org.jetbrains.annotations.NotNull()
    android.view.View view, int anim) {
    }
    
    /**
     * DatePicker
     */
    public static final void selectDate(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$selectDate, @org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> observableField) {
    }
    
    /**
     * string to part request body
     */
    @org.jetbrains.annotations.Nullable()
    public static final okhttp3.RequestBody getPartRequestBody(@org.jetbrains.annotations.Nullable()
    java.lang.String string) {
        return null;
    }
    
    /**
     * File to Part
     */
    @org.jetbrains.annotations.Nullable()
    public static final okhttp3.MultipartBody.Part getPartFromFile(@org.jetbrains.annotations.Nullable()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.lang.String param, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        return null;
    }
    
    /**
     * File to Part
     */
    @org.jetbrains.annotations.Nullable()
    public static final okhttp3.MultipartBody.Part getPartFromFileLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String string, @org.jetbrains.annotations.NotNull()
    java.lang.String param, @org.jetbrains.annotations.NotNull()
    java.lang.String contentType) {
        return null;
    }
    
    /**
     * Change Time Format
     */
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String changeTimeFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String getTimeStampFromMillis(long milliSec) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String getTimeAgo(@org.jetbrains.annotations.Nullable()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String getDateBooking(@org.jetbrains.annotations.Nullable()
    java.lang.String input) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String getTimeBooking(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
    
    /**
     * Session Expired Alert
     */
    @android.annotation.SuppressLint(value = {"PackageManagerGetSignatures"})
    public static final void changeLang(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$changeLang, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String changeDateFormat(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$changeDateFormat, @org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String changeDateFormatSchedule(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$changeDateFormatSchedule, @org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public static final java.lang.String changeDateFormatReorder(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$changeDateFormatReorder, @org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String changeDecimalPlaces(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$changeDecimalPlaces, @org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
}