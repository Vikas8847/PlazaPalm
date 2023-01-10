package com.example.plazapalm.views.advancesettings.editfontpage;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lcom/example/plazapalm/views/advancesettings/editfontpage/EditFrontPageVM;", "Landroidx/lifecycle/ViewModel;", "()V", "fontBottomSheet", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getFontBottomSheet", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "setFontBottomSheet", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "fontListAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/FontsListModelResponse;", "getFontListAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "fontListAdapter$delegate", "Lkotlin/Lazy;", "fontsNameList", "Ljava/util/ArrayList;", "getFontsNameList", "()Ljava/util/ArrayList;", "setFontsNameList", "(Ljava/util/ArrayList;)V", "onClicks", "", "view", "Landroid/view/View;", "setAdapter", "showBottomSheetDialogOne", "app_debug"})
public final class EditFrontPageVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.FontsListModelResponse> fontsNameList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy fontListAdapter$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.bottomsheet.BottomSheetDialog fontBottomSheet;
    
    @javax.inject.Inject()
    public EditFrontPageVM() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.FontsListModelResponse> getFontsNameList() {
        return null;
    }
    
    public final void setFontsNameList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.FontsListModelResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.FontsListModelResponse> getFontListAdapter() {
        return null;
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.material.bottomsheet.BottomSheetDialog getFontBottomSheet() {
        return null;
    }
    
    public final void setFontBottomSheet(@org.jetbrains.annotations.Nullable()
    com.google.android.material.bottomsheet.BottomSheetDialog p0) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void showBottomSheetDialogOne() {
    }
    
    private final void setAdapter() {
    }
}