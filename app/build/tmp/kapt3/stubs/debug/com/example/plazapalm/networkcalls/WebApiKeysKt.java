package com.example.plazapalm.networkcalls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\'\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"ADDTO_BLOCKLIST", "", "ADD_QUESTION", "ADD_TOFAV_POSTPROFILE", "ADD_TO_CALENDAR", "BASE_URL", "BOOKINGSTATUS_INPUT", "CHANGE_PASSWORD", "CONFIRM_BOOKING", "CONTACT_US", "DELETE_ACCOUNT", "DELETE_BOOKING", "DELETE_PROFILE_POST", "DELETE_QUESTION", "FORGOT_PASSWORD", "GET_BOOKING_DETAILSFOR_CUSTOMER", "GET_CALENDAR_RESPONSE", "GET_CATEGORIES", "GET_COLORS", "GET_FAVOURITES", "GET_POST_PROFILE", "GET_PREMIUM_STATUS", "GET_PROFILE", "GET_PROFILE_BY_CATEGORERY", "IMAGE_LOAD_URL", "LIKES_DISLIKES", "LOGIN", "LOG_OUT", "MAP_FEATURES", "POST_COLORS_EDIT", "POST_PRPFILE_UPDATE", "REMOVE_FROM_CALENDAR", "REPORT", "RESEND_OTP", "RESET_PASSWORD", "SAVE_POST_PROFILE", "SIGN_UP", "UPDATE_EMAIL", "UPDATE_PROFILE", "UPDATE_QUESTION", "UPLOAD_MEDIA", "VALIDATE_OTP_UPDATE_EMAIL", "VALIDATE_USERNAME", "VERIFY_OTP", "app_debug"})
public final class WebApiKeysKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "http://192.168.1.87:3000/auth/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_LOAD_URL = "https://d17am3tdlggecz.cloudfront.net/";
    
    /**
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SIGN_UP = "sign-up";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VERIFY_OTP = "verifyOtp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESEND_OTP = "resendOtp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORGOT_PASSWORD = "forgotPassword";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN = "login";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONTACT_US = "contactUs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANGE_PASSWORD = "changePassword";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELETE_ACCOUNT = "deleteUserAccount";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_EMAIL = "updateEmail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOG_OUT = "logout";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESET_PASSWORD = "resetPassword";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_PROFILE = "getProfile";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_PROFILE = "updateProfile";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPLOAD_MEDIA = "uploadMedia";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_CATEGORIES = "getCategory";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_POST_PROFILE = "getPostProfile";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELETE_PROFILE_POST = "postProfileDelete";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADD_TO_CALENDAR = "addToCalender";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VALIDATE_OTP_UPDATE_EMAIL = "validateOtpForUpdateEmail";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VALIDATE_USERNAME = "validateUserName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_PREMIUM_STATUS = "isPremiumStatus";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_PROFILE_BY_CATEGORERY = "getProfileByCategory";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SAVE_POST_PROFILE = "postProfileSave";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POST_PRPFILE_UPDATE = "postProfileUpdate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADD_TOFAV_POSTPROFILE = "addFavourites";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_FAVOURITES = "listFavourites";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIKES_DISLIKES = "likesDislikes";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REPORT = "report";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADD_QUESTION = "addQuestion";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REMOVE_FROM_CALENDAR = "removeFromCalender";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONFIRM_BOOKING = "bookProfileSave";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_CALENDAR_RESPONSE = "getBookingDateMonthWiseForBoth";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADDTO_BLOCKLIST = "addToBlocklist";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_BOOKING_DETAILSFOR_CUSTOMER = "getBookingDetailsForCustomer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BOOKINGSTATUS_INPUT = "bookingStatusInput";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELETE_BOOKING = "deleteBooking";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DELETE_QUESTION = "deleteQuestion";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UPDATE_QUESTION = "updateQuestion";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POST_COLORS_EDIT = "colorLook";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_COLORS = "colorLookGet";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MAP_FEATURES = "mapFeature";
}