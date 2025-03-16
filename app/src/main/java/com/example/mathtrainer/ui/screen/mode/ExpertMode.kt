package com.example.mathtrainer.ui.screen.mode

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ExpertMode(operator: String) {
    ModeScreen(start = 1000, end = 10000, operator = operator)
}