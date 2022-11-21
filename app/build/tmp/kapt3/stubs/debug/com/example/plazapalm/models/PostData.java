package com.example.plazapalm.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\bS\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 ~2\u00020\u0001:\u0001~B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u00d5\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0011\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\t\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010-J\u000b\u0010S\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010;J\u0010\u0010U\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u000b\u0010V\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010;J\u000b\u0010X\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010;J\u0010\u0010[\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010\\\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010]\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010^\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010`\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010;J\u000b\u0010a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0010\u0010c\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010;J\u000b\u0010d\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010>J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'H\u00c6\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010j\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010q\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u00a0\u0003\u0010t\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010uJ\b\u0010v\u001a\u00020\u0011H\u0016J\u0013\u0010w\u001a\u00020\t2\b\u0010x\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010y\u001a\u00020\u0011H\u00d6\u0001J\t\u0010z\u001a\u00020\u0006H\u00d6\u0001J\u0018\u0010{\u001a\u00020|2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010}\u001a\u00020\u0011H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010/R\u0015\u0010\f\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b6\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010/R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010/R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010/R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010<\u001a\u0004\bA\u0010;R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010/R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\bC\u00102R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010<\u001a\u0004\bD\u0010;R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b\u0019\u00102R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b\u001a\u00102R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b\u001b\u00102R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b\u001c\u00102R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010<\u001a\u0004\b\u001d\u0010;R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010/R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bF\u0010>R\u0015\u0010 \u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010<\u001a\u0004\bG\u0010;R\u0013\u0010!\u001a\u0004\u0018\u00010\"\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0015\u0010#\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\bJ\u00102R\u0013\u0010$\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010/R\u0015\u0010%\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bL\u0010>R\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010)\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010/R\u0013\u0010*\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010/R\u0013\u0010+\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010/R\u0013\u0010,\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010/\u00a8\u0006\u007f"}, d2 = {"Lcom/example/plazapalm/models/PostData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "_id", "", "address", "booking_status", "", "c_id", "category_name", "dark_theme", "description_1", "description_2", "description_3", "dislikeCount", "", "distance", "", "expiry_date", "favouriteCount", "first_name", "follow", "font_size", "isAddedToProfile", "isDisliked", "isFavourite", "isLiked", "isPremium", "last_name", "lat", "likeCount", "location", "Lcom/example/plazapalm/models/getLocation;", "location_OnOff", "location_text", "long", "postProfile_picture", "", "", "profile_title", "tags", "user_id", "user_name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Lcom/example/plazapalm/models/getLocation;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getAddress", "getBooking_status", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getC_id", "getCategory_name", "getDark_theme", "getDescription_1", "getDescription_2", "getDescription_3", "getDislikeCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDistance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getExpiry_date", "getFavouriteCount", "getFirst_name", "getFollow", "getFont_size", "getLast_name", "getLat", "getLikeCount", "getLocation", "()Lcom/example/plazapalm/models/getLocation;", "getLocation_OnOff", "getLocation_text", "getLong", "getPostProfile_picture", "()Ljava/util/List;", "getProfile_title", "getTags", "getUser_id", "getUser_name", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Lcom/example/plazapalm/models/getLocation;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/plazapalm/models/PostData;", "describeContents", "equals", "other", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class PostData implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String _id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String address = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean booking_status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String c_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String category_name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean dark_theme = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description_1 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description_2 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description_3 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer dislikeCount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double distance = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String expiry_date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer favouriteCount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String first_name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean follow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer font_size = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isAddedToProfile = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isDisliked = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isFavourite = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isLiked = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer isPremium = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String last_name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double lat = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer likeCount = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.plazapalm.models.getLocation location = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean location_OnOff = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String location_text = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.Object> postProfile_picture = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String profile_title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tags = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String user_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String user_name = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.plazapalm.models.PostData.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.models.PostData copy(@org.jetbrains.annotations.Nullable()
    java.lang.String _id, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean booking_status, @org.jetbrains.annotations.Nullable()
    java.lang.String c_id, @org.jetbrains.annotations.Nullable()
    java.lang.String category_name, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean dark_theme, @org.jetbrains.annotations.Nullable()
    java.lang.String description_1, @org.jetbrains.annotations.Nullable()
    java.lang.String description_2, @org.jetbrains.annotations.Nullable()
    java.lang.String description_3, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dislikeCount, @org.jetbrains.annotations.Nullable()
    java.lang.Double distance, @org.jetbrains.annotations.Nullable()
    java.lang.String expiry_date, @org.jetbrains.annotations.Nullable()
    java.lang.Integer favouriteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String first_name, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean follow, @org.jetbrains.annotations.Nullable()
    java.lang.Integer font_size, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isAddedToProfile, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isDisliked, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFavourite, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isLiked, @org.jetbrains.annotations.Nullable()
    java.lang.Integer isPremium, @org.jetbrains.annotations.Nullable()
    java.lang.String last_name, @org.jetbrains.annotations.Nullable()
    java.lang.Double lat, @org.jetbrains.annotations.Nullable()
    java.lang.Integer likeCount, @org.jetbrains.annotations.Nullable()
    com.example.plazapalm.models.getLocation location, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean location_OnOff, @org.jetbrains.annotations.Nullable()
    java.lang.String location_text, @org.jetbrains.annotations.Nullable()
    java.lang.Double p27_1663806, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> postProfile_picture, @org.jetbrains.annotations.Nullable()
    java.lang.String profile_title, @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.Nullable()
    java.lang.String user_id, @org.jetbrains.annotations.Nullable()
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
    
    public PostData(@org.jetbrains.annotations.Nullable()
    java.lang.String _id, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean booking_status, @org.jetbrains.annotations.Nullable()
    java.lang.String c_id, @org.jetbrains.annotations.Nullable()
    java.lang.String category_name, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean dark_theme, @org.jetbrains.annotations.Nullable()
    java.lang.String description_1, @org.jetbrains.annotations.Nullable()
    java.lang.String description_2, @org.jetbrains.annotations.Nullable()
    java.lang.String description_3, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dislikeCount, @org.jetbrains.annotations.Nullable()
    java.lang.Double distance, @org.jetbrains.annotations.Nullable()
    java.lang.String expiry_date, @org.jetbrains.annotations.Nullable()
    java.lang.Integer favouriteCount, @org.jetbrains.annotations.Nullable()
    java.lang.String first_name, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean follow, @org.jetbrains.annotations.Nullable()
    java.lang.Integer font_size, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isAddedToProfile, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isDisliked, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isFavourite, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isLiked, @org.jetbrains.annotations.Nullable()
    java.lang.Integer isPremium, @org.jetbrains.annotations.Nullable()
    java.lang.String last_name, @org.jetbrains.annotations.Nullable()
    java.lang.Double lat, @org.jetbrains.annotations.Nullable()
    java.lang.Integer likeCount, @org.jetbrains.annotations.Nullable()
    com.example.plazapalm.models.getLocation location, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean location_OnOff, @org.jetbrains.annotations.Nullable()
    java.lang.String location_text, @org.jetbrains.annotations.Nullable()
    java.lang.Double p27_1663806, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> postProfile_picture, @org.jetbrains.annotations.Nullable()
    java.lang.String profile_title, @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.Nullable()
    java.lang.String user_id, @org.jetbrains.annotations.Nullable()
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
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getBooking_status() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getC_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCategory_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDark_theme() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription_1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription_2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription_3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDislikeCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExpiry_date() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFavouriteCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirst_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getFollow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFont_size() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isAddedToProfile() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isDisliked() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isFavourite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isLiked() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer isPremium() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLast_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLat() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLikeCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.plazapalm.models.getLocation component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.plazapalm.models.getLocation getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getLocation_OnOff() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocation_text() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLong() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getPostProfile_picture() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProfile_title() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_name() {
        return null;
    }
    
    public PostData(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/plazapalm/models/PostData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/example/plazapalm/models/PostData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/example/plazapalm/models/PostData;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.example.plazapalm.models.PostData> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.plazapalm.models.PostData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.plazapalm.models.PostData[] newArray(int size) {
            return null;
        }
    }
}