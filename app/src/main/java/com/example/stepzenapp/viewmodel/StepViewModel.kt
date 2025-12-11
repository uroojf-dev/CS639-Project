// Abubakar Tahir PUSH 20 — StepViewModel

package com.example.stepzenapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.stepzenapp.repository.StepRepository

class StepViewModel : ViewModel() {

    private val repo = StepRepository()

    fun addSteps(steps: Int) {
        repo.addSteps(steps)
    }

    fun getSteps() = repo.getAllSteps()
}
