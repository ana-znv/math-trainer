package com.example.mathtrainer.ui.screen.mode

import androidx.compose.runtime.Composable

@Composable
fun EasyMode(operator: String) {
    ModeScreen(start = 1, end = 10, operator = operator)
}