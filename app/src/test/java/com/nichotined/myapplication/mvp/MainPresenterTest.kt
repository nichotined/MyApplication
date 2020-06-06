package com.nichotined.myapplication.mvp

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

class MainPresenterTest {
    private lateinit var mainPresenter: MainPresenter
    var view: MainView = Mockito.mock(MainView::class.java)

    @Before
    fun setUp() {
        mainPresenter = MainPresenter(view)
    }

    @Test
    fun `should set button listener on view initialized`() {
//        Given
//        When
        mainPresenter.onViewInit()
//        Then
        Mockito.verify(view).setButtonListener()
    }

    @Test
    fun `should show error when number divide by zero`() {
//        Given
        val firstNumber = 100
        val secondNumber = 0
        val operator = "/"
//        When
        mainPresenter.onCalculateClicked(
            firstNumber = firstNumber,
            secondNumber = secondNumber,
            operator = operator
        )
//        Then
        Mockito.verify(view).showError("Unable to divide by zero")
    }

    @Test
    fun givenNumberWhenPlusThenPrintResult() {
//        Given
        val firstNumber = 100
        val secondNumber = 100
        val operator = "+"
//        When
        mainPresenter.onCalculateClicked(
            firstNumber = firstNumber,
            secondNumber = secondNumber,
            operator = operator
        )
//        Then
        Mockito.verify(view).showResult(200)
    }

    @Test
    fun givenNumberWhenMinusThenPrintResult() {
//        Given
        val firstNumber = 100
        val secondNumber = 100
        val operator = "-"
//        When
        mainPresenter.onCalculateClicked(
            firstNumber = firstNumber,
            secondNumber = secondNumber,
            operator = operator
        )
//        Then
        Mockito.verify(view).showResult(0)
    }

    @Test
    fun givenNumberWhenMultiplyPrintResult() {
//        Given
        val firstNumber = 100
        val secondNumber = 100
        val operator = "*"
//        When
        mainPresenter.onCalculateClicked(
            firstNumber = firstNumber,
            secondNumber = secondNumber,
            operator = operator
        )
//        Then
        Mockito.verify(view).showResult(10000)
    }

    @Test
    fun givenNumberWhenDividePrintResult() {
//        Given
        val firstNumber = 100
        val secondNumber = 10
        val operator = "/"
//        When
        mainPresenter.onCalculateClicked(
            firstNumber = firstNumber,
            secondNumber = secondNumber,
            operator = operator
        )
//        Then
        Mockito.verify(view).showResult(10)
    }
}