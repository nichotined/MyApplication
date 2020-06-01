package com.nichotined.myapplication.ui

import androidx.lifecycle.ViewModel
import com.nichotined.myapplication.data.Calculator
import com.nichotined.myapplication.data.CalculatorRepository

class CalculatorViewModel(private val calculatorRepository: CalculatorRepository) : ViewModel() {
    fun getCalculator() = calculatorRepository.getCalculator()

    fun addCalculator(calculator: Calculator) = calculatorRepository.addCalculator(calculator)
}