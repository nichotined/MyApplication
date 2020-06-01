package com.nichotined.myapplication.utilities

import com.nichotined.myapplication.data.CalculatorRepository
import com.nichotined.myapplication.data.Database
import com.nichotined.myapplication.ui.CalculatorViewModelFactory

object InjectorUtil {
    fun provideCalculatorViewModelFactory(): CalculatorViewModelFactory {
        val database = Database.getInstance()
        val calculatorRepository = CalculatorRepository.getInstance(database.calculatorDao)
        return CalculatorViewModelFactory(calculatorRepository)
    }
}