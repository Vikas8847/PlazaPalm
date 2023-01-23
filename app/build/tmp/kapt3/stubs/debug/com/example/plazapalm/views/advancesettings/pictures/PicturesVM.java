package com.example.plazapalm.views.advancesettings.pictures;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0015"}, d2 = {"Lcom/example/plazapalm/views/advancesettings/pictures/PicturesVM;", "Landroidx/lifecycle/ViewModel;", "()V", "picturesAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/PicturesModel;", "getPicturesAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "picturesAdapter$delegate", "Lkotlin/Lazy;", "picturesDataList", "Ljava/util/ArrayList;", "getPicturesDataList", "()Ljava/util/ArrayList;", "setPicturesDataList", "(Ljava/util/ArrayList;)V", "onClicks", "", "view", "Landroid/view/View;", "uploadImageVideo", "app_debug"})
public final class PicturesVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.PicturesModel> picturesDataList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy picturesAdapter$delegate = null;
    
    @javax.inject.Inject()
    public PicturesVM() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.PicturesModel> getPicturesDataList() {
        return null;
    }
    
    public final void setPicturesDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.PicturesModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.PicturesModel> getPicturesAdapter() {
        return null;
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void uploadImageVideo() {
    }
}