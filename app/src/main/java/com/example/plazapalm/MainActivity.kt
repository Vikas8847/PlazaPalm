package com.example.plazapalm

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.ViewGroup
import android.view.Window
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableBoolean
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.plazapalm.databinding.ActivityMainBinding
import com.example.plazapalm.pref.PreferenceFile
import com.example.plazapalm.utils.CommonMethods.dialog
import com.example.plazapalm.utils.Constants
import com.example.plazapalm.utils.hideKeyboard
import com.example.plazapalm.utils.onNavDestinationSelected
import com.example.plazapalm.views.MainVM
import com.example.plazapalm.views.catergorylist.CategoriesListFragment
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import io.branch.referral.Branch
import java.lang.ref.WeakReference
import javax.inject.Inject

@AndroidEntryPoint
open class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private val mainVM: MainVM? = null
    private lateinit var mFusedLocationClient: FusedLocationProviderClient
    private var isMyProfileClicked = ObservableBoolean(false)
    private var isDashBoardClicked = ObservableBoolean(false)
    private var isCategoryClicked = ObservableBoolean(false)
    private var isMessageClicked = ObservableBoolean(false)

    @Inject
    lateinit var pref: PreferenceFile
    private var navController: NavController? = null

    companion object {
        // var navListener: NavigationListener? = null
        lateinit var context: WeakReference<Context>
        lateinit var activity: Activity
    }

    private var binding: ActivityMainBinding? = null
    /* override fun onStart() {
         super.onStart()
         context = WeakReference(this)
         activity = Activity()
     }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        Constants.APP_STATE="start"
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        binding?.model = mainVM
        activity = MainActivity()

        mainVM?.navController = findNavController(R.id.fragmentMain)

        context = WeakReference(this)
        setUpNav()
        //setTypeHeretoCategoryFragment()
        val currentNightMode = Configuration.UI_MODE_NIGHT_MASK
        when (currentNightMode) {
            Configuration.UI_MODE_NIGHT_NO -> {
                // Night mode is not active, we're using the light theme
            }
            Configuration.UI_MODE_NIGHT_YES -> {
                // Night mode is active, we're using dark theme
            }
        }
    }

    private fun setUpNav() {
        navController = findNavController(R.id.fragmentMain)
        // navController!!.setGraph(navController!!.graph,Bundle())
        binding?.bottNavMain?.setOnNavigationItemSelectedListener(this)
        //   navController?.navigate(R.id.dashBoardFragment)
        navController?.addOnDestinationChangedListener { _, destination, _ ->
            navController?.addOnDestinationChangedListener { _, destination, _ ->

                if (destination.id == R.id.dashBoardFragment || destination.id == R.id.myProfileFragment ||
                    destination.id == R.id.messagesFragment || destination.id == R.id.openCategeroyFragment ||
                    destination.id == R.id.advanceMapFragment || destination.id == R.id.picturesFragment ||
                    destination.id == R.id.bookingDetailsFragment
                ) {

                    binding?.bottNavMain?.selectedItemId = destination.id
                    binding?.bottNavMain?.isVisible = true
                    Log.e("gmslgsgsgs11====", "wgwgqwgewg")
                } else {
                    binding?.bottNavMain?.isVisible = false
                    Log.e("gmslgsgsgs22====", "wgwgqwgewg")
                }
            }
        }
        var dialog: Dialog? = null
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if (item.itemId != navController?.currentDestination!!.id) {
            when (item.itemId) {
                R.id.dashBoard -> {
                    if (binding!!.bottNavMain.menu.getItem(0).isChecked){
                        binding!!.bottNavMain.isEnabled = false
                        binding!!.bottNavMain.isClickable = false
                    } else {
                        binding!!.bottNavMain.isEnabled = true
                        binding!!.bottNavMain.isClickable = true
                        hideKeyboard()
                        Log.e("gmslgsgsgs====", "wgwgqwgewg")
                        binding?.bottNavMain?.onNavDestinationSelected(
                            item.itemId,
                            navController!!
                        )
                        navController?.navigate(R.id.dashBoardFragment)
                    }
                }
                R.id.categories -> {
                    if (binding!!.bottNavMain.menu.getItem(1).isChecked) {
                        binding!!.bottNavMain.isEnabled = false
                        binding!!.bottNavMain.isClickable = false
                    } else {
                        binding!!.bottNavMain.isEnabled = true
                        binding!!.bottNavMain.isClickable = true
                        hideKeyboard()
                        binding?.bottNavMain?.onNavDestinationSelected(
                            item.itemId,
                            navController!!
                        )
                        val bundle = Bundle()
                        bundle.putString("comingFrom", "main")
                        navController?.navigate(R.id.openCategeroyFragment, bundle)
                    }
                }
                R.id.messages -> {
                    if (binding!!.bottNavMain.menu.getItem(2).isChecked) {

                        binding!!.bottNavMain.isClickable = false
                        binding!!.bottNavMain.isEnabled = false
                    } else {
                        binding!!.bottNavMain.isClickable = true
                        binding!!.bottNavMain.isEnabled = true
                        hideKeyboard()
                        binding?.bottNavMain?.onNavDestinationSelected(
                            item.itemId,
                            navController!!
                        )
                        navController?.navigate(R.id.messagesFragment)
                    }
                }
                R.id.myProfile -> {
                    if (binding!!.bottNavMain.menu.getItem(3).isChecked) {
                        binding!!.bottNavMain.isClickable = false
                        binding!!.bottNavMain.isEnabled = false
                    } else {
                        binding!!.bottNavMain.isClickable = true
                        binding!!.bottNavMain.isEnabled = true
                        hideKeyboard()
                        binding?.bottNavMain?.onNavDestinationSelected(
                            item.itemId,
                            navController!!
                        )
                        navController?.navigate(R.id.myProfileFragment)
                    }
                }
                else -> {
                }
            }
        }

        /*  if (item.itemId != navController!!.currentDestination!!.id) {
      }
      return true*/
        return true
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Branch.sessionBuilder(this).withCallback { referringParams, error ->
            if (error != null) {
                Log.e("BranchSDK_Tester", error.message)
            } else if (referringParams != null) {
                Log.e("BranchSDK_Tester", referringParams.toString())
            } else {

            }
        }.reInit()
    }


    override fun onStart() {
        super.onStart()
        context = WeakReference(this)
        activity = Activity()
        Branch.sessionBuilder(this)
            .withCallback { branchUniversalObject, linkProperties, error ->
                if (error != null) {
                    Log.e("BranchSDK_Tester", "branch init failed. Caused by -" + error.message)
                } else {
                    Log.e("BranchSDK_Tester", "branch init complete!")
                    if (branchUniversalObject != null) {
                        Log.e("BranchSDK_Tester", "title " + branchUniversalObject.title)
                        Log.e("BranchSDK_Tester", "CanonicalIdentifier " + branchUniversalObject.canonicalIdentifier)
                        Log.e("BranchSDK_Tester", "metadata " + branchUniversalObject.contentMetadata.convertToJson())

                        var dataObject=branchUniversalObject.contentMetadata.convertToJson()
                        var deeplink_path= dataObject.getString("deeplink_path")
                        //Toast.makeText(this,deeplink_path,Toast.LENGTH_LONG).show()

                        pref.storeKey("link_share_pid",deeplink_path)
                        // setUpNav()
                    }
                    if (linkProperties != null) {
                        Log.e("BranchSDK_Tester", "Channel " + linkProperties.channel)
                        Log.e(
                            "BranchSDK_Tester",
                            "control params " + linkProperties.controlParams
                        )
                    } else {

                    }
                }
            }.withData(this.intent.data).init()
    }

    private fun setTypeHeretoCategoryFragment() {
        val intent = Intent(this, CategoriesListFragment::class.java)
        val bundle = Bundle()
        bundle.putString("comingFrom", "mainActivity")
        activity.startActivity(intent, bundle)
    }

    private fun showExitDialog() {
        if (dialog != null && dialog?.isShowing!!) {
            dialog?.dismiss()
        } else {
            dialog = Dialog(context.get()!!, android.R.style.Theme_Dialog)
            dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog?.setContentView(R.layout.alert_exit)
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.attributes?.width = ViewGroup.LayoutParams.MATCH_PARENT
            dialog?.setCancelable(true)

            dialog?.findViewById<TextView>(R.id.tvCancel)?.setOnClickListener {
                dialog?.dismiss()
            }

            dialog?.findViewById<TextView>(R.id.tvYes)?.setOnClickListener {
                finishAffinity()
                dialog?.dismiss()
            }
        }
        dialog?.show()
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount == 1) {
            finishAffinity()
            // showExitDialog()
        } else {
            super.onBackPressed()
        }
    }

    fun setTabMethod(tabValue: Int) {
        if (tabValue == 1) {
            binding?.bottNavMain?.selectedItemId = R.id.dashBoard
        } else
            if (tabValue == 2) {
                binding?.bottNavMain?.selectedItemId = R.id.categories
            } else
                if (tabValue == 3) {
                    binding?.bottNavMain?.selectedItemId = R.id.messages
                } else
                    if (tabValue == 4) {
                        binding?.bottNavMain?.selectedItemId = R.id.myProfile
                        binding?.bottNavMain?.isVisible = true
                    }
    }
}