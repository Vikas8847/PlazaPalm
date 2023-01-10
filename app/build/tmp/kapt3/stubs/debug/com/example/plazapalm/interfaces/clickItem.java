package com.example.plazapalm.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/plazapalm/interfaces/clickItem;", "", "click", "", "categoryName", "", "position", "", "_id", "s", "color", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "app_debug"})
public abstract interface clickItem {
    
    public abstract void click(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryName, int position, @org.jetbrains.annotations.Nullable()
    java.lang.String _id, @org.jetbrains.annotations.NotNull()
    java.lang.String s, @org.jetbrains.annotations.Nullable()
    java.lang.Integer color);
}