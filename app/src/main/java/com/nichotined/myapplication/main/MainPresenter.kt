package com.nichotined.myapplication.main


class MainPresenter(private val mainView: MainView) {
    private var textFirst: CharSequence = "0"
    private var textSecond: CharSequence = "0"
    var result: String = ""

    fun initListener() {
        mainView.setButtonListener()
        mainView.getTextFirst()
        mainView.getTextSecond()
    }

    fun onTextFirstFilled(s: CharSequence?) {
        textFirst = s!!
    }

    fun onTextSecondFilled(s: CharSequence?) {
        textSecond = s!!
    }

    fun onCalculation(operator: String) {
        val firstNumber = textFirst.toString().toInt()
        val secondNumber = textSecond.toString().toInt()

        when (operator) {
            "+" -> {
                result = (firstNumber + secondNumber).toString()
            }
            "-" -> {
                result = (firstNumber - secondNumber).toString()
            }
            "*" -> {
                result = (firstNumber * secondNumber).toString()
            }
            "/" -> {
                if (firstNumber != 0 || secondNumber != 0)
                    result = (firstNumber / secondNumber).toString()
            }
        }
        mainView.showResult()
    }
}