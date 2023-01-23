package com.example.plazapalm.views.myprofile.postprofile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00104\u001a\u000205H\u0002J \u00106\u001a\u0002052\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020;H\u0016J\u0012\u0010<\u001a\u0002052\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J&\u0010?\u001a\u0004\u0018\u0001082\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010D\u001a\u000205H\u0016J\u001a\u0010E\u001a\u0002052\u0006\u00107\u001a\u0002082\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010F\u001a\u000205H\u0003J\b\u0010G\u001a\u000205H\u0002R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\u00020/X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u00a8\u0006H"}, d2 = {"Lcom/example/plazapalm/views/myprofile/postprofile/PostProfileFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/plazapalm/interfaces/ItemClickListener;", "()V", "ImageList", "Ljava/util/ArrayList;", "Lcom/example/plazapalm/models/AddPhoto;", "Lkotlin/collections/ArrayList;", "getImageList", "()Ljava/util/ArrayList;", "setImageList", "(Ljava/util/ArrayList;)V", "binding", "Lcom/example/plazapalm/databinding/PostProfileFragmentBinding;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "getPref", "()Lcom/example/plazapalm/pref/PreferenceFile;", "setPref", "(Lcom/example/plazapalm/pref/PreferenceFile;)V", "profileStatus", "Landroidx/databinding/ObservableBoolean;", "getProfileStatus", "()Landroidx/databinding/ObservableBoolean;", "setProfileStatus", "(Landroidx/databinding/ObservableBoolean;)V", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "getRepository", "()Lcom/example/plazapalm/networkcalls/Repository;", "setRepository", "(Lcom/example/plazapalm/networkcalls/Repository;)V", "token", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getToken", "()Landroidx/databinding/ObservableField;", "setToken", "(Landroidx/databinding/ObservableField;)V", "viewModel", "Lcom/example/plazapalm/views/myprofile/postprofile/PostProfileVM;", "getViewModel", "()Lcom/example/plazapalm/views/myprofile/postprofile/PostProfileVM;", "viewModel$delegate", "Lkotlin/Lazy;", "viewProAddImageAdapter", "Lcom/example/plazapalm/views/myprofile/postprofile/adapter/ViewProAddImageAdapter;", "getViewProAddImageAdapter", "()Lcom/example/plazapalm/views/myprofile/postprofile/adapter/ViewProAddImageAdapter;", "setViewProAddImageAdapter", "(Lcom/example/plazapalm/views/myprofile/postprofile/adapter/ViewProAddImageAdapter;)V", "getBundledata", "", "onClick", "view", "Landroid/view/View;", "type", "position", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "onViewCreated", "setAdapter", "showRecyclerviewClick", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PostProfileFragment extends androidx.fragment.app.Fragment implements com.example.plazapalm.interfaces.ItemClickListener {
    @javax.inject.Inject()
    public com.example.plazapalm.pref.PreferenceFile pref;
    @javax.inject.Inject()
    public com.example.plazapalm.networkcalls.Repository repository;
    private com.example.plazapalm.databinding.PostProfileFragmentBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    public java.util.ArrayList<com.example.plazapalm.models.AddPhoto> ImageList;
    public com.example.plazapalm.views.myprofile.postprofile.adapter.ViewProAddImageAdapter viewProAddImageAdapter;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> token;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean profileStatus;
    
    public PostProfileFragment() {
        super();
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
    
    private final com.example.plazapalm.views.myprofile.postprofile.PostProfileVM getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.AddPhoto> getImageList() {
        return null;
    }
    
    public final void setImageList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.AddPhoto> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.views.myprofile.postprofile.adapter.ViewProAddImageAdapter getViewProAddImageAdapter() {
        return null;
    }
    
    public final void setViewProAddImageAdapter(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.views.myprofile.postprofile.adapter.ViewProAddImageAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getProfileStatus() {
        return null;
    }
    
    public final void setProfileStatus(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getBundledata() {
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
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void setAdapter() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void showRecyclerviewClick() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int position) {
    }
}