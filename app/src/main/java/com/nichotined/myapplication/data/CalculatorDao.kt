package com.nichotined.myapplication.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class CalculatorDao {
    private val resultList = mutableListOf<Calculator>()
    private val results = MutableLiveData<List<Calculator>>()

    init {
        results.value = resultList
    }

    fun addData(calculator: Calculator) {
        resultList.add(calculator)
        results.value = resultList
    }

    fun getCalculator() = results as LiveData<List<Calculator>>
}