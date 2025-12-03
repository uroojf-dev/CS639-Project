package com.example.stepzenapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(onMoodClick: () -> Unit)
 {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Stepzen",
            fontSize = 28.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Track your daily wellness",
            fontSize = 16.sp
        )
    }
}

Spacer(modifier = Modifier.height(24.dp))

Button(
onClick = onMoodClick,
modifier = Modifier.fillMaxWidth()
) {
    Text("Select Mood")
}
