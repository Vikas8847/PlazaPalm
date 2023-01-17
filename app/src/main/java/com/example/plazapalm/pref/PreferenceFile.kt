package com.example.plazapalm.pref

import android.content.SharedPreferences
import com.example.plazapalm.models.AddPhoto
import com.example.plazapalm.models.SavePostProfileResponse
import com.example.plazapalm.utils.Constants
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
    fun storeKey(key: String, value: String) {
        editor.putString(key, value)
        editor.apply()
    }
    fun storeBoolKey(key : String, value : Boolean) {
        editor.putBoolean(key, value)
        editor.apply()
    }
    fun retrieveBoolKey(key: String): Boolean? {
        return sharedPreferences.getBoolean(key, false)
    }
    fun storeFilterResponse( body: String) {
        editor.putString("FilterList",body)
        editor.apply()
    }
    fun retrieveFilterResponse(): String? {
        return sharedPreferences.getString("FilterList","")
    }
    fun storeLocation(value: String) {
        editor.putString("location", value)
        editor.apply()
    }
    fun storeLatlong(key: String,value: Float){
        editor.putFloat(key, value)
        editor.apply()
    }
    fun retvieLatlong(key: String,): Float {
        return sharedPreferences.getFloat(key, 0.0F)
    }
    fun storeMiles(value: Int){
        editor.putInt("Milesss", value)
        editor.apply()
    }
    fun retvieMiles(): Int {
        return sharedPreferences.getInt("Milesss",0)
    }
    fun retrieveLocation() : String? {
        return sharedPreferences.getString("location", null)
    }
    fun retrieveKey(key: String): String? {
        return sharedPreferences.getString(key, null)
    }
    fun storeImage(key : String, value : ArrayList<AddPhoto>) {
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
    fun storecolor(key: String,value: Int){
        editor.putInt(key, value)
        editor.apply()
    }
    fun retviecolor(key: String): Int? {
        return sharedPreferences.getInt(key, 0)
    }
    fun storecolorString(key: String,value: String){
        editor.putString(key, value)
        editor.apply()
    }
    fun retviecolorString(key: String): String? {
        return sharedPreferences.getString(key, "")
    }
    fun storeopacity(key: String,value: Float){
        editor.putFloat(key, value)
        editor.apply()
    }
    fun retvieopacity(key: String): Float? {
        return sharedPreferences.getFloat(key, 0f)
    }
    fun storeosize(key: String,value: Float){
        editor.putFloat(key, value)
        editor.apply()
    }
    fun retviesize(key: String): Float? {
        return sharedPreferences.getFloat(key, 0f)
    }
    fun cleardata(key :String) {

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
}