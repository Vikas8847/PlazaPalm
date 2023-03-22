package com.example.plazapalm.views.advancesettings.pictures

import android.Manifest
import android.app.Activity
import android.app.Activity.RESULT_OK
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
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.plazapalm.BuildConfig
import com.example.plazapalm.R
import com.example.plazapalm.databinding.PicturesFragmentBinding
import com.example.plazapalm.networkcalls.Repository
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.hideProgress
import com.example.plazapalm.utils.showProgress
import com.google.zxing.integration.android.IntentIntegrator
import com.iceteck.silicompressorr.SiliCompressor
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import dagger.hilt.android.AndroidEntryPoint
import java.io.File
import java.io.IOException
import java.net.URISyntaxException
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
class PicturesFragment : Fragment(R.layout.pictures_fragment), View.OnClickListener {
    private var VideoPhotodialog: Dialog? = null
    private var photoFile: File? = null
    private var checkForCamera: String? = ""
    private var dialog: Dialog? = null
    private var binding: PicturesFragmentBinding? = null
    private val viewModel: PicturesVM by viewModels()

    val MY_CAMERA_PERMISSION_CODE = 999
    val REQUEST_TAKE_GALLERY_VIDEO = 123
    val GALARY_REQUEST_CODE = 201
    val REQUEST_CODEE = 200
    val REQUEST_VIDEO_CAPTURE = 101

    @Inject
    lateinit var repository: Repository
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = PicturesFragmentBinding.inflate(layoutInflater)
        // CommonMethods.statusBar(true)
        val old = StrictMode.getThreadPolicy()
        StrictMode.setThreadPolicy(
            ThreadPolicy.Builder(old)
                .permitDiskWrites()
                .build()
        )
        //  doCorrectStuffThatWritesToDisk()
        StrictMode.setThreadPolicy(old)
        return binding?.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("Picture_Screeennn===", "1111")
        CommonMethods.statusBar(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel
        viewModel.photosAvailable.set(false)
        setPicturesAdapter()
        initUI()
        viewModel.fetchAllGalleryPhotoMethod()
        Log.e("OnCreate_Gallery===", "onViewCreated")
    }

    private fun initUI() {
        binding!!.ivPicturesAdd.setOnClickListener(this)
    }

    private fun setPicturesAdapter() {
        binding?.rvPictures?.layoutManager = GridLayoutManager(requireContext(), 3)
        binding?.rvPictures?.adapter = viewModel.picturesAdapter
        binding?.rvPictures?.adapter?.notifyDataSetChanged()
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.ivPicturesAdd -> {
                showVideoPhotoDialog()
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
            var tvTakePhotoBtn = dialog?.findViewById<AppCompatTextView>(R.id.tvTakePhotoBtn)
            tvTakePhotoBtn!!.setText(requireActivity().getString(R.string.take_photo))

            tvTakePhotoBtn!!.setOnClickListener {
                //open camera
                checkForCamera = "1"
                permissionMethod(requireActivity())

                dialog?.dismiss()
            }

            var tvTakePhotoGalleryBtn =
                dialog?.findViewById<AppCompatTextView>(R.id.tvTakePhotoGalleryBtn)
            tvTakePhotoGalleryBtn!!.setText(requireActivity().getString(R.string.photo_library))

            /**Take Gallery Button **/
            dialog?.findViewById<AppCompatTextView>(R.id.tvTakePhotoGalleryBtn)
                ?.setOnClickListener {
                    checkForCamera = "2"
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

    fun openGalleryMethod() {
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
            viewModel.UploadMediaMethod(file!!, 1)
            /*  newPhotoList.removeAt(pos!!)
              Log.e("fnknfsnefksef===",file.toString())
              newPhotoList.add(pos!!, AddPhoto(File(file).absolutePath, false,1))
              addPhotosAdapter.updateList(newPhotoList, pos!!)*/
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
                Log.e("Picture_Screeennn===", "2222")
                var photoFileData = photoFile
                viewModel.UploadMediaMethod(photoFile!!.absolutePath, 1)
                /*       newPhotoList.removeAt(pos!!)
                       newPhotoList.add(pos!!, AddPhoto(photoFileData!!.absolutePath, false,1))
                       addPhotosAdapter.updateList(newPhotoList, pos!!)
                       // addPhotosAdapter.notifyDataSetChanged()
                       //  bundle.putParcelableArrayList("photoList",photoList)
                       //   bundle.putString("DAMEO","xcxcxc")
                       dataStoreUtil.savephoto(ADD_PHOTO_URI, newPhotoList.toString())*/
            }
        } else
            if (requestCode == REQUEST_TAKE_GALLERY_VIDEO &&
                resultCode == Activity.RESULT_OK ) {
                //For Pick Video from Gallery
                val selectedImageUri : Uri? = data!!.getData()
                var filemanagerstring = selectedImageUri!!.path
                var selectedImagePath = getVideoPathFromGallery(selectedImageUri)

                val file = File(Environment.getExternalStorageDirectory().absolutePath)
                CompressVideo(viewModel, requireActivity()).execute("false", selectedImageUri.toString(), file.absolutePath)

                //  viewModel.UploadMediaMethod(File(selectedImagePath).absolutePath,2)

            } else  if (requestCode == REQUEST_VIDEO_CAPTURE && resultCode == RESULT_OK) {
                val videoUri = data?.data
                val file = File(Environment.getExternalStorageDirectory().absolutePath)

                CompressVideo(viewModel, requireActivity()).execute("false", videoUri.toString(), file.absolutePath)

//                videoView.setVideoURI(videoUri)
//                videoView.start()
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

        val cursor: Cursor? =
            requireActivity().getContentResolver().query(uri, projection, null, null, null)
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
                startActivityForResult(cameraIntent, IntentIntegrator.REQUEST_CODE)
            } else {
                Toast.makeText(requireActivity(), "camera permission denied", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    private fun permissionMethod(context: Activity) {
        Dexter.withActivity(context).withPermissions(
            Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE
        )
            .withListener(object : MultiplePermissionsListener {
                override fun onPermissionsChecked(multiplePermissionsReport: MultiplePermissionsReport) {
                    if (checkForCamera == "1") {
                        openCameraIntent()
                    } else if (checkForCamera == "2") {
                        openGalleryMethod()
                    } else {
                        selectVideoMethod()
                    }
                }

                override fun onPermissionRationaleShouldBeShown(
                    list: List<PermissionRequest?>?,
                    permissionToken: PermissionToken,
                ) {
                    permissionToken.continuePermissionRequest()
                }
            }).check()
    }


    //For Open Gallery
    fun selectVideoMethod() {
        val intent = Intent()
        intent.type = "video/*"
        intent.action = Intent.ACTION_PICK
        startActivityForResult(
            Intent.createChooser(intent, "Select Video"),
            REQUEST_TAKE_GALLERY_VIDEO
        )
    }

    // For get video path from galley
    fun getVideoPathFromGallery(uri: Uri?): String? {
        val projection = arrayOf(MediaStore.Video.Media.DATA)
        val cursor: Cursor? =
            requireActivity().contentResolver.query(uri!!, projection, null, null, null)
        return if (cursor != null) {
            // HERE YOU WILL GET A NULLPOINTER IF CURSOR IS NULL
            // THIS CAN BE, IF YOU USED OI FILE MANAGER FOR PICKING THE MEDIA
            val column_index = cursor
                .getColumnIndexOrThrow(MediaStore.Video.Media.DATA)
            cursor.moveToFirst()
            cursor.getString(column_index)
        } else null
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
        var imagePath = image.getAbsolutePath()
        return image
    }

    private fun showVideoPhotoDialog() {
        if (VideoPhotodialog != null && VideoPhotodialog?.isShowing!!) {
            VideoPhotodialog?.dismiss()
        } else {
            VideoPhotodialog = Dialog(CommonMethods.context, android.R.style.Theme_Dialog)
            VideoPhotodialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)

            /** khem 21/03/23 */
//            VideoPhotodialog?.setContentView(R.layout.take_video_layout)
            VideoPhotodialog?.setContentView(R.layout.open_camera_and_gallery)
            VideoPhotodialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            VideoPhotodialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            VideoPhotodialog?.setCancelable(false)

            /** For Photo Button  **/
            /** khem 21/03/23 */

            var tvTakePhotoBtn =
                VideoPhotodialog?.findViewById<AppCompatTextView>(R.id.tvTakePhotoBtn)

            tvTakePhotoBtn!!.setText(requireActivity().getString(R.string.take_video))

            tvTakePhotoBtn!!.setOnClickListener {
                //open camera
//                showChooseOptionAccountDialog()

                captureCamera()

                VideoPhotodialog?.dismiss()
            }

            val tvTakePhotoGalleryBtn =
                VideoPhotodialog?.findViewById<AppCompatTextView>(R.id.tvTakePhotoGalleryBtn)
            tvTakePhotoGalleryBtn!!.setText(requireActivity().getString(R.string.upload_video))

            /**For Video Button **/
            VideoPhotodialog?.findViewById<AppCompatTextView>(R.id.tvTakePhotoGalleryBtn)
                ?.setOnClickListener {
                    checkForCamera = "3"
                    permissionMethod(requireActivity())
                    VideoPhotodialog?.dismiss()
                }

            /** Take cancel Button **/
            VideoPhotodialog?.findViewById<AppCompatTextView>(R.id.tvCancelBtn)
                ?.setOnClickListener {
                    VideoPhotodialog?.dismiss()
                }
            VideoPhotodialog?.show()
        }

    }

    private fun captureCamera() {
        val intent = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
        startActivityForResult(intent, REQUEST_VIDEO_CAPTURE)
    }


    private class CompressVideo(var viewModel: PicturesVM, var context: Activity) :
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

        override fun onPostExecute(s: String?) {
            super.onPostExecute(s)
            // Dismiss dialog
            //dialog!!.dismiss()
            Log.e("sfms,fnmqefqfwfwfwf===", s.toString())
            hideProgress()
            viewModel.UploadMediaMethod(File(s).absolutePath, 2)
        }
    }
}