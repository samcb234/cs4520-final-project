package com.example.assetally

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assetally.ui.theme.screens.AssetViewScreen
import com.example.assetally.ui.theme.screens.LoginScreen

sealed class Routes(val route: String) {
    object Login : Routes("Login");

}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "loginScreen") {
                composable("loginScreen") { LoginScreen(navController = navController) }
                composable("assetViewScreen") { AssetViewScreen(navController = navController) }
                //composable("assetView") { ListItemScreen(navController = navController) }
                //composable("assetAddScreen") { AssetAddScreen(navController = navController) }
                //composable("assetAddQtyScreen") { AssetAddQtyScreen(navController = navController) }
            }


            }
        }


    }


