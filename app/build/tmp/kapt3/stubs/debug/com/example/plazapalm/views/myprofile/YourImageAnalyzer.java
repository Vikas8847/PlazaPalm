package com.example.plazapalm.views.myprofile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J \u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\u0018\u0010 \u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\b\u0005\u00a8\u0006$"}, d2 = {"Lcom/example/plazapalm/views/myprofile/YourImageAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "()V", "ORIENTATIONS", "Landroid/util/SparseIntArray;", "ORIENTATIONS$1", "analyze", "", "imageProxy", "Landroidx/camera/core/ImageProxy;", "getCompensation", "activity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "isFrontFacing", "", "getRotationCompensation", "", "cameraId", "", "imageFromArray", "byteArray", "", "rotationDegrees", "imageFromBuffer", "byteBuffer", "Ljava/nio/ByteBuffer;", "imageFromMediaImage", "mediaImage", "Landroid/media/Image;", "rotation", "imageFromPath", "uri", "Landroid/net/Uri;", "Companion", "app_debug"})
final class YourImageAnalyzer implements androidx.camera.core.ImageAnalysis.Analyzer {
    private final android.util.SparseIntArray ORIENTATIONS$1 = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.plazapalm.views.myprofile.YourImageAnalyzer.Companion Companion = null;
    private static final java.lang.String TAG = "MLKIT";
    private static final java.lang.String MY_CAMERA_ID = "my_camera_id";
    private static final android.util.SparseIntArray ORIENTATIONS = null;
    
    public YourImageAnalyzer() {
        super();
    }
    
    private final void imageFromMediaImage(android.media.Image mediaImage, int rotation) {
    }
    
    private final void imageFromBuffer(java.nio.ByteBuffer byteBuffer, int rotationDegrees) {
    }
    
    private final void imageFromArray(byte[] byteArray, int rotationDegrees) {
    }
    
    private final void imageFromPath(android.content.Context context, android.net.Uri uri) {
    }
    
    @android.annotation.SuppressLint(value = {"UnsafeOptInUsageError"})
    @java.lang.Override()
    public void analyze(@org.jetbrains.annotations.NotNull()
    androidx.camera.core.ImageProxy imageProxy) {
    }
    
    /**
     * Get the angle by which an image must be rotated given the device's current
     * orientation.
     */
    @kotlin.jvm.Throws(exceptionClasses = {android.hardware.camera2.CameraAccessException.class})
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    private final int getRotationCompensation(java.lang.String cameraId, android.app.Activity activity, boolean isFrontFacing) throws android.hardware.camera2.CameraAccessException {
        return 0;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {android.hardware.camera2.CameraAccessException.class})
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP)
    private final void getCompensation(android.app.Activity activity, android.content.Context context, boolean isFrontFacing) throws android.hardware.camera2.CameraAccessException {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/plazapalm/views/myprofile/YourImageAnalyzer$Companion;", "", "()V", "MY_CAMERA_ID", "", "ORIENTATIONS", "Landroid/util/SparseIntArray;", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}