package com.example.plazapalm.fcm

import android.util.Log
import com.example.plazapalm.datastore.DataStoreUtil
import com.example.plazapalm.datastore.SAVE_FIREBASE_TOKEN
import com.example.plazapalm.pref.PreferenceFile
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import javax.inject.Inject


class FirebaseService @Inject constructor(
//    val pref: PreferenceFile,
//    val dataStore: DataStoreUtil
 ) : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        super.onNewToken(token)

//        pref.saveFirebaseToken(token)
        Log.e("NEW___TOKKEN == ", token.toString())

    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        Log.e("NEW___TOKKEN == ", message.toString())

    }

}