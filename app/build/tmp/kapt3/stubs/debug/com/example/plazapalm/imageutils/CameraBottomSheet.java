package com.example.plazapalm.imageutils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ&\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J&\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/plazapalm/imageutils/CameraBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "galleryResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "cameraResult", "activity", "Landroid/app/Activity;", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/ActivityResultLauncher;Landroid/app/Activity;)V", "selectImage", "", "dialog", "Landroid/app/Dialog;", "setupDialog", "style", "", "takeImage", "app_debug"})
public final class CameraBottomSheet extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> galleryResult = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> cameraResult = null;
    private final android.app.Activity activity = null;
    
    public CameraBottomSheet(@org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> galleryResult, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> cameraResult, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override()
    public void setupDialog(@org.jetbrains.annotations.NotNull()
    android.app.Dialog dialog, int style) {
    }
    
    private final void takeImage(android.app.Activity activity, androidx.activity.result.ActivityResultLauncher<android.content.Intent> cameraResult, android.app.Dialog dialog) {
    }
    
    private final void selectImage(android.app.Activity activity, androidx.activity.result.ActivityResultLauncher<android.content.Intent> galleryResult, android.app.Dialog dialog) {
    }
}