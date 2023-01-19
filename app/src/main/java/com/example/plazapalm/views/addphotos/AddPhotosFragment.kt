package com.example.plazapalm.views.addphotos

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.AsyncTask
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.example.plazapalm.BuildConfig
import com.example.plazapalm.R
import com.example.plazapalm.databinding.AddPhotosFragmentBinding
import com.example.plazapalm.datastore.ADD_PHOTO_URI
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.interfaces.ItemClickListener
import com.example.plazapalm.models.AddPhoto
import com.example.plazapalm.models.UploadMediaResponse
import com.example.plazapalm.networkcalls.ApiEnums
import com.example.plazapalm.networkcalls.ApiProcessor
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.networkcalls.RetrofitApi
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.hideProgress
import com.example.plazapalm.utils.showProgress
import com.example.plazapalm.views.addphotos.adapter.AddPhotosAdapter
import com.google.gson.Gson
import com.google.zxing.integration.android.IntentIntegrator.REQUEST_CODE
import com.iceteck.silicompressorr.SiliCompressor
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import java.io.File
import java.io.IOException
import java.net.URISyntaxException
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
class AddPhotosFragment : Fragment(R.layout.add_photos_fragment), ItemClickListener {
    private var VideoPhotodialog: Dialog?=null
    private var checkForCamera: String?=""

    @Inject
    lateinit var dataStoreUtil: DataStoreUtil

    @Inject
    lateinit var pref: PreferenceFile

    @Inject
    lateinit var repository: Repository

    var binding: AddPhotosFragmentBinding? = null
    val viewModel: AddPhotosVM by viewModels()
    var photoFile: File? = null
    val GALARY_REQUEST_CODE = 201
   private var newPhotoList: ArrayList<AddPhoto> = ArrayList()
    lateinit var addPhotosAdapter: AddPhotosAdapter
    var dialog: Dialog? = null

    //  val addPhotosAdapter by lazy { AddPhotosAdapter(requireActivity(),this) }
    val REQUEST_CODEE = 200
    var pos: Int? = 0
    lateinit var bundle: Bundle
    val MY_CAMERA_PERMISSION_CODE = 100
    val REQUEST_TAKE_GALLERY_VIDEO=567
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = AddPhotosFragmentBinding.inflate(layoutInflater)

        newPhotoList =
            requireArguments().getParcelableArrayList<AddPhoto>("imageList") as ArrayList<AddPhoto>

        newPhotoList= newPhotoList.filter { it.isValid==true } as ArrayList<AddPhoto>

        for(idx in 0 until newPhotoList.size)
        {
            Log.e("New_Imagesss===",newPhotoList[idx].Image.toString())
        }
        return binding?.root
    }

    override fun onStop() {
        super.onStop()
        Log.e("sfaffasddsdsdf",newPhotoList.size.toString())

       // photoList=addPhotosAdapter.photos.filter { it.isValid==true } as ArrayList<AddPhoto>

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel
        //  photoList = ArrayList()
        bundle = Bundle()
        setAdapter()
        click()
    }

    private fun click() {
        binding!!.btnAddPhotos.setOnClickListener {


//            bundle?.putParcelableArrayList("Images",photoList)


//             var dataList=  photoList.filter { it.Image!="" } as ArrayList<AddPhoto>

            UploadMedia(requireView())

            /*  var arraylist=ArrayList<AddPhoto>()

              for(idx in 0 until photoList.size)
              {
                  if(photoList[idx].Image!="")
                  {
                      arraylist.add(photoList[idx])
                  }
              }

              Log.e("ASA",bundle!!.getString("khem").toString() + "VVVV")


              var gsonValue=Gson().toJson(arraylist)

              findNavController().previousBackStackEntry?.savedStateHandle?.set("photos",gsonValue)
              findNavController().popBackStack()

            //  bundle.putParcelableArrayList("photoList",dataList)
            //  requireActivity().supportFragmentManager.popBackStack()
  //            view!!.findNavController().navigate(R.id.action_addPhotosFragment_to_postProfileFragment,bundle)*/
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setAdapter() {

        binding?.rvAddPhotos?.layoutManager =
            GridLayoutManager(requireContext(), 3, GridLayoutManager.VERTICAL, false)


        var numOfPhotos = 6
        var pendingPhoto = 0
        if (newPhotoList.size > 0) {
            pendingPhoto = numOfPhotos - newPhotoList.size
        } else {
            pendingPhoto = 6
        }

        for (idx in 0 until pendingPhoto) {
            newPhotoList.add(AddPhoto("", false))
        }

        addPhotosAdapter = AddPhotosAdapter(requireActivity(), newPhotoList, this)
        binding?.rvAddPhotos?.adapter = addPhotosAdapter
        binding?.rvAddPhotos?.adapter?.notifyDataSetChanged()

    }

    var imagePath: String? = null

    @Throws(IOException::class)

    private fun createImageFile(): File? {
        val timeStamp: String = SimpleDateFormat(
            "yyyyMMdd_HHmmss",
            Locale.getDefault()
        ).format(Date())
        val imageFileName = "IMG_" + timeStamp + "_"
        val storageDir: File? =
            requireActivity().getExternalFilesDir(Environment.DIRECTORY_PICTURES)
        val image: File = File.createTempFile(
            imageFileName,
            ".jpg",
            storageDir
        )
        imagePath = image.getAbsolutePath()
        return image
    }

    // var photoFile: File? = null
    private fun openCameraIntent() {
        val pictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (pictureIntent.resolveActivity(requireActivity().packageManager) != null) {
            //Create a file to store the image

            try {
                photoFile = createImageFile()
            } catch (ex: IOException) {
            }
            if (photoFile != null) {
                /* val photoURI: Uri =
                     FileProvider.getUriForFile(this, "com.inshorts.myapplication.android.provider", photoFile)*/
                val photoURI: Uri = FileProvider.getUriForFile(
                    Objects.requireNonNull(requireActivity()),
                    BuildConfig.APPLICATION_ID + ".fileprovider", photoFile!!
                )
                pictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
                startActivityForResult(pictureIntent, REQUEST_CODEE)
            }
        }
    }

    override fun onClick(view: View, type: String, position: Int) {
        pos = position
        when (type) {
            CommonMethods.context.getString(R.string.add_photo_type) -> {
             // showVideoPhotoDialog()
               showChooseOptionAccountDialog()
            }
        }
    }

    private fun showChooseOptionAccountDialog() {
        if (dialog != null && dialog?.isShowing!!) {
            dialog?.dismiss()
        } else {
            dialog = Dialog(CommonMethods.context, android.R.style.Theme_Dialog)
            dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog?.setContentView(R.layout.open_camera_and_gallery)
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            dialog?.setCancelable(false)
            /** Take Photo Button  **/
           var tvTakePhotoBtn=dialog?.findViewById<AppCompatTextView>(R.id.tvTakePhotoBtn)
            tvTakePhotoBtn!!.setText(requireActivity().getString(R.string.take_photo))

            tvTakePhotoBtn!!.setOnClickListener {
                //open camera
                checkForCamera="1"
                permissionMethod(requireActivity())

                dialog?.dismiss()
            }

            var tvTakePhotoGalleryBtn=dialog?.findViewById<AppCompatTextView>(R.id.tvTakePhotoGalleryBtn)
            tvTakePhotoGalleryBtn!!.setText(requireActivity().getString(R.string.photo_library))

            /**Take Gallery Button **/
            dialog?.findViewById<AppCompatTextView>(R.id.tvTakePhotoGalleryBtn)
                ?.setOnClickListener {
                    checkForCamera="2"
                    permissionMethod(requireActivity())
                    dialog?.dismiss()
                }

            /** Take cancel Button **/
            dialog?.findViewById<AppCompatTextView>(R.id.tvCancelBtn)?.setOnClickListener {
                dialog?.dismiss()
            }
            dialog?.show()
        }
    }

    fun openGalleryMethod()
    {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, GALARY_REQUEST_CODE)

        dialog?.dismiss()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK && requestCode == GALARY_REQUEST_CODE && data != null) {

            val selectedImageURI: Uri = data.data!!
            var file = getPath(selectedImageURI)
            newPhotoList.removeAt(pos!!)
            Log.e("fnknfsnefksef===",file.toString())
            newPhotoList.add(pos!!, AddPhoto(File(file).absolutePath, false,1))
            addPhotosAdapter.updateList(newPhotoList, pos!!)
            //  bundle.putParcelableArrayList("photoList",photoList)
            //bundle.putString("DAMEO","DDDD")
            //   pref.storeImage("ADD_PHOTO_URI",photoList)
          //  addPhotosAdapter.notifyDataSetChanged()
           // showPhotoMethod(File(file))

        } else if (requestCode == REQUEST_CODEE &&
            resultCode == Activity.RESULT_OK
        ) {

            if (photoFile != null) {
                //    Glide.with(this).load(photoFile).into(ivPhoto!!)
//                    var photoFileData=Uri.fromFile(photoFile) as Uri
                var photoFileData = photoFile
                newPhotoList.removeAt(pos!!)
                newPhotoList.add(pos!!, AddPhoto(photoFileData!!.absolutePath, false,1))
                addPhotosAdapter.updateList(newPhotoList, pos!!)
               // addPhotosAdapter.notifyDataSetChanged()
                //  bundle.putParcelableArrayList("photoList",photoList)
                //   bundle.putString("DAMEO","xcxcxc")
                dataStoreUtil.savephoto(ADD_PHOTO_URI, newPhotoList.toString())
            }
        }else
        if (requestCode == REQUEST_TAKE_GALLERY_VIDEO &&
            resultCode == Activity.RESULT_OK
        ) {
            //For Pick Video from Gallery
            val selectedImageUri: Uri? = data!!.getData()
           var filemanagerstring = selectedImageUri!!.path
           var selectedImagePath = getVideoPathFromGallery(selectedImageUri)
            Log.e("fnknfsnefksef11111===",File(selectedImagePath)!!.absolutePath.toString())
         /*   newPhotoList.add(pos!!, AddPhoto(File(selectedImagePath)!!.absolutePath, false,2))
            addPhotosAdapter.updateList(newPhotoList, pos!!)*/


            val file = File(
                Environment.getExternalStorageDirectory()
                    .absolutePath)

            CompressVideo(requireActivity(),newPhotoList,pos!!,addPhotosAdapter).execute(
                "false", selectedImageUri.toString(), file.absolutePath)

          //  getVideoPathFromGallery(selectedImagePath)
        }
    }


    private class CompressVideo(
        var context: Activity, var newPhotoList: ArrayList<AddPhoto>,
        var pos: Int,
        var addPhotosAdapter: AddPhotosAdapter
    ) :
        AsyncTask<String?, String?, String?>() {
        // Initialize dialog
        var dialog: Dialog? = null
        override fun onPreExecute() {
            super.onPreExecute()
            // Display dialog
            context.showProgress()
        }

        protected override fun doInBackground(vararg params: String?): String? {
            // Initialize video path
            var videoPath: String? = null
            try {
                // Initialize uri
                val uri = Uri.parse(params[1])
                // Compress video
                videoPath = SiliCompressor.with(context)
                    .compressVideo(uri, params[2])
            } catch (e: URISyntaxException) {
                e.printStackTrace()
            }
            // Return Video path
            return videoPath
        }

        override fun onPostExecute(path: String?) {
            super.onPostExecute(path)
            // Dismiss dialog
            //dialog!!.dismiss()
            Log.e("sfms,fnmqefqfwfwfwf===",path.toString())
            hideProgress()

            newPhotoList.add(pos!!, AddPhoto(File(path)!!.absolutePath, false,2))
            addPhotosAdapter.updateList(newPhotoList, pos!!)

        }
    }


    /**
     * helper to retrieve the path of an image URI
     */
    fun getPath(uri: Uri?): String? {
        // just some safety built in
        if (uri == null) {
            // TODO perform some logging or show user feedback
            return null
        }
        // try to retrieve the image from the media store first
        // this will only work for images selected from gallery
        val projection = arrayOf(MediaStore.Images.Media.DATA)
      //  val cursor: Cursor = requireActivity().contentResolver.query()(uri, projection, null, null, null)

        val cursor: Cursor? = requireActivity().getContentResolver().query(uri, projection, null, null, null)
        if (cursor != null) {
            val column_index = cursor
                .getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
            cursor.moveToFirst()
            val path = cursor.getString(column_index)
            cursor.close()
            return path
        }
        // this is our fallback here
        return uri.path
    }



    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray,
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        super.onRequestPermissionsResult(requestCode, permissions!!, grantResults)
        if (requestCode == MY_CAMERA_PERMISSION_CODE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(requireActivity(), "camera permission granted", Toast.LENGTH_LONG)
                    .show()
                val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(cameraIntent, REQUEST_CODE)
            } else {
                Toast.makeText(requireActivity(), "camera permission denied", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    fun UploadMedia(view: View) = lifecycleScope.launch {

        var surveyImagesParts: Array<MultipartBody.Part?>? = null

        var tempList =
            newPhotoList!!.filter { it.isValid == false && it.Image != "" } as ArrayList<AddPhoto>


        if (tempList!!.size > 0) {
            Log.e("cXXZZZ", tempList.toString() + "VVVV")

            surveyImagesParts = arrayOfNulls<MultipartBody.Part>(tempList?.size!!)

            for (index in 0 until tempList!!.size) {

                var mediaType=""
                if(tempList[index].mediaType==2)
                {
                    //For Video
                    mediaType="video/*"
                }else
                {
                    //For Photo
                    mediaType="image/*"
                }


                val file = File(
                    tempList!!
                        .get(index)
                        .Image!!

                )
                Log.e("SDDDOOPPPP", file.toString())
                val surveyBody: RequestBody =
                   // RequestBody.create("image/*".toMediaTypeOrNull(), file)
                    RequestBody.create(mediaType.toMediaTypeOrNull(), file)
                surveyImagesParts[index] =
                    MultipartBody.Part.createFormData("profile_picture", file.name, surveyBody)
                Log.e("SDDDSS-----SSSS", surveyBody.toString())

            }

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

                        if ( res.isSuccessful && res.body()!=null ){
                            if (res.body()!!.status==200){

                                var previousSelectedPhotos = newPhotoList!!.filter { it.isValid == true } as ArrayList<AddPhoto>
                                var newList = ArrayList<String>()
                                newList.clear()
                                if (previousSelectedPhotos.size > 0) {
                                    for (idx in 0 until previousSelectedPhotos.size) {
                                        newList.add(previousSelectedPhotos[idx].Image.toString())
                                    }
                                }

                                if (res.body()!!.data.size > 0) {
                                    for (idx in 0 until res.body()!!.data.size) {
                                        newList.add(res.body()!!.data[idx].toString())
                                    }
                                }

                                var arraylist = ArrayList<AddPhoto>()

                                for (idx in 0 until newList.size) {
                                    if (newList[idx].toString() != "") {
                                        arraylist.add(AddPhoto(newList[idx],true))
                                    }
                                }

                                Log.e("AS88888888A", arraylist.toString() + "VVVV")
                                CommonMethods.showToast(requireActivity(), "images uploaded")
                                var gsonValue = Gson().toJson(arraylist)

                                findNavController().previousBackStackEntry?.savedStateHandle?.set("photos", gsonValue)
                                findNavController().popBackStack()

                                //  bundle.putParcelableArrayList("photoList",dataList)
                                //  requireActivity().supportFragmentManager.popBackStack()
//            view!!.findNavController().navigate(R.id.action_addPhotosFragment_to_postProfileFragment,bundle)

                            }else{
                                CommonMethods.showToast(requireActivity(), res!!.body()!!.message)

                            }

                        }else{
                            CommonMethods.showToast(requireActivity(), res.message())

                        }

                    }

                    override fun onError(message: String) {
                        super.onError(message)
                        Log.e("ERROR_Add_Photos" , message)
                        CommonMethods.showToast(requireActivity(), message)

                    }
                })

        } /*else {

            val data_list = ArrayList<String>()
            for (idx in 0 until photoList!!.size){
                data_list.add(photoList!!.get(idx).Image.toString())
            }

            Log.e("DSFSFSFSFSFSF",data_list.toString())

            if (postdata.get().toString().equals("Post")) {
                SavePostProfileAPI(view, data_list)
            } else if (postdata.get().toString().equals("Update")) {
                editProfileAPI(view, data_list)
            }

        }*/
    }

    fun showPhotoMethod( path:File)
    {
        var dialog=Dialog(requireActivity())
        dialog.setContentView(R.layout.demo_dialog)
        dialog.show()
        var ivPhoto=dialog.findViewById<ImageView>(R.id.ivPhoto)
        Glide
            .with(requireActivity())
            .load(path)
            .centerCrop()
            .into(ivPhoto)
    }


    private fun permissionMethod(context: Activity) {
        Dexter.withActivity(context).withPermissions(Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_EXTERNAL_STORAGE)
            .withListener(object : MultiplePermissionsListener {
                override fun onPermissionsChecked(multiplePermissionsReport: MultiplePermissionsReport) {
                    //displaySong()
                  //  if(multiplePermissionsReport.deniedPermissionResponses.size==0) {
                        if (checkForCamera == "1") {
                            openCameraIntent()
                        } else    if (checkForCamera == "2") {
                            openGalleryMethod()
                        }else
                    {
                        selectVideoMethod()
                    }
                    //}
                }

                override fun onPermissionRationaleShouldBeShown(
                    list: List<PermissionRequest?>?,
                    permissionToken: PermissionToken,
                ) {
                    permissionToken.continuePermissionRequest()
                }
            }).check()
    }



    private fun showVideoPhotoDialog() {
        if (VideoPhotodialog != null && VideoPhotodialog?.isShowing!!) {
            VideoPhotodialog?.dismiss()
        } else {
            VideoPhotodialog = Dialog(CommonMethods.context, android.R.style.Theme_Dialog)
            VideoPhotodialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            VideoPhotodialog?.setContentView(R.layout.open_camera_and_gallery)
            VideoPhotodialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            VideoPhotodialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            VideoPhotodialog?.setCancelable(false)
            /** For Photo Button  **/
            var tvTakePhotoBtn=VideoPhotodialog?.findViewById<AppCompatTextView>(R.id.tvTakePhotoBtn)
            tvTakePhotoBtn!!.setText(requireActivity().getString(R.string.upload_image))

            tvTakePhotoBtn!!.setOnClickListener {
                //open camera
                showChooseOptionAccountDialog()
                VideoPhotodialog?.dismiss()
            }

            var tvTakePhotoGalleryBtn=VideoPhotodialog?.findViewById<AppCompatTextView>(R.id.tvTakePhotoGalleryBtn)
            tvTakePhotoGalleryBtn!!.setText(requireActivity().getString(R.string.upload_video))

            /**For Video Button **/
            VideoPhotodialog?.findViewById<AppCompatTextView>(R.id.tvTakePhotoGalleryBtn)
                ?.setOnClickListener {

                    checkForCamera="3"
                    permissionMethod(requireActivity())
                    VideoPhotodialog?.dismiss()
                }

            /** Take cancel Button **/
            VideoPhotodialog?.findViewById<AppCompatTextView>(R.id.tvCancelBtn)?.setOnClickListener {
                VideoPhotodialog?.dismiss()
            }
            VideoPhotodialog?.show()
        }

    }

    //For Open Gallery
    fun selectVideoMethod()
    {
        val intent = Intent()
        intent.type = "video/*"
        intent.action = Intent.ACTION_PICK
        startActivityForResult(Intent.createChooser(intent, "Select Video"),
            REQUEST_TAKE_GALLERY_VIDEO)
    }

    // For get video path from galley
    fun getVideoPathFromGallery(uri: Uri?): String? {
        val projection = arrayOf(MediaStore.Video.Media.DATA)
        val cursor: Cursor? = requireActivity().contentResolver.query(uri!!, projection, null, null, null)
        return if (cursor != null) {
            // HERE YOU WILL GET A NULLPOINTER IF CURSOR IS NULL
            // THIS CAN BE, IF YOU USED OI FILE MANAGER FOR PICKING THE MEDIA
            val column_index = cursor
                .getColumnIndexOrThrow(MediaStore.Video.Media.DATA)
            cursor.moveToFirst()
            cursor.getString(column_index)
        } else null
    }
}