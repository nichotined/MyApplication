package com.nichotined.myapplication.mvp


class MainPresenter(private val mainView: MainView) {
    fun onViewInit() {
        mainView.setButtonListener()
    }

    fun onCalculateClicked(firstNumber: Int, secondNumber: Int, operator: String) {
        var result = 0
        when (operator) {
            "+" -> {
                result = firstNumber + secondNumber
            }
            "-" -> {
                result = firstNumber - secondNumber
            }
            "*" -> {
                result = firstNumber * secondNumber
            }
            "/" -> {
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber
                } else {
                    mainView.showError("Unable to divide by zero")
                }
            }
        }
        mainView.showResult(result)
    }
}