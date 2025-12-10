// PUSH 13 — Add WaterViewModel

package com.example.stepzenapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.stepzenapp.repository.WaterRepository

class WaterViewModel : ViewModel() {

    private val repo = WaterRepository()

    fun addCup() {
        repo.add(1) // adding one cup
    }

    fun getWaterData() = repo.getAll()
}
