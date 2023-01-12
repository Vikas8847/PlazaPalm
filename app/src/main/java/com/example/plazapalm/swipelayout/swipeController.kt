package com.example.plazapalm.swipelayout

import android.graphics.Canvas
import android.icu.lang.UCharacter
import android.util.Log
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import javax.security.auth.callback.Callback

class SwipeController(param: SwipeControllerActions) : Callback {
    fun getMovementFlags(recyclerView: RecyclerView?, viewHolder: RecyclerView.ViewHolder?): Int {
        return ItemTouchHelper.Callback.makeMovementFlags(
            0,
            UCharacter.IndicPositionalCategory.LEFT or UCharacter.IndicPositionalCategory.RIGHT
        )
    }

    fun onMove(
        recyclerView: RecyclerView?,
        viewHolder: RecyclerView.ViewHolder?,
        target: RecyclerView.ViewHolder?
    ): Boolean {
        return false
    }

    fun onSwiped(viewHolder: Canvas, direction: Int) {

        if (direction== UCharacter.IndicPositionalCategory.LEFT){
            Log.e("SDSD","WORKINGGLEFTT=====")
        }else{
            Log.e("SDSD","WORKINGGRIGHTTT++++")
        }
    }
}