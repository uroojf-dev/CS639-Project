//Push 3 - Add Mood Data Model

package com.example.stepzenapp.model

data class Mood(
    val id: Int = 0,
    val moodType: String = "",
    val timestamp: Long = System.currentTimeMillis()
)


