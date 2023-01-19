package com.example.plazapalm.views.advancesettings.editfontpage;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(J\u0012\u0010)\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010+H\u0003J\b\u0010,\u001a\u00020&H\u0002J\b\u0010-\u001a\u00020&H\u0003J\b\u0010.\u001a\u00020&H\u0003J\b\u0010/\u001a\u00020&H\u0003J\b\u00100\u001a\u00020&H\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00061"}, d2 = {"Lcom/example/plazapalm/views/advancesettings/editfontpage/EditFrontPageVM;", "Landroidx/lifecycle/ViewModel;", "()V", "appCompatTextView", "Landroidx/appcompat/widget/AppCompatTextView;", "getAppCompatTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "setAppCompatTextView", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "fontBottomSheet", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getFontBottomSheet", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "setFontBottomSheet", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "fontListAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/FontsListModelResponse;", "getFontListAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "fontListAdapter$delegate", "Lkotlin/Lazy;", "fontsFilteredList", "Ljava/util/ArrayList;", "getFontsFilteredList", "()Ljava/util/ArrayList;", "setFontsFilteredList", "(Ljava/util/ArrayList;)V", "fontsNameList", "getFontsNameList", "setFontsNameList", "scheduleBinding", "Lcom/example/plazapalm/databinding/FontsListFragmentBinding;", "getScheduleBinding", "()Lcom/example/plazapalm/databinding/FontsListFragmentBinding;", "setScheduleBinding", "(Lcom/example/plazapalm/databinding/FontsListFragmentBinding;)V", "onClicks", "", "view", "Landroid/view/View;", "search", "text", "", "searchFunctionality", "setAdapter", "setFontsInAdapterList", "showBottomSheetDialogOne", "updateRecyclerView", "app_debug"})
public final class EditFrontPageVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.FontsListModelResponse> fontsNameList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.FontsListModelResponse> fontsFilteredList;
    @org.jetbrains.annotations.Nullable()
    private com.example.plazapalm.databinding.FontsListFragmentBinding scheduleBinding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy fontListAdapter$delegate = null;
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private androidx.appcompat.widget.AppCompatTextView appCompatTextView;
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
    public final java.util.ArrayList<com.example.plazapalm.models.FontsListModelResponse> getFontsFilteredList() {
        return null;
    }
    
    public final void setFontsFilteredList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.FontsListModelResponse> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.plazapalm.databinding.FontsListFragmentBinding getScheduleBinding() {
        return null;
    }
    
    public final void setScheduleBinding(@org.jetbrains.annotations.Nullable()
    com.example.plazapalm.databinding.FontsListFragmentBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.FontsListModelResponse> getFontListAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.widget.AppCompatTextView getAppCompatTextView() {
        return null;
    }
    
    public final void setAppCompatTextView(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.AppCompatTextView p0) {
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
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged", "ResourceType"})
    private final void showBottomSheetDialogOne() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged", "ResourceType"})
    private final void setAdapter() {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setFontsInAdapterList() {
    }
    
    private final void searchFunctionality() {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void search(java.lang.String text) {
    }
    
    private final void updateRecyclerView() {
    }
}