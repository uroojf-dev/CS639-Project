//Push 4-- Abubakar-Add MoodRepository


package com.example.stepzenapp.repository

import com.example.stepzenapp.model.Mood

class MoodRepository {

    private val moodList = mutableListOf<Mood>()

    fun addMood(mood: Mood) {
        moodList.add(mood)
    }

    fun getAllMoods(): List<Mood> {
        return moodList.toList()
    }
}
