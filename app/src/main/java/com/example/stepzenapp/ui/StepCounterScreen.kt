// PUSH 21 — StepCounterScreen UI

package com.example.stepzenapp.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.stepzenapp.viewmodel.StepViewModel

@Composable
fun StepCounterScreen(
    viewModel: StepViewModel,
    onBackClick: () -> Unit
) {
    var steps by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

        Text("Step Counter", fontSize = MaterialTheme.typography.headlineMedium.fontSize)

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = steps,
            onValueChange = { steps = it },
            label = { Text("Enter Steps") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            if (steps.isNotEmpty()) {
                viewModel.addSteps(steps.toInt())
                steps = ""
            }
        }) {
            Text("Add Steps")
        }

        Spacer(modifier = Modifier.height(25.dp))

        Button(onClick = onBackClick) {
            Text("Back")
        }
    }
}

