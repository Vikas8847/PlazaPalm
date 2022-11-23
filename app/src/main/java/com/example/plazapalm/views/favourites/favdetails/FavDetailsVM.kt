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
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.databinding.ObservableParcelable
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
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
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Response
import javax.inject.Inject


@HiltViewModel
class FavDetailsVM @Inject constructor(
    private var dataStoreUtil: DataStoreUtil,
    private var repository: Repository,
    private var pref: PreferenceFile,
) : ViewModel() {

    var uploadImagesList = ArrayList<ImagesVideosModel>()
    var uploadVideoList = ArrayList<ImagesVideosModel>()
//  val viewProfileAdapter by lazy { RecyclerAdapter<ImagesVideosModel>(R.layout.view_profile_images_list) }

    val videosAdapter by lazy { RecyclerAdapter<ImagesVideosModel>(R.layout.view_profile_videos_list) }
    var isFavourites = ObservableBoolean(false)
    var isViewProfile = ObservableBoolean(false)
    var CommingFrom = ObservableField("")
    var p_id = ObservableField("")
    var firstName = ObservableField("")
    var lastName = ObservableField("")
    var DisLikesCount = ObservableField("")
    var LikesCount = ObservableField("")
    var username = ObservableField("")
    var fav_title = ObservableField("")
    var etVEditProDescription = ObservableField("")
    var tvFavDetailsAddress = ObservableField("")
    var tvFavCityAddress = ObservableField("")
    var isFav = ObservableBoolean(false)
    var isLike = ObservableBoolean(false)
    var isLikeDislike = ObservableBoolean(false)
    var isDisLike = ObservableBoolean(false)
    var selectImage = ObservableBoolean(false)
    var isAddedProfile = ObservableBoolean(false)
    var data_list: ArrayList<AddPhoto>? = null

    //      var userdata : postData? = null
    var userdata = ObservableParcelable<postData?>()

    var dialog: Dialog? = null
    var deldialog: Dialog? = null

    init {

    }

    fun onClicks(view: View) {
        when (view.id) {
            R.id.ivFavDetailsDislike -> {
                val imageLik = view as ImageView

                if (isLike.get().equals(false) || isDisLike.get().equals(false)) {
                    isDisLike.set(true)
                    isLike.set(false)
                } else {

                   var dislikeValue= isDisLike.get()
                   var likeValue= isLike.get()
                    isDisLike.set(likeValue)
                    isLike.set(dislikeValue)

                }
                Log.e("CHECHK", isDisLike.get().toString() + "VV----  " + isLike.get())

                likeApi(isLike.get(), isDisLike.get(), "disLike", imageLik)

            }

            R.id.ivFavDetailsLike -> {

                val imageDis = view as ImageView

                if (isLike.get().equals(false) || isDisLike.get().equals(false)) {
                    isLike.set(true)
                    isDisLike.set(false)

                } else {
                    var dislikeValue= isDisLike.get()
                    var likeValue= isLike.get()
                    isDisLike.set(likeValue)
                    isLike.set(dislikeValue)

                }

                likeApi(isLike.get(), isLikeDislike.get(), "like", imageDis)
            }
            R.id.ivFavDetailsBackBtn -> {
                view.findNavController().navigateUp()
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

//                if (isViewProfile.get()) {
//                    showViewProfileDialog(view)
//                } else {
//                    showFavDetailsDialog(view)
//                }
//
                if (CommingFrom.get().equals("isFavorite")) {
                    showFavDetailsDialog(view, false)
                } else if (CommingFrom.get().equals("isDashBoard")) {
                    showFavDetailsDialog(view, false)

                } else if (CommingFrom.get().equals("isViewProfile")) {
                    showViewProfileDialog(view)
                }

                /*  if (isPremium){
                      dialogPremiumEditDeleteProfile(view)
                  }
                  else{

                  }*/

            }

            R.id.ivFavDetailsChats -> {
                view.navigateWithId(R.id.action_favDetailsFragment_to_chatFragment)
            }

            R.id.btnBookingProfile -> {
                view.navigateWithId(R.id.confirmBookingFragment)
            }
        }
    }

    private fun likeApi(isLiked: Boolean, isDislike: Boolean, from: String, image: ImageView) {

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
                            Log.e("SSSSCXXXXX", res.body()!!.message.toString())

                            if (from.equals("disLike")) {

                                /// test
//                                    isLike.set(true)
//                                    isDisLike.set(false)

/*
                                if (res.body()!!.message.equals("Disliked")) {
                                    Glide.with(CommonMethods.context)
                                        .load(R.drawable.ic_like_icon)
                                        .into(image)

                                } else if (res.body()!!.message.equals("Un-Disliked")) {
                                    Glide.with(CommonMethods.context)
                                        .load(R.drawable.like_unfilled_image)
                                        .into(image)

                                }*/

                            } else if (from.equals("like")) {
                                /// test

//                                isLike.set(false)
//                                isDisLike.set(true)

                                /* if (res.body()!!.message.equals("Liked")) {
                                     Glide.with(CommonMethods.context)
                                         .load(R.drawable.ic_like_icon)
                                         .into(image)
                                 } else if (res.body()!!.message.equals("Unliked")) {
                                     Glide.with(CommonMethods.context)
                                         .load(R.drawable.like_unfilled_image)
                                         .into(image)
                                 }*/

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

            })

    }

    private fun AddtoFavAPI(view: View, isfav: Boolean, from: String) {

        var imageView = view as ImageView

        Log.e("SADF", "Working ")
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
                                Glide.with(CommonMethods.context)
                                    .load(R.drawable.ic_heart_filled_icon)
                                    .into(imageView)
                                isFav.set(false)

                                Log.e("TRUE", res.body().toString())


                            } else {
                                Glide.with(CommonMethods.context)
                                    .load(R.drawable.ic_heart_icon)
                                    .into(imageView)
                                isFav.set(true)
                                Log.e("FALSE", res.body().toString())
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
                    AddtoFavAPI(view, isfav, "removeFav")
                    dialog?.dismiss()
                }
            /** Add to Calendar (Button) **/
            dialog?.findViewById<AppCompatTextView>(R.id.tvChooseOptAddToCalFavDetails)
                ?.setOnClickListener {
                    val ispopUpAddCal = Bundle()
                    ispopUpAddCal.putString("ispopUpAddCal", "addToCalander")
                    ispopUpAddCal.putString("user_name", username.get())
                    ispopUpAddCal.putString("user_location",userdata.get()!!.location_text)
                    ispopUpAddCal.putString("pro_imageg",data_list!!.get(0).Image)
                    ispopUpAddCal.putFloat("miles",0.0f)

                    Log.e("SSSSSSs",userdata.get()!!.location_text.toString())
                    view.navigateWithId(R.id.confirmBookingFragment , ispopUpAddCal)
                    dialog?.dismiss()
                }
            /** Share Click (Button) **/
            dialog?.findViewById<AppCompatTextView>(R.id.tvFavChooseShare)?.setOnClickListener {

                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Insert Subject here")
                val app_url = " https://play.google.com/store/apps/details?id=my.example.javatpoint"
                shareIntent.putExtra(Intent.EXTRA_TEXT, app_url)
                CommonMethods.context.startActivity(Intent.createChooser(shareIntent, "Share via"))

                dialog?.dismiss()

            }

            /**RePort Button Click**/
            dialog?.findViewById<AppCompatTextView>(R.id.tvChooseOptFavDetailsReport)
                ?.setOnClickListener {
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
                dialog?.dismiss()
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
                                Log.e("QWQAAAZZZ", res.body().toString())
                                CommonMethods.showToast(CommonMethods.context, res.body()!!.message)
                                pref.storeBoolKey(Constants.POSTSTATUS, false)
                                view.navigateBack()
                                dialog?.dismiss()
                                deldialog?.dismiss()
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
}