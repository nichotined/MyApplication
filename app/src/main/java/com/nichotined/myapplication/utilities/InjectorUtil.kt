package com.nichotined.myapplication.utilities

import com.nichotined.myapplication.mvvm.CalculatorViewModelFactory

object InjectorUtil {
    fun provideCalculatorViewModelFactory(): CalculatorViewModelFactory {

        return CalculatorViewModelFactory()
    }
}