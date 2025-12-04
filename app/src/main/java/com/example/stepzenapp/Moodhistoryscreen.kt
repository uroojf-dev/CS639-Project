package com.example.stepzenapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.stepzenapp.viewmodel.MoodViewModel

@Composable
fun MoodHistoryScreen(viewModel: MoodViewModel) {
    val moods = viewModel.getMoods()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text("Mood History", style = MaterialTheme.typography.headlineSmall)

        for (mood in moods) {
            Text("${mood.moodType} - ${mood.timestamp}")
        }
    }
}


// PUSH 10 — Add navigation to Mood History Update HomeScreen Add another button:

Button(
    onClick = onHistoryClick,
    modifier = Modifier.fillMaxWidth()
) {
    Text("View Mood History")
}


Update function signature:
fun HomeScreen(
    onMoodClick: () -> Unit,
    onHistoryClick: () -> Unit
)

Update MainActivity navigation:
In MainActivity NavHost, add:
composable("history") {
    MoodHistoryScreen(viewModel)
}

And update HomeScreen call:
HomeScreen(
    onMoodClick = { navController.navigate("mood") },
    onHistoryClick = { navController.navigate("history") }
)
