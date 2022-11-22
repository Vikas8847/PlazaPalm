package com.example.plazapalm.views.addphotos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XJ\b\u0010Y\u001a\u00020ZH\u0002J\n\u0010[\u001a\u0004\u0018\u000101H\u0002J\u0012\u0010\\\u001a\u0004\u0018\u00010+2\b\u0010]\u001a\u0004\u0018\u00010^J\"\u0010_\u001a\u00020Z2\u0006\u0010`\u001a\u00020\u00052\u0006\u0010a\u001a\u00020\u00052\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J \u0010d\u001a\u00020Z2\u0006\u0010W\u001a\u00020X2\u0006\u0010e\u001a\u00020+2\u0006\u0010f\u001a\u00020\u0005H\u0016J&\u0010g\u001a\u0004\u0018\u00010X2\u0006\u0010h\u001a\u00020i2\b\u0010j\u001a\u0004\u0018\u00010k2\b\u0010l\u001a\u0004\u0018\u00010\u0019H\u0016J-\u0010m\u001a\u00020Z2\u0006\u0010`\u001a\u00020\u00052\u000e\u0010n\u001a\n\u0012\u0006\b\u0001\u0012\u00020+0o2\u0006\u0010p\u001a\u00020qH\u0016\u00a2\u0006\u0002\u0010rJ\u001a\u0010s\u001a\u00020Z2\u0006\u0010W\u001a\u00020X2\b\u0010l\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010t\u001a\u00020ZH\u0002J\b\u0010u\u001a\u00020ZH\u0003J\b\u0010v\u001a\u00020ZH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u00106\u001a\b\u0012\u0004\u0012\u00020807X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010=\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010C\u001a\u00020D8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001e\u0010I\u001a\u00020J8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001b\u0010O\u001a\u00020P8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bQ\u0010R\u00a8\u0006w"}, d2 = {"Lcom/example/plazapalm/views/addphotos/AddPhotosFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/plazapalm/interfaces/ItemClickListener;", "()V", "GALARY_REQUEST_CODE", "", "getGALARY_REQUEST_CODE", "()I", "MY_CAMERA_PERMISSION_CODE", "getMY_CAMERA_PERMISSION_CODE", "REQUEST_CODEE", "getREQUEST_CODEE", "addPhotosAdapter", "Lcom/example/plazapalm/views/addphotos/adapter/AddPhotosAdapter;", "getAddPhotosAdapter", "()Lcom/example/plazapalm/views/addphotos/adapter/AddPhotosAdapter;", "setAddPhotosAdapter", "(Lcom/example/plazapalm/views/addphotos/adapter/AddPhotosAdapter;)V", "binding", "Lcom/example/plazapalm/databinding/AddPhotosFragmentBinding;", "getBinding", "()Lcom/example/plazapalm/databinding/AddPhotosFragmentBinding;", "setBinding", "(Lcom/example/plazapalm/databinding/AddPhotosFragmentBinding;)V", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "getDataStoreUtil", "()Lcom/example/plazapalm/datastore/DataStoreUtil;", "setDataStoreUtil", "(Lcom/example/plazapalm/datastore/DataStoreUtil;)V", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "imagePath", "", "getImagePath", "()Ljava/lang/String;", "setImagePath", "(Ljava/lang/String;)V", "photoFile", "Ljava/io/File;", "getPhotoFile", "()Ljava/io/File;", "setPhotoFile", "(Ljava/io/File;)V", "photoList", "Ljava/util/ArrayList;", "Lcom/example/plazapalm/models/AddPhoto;", "getPhotoList", "()Ljava/util/ArrayList;", "setPhotoList", "(Ljava/util/ArrayList;)V", "pos", "getPos", "()Ljava/lang/Integer;", "setPos", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "getPref", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPref", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "getRepository", "()Lcom/example/plazapalm/networkcalls/Repository;", "setRepository", "(Lcom/example/plazapalm/networkcalls/Repository;)V", "viewModel", "Lcom/example/plazapalm/views/addphotos/AddPhotosVM;", "getViewModel", "()Lcom/example/plazapalm/views/addphotos/AddPhotosVM;", "viewModel$delegate", "Lkotlin/Lazy;", "UploadMedia", "Lkotlinx/coroutines/Job;", "view", "Landroid/view/View;", "click", "", "createImageFile", "getPath", "uri", "Landroid/net/Uri;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "type", "position", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "openCameraIntent", "setAdapter", "showChooseOptionAccountDialog", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddPhotosFragment extends androidx.fragment.app.Fragment implements com.example.plazapalm.interfaces.ItemClickListener {
    @javax.inject.Inject()
    public com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    @javax.inject.Inject()
    public com.example.plazapalm.pref.PreferenceFile pref;
    @javax.inject.Inject()
    public com.example.plazapalm.networkcalls.Repository repository;
    @org.jetbrains.annotations.Nullable()
    private com.example.plazapalm.databinding.AddPhotosFragmentBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private java.io.File photoFile;
    private final int GALARY_REQUEST_CODE = 201;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.AddPhoto> photoList;
    public com.example.plazapalm.views.addphotos.adapter.AddPhotosAdapter addPhotosAdapter;
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog dialog;
    private final int REQUEST_CODEE = 200;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer pos = 0;
    public android.os.Bundle bundle;
    private final int MY_CAMERA_PERMISSION_CODE = 100;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imagePath;
    
    public AddPhotosFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.datastore.DataStoreUtil getDataStoreUtil() {
        return null;
    }
    
    public final void setDataStoreUtil(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.pref.PreferenceFile getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.networkcalls.Repository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.plazapalm.databinding.AddPhotosFragmentBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    com.example.plazapalm.databinding.AddPhotosFragmentBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.views.addphotos.AddPhotosVM getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getPhotoFile() {
        return null;
    }
    
    public final void setPhotoFile(@org.jetbrains.annotations.Nullable()
    java.io.File p0) {
    }
    
    public final int getGALARY_REQUEST_CODE() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.AddPhoto> getPhotoList() {
        return null;
    }
    
    public final void setPhotoList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.AddPhoto> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.views.addphotos.adapter.AddPhotosAdapter getAddPhotosAdapter() {
        return null;
    }
    
    public final void setAddPhotosAdapter(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.views.addphotos.adapter.AddPhotosAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Dialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    public final int getREQUEST_CODEE() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPos() {
        return null;
    }
    
    public final void setPos(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Bundle getBundle() {
        return null;
    }
    
    public final void setBundle(@org.jetbrains.annotations.NotNull()
    android.os.Bundle p0) {
    }
    
    public final int getMY_CAMERA_PERMISSION_CODE() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void click() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void setAdapter() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImagePath() {
        return null;
    }
    
    public final void setImagePath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final java.io.File createImageFile() throws java.io.IOException {
        return null;
    }
    
    private final void openCameraIntent() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int position) {
    }
    
    private final void showChooseOptionAccountDialog() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPath(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri) {
        return null;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job UploadMedia(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
}