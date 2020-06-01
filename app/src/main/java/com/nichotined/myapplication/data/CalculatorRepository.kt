package com.nichotined.myapplication.data

class CalculatorRepository private constructor(private var calculatorDao: CalculatorDao) {

    fun addCalculator(calculator: Calculator) {
        calculatorDao.addData(calculator)
    }

    fun getCalculator() = calculatorDao.getCalculator()

    companion object {
        @Volatile
        private var instance: CalculatorRepository? = null

        fun getInstance(calculatorDao: CalculatorDao) = instance ?: synchronized(this) {
            instance ?: CalculatorRepository(calculatorDao).also {
                instance = it
            }
        }
    }
}