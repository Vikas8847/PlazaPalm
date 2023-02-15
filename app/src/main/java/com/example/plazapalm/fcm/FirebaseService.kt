package com.example.plazapalm.fcm

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.media.RingtoneManager
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import com.example.plazapalm.MainActivity
import com.example.plazapalm.R
import com.example.plazapalm.utils.CommonMethods
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import org.json.JSONObject
import java.util.*
import javax.inject.Inject

class FirebaseService @Inject constructor(
//    val pref: PreferenceFile,
//    val dataStore: DataStoreUtil
 ) : FirebaseMessagingService() {

    private lateinit var mNotificationManager: NotificationManager

    override fun onNewToken(token: String) {
        super.onNewToken(token)
//        pref.saveFirebaseToken(token)
        Log.e("NEW___TOKKEN == ", token.toString())
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        Log.e("NEW___TOKKEN == ", message.toString())
        val dataObject = JSONObject(message.data["data"])
        var otherUserId = dataObject.getString("senderID")
        var loginId = dataObject.getString("receiverID")
        showNotification(dataObject)
    }

    private fun showNotification(data: JSONObject) {
        val random = Random()
        val generatedPassword = String.format("%06d", random.nextInt(10000))

     /*   var checkData = MyUtils.getString(applicationContext, "app_kill")
        var intent: Intent? = null
        Log.e("egmwgawgeagegeg===", checkData.toString())
        if (checkData.equals("start")) {
            intent = Intent(this, ChatActivity::class.java)
        } else {
            intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("chat_open_screen", "Noti")
        }

        intent.putExtra(MyConstants.OTHER_USER_ID, data.getString("senderID"))
        intent.putExtra(MyConstants.CHAT_SCREEN_TYPE, "1")
        intent.putExtra(MyConstants.OTHER_USER_DETAIL, data.getString("userName"))
        intent.putExtra(MyConstants.SNOOZE_STATUS, "0")
        intent.putExtra(MyConstants.SUPERLIKE_STATUS, false)*/


        //  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        var intent: Intent? = null
        intent = Intent(this, MainActivity::class.java)
        var pendingIntent: PendingIntent? = null
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            //  pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_MUTABLE)
            pendingIntent = PendingIntent.getActivity(this,
                Integer.parseInt(generatedPassword),
                intent,
                PendingIntent.FLAG_IMMUTABLE)
        } else {
            //pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_ONE_SHOT)
            pendingIntent = PendingIntent.getActivity(this,
                Integer.parseInt(generatedPassword),
                intent,
                PendingIntent.FLAG_ONE_SHOT)
        }


        var mesageType = ""
        var userName = ""
        var title = ""
        var message = ""


        if (data.has("userName")) {
            userName = data.getString("userName")
        }

        Log.e("fefkewfkewfwefewf====",data.toString())
                if (mesageType.lowercase(Locale.getDefault()).equals("text")) {
                    title = "$userName sent a message to you"
                    message = data.getString("message")
                } else {
                    title = userName
                    message = data.getString("message")
                }

        /*
        Add new parameter in Data object("message_type")
        Value :
        image for Image
        audio for Audio
        text for Simple text message
        Missed Voice Call and Missed Video Call for calling
         */

        // val pendingIntent = PendingIntent.getActivity(this, Integer.parseInt(generatedPassword), intent, PendingIntent.FLAG_IMMUTABLE)
        //     val CHANNEL_ID = getString(R.string.app_name) + "" + System.currentTimeMillis()
        val CHANNEL_ID = getString(R.string.app_name) + "" + data.getString("senderID").toString()
        var mChannel: NotificationChannel? = null
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            mChannel = NotificationChannel(
                CHANNEL_ID,
                getString(R.string.app_name),
                NotificationManager.IMPORTANCE_HIGH
            )
        }
        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val nb = NotificationCompat.Builder(this, getString(R.string.app_name))

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            nb.setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(
                    BitmapFactory.decodeResource(CommonMethods.context.resources,
                        R.mipmap.ic_launcher))
        } else {
            nb.setSmallIcon(R.mipmap.ic_launcher)
        }

        nb.setContentTitle(title)
        nb.setContentText(message)
        nb.setStyle(NotificationCompat.BigTextStyle().bigText(message))
        nb.setAutoCancel(true)
        nb.setSound(defaultSoundUri)
        nb.setVibrate(longArrayOf(1000, 1000, 1000, 1000, 1000, 1000, 1000))
        nb.setLights(Color.GREEN, 3000, 3000)
        nb.setDefaults(Notification.DEFAULT_ALL)
        nb.priority = Notification.PRIORITY_HIGH
        nb.setContentIntent(pendingIntent)
        nb.setChannelId(CHANNEL_ID)
        mNotificationManager = this.getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        assert(mNotificationManager != null)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            mNotificationManager.createNotificationChannel(mChannel!!)
        }
        val random2 = Random()
        val generatedPassword2 = String.format("%06d", random2.nextInt(10000))
        //    Log.d("MyApp", "Generated Password : " + generatedPassword2);

        mNotificationManager.notify(generatedPassword2.toInt(), nb.build())
    }
}