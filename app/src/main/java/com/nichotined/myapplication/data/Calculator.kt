package com.nichotined.myapplication.data

data class Calculator(val expression: String, val result: String) {
    override fun toString(): String {
        return result.toString()
    }
}