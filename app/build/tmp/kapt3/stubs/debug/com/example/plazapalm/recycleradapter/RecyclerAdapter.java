package com.example.plazapalm.recycleradapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003:\u0002-.B\u000f\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0007J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\b\u0010 \u001a\u00020\u0006H\u0016J\u001e\u0010!\u001a\u00020\u001d2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010#\u001a\u00020\u0006H\u0016J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0006H\u0016J\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020)2\u0006\u0010#\u001a\u00020\u0006H\u0002J\u000e\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u0012J\u0010\u0010,\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR+\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\tj\b\u0012\u0004\u0012\u00020\u0006`\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "T", "Lcom/example/plazapalm/recycleradapter/AbstractModel;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter$VH;", "layoutId", "", "(I)V", "animatedPosition", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getAnimatedPosition", "()Ljava/util/HashSet;", "animatedPosition$delegate", "Lkotlin/Lazy;", "inflater", "Landroid/view/LayoutInflater;", "isAnimation", "", "items", "", "getItems", "()Ljava/util/List;", "items$delegate", "getLayoutId", "()I", "onItemClick", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter$OnItemClick;", "addItems", "", "", "getAllItems", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAnimation", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "setAnimations", "boolean", "setOnItemClick", "OnItemClick", "VH", "app_debug"})
public final class RecyclerAdapter<T extends com.example.plazapalm.recycleradapter.AbstractModel> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.plazapalm.recycleradapter.RecyclerAdapter.VH<T>> {
    private final int layoutId = 0;
    private final kotlin.Lazy animatedPosition$delegate = null;
    private final kotlin.Lazy items$delegate = null;
    private android.view.LayoutInflater inflater;
    private com.example.plazapalm.recycleradapter.RecyclerAdapter.OnItemClick onItemClick;
    private boolean isAnimation = true;
    
    public RecyclerAdapter(@androidx.annotation.LayoutRes()
    int layoutId) {
        super();
    }
    
    public final int getLayoutId() {
        return 0;
    }
    
    private final java.util.HashSet<java.lang.Integer> getAnimatedPosition() {
        return null;
    }
    
    private final java.util.List<T> getItems() {
        return null;
    }
    
    public final void setAnimations(boolean p0_32355860) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getAllItems() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> items) {
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    com.example.plazapalm.recycleradapter.RecyclerAdapter.OnItemClick onItemClick) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.plazapalm.recycleradapter.RecyclerAdapter.VH<T> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.recycleradapter.RecyclerAdapter.VH<T> holder, int position) {
    }
    
    private final void setAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/plazapalm/recycleradapter/RecyclerAdapter$VH;", "T", "Lcom/example/plazapalm/recycleradapter/AbstractModel;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/databinding/ViewDataBinding;", "(Landroidx/databinding/ViewDataBinding;)V", "bind", "", "model", "(Lcom/example/plazapalm/recycleradapter/AbstractModel;)V", "app_debug"})
    public static final class VH<T extends com.example.plazapalm.recycleradapter.AbstractModel> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.databinding.ViewDataBinding binding = null;
        
        public VH(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        T model) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/example/plazapalm/recycleradapter/RecyclerAdapter$OnItemClick;", "", "onClick", "", "view", "Landroid/view/View;", "position", "", "type", "", "app_debug"})
    public static abstract interface OnItemClick {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, int position, @org.jetbrains.annotations.NotNull()
        java.lang.String type);
    }
}