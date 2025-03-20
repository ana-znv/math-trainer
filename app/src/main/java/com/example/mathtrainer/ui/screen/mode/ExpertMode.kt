package com.example.mathtrainer.ui.screen.mode

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ExpertMode(operator: String) {
    when (operator) {
        "*" -> {
            ModeScreen(start = 50, end = 150, operator = operator)
        }
        "/" -> {
            ModeScreen(start = 1, end = 1000, operator = operator)
        }
        else -> {
            ModeScreen(start = 1000, end = 10000, operator = operator)
        }
    }
}