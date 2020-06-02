package com.nichotined.myapplication.ui

import androidx.lifecycle.ViewModel
import com.nichotined.myapplication.data.Calculator
import com.nichotined.myapplication.data.CalculatorRepository
import com.udojava.evalex.Expression

class CalculatorViewModel(private val calculatorRepository: CalculatorRepository) : ViewModel() {
    fun getCalculator() = calculatorRepository.getCalculator()

    fun addCalculator(calculator: Calculator) = calculatorRepository.addCalculator(calculator)

    fun getResult(expression: String): String {
        return Expression(expression).setPrecision(12).eval().toPlainString()
    }
}