package com.example.plazapalm.views.addphotos.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001)B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u001d\u001a\u00020\u0017H\u0016J\u001c\u0010\u001e\u001a\u00020\u001f2\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u0017H\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0017H\u0016J(\u0010&\u001a\u00020\u001f2\u0016\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010(\u001a\u00020\u0017H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006*"}, d2 = {"Lcom/example/plazapalm/views/addphotos/adapter/AddPhotosAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/plazapalm/views/addphotos/adapter/AddPhotosAdapter$ViewHolder;", "activity", "Landroidx/fragment/app/FragmentActivity;", "photos", "Ljava/util/ArrayList;", "Lcom/example/plazapalm/models/AddPhoto;", "Lkotlin/collections/ArrayList;", "itemClickListener", "Lcom/example/plazapalm/interfaces/ItemClickListener;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/ArrayList;Lcom/example/plazapalm/interfaces/ItemClickListener;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "getItemClickListener", "()Lcom/example/plazapalm/interfaces/ItemClickListener;", "setItemClickListener", "(Lcom/example/plazapalm/interfaces/ItemClickListener;)V", "getPhotos", "()Ljava/util/ArrayList;", "setPhotos", "(Ljava/util/ArrayList;)V", "poss", "", "getPoss", "()Ljava/lang/Integer;", "setPoss", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "picturesList", "pos", "ViewHolder", "app_debug"})
public final class AddPhotosAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.plazapalm.views.addphotos.adapter.AddPhotosAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.AddPhoto> photos;
    @org.jetbrains.annotations.NotNull()
    private com.example.plazapalm.interfaces.ItemClickListener itemClickListener;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer poss;
    
    public AddPhotosAdapter(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.AddPhoto> photos, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.interfaces.ItemClickListener itemClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.AddPhoto> getPhotos() {
        return null;
    }
    
    public final void setPhotos(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.AddPhoto> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.interfaces.ItemClickListener getItemClickListener() {
        return null;
    }
    
    public final void setItemClickListener(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.interfaces.ItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPoss() {
        return null;
    }
    
    public final void setPoss(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.AddPhoto> picturesList, int pos) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.plazapalm.views.addphotos.adapter.AddPhotosAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.views.addphotos.adapter.AddPhotosAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/example/plazapalm/views/addphotos/adapter/AddPhotosAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "bindining", "Lcom/example/plazapalm/databinding/AddPhotosItemListBinding;", "(Lcom/example/plazapalm/views/addphotos/adapter/AddPhotosAdapter;Lcom/example/plazapalm/databinding/AddPhotosItemListBinding;)V", "getBindining", "()Lcom/example/plazapalm/databinding/AddPhotosItemListBinding;", "setBindining", "(Lcom/example/plazapalm/databinding/AddPhotosItemListBinding;)V", "setImage", "", "context", "Landroid/content/Context;", "photos", "Ljava/util/ArrayList;", "Lcom/example/plazapalm/models/AddPhoto;", "Lkotlin/collections/ArrayList;", "position", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.plazapalm.databinding.AddPhotosItemListBinding bindining;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.plazapalm.databinding.AddPhotosItemListBinding bindining) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.plazapalm.databinding.AddPhotosItemListBinding getBindining() {
            return null;
        }
        
        public final void setBindining(@org.jetbrains.annotations.NotNull()
        com.example.plazapalm.databinding.AddPhotosItemListBinding p0) {
        }
        
        public final void setImage(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.example.plazapalm.models.AddPhoto> photos, int position) {
        }
    }
}