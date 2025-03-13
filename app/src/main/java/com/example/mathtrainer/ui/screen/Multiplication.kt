package com.example.mathtrainer.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import java.util.Locale

@Composable
fun Multiplication(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 30.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Choose a difficult:",
            fontSize = 24.sp,
        )


        LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 200.dp)) {
            items(
                listOf(
                    "Easy" to "easy",
                    "Medium" to "medium",
                    "Hard" to "hard",
                    "Expert" to "expert"
                )
            ) { (difficulty, route) ->
                ButtonsDifficulty(
                    navController = navController,
                    difficulty = difficulty,
                    route = route
                )
            }
        }
    }
}

@Composable
fun ButtonsDifficulty(navController: NavController, difficulty: String, route: String) {
    Button(
        onClick = { navController.navigate(route) },
        modifier = Modifier.padding(top = 10.dp, start = 15.dp, end = 15.dp)
    ) {
        Text(difficulty)
    }
}