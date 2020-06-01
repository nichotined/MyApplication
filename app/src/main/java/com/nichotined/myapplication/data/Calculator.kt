package com.nichotined.myapplication.data

data class Calculator(val firstNumber: Double, val secondNumber: Double, val result: Double) {
    override fun toString(): String {
        return result.toString()
    }
}