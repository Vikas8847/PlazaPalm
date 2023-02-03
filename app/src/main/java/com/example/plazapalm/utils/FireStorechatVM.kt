package com.example.plazapalm.utils

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.plazapalm.pref.PreferenceFile
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions

class FireStorechatVM() : ViewModel() {
    val users = HashMap<String, Any>()
    val firestore = FirebaseFirestore.getInstance()

    fun firestoreLogin(pref:PreferenceFile){

        users["fcmToken"] = pref.retrieveFirebaseToken().toString()
        users["osType"] = "1"
//        users["notificationStatus"] = ""

        //SetOptions.merge()

        firestore.collection("Users").document()
            .set(users, SetOptions.merge())
            .addOnSuccessListener {
                Log.e("TAG--US", "sucess")
            }
            .addOnFailureListener {
                Log.e("TAG--US", "faild")
            }
    }

}
