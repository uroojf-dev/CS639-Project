//Push 4-- Tahir-Add MoodRepository


package com.example.stepzenapp.r .                                                   epository

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
