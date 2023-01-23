package com.example.plazapalm.views.advancesettings.pictures;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0002J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020#H\u0016J\b\u0010-\u001a\u00020#H\u0016J\b\u0010.\u001a\u00020#H\u0016J\u001a\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00101\u001a\u00020#H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086D\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\u00a8\u00062"}, d2 = {"Lcom/example/plazapalm/views/advancesettings/pictures/ShowPictureVideoFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/plazapalm/databinding/ShowPictureVideoFragmentBinding;", "mediaController", "Landroid/widget/MediaController;", "getMediaController", "()Landroid/widget/MediaController;", "setMediaController", "(Landroid/widget/MediaController;)V", "position", "", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "videoUrl", "", "getVideoUrl", "()Ljava/lang/String;", "setVideoUrl", "(Ljava/lang/String;)V", "videoView", "Landroid/widget/VideoView;", "getVideoView", "()Landroid/widget/VideoView;", "setVideoView", "(Landroid/widget/VideoView;)V", "viewModel", "Lcom/example/plazapalm/views/advancesettings/pictures/ShowPictureVideoVM;", "getViewModel", "()Lcom/example/plazapalm/views/advancesettings/pictures/ShowPictureVideoVM;", "viewModel$delegate", "Lkotlin/Lazy;", "clicks", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStop", "onViewCreated", "view", "setUpVideoPlayer", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ShowPictureVideoFragment extends androidx.fragment.app.Fragment {
    public android.widget.VideoView videoView;
    public android.widget.MediaController mediaController;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer position = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String videoUrl = "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1";
    private com.example.plazapalm.databinding.ShowPictureVideoFragmentBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public ShowPictureVideoFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.VideoView getVideoView() {
        return null;
    }
    
    public final void setVideoView(@org.jetbrains.annotations.NotNull()
    android.widget.VideoView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.MediaController getMediaController() {
        return null;
    }
    
    public final void setMediaController(@org.jetbrains.annotations.NotNull()
    android.widget.MediaController p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVideoUrl() {
        return null;
    }
    
    public final void setVideoUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final com.example.plazapalm.views.advancesettings.pictures.ShowPictureVideoVM getViewModel() {
        return null;
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
    
    private final void setUpVideoPlayer() {
    }
    
    private final void clicks() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
}