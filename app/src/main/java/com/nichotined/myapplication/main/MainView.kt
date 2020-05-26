package com.nichotined.myapplication.main

interface MainView {
    fun setButtonListener()
    fun showResult(result: Int)
    fun showError(message: String)
}

abstract class Something {
    abstract fun calculate()

    fun addNumber(x: Int, y: Int): Int {
        return x + y
    }
}