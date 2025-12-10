// PUSH 12 — Create WaterRepository

package com.example.stepzenapp.repository

import com.example.stepzenapp.model.WaterIntake

class WaterRepository {

    private val waterList = mutableListOf<WaterIntake>()

    fun add(amount: Int) {
        waterList.add(WaterIntake(amount))
    }

    fun getAll(): List<WaterIntake> {
        return waterList.toList()
    }
}
