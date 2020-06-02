package com.nichotined.myapplication.ui

import com.nichotined.myapplication.data.Calculator
import com.nichotined.myapplication.data.CalculatorRepository
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorViewModelTest {
    private lateinit var calculatorViewModel: CalculatorViewModel
    val calculatorRepository: CalculatorRepository = Mockito.mock(CalculatorRepository::class.java)

    @Before
    fun setup() {
        calculatorViewModel = CalculatorViewModel(calculatorRepository)
    }

    @Test
    fun addCalculator() {
        // Given
        val expression = "2+2"
        val result = "4"
        // When
        calculatorViewModel.addCalculator(Calculator(expression = expression, result = result))
        // Then
        Mockito.verify(calculatorRepository)
            .addCalculator(Calculator(expression = expression, result = result))
    }

    @Test
    fun getCalculator() {
        // Given
        // When
        calculatorViewModel.getCalculator()
        // Then
        Mockito.verify(calculatorRepository).getCalculator()
    }

    @Test
    fun getResult() {
        // Given
        // When
        // Then
    }
}
