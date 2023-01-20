package com.example.plazapalm.views.advancesettings.editfontpage;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KJ\u0012\u0010L\u001a\u00020I2\b\u0010M\u001a\u0004\u0018\u00010$H\u0003J\b\u0010N\u001a\u00020IH\u0002J\b\u0010O\u001a\u00020IH\u0003J\b\u0010P\u001a\u00020IH\u0003J\b\u0010Q\u001a\u00020IH\u0003J\b\u0010R\u001a\u00020IH\u0002J\b\u0010S\u001a\u00020IH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\"\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u00108\u001a\b\u0012\u0004\u0012\u00020:09X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010?\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\'\"\u0004\bA\u0010)R(\u0010B\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\'\"\u0004\bD\u0010)R(\u0010E\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010$0$0#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\'\"\u0004\bG\u0010)\u00a8\u0006T"}, d2 = {"Lcom/example/plazapalm/views/advancesettings/editfontpage/EditFrontPageVM;", "Landroidx/lifecycle/ViewModel;", "()V", "appCompatTxtFont", "Landroidx/appcompat/widget/AppCompatTextView;", "getAppCompatTxtFont", "()Landroidx/appcompat/widget/AppCompatTextView;", "setAppCompatTxtFont", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "fontBottomSheet", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getFontBottomSheet", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "setFontBottomSheet", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "fontListAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/FontsListModelResponse;", "getFontListAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "fontListAdapter$delegate", "Lkotlin/Lazy;", "fontTypeface", "Landroid/graphics/Typeface;", "getFontTypeface", "()Landroid/graphics/Typeface;", "setFontTypeface", "(Landroid/graphics/Typeface;)V", "fontsFilteredList", "Ljava/util/ArrayList;", "getFontsFilteredList", "()Ljava/util/ArrayList;", "setFontsFilteredList", "(Ljava/util/ArrayList;)V", "fontsName", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getFontsName", "()Landroidx/databinding/ObservableField;", "setFontsName", "(Landroidx/databinding/ObservableField;)V", "fontsNameList", "getFontsNameList", "setFontsNameList", "isChecked", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "setChecked", "(Landroidx/databinding/ObservableBoolean;)V", "scheduleBinding", "Lcom/example/plazapalm/databinding/FontsListFragmentBinding;", "getScheduleBinding", "()Lcom/example/plazapalm/databinding/FontsListFragmentBinding;", "setScheduleBinding", "(Lcom/example/plazapalm/databinding/FontsListFragmentBinding;)V", "typfaceObserverLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getTypfaceObserverLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setTypfaceObserverLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "userProfileDescription", "getUserProfileDescription", "setUserProfileDescription", "userProfileLocation", "getUserProfileLocation", "setUserProfileLocation", "userProfileName", "getUserProfileName", "setUserProfileName", "onClicks", "", "view", "Landroid/view/View;", "search", "text", "searchFunctionality", "setAdapter", "setFontsInAdapterList", "showBottomSheetDialogOne", "showViewProfileDialog", "updateRecyclerView", "app_debug"})
public final class EditFrontPageVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.widget.AppCompatTextView appCompatTxtFont;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.FontsListModelResponse> fontsNameList;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Typeface fontTypeface;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isChecked;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> userProfileName;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> userProfileDescription;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> userProfileLocation;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> typfaceObserverLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> fontsName;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.FontsListModelResponse> fontsFilteredList;
    @org.jetbrains.annotations.Nullable()
    private com.example.plazapalm.databinding.FontsListFragmentBinding scheduleBinding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy fontListAdapter$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.material.bottomsheet.BottomSheetDialog fontBottomSheet;
    
    @javax.inject.Inject()
    public EditFrontPageVM() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.widget.AppCompatTextView getAppCompatTxtFont() {
        return null;
    }
    
    public final void setAppCompatTxtFont(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.AppCompatTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.FontsListModelResponse> getFontsNameList() {
        return null;
    }
    
    public final void setFontsNameList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.FontsListModelResponse> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Typeface getFontTypeface() {
        return null;
    }
    
    public final void setFontTypeface(@org.jetbrains.annotations.Nullable()
    android.graphics.Typeface p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isChecked() {
        return null;
    }
    
    public final void setChecked(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getUserProfileName() {
        return null;
    }
    
    public final void setUserProfileName(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getUserProfileDescription() {
        return null;
    }
    
    public final void setUserProfileDescription(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getUserProfileLocation() {
        return null;
    }
    
    public final void setUserProfileLocation(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getTypfaceObserverLiveData() {
        return null;
    }
    
    public final void setTypfaceObserverLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getFontsName() {
        return null;
    }
    
    public final void setFontsName(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
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
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void showViewProfileDialog() {
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