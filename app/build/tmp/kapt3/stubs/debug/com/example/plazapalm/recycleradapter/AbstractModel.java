package com.example.plazapalm.recycleradapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/example/plazapalm/recycleradapter/AbstractModel;", "", "()V", "adapterPosition", "", "getAdapterPosition", "()I", "setAdapterPosition", "(I)V", "mainPosition", "getMainPosition", "setMainPosition", "onItemClick", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter$OnItemClick;", "getOnItemClick", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter$OnItemClick;", "setOnItemClick", "(Lcom/example/plazapalm/recycleradapter/RecyclerAdapter$OnItemClick;)V", "app_debug"})
public abstract class AbstractModel {
    private int adapterPosition = -1;
    private int mainPosition = -1;
    @org.jetbrains.annotations.Nullable()
    private com.example.plazapalm.recycleradapter.RecyclerAdapter.OnItemClick onItemClick;
    
    public AbstractModel() {
        super();
    }
    
    public final int getAdapterPosition() {
        return 0;
    }
    
    public final void setAdapterPosition(int p0) {
    }
    
    public final int getMainPosition() {
        return 0;
    }
    
    public final void setMainPosition(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter.OnItemClick getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    com.example.plazapalm.recycleradapter.RecyclerAdapter.OnItemClick p0) {
    }
}