package com.example.plazapalm.networkcalls

import com.example.plazapalm.models.*
import com.google.gson.JsonObject
import okhttp3.MultipartBody
import org.json.JSONObject
import retrofit2.Response
import retrofit2.http.*
import java.util.*
import kotlin.collections.ArrayList

interface RetrofitApi {
    /*SignUp api..*/
    @FormUrlEncoded
    @POST(SIGN_UP)
    suspend fun signUp(
        @Field("first_name") FirstName: String?,
        @Field("last_name") LastName: String?,
        @Field("email") Email: String?,
        @Field("password") Password: String?,
        @Field("device_token") DeviceToken: String?,
        @Field("device_type") DeviceType: String?,
        @Field("business_profile_status") business_profile_status: Boolean?,
    ): Response<SignupResponseModel>

    /*Verify Otp api..*/
    @FormUrlEncoded
    @POST(VERIFY_OTP)
    suspend fun verifyOtp(
        @Field("email") Email: String?,
        @Field("otp") Otp: String?,
    ): Response<VerifyOtpData>

    /*Resend Otp api..*/
    @FormUrlEncoded
    @POST(RESEND_OTP)
    suspend fun reSendOtp(
        @Field("email") Email: String?
    ): Response<VerifyOtpData>

    /*Forgot Password api..*/
    @FormUrlEncoded
    @POST(FORGOT_PASSWORD)
    suspend fun forgotPassword(
        @Field("email") Email: String?
    ): Response<VerifyOtpData>


    /*Login Api ..*/
    @FormUrlEncoded
    @POST(LOGIN)
    suspend fun loginApi(
        @Field("email") Email: String? = "",
        @Field("password") Password: String? = "",
        @Field("device_token") DeviceToken: String? = "",
        @Field("device_type") DeviceType: String? = ""
    ): Response<LoginDataModel>

    /*Change Password api.. */
    @FormUrlEncoded
    @POST(CHANGE_PASSWORD)
    suspend fun changePassword(
        @Header("Authorization") Authorization: String,
        @Field("currentPassword") CurrentPassword: String? = "",
        @Field("newPassword") NewPassword: String? = "",
    ): Response<VerifyOtpData>


    /*Contact Us api..*/
    @FormUrlEncoded
    @POST(CONTACT_US)
    suspend fun contactUs(
        @Header("Authorization") Authorization: String,
        @Field("email") Email: String? = "",
        @Field("subject") Subject: String? = "",
        @Field("message") Message: String? = ""
    ): Response<ContactUsResponseModel>


    /*Delete Account api.. */
    @DELETE(DELETE_ACCOUNT)
    suspend fun deleteAccount(
        @Header("Authorization") Authorization: String,
    ): Response<VerifyOtpData>


    /*Update email api..*/
    @FormUrlEncoded
    @POST(UPDATE_EMAIL)
    suspend fun updateEmail(
        @Header("Authorization") Authorization: String,
        @Field("email") Email: String?
    ): Response<VerifyOtpData>

    /*Log out api..*/
    @FormUrlEncoded
    @POST(LOG_OUT)
    suspend fun logOutUser(
        @Header("Authorization") Authorization: String,
        @Field("device_token") DeviceToken: String?,
        @Field("device_type") DeviceType: String?
    ): Response<UserLogoutModel>


    /*Reset Password api...*/
    @FormUrlEncoded
    @POST(RESET_PASSWORD)
    suspend fun resetPassword(
        @Field("email") Email: String?,
        @Field("password") Password: String?
    ): Response<VerifyOtpData>


    /*Get Profile Api.. */
    @GET(GET_PROFILE)
    suspend fun getProfileApi(
        @Header("Authorization") Authorization: String?
    ): Response<GetProfileResponseModel>


    /*Update profile api..*/
    @FormUrlEncoded
    @POST(UPDATE_PROFILE)
    suspend fun updateProfile(
        @Header("Authorization") Authorization: String?,
        @Field("first_name") FirstName: String?,
        @Field("last_name") LastName: String?,
        @Field("image_url") ImageUrl: String?,
        @Field("notification") Notification: Boolean? = false,
    ): Response<GetProfileResponseModel>


    @FormUrlEncoded
    @POST(VALIDATE_OTP_UPDATE_EMAIL)
    suspend fun validateOtpUpdateEmail(
        @Header("Authorization") Authorization: String?,
        @Field("email") Email: String?,
        @Field("otp") Otp: String?,
    ): Response<VerifyOtpData>


    /*Upload media api..*/
    @Multipart
    @POST(UPLOAD_MEDIA)
    suspend fun uploadMedia(
        @Header("Authorization") Authorization: String?,
        @Part images: MultipartBody.Part
    ): Response<UploadMediaResponse>

    /*Get Categories Api....*/
    @GET(GET_CATEGORIES)
    suspend fun getCategories(
        @Header("Authorization") Authorization: String,
        @Query("lat") Lat: Double,
        @Query("long") Long: Double,
        @Query("offset") OffSet: Int,
        @Query("limit") Limit: Int,
        @Query("search") Search: String
    ): Response<CategoriesResponseModel>

    /*   *//*Add to Calendar...*//*
    @FormUrlEncoded
    @POST(ADD_TO_CALENDAR)
    suspend fun addToCalendar(
        @Field("category_name") CategoryName:String,
        @Field("choose_date") ChooseDate:String,
        @Field("post_profile_id") Post_profile_id:String,
        @Field("choose_time") ChooseTime:String,
        @Field("description") Description:String,
        @Field("items[]")
    ):Response<AddToCalendarResponseModel>
*/
    @GET(GET_PREMIUM_STATUS)
    suspend fun isPremiumStatus(
        @Header("Authorization") Authorization: String
    ): Response<CategoriesResponseModel>

//    @FormUrlEncoded
//    @POST(GET_PROFILE_BY_CATEGORERY)
//    suspend fun  getProfileByCategory(
//        @Header("Authorization")  Authorization: String,
//        @Field("c_id") c_id:String,
//        @Field("offset") offset:Int,
//        @Field("limit") limit:Int,
//        @Field("lat")lat:Double,
//        @Field("long")long:Double,
//        @Field("search")search:String
//    ):Response<GetProfilebyCateResponse>

    @FormUrlEncoded
    @POST(GET_PROFILE_BY_CATEGORERY)
    suspend fun getProfileByCategory(
        @Header("Authorization") Authorization: String,
        @Field("c_id") c_id: ArrayList<String>,
        // @Field("c_id") c_id: String,
        @Field("offset") offset: Int,
        @Field("limit") limit: Int,
        @Field("lat") lat: Double,
        @Field("long") long: Double,
        @Field("search") search: String,
        @Field("miles") miles: String
    ): Response<GetProfileCateResponse>

    @FormUrlEncoded
    @POST(SAVE_POST_PROFILE)
    suspend fun postProfile(
        @Header("Authorization") Authorization: String?,
        @Field("first_name") FirstName: String?,
        @Field("last_name") LastName: String?,
        @Field("long") long: String?,
        @Field("expiry_date") expiry_date: String?,
        @Field("address") address: String?,
        @Field("location_text") location_text: String?,
        @Field("image_url") image_url: ArrayList<String>,
//        @Part("image_url") image_url : MultipartBody.Part,
        @Field("user_name") user_name: String,
        @Field("tags") tags: String?,
        @Field("description_2") description_2: String?,
        @Field("description_1") description_1: String?,
        @Field("description_3") description_3: String?,
        @Field("lat") lat: String?,
        @Field("profile_title") profile_title: String?,
        @Field("c_id") c_id: String?,
    ): Response<SavePostProfileResponse>


/*
    @Multipart
    @POST(SAVE_POST_PROFILE)
    suspend fun postProfile(

        @Header("Authorization") Authorization: String?,
        @Part("first_name") FirstName: RequestBody?,
        @Part("last_name") LastName: RequestBody?,
        @Part("long") long: RequestBody?,
        @Part("expiry_date") expiry_date: RequestBody?,
        @Part("address") address: RequestBody?,
        @Part("location_text") location_text: RequestBody?,
        @Part image_url : Array<MultipartBody.Part?>,
//      @Part("image_url") image_url : MultipartBody.Part,
        @Part("user_name") user_name: RequestBody?,
        @Part("tags") tags: RequestBody?,
        @Part("description_2") description_2: RequestBody?,
        @Part("description_1") description_1: RequestBody?,
        @Part("description_3") description_3: RequestBody?,
        @Part("lat") lat: RequestBody?,
        @Part("profile_title") profile_title: RequestBody?,
        @Part("c_id") c_id: RequestBody?,
        ): Response<SavePostProfileResponse>
*/

    @FormUrlEncoded
    @POST(VALIDATE_USERNAME)
    suspend fun validateUserName(
        @Header("Authorization") Authorization: String?,
        @Field("user_name") user_name: String?,
    ): Response<ValidateUserNameResponse>

    @GET(GET_POST_PROFILE)
    suspend fun getPostProfile(
        @Header("Authorization") Authorization: String,
        @Query("p_id") p_id: String,
        @Query("lat") Lat: Float,
        @Query("long") Long: Float
    ): Response<GetPostProfileResponse>

    @DELETE("postProfileDelete/{name}")
    suspend fun deleteProfilePost(
        @Header("Authorization") Authorization: String,
        @Path("name") name: String
    ): Response<DeletePostProfileResponse>

    /*Upload media api..*/
    @Multipart
    @POST(UPLOAD_MEDIA)
    suspend fun uploadMediaPostProfile(
        @Header("Authorization") Authorization: String?,
        @Part images: Array<MultipartBody.Part?>
    ): Response<UploadMediaResponse>

    @FormUrlEncoded
    @POST(POST_PRPFILE_UPDATE)
    suspend fun updatepostProfile(
        @Header("Authorization") Authorization: String?,
        @Field("first_name") FirstName: String?,
        @Field("last_name") LastName: String?,
        @Field("long") long: String?,
        @Field("expiry_date") expiry_date: String?,
        @Field("address") address: String?,
        @Field("location_text") location_text: String?,
        @Field("image_url") image_url: ArrayList<String>,
//      @Part("image_url") image_url : MultipartBody.Part,
        @Field("user_name") user_name: String,
        @Field("tags") tags: String?,
        @Field("description_2") description_2: String?,
        @Field("description_1") description_1: String?,
        @Field("description_3") description_3: String?,
        @Field("lat") lat: String?,
        @Field("profile_title") profile_title: String?,
        @Field("c_id") c_id: String?,
        @Field("p_id") p_id: String?
    ): Response<UpdateProfileResponse>

    @FormUrlEncoded
    @POST(ADD_TOFAV_POSTPROFILE)
    suspend fun addtoFav(
        @Header("Authorization") Authorization: String?,
        @Field("p_id") p_id: String?,
        @Field("favType") favType: Boolean?
    ): Response<AddFavPostProfileResponse>

    @GET(GET_FAVOURITES)
    suspend fun getFavDetals(
        @Header("Authorization") Authorization: String?,
        @Query("lat") lat: Double,
        @Query("long") long: Double
    ): Response<GetFavResponse>

    @FormUrlEncoded
    @POST(LIKES_DISLIKES)
    suspend fun likesDislikes(
        @Header("Authorization") Authorization: String,
        @Field("p_id") p_id: String,
        @Field("likeStatus") likeStatus: Boolean,
        @Field("dislikeStatus") dislikeStatus: Boolean
    ): Response<LikesResPonse>

    @FormUrlEncoded
    @POST(REPORT)
    suspend fun report(
        @Header("Authorization") Authorization: String,
        @Field("p_id") p_id: String,
        @Field("reportText") reportText: String,
        @Field("note") note: String,
    ): Response<ReportResponse>

    @FormUrlEncoded
    @POST(ADD_QUESTION)
    suspend fun addQuestion(
        @Header("Authorization") Authorization: String,
        @Field("p_id") p_id: String,
        @Field("question_text") question_text: String
    ): Response<AddQuestionResponseModel>
    // add Calendar api ..


    @FormUrlEncoded
    @POST(ADD_TO_CALENDAR)
    suspend fun addToCalendarBooking(
        @Header("Authorization") Authorization: String,
        @Field("category_name") Category_Name: String,
        @Field("choose_date") Choose_Date: String,
        @Field("post_profile_id") Post_Profile_Id: String,
        @Field("choose_time") Choose_Time: String,
        @Field("description") Description: String,
        @Field("question_answer") Question_Answer: ArrayList<QuestionAnswer>
    ): Response<AddToCalendarResponseModel>

    /**Delete Account api.. */
    @DELETE(REMOVE_FROM_CALENDAR)
    suspend fun deleteFromCalendar(
        @Header("Authorization") Authorization: String,
        @Field("booking_id") Booking_Id: String
    ): Response<AddToCalendarResponseModel>

    /** Confirm Booking Api**/
    @FormUrlEncoded
    @POST(CONFIRM_BOOKING)
    suspend fun conBookProfileSave(
        @Header("Authorization") Authorization: String,
        @Field("post_profile_id") post_profile_id: String,
        @Field("choose_date") choose_date: String,
        @Field("choose_time") choose_time: String,
        @Field("description") description: String,
        @Field("category_name") category_name: String,
        @Field("question_answer") question_answer: ArrayList<QuestionAnswer>

    ): Response<ConfirmBookingProfileResponse>

    /** GetCalendarBookingDateMonthWiseForBoth Api */
    @GET(GET_CALENDAR_RESPONSE)
    suspend fun getCalendarBookingDateMonthWiseForBoth(
        @Header("Authorization") Authorization: String,
        @Query("month") month: Int,
        @Query("year") year: Int,
        @Query("post_profile_id ") post_profile_id: String

    ): Response<GetCalanderResponseModel>


    /** AddToBlocklist Api */
    @FormUrlEncoded
    @POST(ADDTO_BLOCKLIST)
    suspend fun addToBlocklist(
        @Header("Authorization") Authorization: String,
        @Field("u_id") u_id: String,
        @Field("isBlocked") isBlocked: Boolean
    ): Response<BlockUserResponse>

    /** GetBookingDetailsForCustomer Api */
    @GET(GET_BOOKING_DETAILSFOR_CUSTOMER)
    suspend fun getBookingDetailsForCustomer(
        @Header("Authorization") Authorization: String,
        @Query("booking_id") booking_id: String
    ): Response<BookingDetailsResponse>

    /** Booking StatusInput Api */
    @FormUrlEncoded
    @POST(BOOKINGSTATUS_INPUT)
    suspend fun bookingStatusInput(
        @Header("Authorization") Authorization: String,
        @Query("booking_id") booking_id: String,
        @Query("booking_status") booking_status: String
    ): Response<BookingStatusInputResponse>

    /** Delete Booking Api */
    @FormUrlEncoded
    @DELETE(DELETE_BOOKING)
    suspend fun deleteBooking(
        @Header("Authorization") Authorization: String,
        @Field("booking_id") booking_id: String
    ): Response<DeleteBookingResponse>

    @GET("listQuestion/{p_id}")
    suspend fun listQuestion(
        @Header("Authorization") Authorization: String,
        @Path("p_id") p_id: String
    ): Response<GetQuestionsListResponse>

    @DELETE(DELETE_QUESTION)
    suspend fun deleteQuestion(
        @Header("Authorization") Authorization: String,
        @Query("question_id") question_id: String
    ): Response<DeleteQuestionsResponse>

    @POST(UPDATE_QUESTION)
    suspend fun updateQuestion(
        @Header("Authorization") Authorization: String,
        @Field("question_id") question_id: String,
        @Field("question_text") question_text: String
    ): Response<DeleteQuestionsResponse>

    @FormUrlEncoded
    @POST(POST_COLORS_EDIT)
    suspend fun postEditLookColors(
        @Header("Authorization") Authorization: String,
        @Field("backgroundColor") backgroundColor: String,
        @Field("backgroundType") backgroundType: String,
        @Field("columnColor") columnColor: String,
        @Field("columnOpacity") columnOpacity: Double,
        @Field("borderOpacity") borderOpacity: Double,
        @Field("borderWidth") borderWidth: Float,
        @Field("borderColor") borderColor: String,
        @Field("fontName") fontName: String,
        @Field("fontColor") fontColor: String,
        @Field("fontSize") fontSize: Int,
        @Field("fontOpacity") fontOpacity: Double

    ): Response<EditLookColorsResponse>

    @GET(GET_COLORS)
    suspend fun colorLookGet(
        @Header("Authorization") Authorization: String
    ): Response<GetColorsResponse>

    @POST(MAP_FEATURES)
    suspend fun mapFeatreData(
      @Body jsonObject: JSONObject
    ): Response<MapFeaturedDataRes>

    @FormUrlEncoded
    @POST(MAP_FEATURES)
    suspend fun mapFeatreData(
        @Header("Authorization") Authorization: String,
        @Field("darkTheme") darkTheme: Boolean,
        @Field("locationOnOff") locationOnOff: Boolean,
        @Field("follow") follow: Boolean
    ): Response<MapFeaturedDataRes>

    @GET(GET_MAP_FEATURES)
    suspend fun getMapFeatured(
        @Header("Authorization") Authorization: String
    ): Response<GetMapFeature>

    @FormUrlEncoded
    @POST(UPDATE_LATLONG)
    suspend fun updateLatlng(
        @Header("Authorization") Authorization: String,
        @Field("user_lat") user_lat: Double,
        @Field("user_long") user_long: Double
    ):Response<UpdateLatlngResponse>



  //  @POST(GALLERYPOST)
    @HTTP(method = "POST", path = GALLERYPOST, hasBody = true)
    suspend fun uploadSinglePhotoUrl(
        @Header("Authorization") Authorization: String,
        @Header("Content-Type") contentType: String,
        @Body mediaData: UploadedMedia
    ): Response<UploadMediaResponse>


    @GET(GALLERYGET)
    suspend fun getGalleryList(
        @Header("Authorization") Authorization: String
    ): Response<UploadMediaResponse>

   // @DELETE(DELETE_MEDIA)
    @HTTP(method = "DELETE", path = DELETE_MEDIA, hasBody = true)
    suspend fun deleteGalleryPhotoAPI(
        @Header("Authorization") Authorization: String,
        @Header("Content-Type") contentType: String,
        @Body jsonObject:DeleteMediaData
    ): Response<DeleteMediaResponse>
}