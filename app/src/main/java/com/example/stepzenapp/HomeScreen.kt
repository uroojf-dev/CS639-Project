package com.example.stepzenapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//..
import androidx.compose.ui.tooling.preview.Preview
import com.example.stepzenapp.ui.theme.StepzenTheme

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    StepzenTheme {
        HomeScreen()
    }
}


@Composable
fun HomeScreen(
    onMoodClick: () -> Unit = {},
    onHistoryClick: () -> Unit = {}
) {
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

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onMoodClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Select Mood")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onHistoryClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("View Mood History")
        }

        //push 17-urooj-buttons
        Button(onClick = { navController.navigate("waterInput") }) {
            Text("Track Water")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("waterHistory") }) {
            Text("Water History")
        }

    }
}
