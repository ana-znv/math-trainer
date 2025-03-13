package com.example.mathtrainer

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mathtrainer.ui.screen.Addition
import com.example.mathtrainer.ui.screen.Division
import com.example.mathtrainer.ui.screen.Multiplication
import com.example.mathtrainer.ui.screen.Subtraction
import com.example.mathtrainer.ui.screen.mode.EasyMode
import com.example.mathtrainer.ui.screen.mode.ExpertMode
import com.example.mathtrainer.ui.screen.mode.HardMode
import com.example.mathtrainer.ui.screen.mode.MediumMode

@Composable
fun NavController() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { HomeScreen(navController) }
        composable("multiplication") { Multiplication(navController) }
        composable("division") { Division(navController) }
        composable("addition") { Addition(navController) }
        composable("subtraction") { Subtraction(navController) }

        composable("easy") { EasyMode() }
        composable("medium") { MediumMode() }
        composable("hard") { HardMode() }
        composable("expert") { ExpertMode() }
    }
}