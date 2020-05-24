package com.nichotined.myapplication.main

import com.nichotined.myapplication.MainActivity
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

class MainPresenterTest {
    private lateinit var mainPresenter: MainPresenter
    var view: MainView = Mockito.mock(MainView::class.java)

    @Before
    fun setUp() {
        mainPresenter = MainPresenter(view)
    }

    @Test
    fun `givenNumberThenPrintResult`() {
//        Given
        mainPresenter.onTextFirstFilled("100")
        mainPresenter.onTextSecondFilled("100")
//        When
        mainPresenter.onButtonClick()
//        Then
        Mockito.verify(view).showResult()
    }
}