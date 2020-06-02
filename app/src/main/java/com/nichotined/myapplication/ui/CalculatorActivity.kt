package com.nichotined.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.nichotined.myapplication.R
import com.nichotined.myapplication.data.Calculator
import com.nichotined.myapplication.utilities.InjectorUtil
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        initializeUi()
    }

    private fun initializeUi() {
        val factory = InjectorUtil.provideCalculatorViewModelFactory()
        val viewModel = ViewModelProvider(this, factory)
            .get(CalculatorViewModel::class.java)

        viewModel.getCalculator().observe(this, Observer { results ->
            val stringBuilder = StringBuilder()
            results.forEach { calculator ->
                stringBuilder.append("${calculator.expression} = ${calculator.result}\n")
            }
            textCalculatorResult.text = stringBuilder.toString()
        })

        btnCalculator.setOnClickListener {
            val expression = textCalculatorExpression.text.toString()
            val result = viewModel.getResult(expression)
            val calculator = Calculator(expression = expression, result = result)

            viewModel.addCalculator(calculator)
        }
    }
}