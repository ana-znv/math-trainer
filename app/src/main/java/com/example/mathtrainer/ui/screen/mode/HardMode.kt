package com.example.mathtrainer.ui.screen.mode

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HardMode(operator: String) {
    when (operator) {
        "*" -> {
            ModeScreen(start = 100, end = 200, operator = operator)
        }
        "/" -> {
            ModeScreen(start = 100, end = 200, operator = operator)
        }
        else -> {
            ModeScreen(start = 100, end = 1000, operator = operator)
        }
    }
}