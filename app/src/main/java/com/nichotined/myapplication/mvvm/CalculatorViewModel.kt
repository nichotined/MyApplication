package com.nichotined.myapplication.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {
    val result = MutableLiveData<String>()

    fun onCalculateClicked(operator: String, firstNumber: Int, secondNumber: Int) {
        when (operator) {
            "+" -> {
                result.postValue((firstNumber + secondNumber).toString())
            }
        }
    }
}