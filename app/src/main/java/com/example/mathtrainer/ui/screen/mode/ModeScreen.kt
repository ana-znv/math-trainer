package com.example.mathtrainer.ui.screen.mode

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlin.random.Random

@Composable
fun ModeScreen(start: Int, end: Int, operator: String) {
    var firstValue by remember {
        mutableIntStateOf(Random.nextInt(start, end))
    }

    var secondValue by remember {
        mutableIntStateOf(Random.nextInt(start, end))
    }

    var total by remember {
        mutableStateOf("")
    }

    var result by remember {
        mutableStateOf("")
    }

    var isVisible by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.3f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "$firstValue $operator $secondValue = ?",
                fontSize = 60.sp,
                color = Color(0xFF2A2A2A),
                fontWeight = FontWeight.W500
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = total,
                onValueChange = { total = it },
                label = { Text(text = "Result") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 30.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    isVisible = true

                    val computedResult = when(operator) {
                        "+" -> firstValue + secondValue
                        "-" -> firstValue - secondValue
                        "*" -> firstValue * secondValue
                        "/" -> firstValue / secondValue
                        else -> null
                    }
                    result = if (computedResult == total.toInt()) "✅" else "❌"

                    firstValue = Random.nextInt(start, end)
                    secondValue = Random.nextInt(start, end)
                    total = ""
                },
                modifier = Modifier
                    .fillMaxWidth(0.4f),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF43A047))
            ) {
                Text(text = "Submit")
            }
            AnimatedVisibility(
                visible = isVisible,
                enter = fadeIn(),
                exit = fadeOut()
            ) {
                Text(
                    text = result
                )
            }
            LaunchedEffect(isVisible) {
                if (isVisible) {
                    delay(1000)
                    isVisible = false
                }

            }
        }
    }
}