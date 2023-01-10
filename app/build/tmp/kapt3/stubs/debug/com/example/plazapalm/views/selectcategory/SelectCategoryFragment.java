package com.example.plazapalm.views.selectcategory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J9\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0013H\u0002J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\'"}, d2 = {"Lcom/example/plazapalm/views/selectcategory/SelectCategoryFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/plazapalm/interfaces/clickItem;", "()V", "binding", "Lcom/example/plazapalm/databinding/FragmentSelectCategoryBinding;", "selectCateAdapter", "Lcom/example/plazapalm/views/selectcategory/adapters/SelectCateAdapter;", "getSelectCateAdapter", "()Lcom/example/plazapalm/views/selectcategory/adapters/SelectCateAdapter;", "setSelectCateAdapter", "(Lcom/example/plazapalm/views/selectcategory/adapters/SelectCateAdapter;)V", "viewmodel", "Lcom/example/plazapalm/views/selectcategory/SelectCategoryViewModel;", "getViewmodel", "()Lcom/example/plazapalm/views/selectcategory/SelectCategoryViewModel;", "viewmodel$delegate", "Lkotlin/Lazy;", "click", "", "categoryName", "", "position", "", "c_id", "s", "color", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getdata", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SelectCategoryFragment extends androidx.fragment.app.Fragment implements com.example.plazapalm.interfaces.clickItem {
    private com.example.plazapalm.databinding.FragmentSelectCategoryBinding binding;
    private final kotlin.Lazy viewmodel$delegate = null;
    public com.example.plazapalm.views.selectcategory.adapters.SelectCateAdapter selectCateAdapter;
    
    public SelectCategoryFragment() {
        super();
    }
    
    private final com.example.plazapalm.views.selectcategory.SelectCategoryViewModel getViewmodel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.views.selectcategory.adapters.SelectCateAdapter getSelectCateAdapter() {
        return null;
    }
    
    public final void setSelectCateAdapter(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.views.selectcategory.adapters.SelectCateAdapter p0) {
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
    
    private final void getdata() {
    }
    
    @java.lang.Override()
    public void click(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, int position, @org.jetbrains.annotations.Nullable()
    java.lang.String c_id, @org.jetbrains.annotations.NotNull()
    java.lang.String s, @org.jetbrains.annotations.Nullable()
    java.lang.Integer color) {
    }
}