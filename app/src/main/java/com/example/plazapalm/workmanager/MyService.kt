package com.example.plazapalm.workmanager

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.plazapalm.utils.Constants

class MyService:Service() {
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onCreate() {
        super.onCreate()
        Constants.APP_STATE="Start"
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Constants.APP_STATE="Start"
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Constants.APP_STATE=""
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        super.onTaskRemoved(rootIntent)
        Constants.APP_STATE=""
    }
}