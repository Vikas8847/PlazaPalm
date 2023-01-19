package com.example.plazapalm.views.favourites.favdetails

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.databinding.ObservableParcelable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.plazapalm.BuildConfig
import com.example.plazapalm.R
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.models.*
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.navigateBack
import com.example.plazapalm.utils.navigateWithId
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Response
import javax.inject.Inject


@HiltViewModel
class FavDetailsVM @Inject constructor(
    private var dataStoreUtil: DataStoreUtil,
    private var repository: Repository,
    private var pref: PreferenceFile,
) : ViewModel() {

    // private var tvRemoveFav=ObservableField("")
    private var tvRemoveFav: AppCompatTextView? = null

    var uploadImagesList = ArrayList<ImagesVideosModel>()
    var uploadVideoList = ArrayList<ImagesVideosModel>()
//  val viewProfileAdapter by lazy { RecyclerAdapter<ImagesVideosModel>(R.layout.view_profile_images_list) }

    val videosAdapter by lazy { RecyclerAdapter<ImagesVideosModel>(R.layout.view_profile_videos_list) }
    var isFavourites = ObservableBoolean(false)
    var isViewProfile = ObservableBoolean(false)
    var CommingFrom = ObservableField("")
    var p_id = ObservableField("")
    var u_ID = ObservableField("")
    var userId = ObservableField("")
    var firstName = ObservableField("")
    var lastName = ObservableField("")
    var DisLikesCount = ObservableField("")
    var LikesCount = ObservableField("")
    var username = ObservableField("")
    var addData = ObservableField("")
    var fav_title = ObservableField("")

    var fontViewColor = ObservableField("")
    var columnViewColor = ObservableField("")
    var borderViewColor = ObservableField("")

    var etVEditProDescription = ObservableField("")
    var tvFavDetailsAddress = ObservableField("")
    var tvFavCityAddress = ObservableField("")
    var isFav = ObservableBoolean(false)
    var isLike = ObservableBoolean(false)
    var isLikeDislike = ObservableBoolean(false)
    var isDisLike = ObservableBoolean(false)
    var data_list: ArrayList<AddPhoto>? = null
    var userdata = ObservableParcelable<postData?>()
    var dialog: Dialog? = null
    var deldialog: Dialog? = null
    var reportText: TextView? = null
    var tvFavouriteCountValue = ObservableField("0")
    var tvAllowBooking = ObservableBoolean(false)
    var checkFavouriteShow = ObservableInt()
    /** Advance setting */
    val backgroundColor = MutableLiveData<Any>()
    val textColor = MutableLiveData<Any>()

init {
}

    fun onClicks(view: View) {
        when (view.id) {
            R.id.ivFavDetailsDislike -> {

                setdislike(isLike.get(), isDisLike.get(), 2)

                /*  var count = 5
                  val imageLik = view as ImageView

                  if (isDisLike.get().equals(true)) {
                      count=count++
                  } else {
                      count=count--

                  }

                  Log.e("AUTOINCRIMENT", count.toString())

                  if (isLike.get().equals(false) || isDisLike.get().equals(false)) {
                      isDisLike.set(true)
                      isLike.set(false)
                  } else {
                      var dislikeValue = isDisLike.get()
                      var likeValue = isLike.get()
                      isDisLike.set(likeValue)
                      isLike.set(dislikeValue)

                  }

                  Log.e("CHECHK", isDisLike.get().toString() + "VV----  " + isLike.get())

                  likeApi(isLike.get(), isDisLike.get(), "disLike", imageLik)*/

            }

            R.id.ivFavDetailsLike -> {
                setdislike(isLike.get(), isDisLike.get(), 1)
                /*  val imageDis = view as ImageView

                  if (isLike.get().equals(false) || isDisLike.get().equals(false)) {
                      isLike.set(true)
                      isDisLike.set(false)

                  } else {
                      var dislikeValue = isDisLike.get()
                      var likeValue = isLike.get()
                      isDisLike.set(likeValue)
                      isLike.set(dislikeValue)

                  }

                  likeApi(isLike.get(), isLikeDislike.get(), "like", imageDis)*/

            }
            R.id.ivFavDetailsBackBtn -> {
                view.navigateBack()

//              val bundle ="checkApi"

//                 view.findNavController().previousBackStackEntry?.savedStateHandle?.set("changeStatus", bundle)
//                 view.findNavController().popBackStack()

//                view.findNavController().navigateUp()

            }
            R.id.ivFavDetailsFilledHeart -> {

                if (CommingFrom.get().equals("isFavorite")) {
                    AddtoFavAPI(view, isFav.get(), "isFavorite")

                } else if (CommingFrom.get().equals("isDashBoard")) {

                    AddtoFavAPI(view, isFav.get(), "isDashBoard")

                } else if (CommingFrom.get().equals("isViewProfile")) {

                    AddtoFavAPI(view, isFav.get(), "addFav")
                }

            }

            R.id.ivFavDetailsOptions -> {

                if (CommingFrom.get().equals("isFavorite")) {
                    showFavDetailsDialog(view, isFav.get())
                } else if (CommingFrom.get().equals("isDashBoard")) {
                    showFavDetailsDialog(view, isFav.get())

                } else if (CommingFrom.get().equals("isViewProfile")) {
                    showViewProfileDialog(view)
                }

            }

            R.id.ivFavDetailsChats -> {
                view.navigateWithId(R.id.action_favDetailsFragment_to_chatFragment)
            }

            R.id.btnBookingProfile -> {

                val booking_pro = Bundle()
                booking_pro.putString("bookClick", "confirmBook")
                booking_pro.putString("userName", username.get())
                booking_pro.putString("p_id", p_id.get())
                booking_pro.putString("userLocation", tvFavCityAddress.get().toString())
                booking_pro.putString("proImageg", data_list!!.get(0).Image)
                booking_pro.putFloat("miles", 0.0f)

                view.navigateWithId(R.id.confirmBookingFragment, booking_pro)

            }
        }
    }

    private fun setdislike(likeButton: Boolean, dislikeButton: Boolean, buttonType: Int) {

        var count = LikesCount.get()!!.toInt()
        var discount = DisLikesCount.get()!!.toInt()


     //   Log.e("ADDDDDDD",)
        if (!likeButton && !dislikeButton) {
            if (buttonType == 1) {
                isLike.set(true)
                count++
               // discount--
                isDisLike.set(false)
            } else {
               // count--
                discount++
                isLike.set(false)
                isDisLike.set(true)
            }
        } else if (likeButton && !dislikeButton) {
            if (buttonType == 1) {
                isLike.set(false)
                isDisLike.set(false)
                count--
               // discount--
            } else {
                count--
                discount++
                isLike.set(false)
                isDisLike.set(true)
            }

        } else if (!likeButton && dislikeButton) {

            if (buttonType == 1) {
                isLike.set(true)
                count++
                discount--
                isDisLike.set(false)
            } else {
//                count++
                discount--
                isDisLike.set(false)
                isLike.set(false)
            }

        }

        LikesCount.set(count.toString())
        DisLikesCount.set(discount.toString())

        var likeOtherValue=false
        var dislikeOtherValue=false

        if (buttonType == 1) {
            likeOtherValue=true
            dislikeOtherValue=false
        }else{
            likeOtherValue=false
            dislikeOtherValue=true
        }


        likeApi(likeOtherValue, dislikeOtherValue)



       /* if (isLike.get() && isDisLike.get().equals(false)){
            likeApi(true, false)
        }else if (isLike.get().equals(false) && isDisLike.get().equals(true)){
            likeApi(false, true)
        }*/

    }

    // private fun likeApi(isLiked: Boolean, isDislike: Boolean, from: String, image: ImageView) {
    private fun likeApi(isLiked: Boolean, isDislike: Boolean) {

        repository.makeCall(apiKey = ApiEnums.LIKES_DISLIKES,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<LikesResPonse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<LikesResPonse> {
                    return retrofitApi.likesDislikes(
                        pref.retrieveKey("token").toString(),
                        p_id.get().toString(),
                        isLiked,
                        isDislike
                    )
                }

                override fun onResponse(res: Response<LikesResPonse>) {
                    if (res.isSuccessful || res != null) {
                        if (res.body()!!.status == 200) {

                            dialog?.dismiss()
                            CommonMethods.showToast(
                                CommonMethods.context,
                                res.body()!!.message.toString()
                            )

                        } else {

                            CommonMethods.showToast(
                                CommonMethods.context,
                                res.body()?.message.toString()
                            )

                        }

                    } else {

                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

            })

    }

    private fun AddtoFavAPI(view: View, isfav: Boolean, from: String) {


        Log.e("SADF", "Working--++")

        repository.makeCall(
            apiKey = ApiEnums.ADD_TO_FAV,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<AddFavPostProfileResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<AddFavPostProfileResponse> {
                    return retrofitApi.addtoFav(
                        pref.retrieveKey("token").toString(),
                        p_id.get().toString(),
                        isfav
//                        isFav.get()
                    )
                }
                override fun onResponse(res: Response<AddFavPostProfileResponse>) {
                    Log.e("QWQQWWSSS", res.body().toString())

                    if (res.isSuccessful || res != null) {
                        if (res.body()!!.status == 200) {
                            dialog?.dismiss()
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)

                            if (isFav.get()) {
//                                    tvRemoveFav?.text="Remove from Favourites"
                                isFav.set(false)
                                Log.e("TRUE", res.body().toString())

                               var newFavoriteCount=tvFavouriteCountValue.get()!!.toInt()+1

                                tvFavouriteCountValue.set(newFavoriteCount.toString())

                            } else {
                                isFav.set(true)
//                                    tvRemoveFav?.text="Add from Favourites"
                                Log.e("FALSE", res.body().toString())
                                var newFavoriteCount=tvFavouriteCountValue.get()!!.toInt()-1

                                tvFavouriteCountValue.set(newFavoriteCount.toString())
                            }

                        } else {
                            CommonMethods.showToast(
                                CommonMethods.context,
                                res.body()?.message.toString()
                            )
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }

                }

            }
        )
    }


    private fun showFavDetailsDialog(view: View, isfav: Boolean) {

        if (dialog != null && dialog?.isShowing!!) {
            dialog?.dismiss()
        } else {
            dialog = Dialog(CommonMethods.context, android.R.style.Theme_Dialog)
            dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog?.setContentView(R.layout.fav_details_choose_options)
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            dialog?.setCancelable(false)
            /**choose options click(Button) **/
            dialog?.findViewById<AppCompatTextView>(R.id.tvChooseOptionTitle)?.setOnClickListener {
                dialog?.dismiss()
            }

            /**Remove From Favourites Click (Button)**/

            dialog?.findViewById<AppCompatTextView>(R.id.tvChooseOptRemoveFavDetails)
                ?.setOnClickListener {
//                    AddtoFavAPI(it as TextView, isfav, "removeFav")
//                    dialog?.dismiss()
                }

            tvRemoveFav = dialog?.findViewById<AppCompatTextView>(R.id.tvChooseOptRemoveFavDetails)

            tvRemoveFav?.setOnClickListener {
                AddtoFavAPI(it as TextView, isfav, "removeFav")
                dialog?.dismiss()
            }

            if (isFav.get()) {
                tvRemoveFav?.text = "Add to Favourites"
            } else {
                tvRemoveFav?.text = "Remove from Favourites"
            }

            /** Add to Calendar (Button) **/
            dialog?.findViewById<AppCompatTextView>(R.id.tvChooseOptAddToCalFavDetails)
                ?.setOnClickListener {

                    val ispopUpAddCal = Bundle()
                    ispopUpAddCal.putString("ispopUpAddCal", "addToCalander")
                    ispopUpAddCal.putString("user_name", username.get())
                    ispopUpAddCal.putString("p_id", p_id.get())
                    ispopUpAddCal.putString("user_location", tvFavCityAddress.get().toString())
                    ispopUpAddCal.putString("pro_imageg", data_list!!.get(0).Image)
                    ispopUpAddCal.putFloat("miles", 0.0f)
                    Log.e("SSSSSSs", userdata.get()!!.location_text.toString())
                    view.navigateWithId(R.id.confirmBookingFragment, ispopUpAddCal)
                    dialog?.dismiss()

                }

            /** Share Click (Button) **/
            dialog?.findViewById<AppCompatTextView>(R.id.tvFavChooseShare)?.setOnClickListener {
/*

                try {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "PlazaPlam")
                    var shareMessage = "\nCheck Profile\n\n"
                    shareMessage =
                        """
                     ${shareMessage}http://www.plazapalm.com?=${BuildConfig.APPLICATION_ID} 
                        
                        """.trimIndent()
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
                    CommonMethods.context.startActivity(Intent.createChooser(shareIntent, "choose one"))
                } catch (e: Exception) {

                    //e.toString();

                }
            */

                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Test")
                val app_url = "http://www.plazapalm.com?profileId=${BuildConfig.APPLICATION_ID}"
                shareIntent.putExtra(Intent.EXTRA_TEXT, app_url)
                CommonMethods.context.startActivity(Intent.createChooser(shareIntent, "Share via"))
                dialog?.dismiss()

            }

            /**RePort Button Click**/
            reportText = dialog?.findViewById<AppCompatTextView>(R.id.tvChooseOptFavDetailsReport)

            reportText?.setOnClickListener {
                val bundle = Bundle()
                bundle.putString("p_id", p_id.get())
                view.navigateWithId(
                    R.id.action_favDetailsFragment_to_reportChooseOptionFragment,
                    bundle
                )
                dialog?.dismiss()
            }

            /*** Cancel Button Clicks **/
            dialog?.findViewById<AppCompatTextView>(R.id.tvFavDetailsCancel)
                ?.setOnClickListener {
                    dialog?.dismiss()
                }

            /*** User cant report of owen account make change in this check */

            if ((u_ID.get().equals(userId.get()))) {
                reportText?.visibility = View.GONE
            } else {
                reportText?.visibility = View.VISIBLE
            }
        }

        dialog?.show()

    }

    private fun showViewProfileDialog(view: View) {
        if (dialog != null && dialog?.isShowing!!) {
            dialog?.dismiss()
        } else {

            dialog = Dialog(CommonMethods.context, android.R.style.Theme_Dialog)
            dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog?.setContentView(R.layout.viewprofile_chooseoption)
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            dialog?.setCancelable(false)

            /** Share Click (Button) **/
            dialog?.findViewById<AppCompatTextView>(R.id.tv_editProfile)?.setOnClickListener {

                val bundle = Bundle()
                bundle.putString("comingFromView", "ViewPrfoile")
                bundle.putParcelable("userDATA", userdata)
                bundle.putString("f_name", userdata.get()?.first_name)
                bundle.putString("l_name", userdata.get()?.last_name)
                bundle.putString("user_name", userdata.get()?.user_name)
                bundle.putString("pro_title", userdata.get()?.profile_title)
                bundle.putString("ex_date", userdata.get()?.expiry_date)
                bundle.putString("addresss", userdata.get()?.address)
                bundle.putString("des_1", userdata.get()?.description_1)
                bundle.putString("des_2", userdata.get()?.description_2)
                bundle.putString("des_3", userdata.get()?.description_3)
                bundle.putString("_id", userdata.get()?._id)
                bundle.putString("p_id", userdata.get()?._id)
                bundle.putString("c_id", userdata.get()?.c_id)
                bundle.putString("cate", userdata.get()?.category_name)
                bundle.putString("longi", userdata.get()?.long!!.toString())
                bundle.putString("lati", userdata.get()?.lat!!.toString())
                bundle.putString("location_text", userdata.get()?.location_text)
                bundle.putBoolean("booking_status", tvAllowBooking.get()!!)

//              var dataList : ArrayList<String> =  userdata.get()?.postProfile_picture as ArrayList<String> /* = java.util.ArrayList<kotlin.String> */

                bundle.putParcelableArrayList("profile_Image", data_list)

                Log.e(
                    "SSSSSSS_____ooo",
                    bundle.getDouble("longi")
                        .toString() + "VVVCCC" + "vvv-----vvvv" + bundle.getDouble("lati")
                        .toString()
                )

                view.navigateWithId(R.id.action_favDetailsFragment_to_postProfileFragment, bundle)
                dialog?.dismiss()

            }

            /**RePort Button Click**/
            dialog?.findViewById<AppCompatTextView>(R.id.tv_delete_profile)
                ?.setOnClickListener {
                    dialog?.dismiss()
                    deletePostProfileDialog(view)
                }
            /*** Cancel Button Clicks **/
            dialog?.findViewById<AppCompatTextView>(R.id.tvFavDetailsCancel)
                ?.setOnClickListener {
                    dialog?.dismiss()
                }
        }
        dialog?.show()
    }

    private fun deletePostProfileDialog(view: View) {
        Log.e("asdsadasd", "ASDASDASDasdasdasdasdasdasdasd")

//            if (deldialog != null && dialog?.isShowing!!) {
//                deldialog?.dismiss()
//            } else {

        deldialog = Dialog(CommonMethods.context, android.R.style.Theme_Dialog)
        deldialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
        deldialog?.setContentView(R.layout.delete_postprofile)
        deldialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        deldialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
        deldialog?.setCancelable(false)


        /**RePort Button Click**/
        deldialog?.findViewById<AppCompatTextView>(R.id.tv_delete_profile)
            ?.setOnClickListener {

                deletePostAPi(view)

            }
        /*** Cancel Button Clicks **/
        deldialog?.findViewById<AppCompatTextView>(R.id.tvFavDetailsCancel)
            ?.setOnClickListener {
            //    dialog?.dismiss()
                deldialog?.dismiss()
            }
//            }

        deldialog?.show()

    }

    private fun deletePostAPi(view: View) {

        repository.makeCall(
            ApiEnums.DELETE_POST,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<DeletePostProfileResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<DeletePostProfileResponse> {
                    return retrofitApi.deleteProfilePost(
                        pref.retrieveKey("token").toString(),
                        p_id.get().toString()
                    )
                }

                override fun onResponse(res: Response<DeletePostProfileResponse>) {
                    if (res.isSuccessful) {
                        if (res.body() != null) {
                            if (res.code() == 200) {

                                pref.storeBoolKey(Constants.POSTSTATUS, false)
                                Log.e("QWQAAAZZZ", res.body().toString())
                                CommonMethods.showToast(CommonMethods.context, res.body()!!.message)
                                view.navigateBack()
                              //  dialog?.dismiss()
                                deldialog?.dismiss()

//                                view.findNavController().previousBackStackEntry?.savedStateHandle?.set("changeStatus", false)
//                                view.findNavController().popBackStack()


                            } else {
                                CommonMethods.showToast(CommonMethods.context, res.body()!!.message)
                            }
                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message)
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

            })
    }


    private fun dialogPremiumEditDeleteProfile(view: View) {
        if (dialog != null && dialog?.isShowing!!) {
            dialog?.dismiss()
        } else {
            dialog = Dialog(CommonMethods.context, android.R.style.Theme_Dialog)
            dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog?.setContentView(R.layout.edit_or_delete_profile)
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            dialog?.setCancelable(false)
        }
        dialog?.findViewById<AppCompatTextView>(R.id.tvEditProPremiumOpt)?.setOnClickListener {
            view.navigateWithId(R.id.postProfileFragment)
        }
        dialog?.findViewById<AppCompatTextView>(R.id.tvEditProPremiumDelete)?.setOnClickListener {

            dialog?.dismiss()
        }
        dialog?.findViewById<AppCompatTextView>(R.id.tvEditProPremiumCancel)?.setOnClickListener {
            dialog?.dismiss()
        }

        dialog?.show()
    }


    private fun setAdapter(rvImages: RecyclerView) {
        rvImages.adapter

    }

    fun getEditLookColor() {
        repository.makeCall(
            ApiEnums.GET_EDITCOLORS,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<GetColorsResponse>> {

                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<GetColorsResponse> {
                    return retrofitApi.colorLookGet(
                        pref.retrieveKey("token").toString(),
                    )
                }

                override fun onResponse(res: Response<GetColorsResponse>) {
                    Log.e("AQQAAA", res.body().toString())

                    if (res.isSuccessful) {
                        if (res.body() != null) {
                            if (res.code() == 200) {
                                Log.e("VVVVVVSS", res.body().toString())
                                backgroundColor.value = res.body()!!.data!!.background_color!!
                                textColor.value = res.body()!!.data!!.font_color!!
                                fontViewColor.set(res.body()!!.data!!.font_color!!)
                                columnViewColor.set(res.body()!!.data!!.column_color!!.toString())
                                borderViewColor.set(res.body()!!.data!!.border_color!!)


                            } else {
                                CommonMethods.showToast(
                                    CommonMethods.context,
                                    res.body()!!.message!!
                                )
                            }

                        } else {
                            CommonMethods.showToast(CommonMethods.context, res.body()!!.message!!)
                        }
                    } else {
                        CommonMethods.showToast(CommonMethods.context, res.message())
                    }
                }

            }

        )

    }

}