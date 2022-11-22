package com.example.plazapalm.views.favourites.favdetails;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ \u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020\u000bH\u0002J\u0010\u0010o\u001a\u00020i2\u0006\u0010j\u001a\u00020kH\u0002J\u0010\u0010p\u001a\u00020i2\u0006\u0010j\u001a\u00020kH\u0002J\u0010\u0010q\u001a\u00020i2\u0006\u0010j\u001a\u00020kH\u0002J(\u0010r\u001a\u00020i2\u0006\u0010s\u001a\u00020m2\u0006\u0010t\u001a\u00020m2\u0006\u0010n\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020vH\u0002J\u000e\u0010w\u001a\u00020i2\u0006\u0010j\u001a\u00020kJ\u0010\u0010x\u001a\u00020i2\u0006\u0010y\u001a\u00020zH\u0002J\u0018\u0010{\u001a\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020mH\u0002J\u0010\u0010|\u001a\u00020i2\u0006\u0010j\u001a\u00020kH\u0002R(\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R(\u0010\u0014\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018j\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b\'\u0010$R(\u0010(\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010\u0010R(\u0010+\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000e\"\u0004\b-\u0010\u0010R(\u0010.\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010\u0010R\u001a\u00101\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00103\"\u0004\b7\u00105R\u001a\u00108\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\u001a\u0010:\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00103\"\u0004\b;\u00105R\u001a\u0010<\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00103\"\u0004\b=\u00105R\u001a\u0010>\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u00103\"\u0004\b?\u00105R\u001a\u0010@\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u00103\"\u0004\bA\u00105R(\u0010B\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u000e\"\u0004\bD\u0010\u0010R(\u0010E\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u000e\"\u0004\bG\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010H\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u00103\"\u0004\bJ\u00105R(\u0010K\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u000e\"\u0004\bM\u0010\u0010R(\u0010N\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u000e\"\u0004\bP\u0010\u0010R \u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u001c\"\u0004\bT\u0010\u001eR \u0010U\u001a\b\u0012\u0004\u0012\u00020R0\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u001c\"\u0004\bW\u0010\u001eR\"\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Z0YX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010_\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u000e\"\u0004\ba\u0010\u0010R!\u0010b\u001a\b\u0012\u0004\u0012\u00020R0c8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bd\u0010e\u00a8\u0006}"}, d2 = {"Lcom/example/plazapalm/views/favourites/favdetails/FavDetailsVM;", "Landroidx/lifecycle/ViewModel;", "dataStoreUtil", "Lcom/example/plazapalm/datastore/DataStoreUtil;", "repository", "Lcom/example/plazapalm/networkcalls/Repository;", "pref", "Lcom/example/plazapalm/pref/PreferenceFile;", "(Lcom/example/plazapalm/datastore/DataStoreUtil;Lcom/example/plazapalm/networkcalls/Repository;Lcom/example/plazapalm/pref/PreferenceFile;)V", "CommingFrom", "Landroidx/databinding/ObservableField;", "", "kotlin.jvm.PlatformType", "getCommingFrom", "()Landroidx/databinding/ObservableField;", "setCommingFrom", "(Landroidx/databinding/ObservableField;)V", "DisLikesCount", "getDisLikesCount", "setDisLikesCount", "LikesCount", "getLikesCount", "setLikesCount", "data_list", "Ljava/util/ArrayList;", "Lcom/example/plazapalm/models/AddPhoto;", "Lkotlin/collections/ArrayList;", "getData_list", "()Ljava/util/ArrayList;", "setData_list", "(Ljava/util/ArrayList;)V", "deldialog", "Landroid/app/Dialog;", "getDeldialog", "()Landroid/app/Dialog;", "setDeldialog", "(Landroid/app/Dialog;)V", "dialog", "getDialog", "setDialog", "etVEditProDescription", "getEtVEditProDescription", "setEtVEditProDescription", "fav_title", "getFav_title", "setFav_title", "firstName", "getFirstName", "setFirstName", "isAddedProfile", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "setAddedProfile", "(Landroidx/databinding/ObservableBoolean;)V", "isDisLike", "setDisLike", "isFav", "setFav", "isFavourites", "setFavourites", "isLike", "setLike", "isLikeDislike", "setLikeDislike", "isViewProfile", "setViewProfile", "lastName", "getLastName", "setLastName", "p_id", "getP_id", "setP_id", "selectImage", "getSelectImage", "setSelectImage", "tvFavCityAddress", "getTvFavCityAddress", "setTvFavCityAddress", "tvFavDetailsAddress", "getTvFavDetailsAddress", "setTvFavDetailsAddress", "uploadImagesList", "Lcom/example/plazapalm/models/ImagesVideosModel;", "getUploadImagesList", "setUploadImagesList", "uploadVideoList", "getUploadVideoList", "setUploadVideoList", "userdata", "Landroidx/databinding/ObservableParcelable;", "Lcom/example/plazapalm/models/postData;", "getUserdata", "()Landroidx/databinding/ObservableParcelable;", "setUserdata", "(Landroidx/databinding/ObservableParcelable;)V", "username", "getUsername", "setUsername", "videosAdapter", "Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "getVideosAdapter", "()Lcom/example/plazapalm/recycleradapter/RecyclerAdapter;", "videosAdapter$delegate", "Lkotlin/Lazy;", "AddtoFavAPI", "", "view", "Landroid/view/View;", "isfav", "", "from", "deletePostAPi", "deletePostProfileDialog", "dialogPremiumEditDeleteProfile", "likeApi", "isLiked", "isDislike", "image", "Landroid/widget/ImageView;", "onClicks", "setAdapter", "rvImages", "Landroidx/recyclerview/widget/RecyclerView;", "showFavDetailsDialog", "showViewProfileDialog", "app_debug"})
public final class FavDetailsVM extends androidx.lifecycle.ViewModel {
    private com.example.plazapalm.datastore.DataStoreUtil dataStoreUtil;
    private com.example.plazapalm.networkcalls.Repository repository;
    private com.example.plazapalm.pref.PreferenceFile pref;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.ImagesVideosModel> uploadImagesList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.plazapalm.models.ImagesVideosModel> uploadVideoList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy videosAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isFavourites;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isViewProfile;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> CommingFrom;
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
    private androidx.databinding.ObservableField<java.lang.String> fav_title;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> etVEditProDescription;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> tvFavDetailsAddress;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> tvFavCityAddress;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isFav;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isLike;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isLikeDislike;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isDisLike;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean selectImage;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableBoolean isAddedProfile;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.example.plazapalm.models.AddPhoto> data_list;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableParcelable<com.example.plazapalm.models.postData> userdata;
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
    public final java.util.ArrayList<com.example.plazapalm.models.ImagesVideosModel> getUploadImagesList() {
        return null;
    }
    
    public final void setUploadImagesList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.ImagesVideosModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.plazapalm.models.ImagesVideosModel> getUploadVideoList() {
        return null;
    }
    
    public final void setUploadVideoList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.plazapalm.models.ImagesVideosModel> p0) {
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
    public final androidx.databinding.ObservableField<java.lang.String> getCommingFrom() {
        return null;
    }
    
    public final void setCommingFrom(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
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
    public final androidx.databinding.ObservableField<java.lang.String> getFav_title() {
        return null;
    }
    
    public final void setFav_title(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getEtVEditProDescription() {
        return null;
    }
    
    public final void setEtVEditProDescription(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTvFavDetailsAddress() {
        return null;
    }
    
    public final void setTvFavDetailsAddress(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTvFavCityAddress() {
        return null;
    }
    
    public final void setTvFavCityAddress(@org.jetbrains.annotations.NotNull()
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
    public final androidx.databinding.ObservableBoolean isLikeDislike() {
        return null;
    }
    
    public final void setLikeDislike(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isDisLike() {
        return null;
    }
    
    public final void setDisLike(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean getSelectImage() {
        return null;
    }
    
    public final void setSelectImage(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableBoolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableBoolean isAddedProfile() {
        return null;
    }
    
    public final void setAddedProfile(@org.jetbrains.annotations.NotNull()
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
    public final androidx.databinding.ObservableParcelable<com.example.plazapalm.models.postData> getUserdata() {
        return null;
    }
    
    public final void setUserdata(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableParcelable<com.example.plazapalm.models.postData> p0) {
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
    
    private final void likeApi(boolean isLiked, boolean isDislike, java.lang.String from, android.widget.ImageView image) {
    }
    
    private final void AddtoFavAPI(android.view.View view, boolean isfav, java.lang.String from) {
    }
    
    private final void showFavDetailsDialog(android.view.View view, boolean isfav) {
    }
    
    private final void showViewProfileDialog(android.view.View view) {
    }
    
    private final void deletePostProfileDialog(android.view.View view) {
    }
    
    private final void deletePostAPi(android.view.View view) {
    }
    
    private final void dialogPremiumEditDeleteProfile(android.view.View view) {
    }
    
    private final void setAdapter(androidx.recyclerview.widget.RecyclerView rvImages) {
    }
}