// PUSH 19 — StepRepository

package com.example.stepzenapp.repository

import com.example.stepzenapp.model.StepCount
import java.text.SimpleDateFormat
import java.util.*

class StepRepository {

    private val stepList = mutableListOf<StepCount>()

    fun addSteps(steps: Int) {
        val time = SimpleDateFormat("hh:mm a", Locale.getDefault()).format(Date())
        stepList.add(StepCount(steps, time))
    }

    fun getAllSteps(): List<StepCount> = stepList
}
