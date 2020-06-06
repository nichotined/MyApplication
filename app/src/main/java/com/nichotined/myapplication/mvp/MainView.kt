package com.nichotined.myapplication.mvp

interface MainView {
    fun setButtonListener()
    fun showResult(result: Int)
    fun showError(message: String)
}
