package com.example.plazapalm.workmanager

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class WorkManager (context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {
    override fun doWork(): Result {
        uploadUserData()
        return Result.success()
    }

    private fun uploadUserData() {
        // do upload work here
    }
}