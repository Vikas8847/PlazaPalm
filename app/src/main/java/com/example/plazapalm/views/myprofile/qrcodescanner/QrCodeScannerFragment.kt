package com.example.plazapalm.views.myprofile.qrcodescanner

import android.Manifest
import android.app.AlertDialog
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.budiyev.android.codescanner.*
import com.example.plazapalm.R
import com.example.plazapalm.databinding.QrCodeScannerFragmentBinding
import com.example.plazapalm.utils.CommonMethods
import com.example.plazapalm.utils.navigateBack
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class QrCodeScannerFragment : Fragment(R.layout.qr_code_scanner_fragment) {
    private lateinit var codeScanner: CodeScanner
    private var binding: QrCodeScannerFragmentBinding? = null
    val viewModel: QrCodeScannerVM by viewModels()
    private val CAMERA_PERMISSION_REQUEST_CODE = 100

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = QrCodeScannerFragmentBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel
        codeScanner = CodeScanner(requireContext(), binding?.scannerView!!)
        codeScanner.camera = CodeScanner.CAMERA_BACK // or CAMERA_FRONT or specific camera id
        codeScanner.formats = CodeScanner.ALL_FORMATS // list of type BarcodeFormat,
        // ex. listOf(BarcodeFormat.QR_CODE)
        codeScanner.autoFocusMode = AutoFocusMode.SAFE // or CONTINUOUS
        codeScanner.scanMode = ScanMode.SINGLE // or CONTINUOUS or PREVIEW
        codeScanner.isAutoFocusEnabled = true // Whether to enable auto focus or not
        codeScanner.isFlashEnabled = false // Whether to enable flash or not
        codeScanner.decodeCallback = DecodeCallback { barCodeResult ->

            activity?.runOnUiThread {
                if (!barCodeResult.equals("")) {
                    // CommonMethods.showToast(requireContext(), "Code Scanned .. ")
                    Log.d("qrCodeResult-->", "barCodeResult==" + barCodeResult.text.toString())
                    val isDashBoard = Bundle()
                    isDashBoard.putString("comingFrom", "isDashBoard")
                    isDashBoard.putString(
                        "DashBoardPostId",
                        barCodeResult.text.toString()
                    )
                    isDashBoard.putDouble(
                        "DashBoardPostLatitude",
                        0.0
                    )
                    isDashBoard.putDouble(
                        "DashBoardPostLongitude",
                        0.0
                    )
                    findNavController().navigate(
                        R.id.action_qrCodeScannerFragment_to_favDetailsFragment,
                        isDashBoard
                    )
                } else {
                    CommonMethods.showToast(requireContext(), "Code not scanned")
                }
            }
        }
        codeScanner.errorCallback = ErrorCallback { barCodeError ->
            // or ErrorCallback.SUPPRESS
            activity?.runOnUiThread {
                Log.d("qrCodeError-->", "Error in Scanned Code.." + barCodeError.message)
                CommonMethods.showToast(requireContext(), "Error in Scanned Code..")
            }
        }

        CameraPermission()

        binding?.scannerView?.setOnClickListener {
            codeScanner.startPreview()
        }

    }

    override fun onResume() {
        super.onResume()
//        requestCameraPermission()
        codeScanner.startPreview()

    }

    override fun onStop() {
        super.onStop()
        codeScanner.stopPreview()
    }

    override fun onPause() {
        codeScanner.releaseResources()
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        codeScanner.stopPreview()
    }

    private fun CameraPermission() {
        if (ContextCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.CAMERA
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            // Permission is already granted, do your camera related stuff here
        } else {
            // Permission is not granted, request the permission
            requestCameraPermission()

        }

//        if (ContextCompat.checkSelfPermission(requireActivity(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED
//        ) {
//            ActivityCompat.requestPermissions(requireActivity(), arrayOf(
//                Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE,
//                Manifest.permission.WRITE_EXTERNAL_STORAGE), CAMERA_PERMISSION_REQUEST_CODE
//            )
//        }else{
//            requestCameraPermission()
//        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == CAMERA_PERMISSION_REQUEST_CODE) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            } else {
//                requestCameraPermission()
//              requireView().navigateBack()

                showPermissionMessage()

            }
        }
    }

    private fun requestCameraPermission() {
        // Request the camera permission
        requestPermissions(arrayOf(Manifest.permission.CAMERA), CAMERA_PERMISSION_REQUEST_CODE)
    }

    private fun showPermissionMessage() {
        AlertDialog.Builder(requireContext())
            .setTitle("Camera Permission Required")
            .setMessage("The camera permission is required to use the camera. Please grant the permission from the app settings.")
            .setPositiveButton("Go to Settings") { _, _ ->
                // Open the app settings to grant the permission manually
                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                val uri = Uri.fromParts("package", requireActivity().packageName, null)
                intent.data = uri
                startActivity(intent)
            }
            .setNegativeButton("Cancel") { _, _ ->
                requireView().navigateBack()
            }
            .create()
            .show()
    }

}

