package com.example.plazapalm.networkcalls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/plazapalm/networkcalls/TokenAuthenticator;", "Lokhttp3/Authenticator;", "()V", "retrofitApi", "Lcom/example/plazapalm/networkcalls/RetrofitApi;", "getRetrofitApi", "()Lcom/example/plazapalm/networkcalls/RetrofitApi;", "setRetrofitApi", "(Lcom/example/plazapalm/networkcalls/RetrofitApi;)V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "app_debug"})
public final class TokenAuthenticator implements okhttp3.Authenticator {
    @javax.inject.Inject()
    public com.example.plazapalm.networkcalls.RetrofitApi retrofitApi;
    
    public TokenAuthenticator() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.networkcalls.RetrofitApi getRetrofitApi() {
        return null;
    }
    
    public final void setRetrofitApi(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.RetrofitApi p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public okhttp3.Request authenticate(@org.jetbrains.annotations.Nullable()
    okhttp3.Route route, @org.jetbrains.annotations.NotNull()
    okhttp3.Response response) {
        return null;
    }
}