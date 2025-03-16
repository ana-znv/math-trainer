package com.example.mathtrainer.ui.screen

import android.net.Uri
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Division(navController: NavController) {
    val divisionOperator = Uri.encode("/")
    ChooseDifficulty(navController = navController, operator = divisionOperator)
}