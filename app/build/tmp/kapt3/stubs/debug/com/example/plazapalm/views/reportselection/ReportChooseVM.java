package com.example.plazapalm.views.reportselection;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$R(\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0018j\b\u0012\u0004\u0012\u00020\u0012`\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\n\u00a8\u0006%"}, d2 = {"Lcom/example/plazapalm/views/reportselection/ReportChooseVM;", "Landroidx/lifecycle/ViewModel;", "()V", "P_ID", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getP_ID", "()Landroidx/databinding/ObservableField;", "setP_ID", "(Landroidx/databinding/ObservableField;)V", "isChecked", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "setChecked", "(Landroidx/databinding/ObservableBoolean;)V", "reportChooseAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/ReportDataModal;", "getReportChooseAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "reportChooseAdapter$delegate", "Lkotlin/Lazy;", "reportModelList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getReportModelList", "()Ljava/util/ArrayList;", "setReportModelList", "(Ljava/util/ArrayList;)V", "selectedData", "getSelectedData", "setSelectedData", "onClicks", "", "view", "Landroid/view/View;", "app_debug"})
public final class ReportChooseVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isChecked;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> selectedData;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> P_ID;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.ReportDataModal> reportModelList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy reportChooseAdapter$delegate = null;
    
    @javax.inject.Inject()
    public ReportChooseVM() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isChecked() {
        return null;
    }
    
    public final void setChecked(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getSelectedData() {
        return null;
    }
    
    public final void setSelectedData(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getP_ID() {
        return null;
    }
    
    public final void setP_ID(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.ReportDataModal> getReportModelList() {
        return null;
    }
    
    public final void setReportModelList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.ReportDataModal> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.ReportDataModal> getReportChooseAdapter() {
        return null;
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}