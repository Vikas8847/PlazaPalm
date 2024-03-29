package com.example.plazapalm.datastore

import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey


const val DATA_STORE_NAME = "PalmPlazza"
const val FOREVER_DATA_STORE_NAME = "ForeverBaronCustomer"
val THEME_KEY by lazy { stringPreferencesKey("theme_key") }
val BOOLEAN_DATA by lazy { booleanPreferencesKey("BOOLEAN") }
val LOGIN_DATA by lazy { stringPreferencesKey("LOGIN_DATA") }
val POST_PROFILE_DATA by lazy { stringPreferencesKey("POST_PROFILE_DATA") }
val UPDATE_USER_POST_PROFILE by lazy { stringPreferencesKey("POST_PROFILE_DATA") }
val PROFILE_DATA by lazy { stringPreferencesKey("PROFILE_DATA") }
val PROFILE_IMAGE by lazy { stringPreferencesKey("PROFILE_IMAGE") }
val ADD_PHOTO_URI by lazy { stringPreferencesKey("ADD_PHOTO_URI") }
val CONFIRM_BOOKING_PROFILE by lazy { stringPreferencesKey("CONFIRM_BOOKING_PROFILE") }
val EDIT_COLORS_LOOK by lazy { stringPreferencesKey("EDIT_COLORS_LOOK") }
val GET_COLORS_EDIT_LOOK by lazy { stringPreferencesKey("GET_COLORS_EDIT_LOOK") }
val SAVE_MAP_FEATURE_FROM_FAV_DEATILS by lazy { stringPreferencesKey("SAVE_MAP_FEATURE_FROM_FAV_DEATILS") }
val SAVE_MAP_FEATURE by lazy { stringPreferencesKey("SAVE_MAP_FEATURE") }
val SAVE_EDIT_COVER_PAGE by lazy { stringPreferencesKey("SAVE_EDIT_COVER_PAGE") }
val SAVE_FIREBASE_TOKEN ="SAVE_FIREBASE_TOKEN"
val IS_BLOCK ="IS_BLOCK"




