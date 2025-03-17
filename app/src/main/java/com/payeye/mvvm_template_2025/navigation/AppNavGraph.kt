package com.payeye.mvvm_template_2025.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.payeye.mvvm_template_2025.detail.DetailScreen
import com.payeye.mvvm_template_2025.main.MainScreen

@Composable
fun MVVMNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavRoutes.MAIN) {
        composable(NavRoutes.MAIN) {
            MainScreen(navController = navController)
        }
        composable(NavRoutes.DETAIL) {
            DetailScreen()
        }

    }
}