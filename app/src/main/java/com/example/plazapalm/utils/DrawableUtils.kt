package com.example.plazapalm.utils
import android.R
import android.content.Context
import android.graphics.drawable.Drawable
import android.graphics.drawable.InsetDrawable
import androidx.core.content.ContextCompat


public final class DrawableUtilsA {
    fun getThreeDots(context: Context?): Drawable? {
        val drawable = ContextCompat.getDrawable(context!!,R.drawable.btn_star_big_off)

        //Add padding to too large icon
        return InsetDrawable(drawable, 100, 0, 100, 0)
    }
}