package com.nichotined.myapplication.main

interface MainView {
    fun setButtonListener()
    fun showResult(result: Int)
    fun showError(message: String)
}
