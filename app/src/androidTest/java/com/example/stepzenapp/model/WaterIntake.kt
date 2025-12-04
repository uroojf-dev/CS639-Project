// PUSH 11 — Create WaterIntake model

package com.example.stepzenapp.model

data class WaterIntake(
    val amount: Int,
    val timestamp: Long = System.currentTimeMillis()
)
