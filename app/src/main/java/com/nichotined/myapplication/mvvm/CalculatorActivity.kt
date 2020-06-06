package com.nichotined.myapplication.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.nichotined.myapplication.R
import com.nichotined.myapplication.utilities.InjectorUtil
import kotlinx.android.synthetic.main.activity_main.*

class CalculatorActivity : AppCompatActivity() {
    private lateinit var viewModel: CalculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factory = InjectorUtil.provideCalculatorViewModelFactory()
//        initializeUi()
        viewModel = ViewModelProvider(this, factory).get(CalculatorViewModel::class.java)
    }

    private fun setButtonListener() {
        var firstNumber = 0
        var secondNumber = 0

        fun getNumber() {
            firstNumber =
                if (textFirst.text.toString() == "") 0 else textFirst.text.toString().toInt()
            secondNumber =
                if (textSecond.text.toString() == "") 0 else textSecond.text.toString().toInt()
        }

        plusButton.setOnClickListener {
            getNumber()
            viewModel.onCalculateClicked(
                operator = "+",
                firstNumber = firstNumber,
                secondNumber = secondNumber
            )
        }

        minusButton.setOnClickListener {
            getNumber()
            viewModel.onCalculateClicked(
                operator = "-",
                firstNumber = firstNumber,
                secondNumber = secondNumber
            )
        }

        multiplyButton.setOnClickListener {
            getNumber()
            viewModel.onCalculateClicked(
                operator = "*",
                firstNumber = firstNumber,
                secondNumber = secondNumber
            )
        }

        divideButton.setOnClickListener {
            getNumber()
            viewModel.onCalculateClicked(
                operator = "/",
                firstNumber = firstNumber,
                secondNumber = secondNumber
            )
        }
    }

    private fun initializeUi() {
//
//        viewModel.getCalculator().observe(this, Observer { results ->
//            val stringBuilder = StringBuilder()
//            results.forEach { calculator ->
//                stringBuilder.append("${calculator.expression} = ${calculator.result}\n")
//            }
//            textCalculatorResult.text = stringBuilder.toString()
//        })
//
//        btnCalculator.setOnClickListener {
//            val expression = textCalculatorExpression.text.toString()
//            val result = viewModel.getResult(expression)
//            val calculator = Calculator(expression = expression, result = result)
//
//            viewModel.addCalculator(calculator)
//        }
    }
}