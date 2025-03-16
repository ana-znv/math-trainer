package com.example.mathtrainer.ui.screen.mode

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MediumMode(operator: String) {
    ModeScreen(start = 10, end = 100, operator = operator)
}