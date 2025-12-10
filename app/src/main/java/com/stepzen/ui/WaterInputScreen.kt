//push-14 -Urooj
//What Push 14 accomplishes
//Creates the Water Input screen
//User can tap “Add 1 Cup”
//Shows total cups from the ViewModel
// Has a Back button
//Fully ready to connect to Navigation late

package com.example.stepzenapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.stepzenapp.viewmodel.WaterViewModel

@Composable
fun WaterInputScreen(
    viewModel: WaterViewModel,
    onBackClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Track Water Intake", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { viewModel.addCup() }) {
            Text("Add 1 Cup")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text("Total Cups Today: ${viewModel.getTotalCups()}", fontSize = 20.sp)

        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = onBackClick) {
            Text("Back")
        }
    }
}
