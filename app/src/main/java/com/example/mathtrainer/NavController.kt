package com.example.mathtrainer

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mathtrainer.ui.screen.Addition
import com.example.mathtrainer.ui.screen.Division
import com.example.mathtrainer.ui.screen.Multiplication
import com.example.mathtrainer.ui.screen.Subtraction

@Composable
fun NavController() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { HomeScreen(navController) }
        composable("multiplication") { Multiplication() }
        composable("division") { Division() }
        composable("addition") { Addition() }
        composable("subtraction") { Subtraction() }
    }
}