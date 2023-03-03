package com.example.plazapalm.utils

import androidx.datastore.preferences.core.stringPreferencesKey

object Constants {
    /** Validation Strings for Signup Page **/
    const val FirstNameCantEmpty = "First Name can't be empty"
    const val MessageNameCantEmpty = "Message can't be empty"
    const val ImageCantEmpty = "Minimum 3 images required "
    const val LastNameCantEmpty = "Last Name can't be empty"
    const val EmailCantEmpty = "Email can't be empty"
    const val UserCantEmpty = "User Name can't be empty"
    const val ENTER_VALID_EMAIL = "Please Enter Valid Email"
    const val PasswordCantEmpty = "Password can't be empty"
    const val ProfileCantEmpty = "Profile title can't be empty"
    const val ConfirmPasswordCantEmpty = "Confirm Password can't be empty"
    const val AddaddressCantEmpty = "Address can't be empty"
    const val LocationCantEmpty = "Location can't be empty"
    const val ExpireDateCantEmpty = "Expiration Date can't be empty"
    const val Description1CantEmpty = "Description 1 can't be empty"
    const val Description2CantEmpty = "Description 2 can't be empty"
    const val Description3CantEmpty = "Description 3 can't be empty"
    const val reportTextCantEmpty = "Report title can't be empty"
    const val reportNoteCantEmpty = "Report note can't be empty"
    const val Description3minimum = "Minimum 20 characters are requird "
    const val CHECK_INTERNET = "Please Check Your Internet Connection First."
    const val VERIFY_EMAIL_OTP = "Please Verify Email Otp ."
    const val ENTER_OTP = "Enter otp"
    const val USER_ACCOUNT_DELETED = "User account is deleted successfully."
    const val PASSWORD_CHANGED = "Password changed successfully"
    const val EMAIL_MUST_VALID = "Email must be a valid email address"
    const val OOPS_SOMETHING_WRONG = "Oops! Something went wrong"
    const val SOMETHING_WRONG = "Something went wrong"
    const val OTP_RESENT = "Otp re-sent"
    const val DeviceType = "android"
    const val DeviceToken = "test55"
    const val AUTHORIZATION = "Authorization"


    /**All Same type key's of Api's **/
    const val FIRST_NAME = "first_name"
    const val LAST_NAME = "last_name"
    const val PASSWORD = "password"
    const val DEVICE_TOKEN = "device_token"
    const val DEVICE_TYPE = "device_type"
    const val IMAGE_URL = "image_url"
    const val NOTIFICATION = "notification"

    /**Verify Otp Api key ***/
    const val EMAIL = "email"
    const val OTP = "otp"

    /**Change Password Api key..**/
    const val CURRENT_PASSWORD = "currentPassword"
    const val NEW_PASSWORD = "newPassword"

    /**Changed password validation strings**/
    const val NEW_PASSWORD_CANT_EMPTY = "New password can't be empty"
    const val CURRENT_PASSWORD_CANT_EMPTY = "Current password can't be empty"
    const val CONFIRM_PASSWORD_CANT_EMPTY = "Confirm password can't be empty"
    const val PASSWORD_NOT_MATCH = "Password does not match"

    /***Contact us strings..*/
    const val SUBJECT_CANT_EMPTY = "Subject can't be  empty"
    const val MESSAGE_CANT_EMPTY = "Message can't be empty"

    /** SAVE POSTPROFILE API KEYS */
    const val LAT = "lat"
    const val LONG = "long"
    const val ADDRESS = "long"
    const val EXPIRE_DATE = "expiredate"
    const val LOCATION = "location"
    const val USER_NAME = "user_name"
    const val TAG = "tag"
    const val DISCRIPTON_1 = "discription4"
    const val DISCRIPTON_2 = "discription2"
    const val DISCRIPTON_3 = "discription3"
    const val PROFILE_TITLE = "profile_title"
    const val C_ID = "cid"

    // pref keys\

    const val POSTSTATUS = "POSTSTATUS"
    const val POSTRESPONSE = "POSTRESPONSE"
    const val FROM_MY_PROFILE = "FROM_MY_PROFILE"

    // OPACITY
    const val COLUMN_OPACITY = "COLUMN_OPACITY"
    const val BORDER_OPACITY = "BORDER_OPACITY"
    const val FONT_OPACITY = "BORDER_OPACITY"

    // COLORS
    const val BACKGROUND_COLOR = "BACKGROUND_COLOR"
    const val BORDER_COLOR = "BORDER_COLOR"
    const val FONT_COLOR = "FONT_COLOR"
    const val COLUMN_COLOR = "COLUMN_COLOR"

    //ADVANCE_EDIT_LOOK (FONTS NAMES)
    const val ADVANCE_EDIT_LOOK_FONTS_NAME = "AdvanceEdit_FontName"

    // SIZE
    const val BORDER_WIDTH = "BORDER_WIDTH"
    const val FONT_SIZE = "FONT_SIZE"

    // Pref keys
    const val SELECTED_CATEGORY_NAME = "SELECTED_CATEGORY_NAME"
    const val SELECTED_CATEGORY_ID = "SELECTED_CATEGORY_ID"
    const val isTopTextSelected = "isTopTextChecked"
    const val isBottomTextSelected = "isBottomTextChecked"

    //Bundle Data Strings..
    const val isFavorite = "isFavorite"
    const val isDashBoard = "isDashBoard"
    const val isViewProfile = "isViewProfile"
    const val addFav = "addFav"
    //Colors Strings

    const val calendarBookingToChat="calendarBookingToChat"
    const val calendarBookingDetails="calendarBookingDetails"
    const val deleteConfirmBooking="deleteConfirmBooking"

    const val BACKGROUND="BACKGROUND"
    const val COLUMN="COLUMN"
    const val BORDER="BORDER"
    const val FONTCOLOR="FONTCOLOR"
    const val Font_Color_Name="Font Color"
    const val Font_Sample="Font Sample"
    const val Border_Color="Border Color"
    const val Background_color="Background Color"
    const val Column_color="Column Color"
    const val Font_Color="Font Color"



    const val Calendar  = "Calendar"

    /** dataStore key */
    val CategoryList by lazy { stringPreferencesKey("CategoryList") }
    val FilterList by lazy { stringPreferencesKey("FilterList") }
    val SELECTED_SLIDER by lazy { stringPreferencesKey("SELECTED_SLIDER") }
    val SLECTED_CATE_SIGNUP by lazy { stringPreferencesKey("FilterList") }
    val list_Name by lazy { stringPreferencesKey("idsList") }
    val list_CateName by lazy { stringPreferencesKey("idsList") }
    var REDIRECT_CHATSCREEN: String = "redirectChatScreen"
    var FILTER_SCREEN_LAT: String = "filter_Screen_Lat"
    var FILTER_SCREEN_LONG: String = "filter_screen_long"
    var FILTER_SCREEN_ADDRESS: String = "filter_screen_address"


    var CATEGORY_SCREEN_LAT: String = "category_screen_lat"
    var CATEGORY_SCREEN_LONG: String = "category_screen_long"
    var CATEGORY_SCREEN_ADDRESS: String = "category_screen_address"


    var CURRENT_LOCATION_LAT:String="current_location_lat"
    var CURRENT_LOCATION_LONG:String="current_location_long"
    var TEMP_LATVALUE:Double?=0.0
    var TEMP_LONGVALUE:Double?=0.0

    var MILES_TEXT:String="mi"

    var CURRENTCHATID:String?=""
    var APP_STATE:String?=""

    var MIN_FONT_SIZE:Int=12
    var MAX_FONT_SIZE:Int=20
    var DEFAULT_FONT_SIZE=15


}