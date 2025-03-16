package com.example.mathtrainer.ui.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Subtraction(navController: NavController) {
    ChooseDifficulty(navController = navController, operator = "-")
}