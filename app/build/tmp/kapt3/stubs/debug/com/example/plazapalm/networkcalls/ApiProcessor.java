package com.example.plazapalm.networkcalls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/plazapalm/networkcalls/ApiProcessor;", "T", "", "onError", "", "message", "", "onResponse", "res", "(Ljava/lang/Object;)V", "sendRequest", "retrofitApi", "Lcom/example/plazapalm/networkcalls/RetrofitApi;", "(Lcom/example/plazapalm/networkcalls/RetrofitApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiProcessor<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object sendRequest(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.RetrofitApi retrofitApi, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> continuation);
    
    public abstract void onResponse(T res);
    
    public abstract void onError(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        public static <T extends java.lang.Object>void onError(@org.jetbrains.annotations.NotNull()
        com.example.plazapalm.networkcalls.ApiProcessor<T> $this, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
    }
}