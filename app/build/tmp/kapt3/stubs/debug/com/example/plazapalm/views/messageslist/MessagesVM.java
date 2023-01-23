package com.example.plazapalm.views.messageslist;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Lcom/example/plazapalm/views/messageslist/MessagesVM;", "Landroidx/lifecycle/ViewModel;", "()V", "isVisible", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "setVisible", "(Landroidx/databinding/ObservableBoolean;)V", "messageUserAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/UserMessageModal;", "getMessageUserAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "messageUserAdapter$delegate", "Lkotlin/Lazy;", "usersList", "Ljava/util/ArrayList;", "getUsersList", "()Ljava/util/ArrayList;", "setUsersList", "(Ljava/util/ArrayList;)V", "getColoredSpanned", "", "text", "color", "onClicks", "", "view", "Landroid/view/View;", "app_debug"})
public final class MessagesVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isVisible;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.UserMessageModal> usersList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy messageUserAdapter$delegate = null;
    
    @javax.inject.Inject()
    public MessagesVM() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isVisible() {
        return null;
    }
    
    public final void setVisible(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.UserMessageModal> getUsersList() {
        return null;
    }
    
    public final void setUsersList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.UserMessageModal> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.UserMessageModal> getMessageUserAdapter() {
        return null;
    }
    
    /**
     * Implemented clicks Here
     */
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getColoredSpanned(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.lang.String color) {
        return null;
    }
}