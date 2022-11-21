package com.example.plazapalm.views.favourites.favdetails;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0002J\u0010\u0010P\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0002J\u0010\u0010Q\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0002J\u0010\u0010R\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0002J(\u0010S\u001a\u00020M2\u0006\u00108\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020XH\u0002J\u000e\u0010Y\u001a\u00020M2\u0006\u0010W\u001a\u00020XJ\u000e\u0010Z\u001a\u00020M2\u0006\u0010N\u001a\u00020OJ\u0010\u0010[\u001a\u00020M2\u0006\u0010W\u001a\u00020XH\u0002J\u0010\u0010\\\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0002J\u0010\u0010]\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0002R(\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R(\u0010%\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000e\"\u0004\b\'\u0010\u0010R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R\u001a\u0010/\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u001a\u00101\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\u001a\u00103\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010*\"\u0004\b4\u0010,R(\u00105\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u000e\"\u0004\b7\u0010\u0010R(\u00108\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000e\"\u0004\b:\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010B\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u000e\"\u0004\bD\u0010\u0010R!\u0010E\u001a\b\u0012\u0004\u0012\u00020G0F8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bH\u0010I\u00a8\u0006^"}, d2 = {"Lcom/example/plazapalm/views/favourites/favdetails/FavDetailsVM;", "Landroidx/lifecycle/ViewModel;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "(Lcom/example/plazapalm/datastore/DataStoreUtil;Lcom/example/plazapalm/networkcalls/Repository;Lcom/example/plazapalm/pref/PreferenceFile;)V", "DisLikesCount", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getDisLikesCount", "()Landroidx/databinding/ObservableField;", "setDisLikesCount", "(Landroidx/databinding/ObservableField;)V", "LikesCount", "getLikesCount", "setLikesCount", "data_list", "Ljava/util/ArrayList;", "Lcom/example/plazapalm/models/AddPhoto;", "Lkotlin/collections/ArrayList;", "getData_list", "()Ljava/util/ArrayList;", "setData_list", "(Ljava/util/ArrayList;)V", "deldialog", "Landroid/app/Dialog;", "getDeldialog", "()Landroid/app/Dialog;", "setDeldialog", "(Landroid/app/Dialog;)V", "dialog", "getDialog", "setDialog", "firstName", "getFirstName", "setFirstName", "isDisLike", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "setDisLike", "(Landroidx/databinding/ObservableBoolean;)V", "isFav", "setFav", "isFavourites", "setFavourites", "isLike", "setLike", "isViewProfile", "setViewProfile", "lastName", "getLastName", "setLastName", "p_id", "getP_id", "setP_id", "userdata", "Landroidx/databinding/ObservableParcelable;", "Lcom/example/plazapalm/models/PostData;", "getUserdata", "()Landroidx/databinding/ObservableParcelable;", "setUserdata", "(Landroidx/databinding/ObservableParcelable;)V", "username", "getUsername", "setUsername", "videosAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "Lcom/example/plazapalm/models/ImagesVideosModel;", "getVideosAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "videosAdapter$delegate", "Lkotlin/Lazy;", "addToFavAPI", "", "view", "Landroid/view/View;", "deletePostAPi", "deletePostProfileDialog", "dialogPremiumEditDeleteProfile", "getPostprofile", "lati", "", "longi", "rvImages", "Landroidx/recyclerview/widget/RecyclerView;", "getViewProfileData", "onClicks", "setAdapter", "showFavDetailsDialog", "showViewProfileDialog", "app_debug"})
public final class FavDetailsVM extends androidx.lifecycle.ViewModel {
    private com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    private com.example.plazapalm.networkcalls.Repository repository;
    private com.example.plazapalm.pref.PreferenceFile pref;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy videosAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isFavourites;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isViewProfile;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> p_id;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> firstName;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> lastName;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> DisLikesCount;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> LikesCount;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> username;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isFav;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isLike;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isDisLike;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.example.plazapalm.models.AddPhoto> data_list;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableParcelable<com.example.plazapalm.models.PostData> userdata;
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog dialog;
    @org.jetbrains.annotations.Nullable()
    private android.app.Dialog deldialog;
    
    @javax.inject.Inject()
    public FavDetailsVM(@org.jetbrains.annotations.NotNull()
    com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.networkcalls.Repository repository, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.pref.PreferenceFile pref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.recycleradapter.RecyclerAdapter<com.example.plazapalm.models.ImagesVideosModel> getVideosAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isFavourites() {
        return null;
    }
    
    public final void setFavourites(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isViewProfile() {
        return null;
    }
    
    public final void setViewProfile(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getP_id() {
        return null;
    }
    
    public final void setP_id(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getDisLikesCount() {
        return null;
    }
    
    public final void setDisLikesCount(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getLikesCount() {
        return null;
    }
    
    public final void setLikesCount(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isFav() {
        return null;
    }
    
    public final void setFav(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isLike() {
        return null;
    }
    
    public final void setLike(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isDisLike() {
        return null;
    }
    
    public final void setDisLike(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.example.plazapalm.models.AddPhoto> getData_list() {
        return null;
    }
    
    public final void setData_list(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.example.plazapalm.models.AddPhoto> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableParcelable<com.example.plazapalm.models.PostData> getUserdata() {
        return null;
    }
    
    public final void setUserdata(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableParcelable<com.example.plazapalm.models.PostData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Dialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Dialog getDeldialog() {
        return null;
    }
    
    public final void setDeldialog(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    public final void onClicks(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void addToFavAPI(android.view.View view) {
    }
    
    private final void showFavDetailsDialog(android.view.View view) {
    }
    
    private final void showViewProfileDialog(android.view.View view) {
    }
    
    private final void deletePostProfileDialog(android.view.View view) {
    }
    
    private final void deletePostAPi(android.view.View view) {
    }
    
    private final void dialogPremiumEditDeleteProfile(android.view.View view) {
    }
    
    public final void getViewProfileData(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView rvImages) {
    }
    
    private final void getPostprofile(java.lang.String p_id, double lati, double longi, androidx.recyclerview.widget.RecyclerView rvImages) {
    }
    
    private final void setAdapter(androidx.recyclerview.widget.RecyclerView rvImages) {
    }
}