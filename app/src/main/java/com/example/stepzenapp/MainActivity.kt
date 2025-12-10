package com.example.stepzenapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.stepzenapp.ui.theme.StepzenTheme
import com.example.stepzenapp.viewmodel.MoodViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StepzenTheme {
                val navController = rememberNavController()
                val viewModel = MoodViewModel()

                NavHost(
                    navController = navController,
                    startDestination = "home"
                ) {
                    composable("home") {
                        HomeScreen(
                            onMoodClick = { navController.navigate("mood") },
                            onHistoryClick = { navController.navigate("history") }
                        )
                    }
                    composable("mood") {
                        MoodSelectionScreen(viewModel)
                    }
                    composable("history") {
                        MoodHistoryScreen(viewModel)
                    }
                }
            }
        }
    }
}
