package com.nichotined.myapplication.main


class MainPresenter(private val mainView: MainView) {
    private var textFirst: CharSequence = "0"
    private var textSecond: CharSequence = "0"
    var result: String = ""

    fun initListener() {
        mainView.getTextFirst()
        mainView.getTextSecond()
    }

    fun onTextFirstFilled(s: CharSequence?) {
        textFirst = s!!
    }

    fun onTextSecondFilled(s: CharSequence?) {
        textSecond = s!!
    }

    fun onCalcPlus() {
        result = (textFirst.toString().toInt() + textSecond.toString().toInt()).toString()
        mainView.showResult()
    }

    fun onCalcMinus() {
        result = (textFirst.toString().toInt() - textSecond.toString().toInt()).toString()
        mainView.showResult()
    }
}