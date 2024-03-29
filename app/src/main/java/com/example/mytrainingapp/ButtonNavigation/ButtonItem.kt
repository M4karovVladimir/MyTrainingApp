package com.example.mytrainingapp.ButtonNavigation

import com.example.mytrainingapp.R

sealed class ButtonItem(val title: String, val iconId: Int, val route: String) {
    object Screen1: ButtonItem("Sreen 1", R.drawable.icon, "screen_1")
    object Screen2: ButtonItem("Sreen 2", R.drawable.airplane, "screen_2")
    object Screen3: ButtonItem("Sreen 3", R.drawable.rofl, "screen_3")
    object Screen4: ButtonItem("Sreen 4", R.drawable.phone, "screen_4")
}
