package com.example.mytrainingapp.ButtonNavigation

import androidx.compose.foundation.background
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState


@Composable
fun ButtonNavigation(
    navController: NavController
) {
    val listItems = listOf(
        ButtonItem.Screen1,
        ButtonItem.Screen2,
        ButtonItem.Screen3,
        ButtonItem.Screen4,
    )
   NavigationBar(
       Modifier.background(Color.White)
   ) {
       val backStackEntry by navController.currentBackStackEntryAsState()
       val currentRout = backStackEntry?.destination?.route
       listItems.forEach{item ->
           NavigationBarItem(
               selected = currentRout == item.route,
               onClick = {
                         navController.navigate(item.route)
               },
               icon = {
                   Icon(
                       painter = painterResource(id = item.iconId),
                       contentDescription = "Icon"
                   )
               },
               label = {
                   Text(
                       text = item.title,
                       fontSize = 9.sp
                   )
               },
               colors = NavigationBarItemDefaults.colors(
                   selectedIconColor = Color.Red,
                   unselectedIconColor = Color.Gray,
                   selectedTextColor = Color.Red,
                   unselectedTextColor = Color.Gray
           )
           )
       }
   }


}