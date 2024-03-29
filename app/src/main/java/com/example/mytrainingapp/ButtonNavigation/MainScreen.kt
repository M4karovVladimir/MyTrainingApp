package com.example.mytrainingapp.ButtonNavigation

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            ButtonNavigation(navController = navController)
        }
    ) {
        NavGraph(navHostController =navController )
    }
}