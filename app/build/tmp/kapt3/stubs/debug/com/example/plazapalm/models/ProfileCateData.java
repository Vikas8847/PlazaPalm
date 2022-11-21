package com.example.plazapalm.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\bF\b\u0086\b\u0018\u00002\u00020\u0001B\u00c7\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010H\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010I\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u0010\u0010J\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010K\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0002\u00108J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u00104J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003\u00a2\u0006\u0002\u00108J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001eH\u00c6\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u00d8\u0002\u0010^\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010_J\u0013\u0010`\u001a\u00020\u00112\b\u0010a\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010b\u001a\u00020\u0014H\u00d6\u0001J\t\u0010c\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010%R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b\u0010\u00102R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b\u0012\u00102R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u00105\u001a\u0004\b\u0013\u00104R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b\u0015\u00102R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b\u0016\u00102R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u00105\u001a\u0004\b:\u00104R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\n\n\u0002\u00109\u001a\u0004\b<\u00108R\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010%R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010%\u00a8\u0006d"}, d2 = {"Lcom/example/plazapalm/models/ProfileCateData;", "Lcom/example/plazapalm/recycleradapter/AbstractModel;", "_id", "", "address", "c_id", "category_name", "created_at", "description_1", "description_2", "description_3", "expiry_date", "", "first_name", "frontpage_bottom_text", "frontpage_top_text", "isAddedToCalender", "", "isFavourite", "isPremium", "", "is_bottom_selected", "is_top_selected", "last_name", "lat", "", "likeCount", "location_text", "long", "postProfile_picture", "", "profile_title", "tags", "u_id", "user_name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getAddress", "getC_id", "getCategory_name", "getCreated_at", "getDescription_1", "getDescription_2", "getDescription_3", "getExpiry_date", "()Ljava/lang/Object;", "getFirst_name", "getFrontpage_bottom_text", "getFrontpage_top_text", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLast_name", "getLat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLikeCount", "getLocation_text", "getLong", "getPostProfile_picture", "()Ljava/util/List;", "getProfile_title", "getTags", "getU_id", "getUser_name", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/plazapalm/models/ProfileCateData;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class ProfileCateData extends com.example.plazapalm.recycleradapter.AbstractModel {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String _id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String address = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String c_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String category_name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String created_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description_1 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description_2 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description_3 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object expiry_date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String first_name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String frontpage_bottom_text = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String frontpage_top_text = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isAddedToCalender = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isFavourite = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer isPremium = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean is_bottom_selected = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean is_top_selected = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String last_name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double lat = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer likeCount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String location_text = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> postProfile_picture = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String profile_title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tags = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String u_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String user_name = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.models.ProfileCateData copy(@org.jetbrains.annotations.Nullable()
    java.lang.String _id, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String c_id, @org.jetbrains.annotations.Nullable()
    java.lang.String category_name, @org.jetbrains.annotations.Nullable()
    java.lang.String created_at, @org.jetbrains.annotations.Nullable()
    java.lang.String description_1, @org.jetbrains.annotations.Nullable()
    java.lang.String description_2, @org.jetbrains.annotations.Nullable()
    java.lang.String description_3, @org.jetbrains.annotations.Nullable()
    java.lang.Object expiry_date, @org.jetbrains.annotations.Nullable()
    java.lang.String first_name, @org.jetbrains.annotations.Nullable()
    java.lang.String frontpage_bottom_text, @org.jetbrains.annotations.Nullable()
    java.lang.String frontpage_top_text, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isAddedToCalender, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFavourite, @org.jetbrains.annotations.Nullable()
    java.lang.Integer isPremium, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_bottom_selected, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_top_selected, @org.jetbrains.annotations.Nullable()
    java.lang.String last_name, @org.jetbrains.annotations.Nullable()
    java.lang.Double lat, @org.jetbrains.annotations.Nullable()
    java.lang.Integer likeCount, @org.jetbrains.annotations.Nullable()
    java.lang.String location_text, @org.jetbrains.annotations.Nullable()
    java.lang.Double p21_1663806, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> postProfile_picture, @org.jetbrains.annotations.Nullable()
    java.lang.String profile_title, @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.Nullable()
    java.lang.String u_id, @org.jetbrains.annotations.Nullable()
    java.lang.String user_name) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ProfileCateData(@org.jetbrains.annotations.Nullable()
    java.lang.String _id, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String c_id, @org.jetbrains.annotations.Nullable()
    java.lang.String category_name, @org.jetbrains.annotations.Nullable()
    java.lang.String created_at, @org.jetbrains.annotations.Nullable()
    java.lang.String description_1, @org.jetbrains.annotations.Nullable()
    java.lang.String description_2, @org.jetbrains.annotations.Nullable()
    java.lang.String description_3, @org.jetbrains.annotations.Nullable()
    java.lang.Object expiry_date, @org.jetbrains.annotations.Nullable()
    java.lang.String first_name, @org.jetbrains.annotations.Nullable()
    java.lang.String frontpage_bottom_text, @org.jetbrains.annotations.Nullable()
    java.lang.String frontpage_top_text, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isAddedToCalender, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFavourite, @org.jetbrains.annotations.Nullable()
    java.lang.Integer isPremium, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_bottom_selected, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_top_selected, @org.jetbrains.annotations.Nullable()
    java.lang.String last_name, @org.jetbrains.annotations.Nullable()
    java.lang.Double lat, @org.jetbrains.annotations.Nullable()
    java.lang.Integer likeCount, @org.jetbrains.annotations.Nullable()
    java.lang.String location_text, @org.jetbrains.annotations.Nullable()
    java.lang.Double p21_1663806, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> postProfile_picture, @org.jetbrains.annotations.Nullable()
    java.lang.String profile_title, @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.Nullable()
    java.lang.String u_id, @org.jetbrains.annotations.Nullable()
    java.lang.String user_name) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String get_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getC_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCategory_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription_1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription_2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription_3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getExpiry_date() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirst_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFrontpage_bottom_text() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFrontpage_top_text() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isAddedToCalender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFavourite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer isPremium() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean is_bottom_selected() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean is_top_selected() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLast_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLat() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLikeCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocation_text() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLong() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getPostProfile_picture() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProfile_title() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getU_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_name() {
        return null;
    }
}