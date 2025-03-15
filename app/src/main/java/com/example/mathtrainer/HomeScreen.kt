package com.example.mathtrainer

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mathtrainer.ui.theme.Grey50

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        HomeItem(
            action = "Multiplication",
            onClick = {
                navController.navigate("multiplication")
            },
            color = Color(0xFFDEA642)
        )
        HomeItem(
            action = "Division", onClick = {
                navController.navigate("division")
            },
            color = Color(0xFF24ACA0)
        )
        HomeItem(
            action = "Addition", onClick = {
                navController.navigate("addition")
            },
            color = Color(0xF3723030)
        )
        HomeItem(
            action = "Subtraction", onClick = {
                navController.navigate("subtraction")
            },
            color = Color(0xFF233894)
        )
    }
}

@Composable
fun HomeItem(action: String, onClick: () -> Unit, color: Color) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(70.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(color)
            .clickable { onClick() },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = action,
            style = TextStyle(
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        )
    }
}