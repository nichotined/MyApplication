package com.nichotined.myapplication.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nichotined.myapplication.data.CalculatorRepository

class CalculatorViewModelFactory(private val calculatorRepository: CalculatorRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CalculatorViewModel(calculatorRepository) as T
    }
}