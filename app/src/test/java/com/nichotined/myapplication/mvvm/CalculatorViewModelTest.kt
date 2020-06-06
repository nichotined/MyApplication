package com.nichotined.myapplication.mvvm

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorViewModelTest {
    private lateinit var calculatorViewModel: CalculatorViewModel

    @get:Rule
    val testRule = InstantTaskExecutorRule()

    @Before
    fun setup() {
        calculatorViewModel = CalculatorViewModel()
    }

//    @Test
//    fun `should set button listener on view initialized`() {
////        Given
////        When
////        Then
//    }

//    @Test
//    fun `should show error when number divide by zero`() {
////        Given
//        val firstNumber = 100
//        val secondNumber = 0
//        val operator = "/"
////        When
//        calculatorViewModel.onCalculateClicked()
////        Then
//    }

    @Test
    fun givenNumberWhenPlusThenPrintResult() {
//        Given
        val firstNumber = 100
        val secondNumber = 100
        val operator = "+"
//        When
        calculatorViewModel.onCalculateClicked(
            operator = operator,
            firstNumber = firstNumber,
            secondNumber = secondNumber
        )
//        Then
        Assert.assertEquals("200", calculatorViewModel.result.value)
    }

    @Test
    fun givenNumberWhenMinusThenPrintResult() {
//        Given
        val firstNumber = 100
        val secondNumber = 100
        val operator = "-"
//        When
        calculatorViewModel.onCalculateClicked(
            operator = operator,
            firstNumber = firstNumber,
            secondNumber = secondNumber
        )
//        Then
        Assert.assertEquals("200", calculatorViewModel.result.value)
    }

    @Test
    fun givenNumberWhenMultiplyPrintResult() {
//        Given
        val firstNumber = 100
        val secondNumber = 100
        val operator = "*"
//        When
        calculatorViewModel.onCalculateClicked(
            operator = operator,
            firstNumber = firstNumber,
            secondNumber = secondNumber
        )
//        Then
    }

    @Test
    fun givenNumberWhenDividePrintResult() {
//        Given
        val firstNumber = 100
        val secondNumber = 10
        val operator = "/"
//        When
        calculatorViewModel.onCalculateClicked(
            operator = operator,
            firstNumber = firstNumber,
            secondNumber = secondNumber
        )
//        Then
    }
}
