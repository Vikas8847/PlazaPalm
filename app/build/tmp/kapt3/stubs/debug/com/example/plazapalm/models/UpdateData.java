package com.example.plazapalm.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\bO\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 \u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0005\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\'J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\bH\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\bH\u00c6\u0003J\t\u0010T\u001a\u00020\bH\u00c6\u0003J\t\u0010U\u001a\u00020\u0005H\u00c6\u0003J\t\u0010V\u001a\u00020\u0005H\u00c6\u0003J\t\u0010W\u001a\u00020\u0019H\u00c6\u0003J\t\u0010X\u001a\u00020\u001bH\u00c6\u0003J\t\u0010Y\u001a\u00020\bH\u00c6\u0003J\t\u0010Z\u001a\u00020\u0005H\u00c6\u0003J\t\u0010[\u001a\u00020\u0019H\u00c6\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00050 H\u00c6\u0003J\t\u0010]\u001a\u00020\u0005H\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u0005H\u00c6\u0003J\t\u0010a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010d\u001a\u00020\bH\u00c6\u0003J\t\u0010e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010g\u001a\u00020\bH\u00c6\u0003J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020\u0005H\u00c6\u0003J\u00c5\u0002\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00192\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 2\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010k\u001a\u00020\b2\b\u0010l\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010m\u001a\u00020\u0003H\u00d6\u0001J\t\u0010n\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010)R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010.R\u0011\u0010\u0016\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010.R\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u001c\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u0011\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u0011\u0010\u001e\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010=R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 \u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010!\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010+R\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010)R\u0011\u0010#\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010+R\u0011\u0010$\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010+R\u0011\u0010%\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010+R\u0011\u0010&\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010+\u00a8\u0006o"}, d2 = {"Lcom/example/plazapalm/models/UpdateData;", "", "__v", "", "_id", "", "address", "booking_status", "", "c_id", "created_at", "dark_theme", "description_1", "description_2", "description_3", "expiry_date", "first_name", "follow", "font_size", "frontpage_bottom_text", "frontpage_top_text", "is_bottom_selected", "is_top_selected", "last_name", "lat", "", "location", "Lcom/example/plazapalm/models/UpdateLocation;", "location_OnOff", "location_text", "long", "postProfile_picture", "", "profile_title", "status", "tags", "u_id", "updated_at", "user_name", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;DLcom/example/plazapalm/models/UpdateLocation;ZLjava/lang/String;DLjava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getAddress", "getBooking_status", "()Z", "getC_id", "getCreated_at", "getDark_theme", "getDescription_1", "getDescription_2", "getDescription_3", "getExpiry_date", "getFirst_name", "getFollow", "getFont_size", "getFrontpage_bottom_text", "getFrontpage_top_text", "getLast_name", "getLat", "()D", "getLocation", "()Lcom/example/plazapalm/models/UpdateLocation;", "getLocation_OnOff", "getLocation_text", "getLong", "getPostProfile_picture", "()Ljava/util/List;", "getProfile_title", "getStatus", "getTags", "getU_id", "getUpdated_at", "getUser_name", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class UpdateData {
    private final int __v = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String _id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String address = null;
    private final boolean booking_status = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String c_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String created_at = null;
    private final boolean dark_theme = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description_1 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description_2 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description_3 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String expiry_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String first_name = null;
    private final boolean follow = false;
    private final int font_size = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String frontpage_bottom_text = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String frontpage_top_text = null;
    private final boolean is_bottom_selected = false;
    private final boolean is_top_selected = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String last_name = null;
    private final double lat = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.plazapalm.models.UpdateLocation location = null;
    private final boolean location_OnOff = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String location_text = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> postProfile_picture = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String profile_title = null;
    private final int status = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String tags = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String u_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updated_at = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String user_name = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.models.UpdateData copy(int __v, @org.jetbrains.annotations.NotNull()
    java.lang.String _id, @org.jetbrains.annotations.NotNull()
    java.lang.String address, boolean booking_status, @org.jetbrains.annotations.NotNull()
    java.lang.String c_id, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, boolean dark_theme, @org.jetbrains.annotations.NotNull()
    java.lang.String description_1, @org.jetbrains.annotations.NotNull()
    java.lang.String description_2, @org.jetbrains.annotations.NotNull()
    java.lang.String description_3, @org.jetbrains.annotations.NotNull()
    java.lang.String expiry_date, @org.jetbrains.annotations.NotNull()
    java.lang.String first_name, boolean follow, int font_size, @org.jetbrains.annotations.NotNull()
    java.lang.String frontpage_bottom_text, @org.jetbrains.annotations.NotNull()
    java.lang.String frontpage_top_text, boolean is_bottom_selected, boolean is_top_selected, @org.jetbrains.annotations.NotNull()
    java.lang.String last_name, double lat, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.models.UpdateLocation location, boolean location_OnOff, @org.jetbrains.annotations.NotNull()
    java.lang.String location_text, double p23_1663806, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> postProfile_picture, @org.jetbrains.annotations.NotNull()
    java.lang.String profile_title, int status, @org.jetbrains.annotations.NotNull()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    java.lang.String u_id, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
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
    
    public UpdateData(int __v, @org.jetbrains.annotations.NotNull()
    java.lang.String _id, @org.jetbrains.annotations.NotNull()
    java.lang.String address, boolean booking_status, @org.jetbrains.annotations.NotNull()
    java.lang.String c_id, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, boolean dark_theme, @org.jetbrains.annotations.NotNull()
    java.lang.String description_1, @org.jetbrains.annotations.NotNull()
    java.lang.String description_2, @org.jetbrains.annotations.NotNull()
    java.lang.String description_3, @org.jetbrains.annotations.NotNull()
    java.lang.String expiry_date, @org.jetbrains.annotations.NotNull()
    java.lang.String first_name, boolean follow, int font_size, @org.jetbrains.annotations.NotNull()
    java.lang.String frontpage_bottom_text, @org.jetbrains.annotations.NotNull()
    java.lang.String frontpage_top_text, boolean is_bottom_selected, boolean is_top_selected, @org.jetbrains.annotations.NotNull()
    java.lang.String last_name, double lat, @org.jetbrains.annotations.NotNull()
    com.example.plazapalm.models.UpdateLocation location, boolean location_OnOff, @org.jetbrains.annotations.NotNull()
    java.lang.String location_text, double p23_1663806, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> postProfile_picture, @org.jetbrains.annotations.NotNull()
    java.lang.String profile_title, int status, @org.jetbrains.annotations.NotNull()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    java.lang.String u_id, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    java.lang.String user_name) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int get__v() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String get_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getBooking_status() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getC_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated_at() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getDark_theme() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription_1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription_2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription_3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExpiry_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirst_name() {
        return null;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean getFollow() {
        return false;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getFont_size() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFrontpage_bottom_text() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFrontpage_top_text() {
        return null;
    }
    
    public final boolean component17() {
        return false;
    }
    
    public final boolean is_bottom_selected() {
        return false;
    }
    
    public final boolean component18() {
        return false;
    }
    
    public final boolean is_top_selected() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLast_name() {
        return null;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    public final double getLat() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.models.UpdateLocation component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.models.UpdateLocation getLocation() {
        return null;
    }
    
    public final boolean component22() {
        return false;
    }
    
    public final boolean getLocation_OnOff() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation_text() {
        return null;
    }
    
    public final double component24() {
        return 0.0;
    }
    
    public final double getLong() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPostProfile_picture() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProfile_title() {
        return null;
    }
    
    public final int component27() {
        return 0;
    }
    
    public final int getStatus() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getU_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser_name() {
        return null;
    }
}