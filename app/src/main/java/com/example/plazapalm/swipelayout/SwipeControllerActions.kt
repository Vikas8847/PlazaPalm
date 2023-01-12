package com.example.plazapalm.swipelayout

abstract class SwipeControllerActions {
    fun onLeftClicked(position: Int) {}
    open fun onRightClicked(position: Int) {}
}