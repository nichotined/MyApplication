package com.nichotined.myapplication.data

class Database private constructor() {

    var calculatorDao = CalculatorDao()
        private set

    companion object {
        @Volatile
        private var instance: Database? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: Database().also {
                instance = it
            }
        }
    }
}