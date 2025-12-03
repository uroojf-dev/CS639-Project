//Push 5-- Abubakar Tahir


package com.example.stepzenapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.stepzenapp.model.Mood
import com.example.stepzenapp.repository.MoodRepository

class MoodViewModel : ViewModel() {

    private val repository = MoodRepository()

    fun saveMood(type: String) {
        repository.addMood(Mood(moodType = type))
    }

    fun getMoods(): List<Mood> {
        return repository.getAllMoods()
    }
}
