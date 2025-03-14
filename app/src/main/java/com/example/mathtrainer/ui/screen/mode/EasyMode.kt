package com.example.mathtrainer.ui.screen.mode

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@Composable
fun EasyMode() {
    var firstValue by remember {
        mutableIntStateOf(Random.nextInt(1, 10))
    }

    var secondValue by remember {
        mutableIntStateOf(Random.nextInt(1, 10))
    }

    var sum by remember {
        mutableStateOf("")
    }

    var result by remember {
        mutableStateOf("")
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
                text = "$firstValue + $secondValue = ?",
                fontSize = 60.sp,
                color = Color(0xFF2A2A2A),
                fontWeight = FontWeight.W500
            )
        }
        Column {
            OutlinedTextField(
                value = sum,
                onValueChange = { sum = it },
                label = { Text(text = "Result") }
            )
            Button(
                onClick = {
                    if (firstValue + secondValue == sum.toInt()) {
                        result = "Correct!"
                    } else {
                        result = "Incorrect!"
                    }
                    firstValue = Random.nextInt(1, 10)
                    secondValue = Random.nextInt(1, 10)
                },
            ) {
                Text(text = "Submit")
            }
            Text(text = result)
        }
    }
}