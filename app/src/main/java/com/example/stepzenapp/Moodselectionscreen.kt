package com.example.stepzenapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.stepzenapp.viewmodel.MoodViewModel

@Composable
fun MoodSelectionScreen(viewModel: MoodViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Button(onClick = { viewModel.saveMood("Happy") }) {
            Text("Happy")
        }
        Button(onClick = { viewModel.saveMood("Neutral") }) {
            Text("Neutral")
        }
        Button(onClick = { viewModel.saveMood("Sad") }) {
            Text("Sad")
        }
    }
}
