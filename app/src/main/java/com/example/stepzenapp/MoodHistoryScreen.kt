package com.example.stepzenapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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

        if (moods.isEmpty()) {
            Text("No moods recorded yet.")
        } else {
            for (mood in moods) {
                Text("${mood.moodType} - ${mood.timestamp}")
            }
        }
    }
}
