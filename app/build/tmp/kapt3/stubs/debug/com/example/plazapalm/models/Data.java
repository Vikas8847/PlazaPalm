package com.example.plazapalm.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\bQ\b\u0086\b\u0018\u00002\u00020\u0001B\u00eb\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010&J\u0010\u0010L\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010T\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010=J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0002\u0010=J\u0011\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001fH\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010g\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00fc\u0002\u0010j\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010kJ\u0013\u0010l\u001a\u00020\n2\b\u0010m\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010n\u001a\u00020\u0003H\u00d6\u0001J\t\u0010o\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\b\'\u0010(R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b7\u00100R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\b8\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010+R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b\u0014\u00100R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b\u0015\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010+R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\bA\u00100R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010+R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\n\n\u0002\u0010>\u001a\u0004\bC\u0010=R\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010 \u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010+R\u0015\u0010!\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\bG\u0010(R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010+R\u0013\u0010#\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010+R\u0013\u0010$\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010+R\u0013\u0010%\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010+\u00a8\u0006p"}, d2 = {"Lcom/example/plazapalm/models/Data;", "", "__v", "", "_id", "", "address", "c_id", "created_at", "dark_theme", "", "description_1", "description_2", "description_3", "expiry_date", "first_name", "follow", "font_size", "frontpage_bottom_text", "frontpage_top_text", "is_bottom_selected", "is_top_selected", "last_name", "lat", "", "location", "Lcom/example/plazapalm/models/Location;", "location_OnOff", "location_text", "long", "postProfile_picture", "", "profile_title", "status", "tags", "u_id", "updated_at", "user_name", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Lcom/example/plazapalm/models/Location;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get__v", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "get_id", "()Ljava/lang/String;", "getAddress", "getC_id", "getCreated_at", "getDark_theme", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescription_1", "getDescription_2", "getDescription_3", "getExpiry_date", "getFirst_name", "getFollow", "getFont_size", "getFrontpage_bottom_text", "getFrontpage_top_text", "getLast_name", "getLat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLocation", "()Lcom/example/plazapalm/models/Location;", "getLocation_OnOff", "getLocation_text", "getLong", "getPostProfile_picture", "()Ljava/util/List;", "getProfile_title", "getStatus", "getTags", "getU_id", "getUpdated_at", "getUser_name", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Lcom/example/plazapalm/models/Location;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/plazapalm/models/Data;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Data {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer __v = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String _id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String address = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String c_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String created_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean dark_theme = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description_1 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description_2 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description_3 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String expiry_date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String first_name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean follow = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer font_size = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String frontpage_bottom_text = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String frontpage_top_text = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean is_bottom_selected = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean is_top_selected = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String last_name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double lat = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.plazapalm.models.Location location = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean location_OnOff = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String location_text = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> postProfile_picture = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String profile_title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String tags = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String u_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String updated_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String user_name = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.plazapalm.models.Data copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer __v, @org.jetbrains.annotations.Nullable()
    java.lang.String _id, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String c_id, @org.jetbrains.annotations.Nullable()
    java.lang.String created_at, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean dark_theme, @org.jetbrains.annotations.Nullable()
    java.lang.String description_1, @org.jetbrains.annotations.Nullable()
    java.lang.String description_2, @org.jetbrains.annotations.Nullable()
    java.lang.String description_3, @org.jetbrains.annotations.Nullable()
    java.lang.String expiry_date, @org.jetbrains.annotations.Nullable()
    java.lang.String first_name, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean follow, @org.jetbrains.annotations.Nullable()
    java.lang.Integer font_size, @org.jetbrains.annotations.Nullable()
    java.lang.String frontpage_bottom_text, @org.jetbrains.annotations.Nullable()
    java.lang.String frontpage_top_text, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_bottom_selected, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_top_selected, @org.jetbrains.annotations.Nullable()
    java.lang.String last_name, @org.jetbrains.annotations.Nullable()
    java.lang.Double lat, @org.jetbrains.annotations.Nullable()
    com.example.plazapalm.models.Location location, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean location_OnOff, @org.jetbrains.annotations.Nullable()
    java.lang.String location_text, @org.jetbrains.annotations.Nullable()
    java.lang.Double p22_1663806, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> postProfile_picture, @org.jetbrains.annotations.Nullable()
    java.lang.String profile_title, @org.jetbrains.annotations.Nullable()
    java.lang.Integer status, @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.Nullable()
    java.lang.String u_id, @org.jetbrains.annotations.Nullable()
    java.lang.String updated_at, @org.jetbrains.annotations.Nullable()
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
    
    public Data(@org.jetbrains.annotations.Nullable()
    java.lang.Integer __v, @org.jetbrains.annotations.Nullable()
    java.lang.String _id, @org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    java.lang.String c_id, @org.jetbrains.annotations.Nullable()
    java.lang.String created_at, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean dark_theme, @org.jetbrains.annotations.Nullable()
    java.lang.String description_1, @org.jetbrains.annotations.Nullable()
    java.lang.String description_2, @org.jetbrains.annotations.Nullable()
    java.lang.String description_3, @org.jetbrains.annotations.Nullable()
    java.lang.String expiry_date, @org.jetbrains.annotations.Nullable()
    java.lang.String first_name, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean follow, @org.jetbrains.annotations.Nullable()
    java.lang.Integer font_size, @org.jetbrains.annotations.Nullable()
    java.lang.String frontpage_bottom_text, @org.jetbrains.annotations.Nullable()
    java.lang.String frontpage_top_text, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_bottom_selected, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_top_selected, @org.jetbrains.annotations.Nullable()
    java.lang.String last_name, @org.jetbrains.annotations.Nullable()
    java.lang.Double lat, @org.jetbrains.annotations.Nullable()
    com.example.plazapalm.models.Location location, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean location_OnOff, @org.jetbrains.annotations.Nullable()
    java.lang.String location_text, @org.jetbrains.annotations.Nullable()
    java.lang.Double p22_1663806, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> postProfile_picture, @org.jetbrains.annotations.Nullable()
    java.lang.String profile_title, @org.jetbrains.annotations.Nullable()
    java.lang.Integer status, @org.jetbrains.annotations.Nullable()
    java.lang.String tags, @org.jetbrains.annotations.Nullable()
    java.lang.String u_id, @org.jetbrains.annotations.Nullable()
    java.lang.String updated_at, @org.jetbrains.annotations.Nullable()
    java.lang.String user_name) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer get__v() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String get_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
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
    public final java.lang.String getCreated_at() {
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
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getExpiry_date() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirst_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getFollow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFont_size() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFrontpage_bottom_text() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFrontpage_top_text() {
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
    public final com.example.plazapalm.models.Location component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.plazapalm.models.Location getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getLocation_OnOff() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocation_text() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLong() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getPostProfile_picture() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProfile_title() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getU_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_name() {
        return null;
    }
}