package com.example.plazapalm.pref

import android.content.SharedPreferences
import com.example.plazapalm.datastore.SAVE_FIREBASE_TOKEN
import com.example.plazapalm.models.AddPhoto
import com.google.gson.Gson
import javax.inject.Inject

class PreferenceFile @Inject constructor(
    private val editor: SharedPreferences.Editor,
    private val sharedPreferences: SharedPreferences,

    /** For permanent use */
    private val editorForever: SharedPreferences.Editor,
    private val sharedPreferencesForever: SharedPreferences
) {

    fun saveCategeory(key: String, value: String) {
        editorForever.putString(key, value)
        editorForever.apply()
    }

    fun retrieveCategeory(key: String): String? {
        return sharedPreferencesForever.getString("key", "{}")
    }


    /***vikas added for store checkbox functionality */
/*
    fun saveBoolean(key: String,value: Boolean){
        editor.putBoolean(key,value)
        editor.commit()
    }

    fun getBoolean(key: String):Boolean{
        return sharedPreferences.getBoolean(key,false)
    }*/


    fun storeKey(key: String, value: String) {
        editor.putString(key, value)
        editor.apply()
    }
    fun storeFontName(key: String,value: String){
        editor.putString(key,value)
        editor.apply()
    }
    fun getFontName(key: String): String? {
        return sharedPreferencesForever.getString(key, "{}")
    }

    fun storeBoolKey(key: String, value: Boolean) {
        editor.putBoolean(key, value)
        editor.apply()
    }

    fun retrieveBoolKey(key: String): Boolean? {
        return sharedPreferences.getBoolean(key, false)
    }

    fun saveISblock(key: String, value: Boolean) {
        editor.putBoolean(key, value)
        editor.apply()
    }

    fun retrieISblock(key: String): Boolean? {
        return sharedPreferences.getBoolean(key, false)
    }


    fun storeFilterResponse(body: String) {
        editor.putString("FilterList", body)
        editor.apply()
    }

    fun retrieveFilterResponse(): String? {
        return sharedPreferences.getString("FilterList", "")
    }

    fun saveCateIdList(body: String) {
        editor.putString("catelistId", body)
        editor.apply()
    }


    fun retrvieCateIdList(): String? {
        return sharedPreferences.getString("catelistId", "")
    }

    fun storeLocation(value: String) {
        editor.putString("location", value)
        editor.apply()
    }

    fun storeFilterLocation(value: String) {
        editor.putString("location_filter", value)
        editor.apply()
    }

    fun retrieveFilterLocation(): String? {
        return sharedPreferences.getString("location_filter", null)
    }


    fun storeLatlong(key: String, value: Float) {
        editor.putFloat(key, value)
        editor.apply()
    }

    fun retvieLatlong(key: String): Float {
        return sharedPreferences.getFloat(key, 0.0F)
    }

    fun storeMiles(value: Int) {
        editor.putInt("Milesss", value)
        editor.apply()
    }

    fun retvieMiles(): Int {
        return sharedPreferences.getInt("Milesss", 0)
    }

    fun retrieveLocation(): String? {
        return sharedPreferences.getString("location", null)
    }

    fun retrieveKey(key: String): String? {
        return sharedPreferences.getString(key, null)
    }

    fun storeImage(key: String, value: ArrayList<AddPhoto>) {
        val gson = Gson()
        val listValue = gson.toJson(value)
        editor.putString(key, listValue)
        editor.apply()
    }

    fun retrieveImage(key: String): String? {
        return sharedPreferences.getString(key, null)
    }

    fun <T> storeObject(key: String, data: T) {
        editor.putString(key, Gson().toJson(data))
        editor.apply()
    }

    fun storecolor(key: String, value: Int) {
        editor.putInt(key, value)
        editor.apply()
    }

    fun retviecolor(key: String): Int? {
        return sharedPreferences.getInt(key, 0)
    }

    fun storecolorString(key: String, value: String) {
        editor.putString(key, value)
        editor.apply()
    }

    fun retviecolorString(key: String): String? {
        return sharedPreferences.getString(key, "")
    }


    fun storeopacity(key: String, value: Float) {
        editor.putFloat(key, value)
        editor.apply()
    }

    fun retvieopacity(key: String): Float? {
        return sharedPreferences.getFloat(key, 0f)
    }

    fun storeosize(key: String, value: Float) {
        editor.putFloat(key, value)
        editor.apply()
    }

    fun retviesize(key: String): Float? {
        return sharedPreferences.getFloat(key, 0f)
    }

    fun cleardata(key: String) {

        editor.remove(key)
        editor.apply()

//    openActivity(Intent(this, Login::class.java), true)
    }

    fun clearPreference() {
        editor.clear()
        editor.apply()

//    openActivity(Intent(this, Login::class.java), true)
    }

/*
    fun retrieveLoginData(): LoginResponse {

        return Gson().fromJson(
            sharedPreferences.getString(loginDataKey, "")!!,
            LoginResponse::class.java
        )
    }
*/


    fun storeCategoryLocation(value: String) {
        editor.putString("location_category", value)
        editor.apply()
    }

    fun retrieveCategoryLocation(): String? {
        return sharedPreferences.getString("location_category", null)
    }

    fun saveFirebaseToken(value: String) {
        editor.putString(SAVE_FIREBASE_TOKEN, value)
        editor.apply()
    }

    fun retrieveFirebaseToken(): String? {
        return sharedPreferences.getString(SAVE_FIREBASE_TOKEN, "")
    }
    fun savePurchaseUserId(value: String) {
        editor.putString("PURCHASE_USERID", value)
        editor.apply()
    }

    fun retrviepurchaseUserId(): String? {
        return sharedPreferences.getString("PURCHASE_USERID","")
    }
}