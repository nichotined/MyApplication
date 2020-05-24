package com.nichotined.myapplication.main

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
    fun givenNumberWhenPlusThenPrintResult() {
//        Given
        mainPresenter.onTextFirstFilled("100")
        mainPresenter.onTextSecondFilled("100")
//        When
        mainPresenter.onCalcPlus()
//        Then
        Mockito.verify(view).showResult()
    }

    @Test
    fun givenNumberWhenMinusThenPrintResult() {
//        Given
        mainPresenter.onTextFirstFilled("100")
        mainPresenter.onTextSecondFilled("100")
//        When
        mainPresenter.onCalcMinus()
//        Then
        Mockito.verify(view).showResult()
    }
}