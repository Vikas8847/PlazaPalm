package com.example.plazapalm.premiumviews.qrcodegenerate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.plazapalm.R
import com.example.plazapalm.databinding.QrCodeGenerateFragmentBinding
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.LOGIN_DATA
import com.example.plazapalm.datastore.PROFILE_DATA
import com.example.plazapalm.models.GetProfileResponseModel
import com.example.plazapalm.models.LoginDataModel
import com.google.zxing.BarcodeFormat
import com.journeyapps.barcodescanner.BarcodeEncoder
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class QRCodeGenerateFragment : Fragment(R.layout.qr_code_generate_fragment) {

    @Inject
    lateinit var dataStoreUtil: DataStoreUtil
    private var binding: QrCodeGenerateFragmentBinding? = null
    private val viewModel: QRCodeGenerateVM by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = QrCodeGenerateFragmentBinding.inflate(layoutInflater)

        dataStoreUtil.readObject(PROFILE_DATA, GetProfileResponseModel::class.java) {
            var user_id = it?.data?.user_id.toString()
            var firstLastName = it?.data?.first_name+" "+it?.data?.last_name
            var userName = it?.data?.user_name
            var imageUrl = it?.data?.profile_picture

            viewModel.storedImageUrl.set(imageUrl)
            viewModel.userName.set(userName)
            viewModel.firstLastName.set(firstLastName)
            generateQRCodeMethod(user_id)
        }
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel
    }


fun generateQRCodeMethod(user_id:String)
{
    try {
        val qrCodeBitmap = BarcodeEncoder().encodeBitmap(user_id, BarcodeFormat.QR_CODE, requireActivity().resources.getDimension(
            com.intuit.sdp.R.dimen._170sdp).toInt(),  requireActivity().resources.getDimension(
            com.intuit.sdp.R.dimen._170sdp).toInt())
        binding!!.ivQrCodeGenerateBarCode.setImageBitmap(qrCodeBitmap)
    } catch (e: Exception) {

    }
 }
}