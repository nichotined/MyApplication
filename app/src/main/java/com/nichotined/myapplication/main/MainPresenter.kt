package com.nichotined.myapplication.main

import com.nichotined.myapplication.MainActivity

class MainPresenter(private val mainView: MainView) {
    private var textFirst: CharSequence = "0"
    private var textSecond: CharSequence = "0"

    fun onButtonClick() {
        mainView.showResult()
    }

    fun onTextFirstFilled(s: CharSequence?) {
        textFirst = s!!
    }

    fun onTextSecondFilled(s: CharSequence?) {
        textSecond = s!!
    }

    fun initListener() {
        mainView.getTextFirst()
        mainView.getTextSecond()
    }

    fun onCalculation(): Int {
        return textFirst.toString().toInt() + textSecond.toString().toInt()
    }
}