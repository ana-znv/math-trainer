package com.example.mathtrainer.ui.screen.mode

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ExpertMode(operator: String) {
    when (operator) {
        "*" -> {
            ModeScreen(start = 200, end = 200, operator = operator)
        }
        "/" -> {
            ModeScreen(start = 100, end = 500, operator = operator)
        }
        else -> {
            ModeScreen(start = 1000, end = 10000, operator = operator)
        }
    }
}