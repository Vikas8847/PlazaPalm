package com.example.plazapalm.models

import android.graphics.Typeface
import com.example.plazapalm.recycleradapter.AbstractModel

data class FontsListModelResponse(var fontTypeface:Typeface,var name:String) : AbstractModel()