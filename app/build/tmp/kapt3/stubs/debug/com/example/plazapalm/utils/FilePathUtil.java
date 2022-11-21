package com.example.plazapalm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J;\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\u0013\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/example/plazapalm/utils/FilePathUtil;", "", "()V", "getDataColumn", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getPathFromUri", "isDownloadsDocument", "", "isExternalStorageDocument", "isGooglePhotosUri", "isMediaDocument", "saveImage", "myBitmap", "Landroid/graphics/Bitmap;", "app_debug"})
public final class FilePathUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.plazapalm.utils.FilePathUtil INSTANCE = null;
    
    private FilePathUtil() {
        super();
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String saveImage(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$saveImage, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap myBitmap) {
        return null;
    }
}