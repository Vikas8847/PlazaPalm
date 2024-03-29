package com.example.plazapalm.views.advancesettings.pictures

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.ObservableBoolean
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.plazapalm.R
import com.example.plazapalm.models.*
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.recycleradapter.RecyclerAdapter
import com.example.plazapalm.utils.navigateWithId
import dagger.hilt.android.lifecycle.HiltViewModel
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import java.io.File
import javax.inject.Inject

@SuppressLint("NotifyDataSetChanged")
@HiltViewModel
class PicturesVM @Inject constructor() : ViewModel() {
    var picturesDataList = ArrayList<PicturesModel>()

    @Inject
    lateinit var repository: Repository

    @Inject
    lateinit var pref: PreferenceFile

    var photosAvailable = ObservableBoolean(false)

    val picturesAdapter by lazy { RecyclerAdapter<PicturesModel>(R.layout.pictures_item_list) }

    init {
        /*  picturesDataList.add(PicturesModel(R.drawable.dash_items_nurse_image, 0))
          picturesDataList.add(PicturesModel(R.drawable.dash_items_nurse_image, 0))
          picturesDataList.add(PicturesModel(R.drawable.dash_items_nurse_image, 0))
          picturesDataList.add(PicturesModel(R.drawable.dash_items_nurse_image, 0))
          picturesDataList.add(PicturesModel(R.drawable.dash_items_nurse_image, 0))
          picturesDataList.add(PicturesModel(R.drawable.dash_items_nurse_image, 0))
          picturesDataList.add(PicturesModel(R.drawable.dash_items_nurse_image, 0))*/

        picturesAdapter.addItems(picturesDataList)
        picturesAdapter.notifyDataSetChanged()
        picturesAdapter.setOnItemClick { view, position, type ->
            when (type) {
                "deleteImageVideo" -> {
                    //Delete Api Call Here..
                    var list1 = picturesAdapter.getAllItems() as ArrayList<PicturesModel>
                    deleteGalleryPhotoMethod(list1[position].image.toString(), position)
                }
                "picturesItemClick" -> {
                    //Navigate to show image or video on new  screen.
                    var list1 = picturesAdapter.getAllItems() as ArrayList<PicturesModel>
                    var bundle = Bundle()
                    bundle.putString("media", list1[position].image.toString())
                    bundle.putString("media_type", list1[position].type.toString())
                    view.navigateWithId(R.id.action_picturesFragment_to_showPictureVideoFragment, bundle)
                }
            }
        }
    }

    fun onClicks(view: View) {
        when (view.id) {
            R.id.ivPictureAddBackBtn -> {
                view.findNavController().navigateUp()
            }
            R.id.ivPicturesAdd -> {
                //open dialog alert to upload image or videos.
           //     uploadImageVideo()
              //  showVideoPhotoDialog()
            }
        }
    }

  /*  private fun uploadImageVideo() {
        if (CommonMethods.dialog != null && CommonMethods.dialog?.isShowing!!) {
            CommonMethods.dialog?.dismiss()
        } else {
            CommonMethods.dialog = Dialog(CommonMethods.context, android.R.style.Theme_Dialog)
            CommonMethods.dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            CommonMethods.dialog?.setContentView(R.layout.pictures_item_upload_image_videos)
            CommonMethods.dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            CommonMethods.dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            CommonMethods.dialog?.setCancelable(false)
            CommonMethods.dialog?.findViewById<AppCompatTextView>(R.id.tvUploadImage)
                ?.setOnClickListener {
                    CommonMethods.dialog?.dismiss()
                }
            CommonMethods.dialog?.findViewById<AppCompatTextView>(R.id.tvUploadVideo)
                ?.setOnClickListener {
                    CommonMethods.dialog?.dismiss()
                }
            CommonMethods.dialog?.findViewById<AppCompatTextView>(R.id.tvPicturesUploadCancel)
                ?.setOnClickListener {
                    CommonMethods.dialog?.dismiss()
                }
        }
        CommonMethods.dialog?.show()
    }*/

    //For Upload file to the Server
    fun UploadMediaMethod(filePath: String, type: Int) {
        var tempList = ArrayList<String>()
        tempList.add(filePath)
        var surveyImagesParts: Array<MultipartBody.Part?>? = null
        if (tempList!!.size > 0) {
            Log.e("cXXZZZ", tempList.toString() + "VVVV")

            surveyImagesParts = arrayOfNulls<MultipartBody.Part>(tempList?.size!!)

            for (index in 0 until tempList!!.size) {

                var mediaType = ""
                if (type == 2) {
                    //For Video
                    mediaType = "video/*"
                } else {
                    //For Photo
                    mediaType = "image/*"
                }

                val file = File(
                    tempList!!
                        .get(index)
                        .toString()
                )
                Log.e("SDDDOOPPPP", file.toString())
                val surveyBody: RequestBody =
                    RequestBody.create(mediaType.toMediaTypeOrNull(), file)
                surveyImagesParts[index] =
                    MultipartBody.Part.createFormData("profile_picture", file.name, surveyBody)
            }
            Log.e("Picture_Screeennn===","3333")
            repository.makeCall(
                apiKey = ApiEnums.UPLOAD_IMAGES,
                loader = true,
                saveInCache = false,
                getFromCache = false,
                requestProcessor = object : ApiProcessor<Response<UploadMediaResponse>> {
                    override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<UploadMediaResponse> {
                        return retrofitApi.uploadMediaPostProfile(
                            Authorization = pref.retrieveKey("token"), surveyImagesParts!!
                        )
                    }

                    override fun onResponse(res: Response<UploadMediaResponse>) {
                        Log.e("HEADERR", res.body().toString())

                        if (res.isSuccessful && res.body() != null) {
                            var photoUrl = res!!.body()!!.data[0].toString()
                            uploadGalleryUrlMethod(photoUrl)
                        }
                    }

                    override fun onError(message: String) {
                        super.onError(message)
                        Log.e("ERROR_Add_Photos", message)
                        //  CommonMethods.showToast(requireActivity(), message)
                    }
                })
        }
    }

    //For Upload single photo
    fun uploadGalleryUrlMethod(photoPath: String) {
        var photoList = ArrayList<String>()
        photoList.add(photoPath)
        var mediaData = UploadedMedia(photoList)
        repository.makeCall(
            apiKey = ApiEnums.UPLOAD_IMAGES,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<UploadMediaResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<UploadMediaResponse> {
                    return retrofitApi.uploadSinglePhotoUrl(
                        Authorization = pref.retrieveKey("token")!!, "application/json", mediaData,
                    )
                }

                override fun onResponse(res: Response<UploadMediaResponse>) {
                    Log.e("HEADERR", res.body().toString())
                    photosAvailable.set(false)
                    if (res.isSuccessful && res.body() != null) {
                        Log.e("HEADERR", res.body().toString())
                        if (picturesAdapter != null) {
                            picturesDataList.clear()
                            picturesAdapter.getAllItems().clear()

                            for (idx in 0 until res.body()!!.data.size) {
                                var mediaType = 1
                                if (res.body()!!.data[idx].contains(".png") ||
                                    res.body()!!.data[idx].contains(".jpg") ||
                                    res.body()!!.data[idx].contains(".jpeg")
                                ) {
                                    mediaType = 1
                                } else {
                                    mediaType = 2
                                }
                                val dataModel = PicturesModel(res.body()!!.data[idx], mediaType)
                                picturesDataList.add(dataModel)
                            }

                            if (picturesDataList.size > 0) {
                                picturesAdapter.addItems(picturesDataList)
                            }
                        }
                        picturesAdapter.notifyDataSetChanged()
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    Log.e("ERROR_Add_Photos", message)
                    //  CommonMethods.showToast(requireActivity(), message)

                }
            })
    }

    //For Fetch All photo
    fun fetchAllGalleryPhotoMethod() {
        repository.makeCall(
            apiKey = ApiEnums.FETCH_GALLERY_PHOTO,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<UploadMediaResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<UploadMediaResponse> {
                    return retrofitApi.getGalleryList(
                        Authorization = pref.retrieveKey("token")!!
                    )
                }

                override fun onResponse(res: Response<UploadMediaResponse>) {
                    Log.e("HEADERR", res.body().toString())

                    if (res.isSuccessful && res.body() != null) {
                        Log.e("HEADERR", res.body().toString())
                        if (picturesAdapter != null) {
                            picturesDataList.clear()
                            picturesAdapter.getAllItems().clear()

                            for (idx in 0 until res.body()!!.data.size) {
                                var mediaType = 1
                                if (res.body()!!.data[idx].toString().contains(".png") ||
                                    res.body()!!.data[idx].toString().contains(".jpg") ||
                                    res.body()!!.data[idx].toString().contains(".jpeg")
                                ) {
                                    mediaType = 1
                                } else {
                                    mediaType = 2
                                }
                                var dataModel =
                                    PicturesModel(res.body()!!.data[idx].toString(), mediaType)
                                picturesDataList.add(dataModel)
                            }

                            if (picturesDataList.size > 0) {
                                picturesAdapter.addItems(picturesDataList)
                            }
                        }
                        picturesAdapter.notifyDataSetChanged()
                    }

                    if (res.body()!!.data.size == 0) {
                        photosAvailable.set(true)
                    } else {
                        photosAvailable.set(false)
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    Log.e("ERROR_Add_Photos", message)
                    //  CommonMethods.showToast(requireActivity(), message)
                }
            })
    }


    //For Delete single photo
    fun deleteGalleryPhotoMethod(photoName: String, selectedPosition: Int) {
        var photoList1 = ArrayList<String>()
        photoList1.add(photoName)
        var mediaData = DeleteMediaData(photoList1)

        repository.makeCall(
            apiKey = ApiEnums.UPLOAD_IMAGES,
            loader = true,
            saveInCache = false,
            getFromCache = false,
            requestProcessor = object : ApiProcessor<Response<DeleteMediaResponse>> {
                override suspend fun sendRequest(retrofitApi: RetrofitApi): Response<DeleteMediaResponse> {
                    return retrofitApi.deleteGalleryPhotoAPI(
                        Authorization = pref.retrieveKey("token")!!, "application/json", mediaData
                    )
                }

                override fun onResponse(res: Response<DeleteMediaResponse>) {
                    Log.e("HEADERR", res.body().toString())

                    if (res.isSuccessful && res.body() != null) {
                        Log.e("HEADERR", res.body().toString())
                        picturesAdapter.getAllItems().removeAt(selectedPosition)
                        picturesAdapter.notifyDataSetChanged()

                        if(picturesAdapter.getAllItems().size==0)
                        {
                            photosAvailable.set(true)
                            Log.e("Deleted_Status==","Yes")
                        }else
                        {
                            Log.e("Deleted_Status==","NO")
                        }
                    }
                }

                override fun onError(message: String) {
                    super.onError(message)
                    Log.e("ERROR_Add_Photos", message)
                    //  CommonMethods.showToast(requireActivity(), message)
                }
            })
    }
}





