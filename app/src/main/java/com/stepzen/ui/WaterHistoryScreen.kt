//Push-15-Urooj

package com.example.stepzenapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.stepzenapp.viewmodel.WaterViewModel

@Composable
fun WaterHistoryScreen(
    viewModel: WaterViewModel,
    onBackClick: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

        Text(text = "Water Intake History")

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(viewModel.getWaterData()) { entry ->
                Text(text = "${entry.amount} cups at ${entry.timestamp}")
                Spacer(modifier = Modifier.height(10.dp))
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = onBackClick) {
            Text("Back")
        }
    }
}
