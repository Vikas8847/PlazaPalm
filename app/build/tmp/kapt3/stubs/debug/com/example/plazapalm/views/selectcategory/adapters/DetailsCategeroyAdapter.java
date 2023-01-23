package com.example.plazapalm.views.selectcategory.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\'B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001eH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006("}, d2 = {"Lcom/example/plazapalm/views/selectcategory/adapters/DetailsCategeroyAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/plazapalm/views/selectcategory/adapters/DetailsCategeroyAdapter$SelectCateViewHolder;", "requireActivity", "Landroidx/fragment/app/FragmentActivity;", "photos", "", "Lcom/example/plazapalm/models/CategoriesData;", "clickItem", "Lcom/example/plazapalm/interfaces/clickItem;", "status", "", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;Lcom/example/plazapalm/interfaces/clickItem;Ljava/lang/String;)V", "getClickItem", "()Lcom/example/plazapalm/interfaces/clickItem;", "setClickItem", "(Lcom/example/plazapalm/interfaces/clickItem;)V", "getPhotos", "()Ljava/util/List;", "setPhotos", "(Ljava/util/List;)V", "getRequireActivity", "()Landroidx/fragment/app/FragmentActivity;", "setRequireActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SelectCateViewHolder", "app_debug"})
public final class DetailsCategeroyAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.plazapalm.views.selectcategory.adapters.DetailsCategeroyAdapter.SelectCateViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private androidx.fragment.app.FragmentActivity requireActivity;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.plazapalm.models.CategoriesData> photos;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.interfaces.clickItem clickItem;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status;
    
    public DetailsCategeroyAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity requireActivity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.plazapalm.models.CategoriesData> photos, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.interfaces.clickItem clickItem, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentActivity getRequireActivity() {
        return null;
    }
    
    public final void setRequireActivity(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.plazapalm.models.CategoriesData> getPhotos() {
        return null;
    }
    
    public final void setPhotos(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.plazapalm.models.CategoriesData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.interfaces.clickItem getClickItem() {
        return null;
    }
    
    public final void setClickItem(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.interfaces.clickItem p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.plazapalm.views.selectcategory.adapters.DetailsCategeroyAdapter.SelectCateViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.views.selectcategory.adapters.DetailsCategeroyAdapter.SelectCateViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/example/plazapalm/views/selectcategory/adapters/DetailsCategeroyAdapter$SelectCateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/plazapalm/databinding/SlectCateItemsBinding;", "(Lcom/example/plazapalm/databinding/SlectCateItemsBinding;)V", "getBinding", "()Lcom/example/plazapalm/databinding/SlectCateItemsBinding;", "setBinding", "app_debug"})
    public static final class SelectCateViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.plazapalm.databinding.SlectCateItemsBinding binding;
        
        public SelectCateViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.plazapalm.databinding.SlectCateItemsBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.plazapalm.databinding.SlectCateItemsBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.example.plazapalm.databinding.SlectCateItemsBinding p0) {
        }
    }
}