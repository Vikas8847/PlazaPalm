package com.example.plazapalm.imageutils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J,\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J;\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0016H\u0002\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J4\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\bH\u0002J\u0016\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020\u0004J6\u0010(\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bJ8\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u00062\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00062\u0014\u0010-\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u000b0.H\u0007J\n\u0010/\u001a\u00020\u0006*\u00020\u0006\u00a8\u00060"}, d2 = {"Lcom/example/plazapalm/imageutils/FilePathUtil;", "", "()V", "decodeImageFromFiles", "Landroid/graphics/Bitmap;", "path", "", "width", "", "height", "deleteFile", "", "file", "Ljava/io/File;", "getCompressed", "context", "Landroid/content/Context;", "getDataColumn", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getExtension", "fileName", "getMediaFilePathFor", "compression", "", "getPathFromUri", "isDownloadsDocument", "isExternalStorageDocument", "isGooglePhotosUri", "isMediaDocument", "rotateImage", "bitmap", "degrees", "rotateImageIfRequired", "selectedImage", "img", "saveImage", "myBitmap", "saveMediaFile2Gallery", "filePath", "isVideo", "returnData", "Lkotlin/Function1;", "getFileType", "app_debug"})
public final class FilePathUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.plazapalm.imageutils.FilePathUtil INSTANCE = null;
    
    private FilePathUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getMediaFilePathFor(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, boolean compression, int width, int height) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPathFromUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    private final java.lang.String getDataColumn(android.content.Context context, android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) {
        return null;
    }
    
    private final boolean isExternalStorageDocument(android.net.Uri uri) {
        return false;
    }
    
    private final boolean isDownloadsDocument(android.net.Uri uri) {
        return false;
    }
    
    private final boolean isMediaDocument(android.net.Uri uri) {
        return false;
    }
    
    private final boolean isGooglePhotosUri(android.net.Uri uri) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File saveImage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap myBitmap, boolean compression, int width, int height) {
        return null;
    }
    
    private final java.io.File getCompressed(android.content.Context context, java.lang.String path, int width, int height) {
        return null;
    }
    
    private final android.graphics.Bitmap decodeImageFromFiles(java.lang.String path, int width, int height) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFileType(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$getFileType) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    public final void saveMediaFile2Gallery(@org.jetbrains.annotations.Nullable()
    java.lang.String filePath, boolean isVideo, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> returnData) {
    }
    
    private final void deleteFile(java.io.File file) {
    }
    
    private final java.lang.String getExtension(java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap rotateImageIfRequired(@org.jetbrains.annotations.NotNull()
    android.net.Uri selectedImage, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap img) {
        return null;
    }
    
    private final android.graphics.Bitmap rotateImage(android.graphics.Bitmap bitmap, int degrees) {
        return null;
    }
}