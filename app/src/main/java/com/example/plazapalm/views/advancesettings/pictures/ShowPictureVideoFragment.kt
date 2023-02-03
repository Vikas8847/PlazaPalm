package com.example.plazapalm.views.advancesettings.pictures

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.example.plazapalm.R
import com.example.plazapalm.databinding.ShowPictureVideoFragmentBinding
import com.example.plazapalm.networkcalls.IMAGE_LOAD_URL
import com.example.plazapalm.utils.CommonMethods
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShowPictureVideoFragment : Fragment(R.layout.show_picture_video_fragment) {
    private var media_type: String? = ""
    private var mediaUrl: String? = ""
    lateinit var videoView: VideoView
    lateinit var mediaController: MediaController
    val position: Int? = 0
    var videoUrl =
        "https://media.geeksforgeeks.org/wp-content/uploads/20201217192146/Screenrecorder-2020-12-17-19-17-36-828.mp4?_=1"
    private var binding: ShowPictureVideoFragmentBinding? = null
    private val viewModel: ShowPictureVideoVM by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ShowPictureVideoFragmentBinding.inflate(layoutInflater)
        videoView = VideoView(requireContext())
        mediaController = MediaController(requireContext())

        mediaUrl = requireArguments().getString("media")
        media_type = requireArguments().getString("media_type")

        viewModel.mediaType.set(media_type!!.toInt())
        if (media_type == "2") {
            setUpVideoPlayer(IMAGE_LOAD_URL + mediaUrl)
        } else {
            //   showPhotoMethod(IMAGE_LOAD_URL+mediaUrl)
            viewModel.mediaValue.set(mediaUrl)
        }

        clicks()
        return binding?.root
    }

    fun showPhotoMethod(mediaUrl: String) {
        Glide.with(requireActivity())
            .load(mediaUrl)
            .error(R.drawable.ic_place_holder)
            .into(binding!!.ivPhoto)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.vm = viewModel
    }

    private fun setUpVideoPlayer(videoUrl: String) {
        videoView = binding?.vPlayer!!
        /* val uri: Uri = Uri.parse(videoUrl)
         videoView.setVideoURI(uri)*/
        videoView.setVideoPath(videoUrl)
        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)

        videoView.setOnPreparedListener { mp ->

            videoView.seekTo(position!!)
            mp.setVolume(0f, 0f)
            if (position == 0) {
                videoView.start()
            } else {
                videoView.pause()
            }

            mp.isLooping = true
            // CommonMethods.showToast(requireContext(), "Video is Preparing")
            Log.d("VideoPreparing", "video is preparing " + videoView.duration)
        }
        videoView.setOnErrorListener { mediaPlayer, _, _ ->

            Log.d("VideoError", "$mediaPlayer")
            CommonMethods.showToast(requireContext(), "Error in Video Playing..")
            false
        }

        videoView.setOnCompletionListener { mp ->
            // videoView.start()
            if (mp.duration == videoView.duration) {
                CommonMethods.showToast(requireContext(), "Video is Completed ..")
            }
        }
        videoView.requestFocus()
        videoView.start()
    }

    private fun clicks() {
        binding?.ivPlayBtn?.setOnClickListener {
            // viewModel.isPlayClicked.set(true)
            if (viewModel.isPlayClicked.get()) {
                viewModel.isPlayClicked.set(false)
                videoView.start()
            } else {
                viewModel.isPlayClicked.set(true)
                videoView.pause()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        videoView.seekTo(position!!)
        videoView.resume()
    }

    override fun onPause() {
        super.onPause()
        videoView.pause()
    }


    override fun onStop() {
        super.onStop()
        videoView.stopPlayback()
    }
}