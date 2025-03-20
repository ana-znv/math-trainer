package com.example.mathtrainer.ui.screen.mode

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HardMode(operator: String) {
    when (operator) {
        "*" -> {
            ModeScreen(start = 1, end = 100, operator = operator)
        }
        "/" -> {
            ModeScreen(start = 1, end = 500, operator = operator)
        }
        else -> {
            ModeScreen(start = 100, end = 1000, operator = operator)
        }
    }
}