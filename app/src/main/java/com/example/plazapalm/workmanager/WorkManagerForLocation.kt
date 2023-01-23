package com.example.plazapalm.workmanager
import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class WorkManagerForLocation (context: Context, workerParams: WorkerParameters) : CoroutineWorker(context, workerParams) {
    override suspend fun doWork(): Result {
            Log.d("Work for every second", "doWork: Running")
//        uploadUserData()
        return Result.success()
    }

    private fun uploadUserData() {
   Log.e("SAFSDQWQQQ" , "DONE1")
    }

}