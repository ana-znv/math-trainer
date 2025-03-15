package com.example.mathtrainer.ui.screen.mode

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HardMode() {
    ModeScreen(start = 100, end = 1000, operator = "+")
}