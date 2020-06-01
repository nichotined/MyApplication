package com.nichotined.myapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
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
        val viewModel = ViewModelProviders.of(this, factory)
            .get(CalculatorViewModel::class.java)

        viewModel.getCalculator().observe(this, Observer { results ->
            val stringBuilder = StringBuilder()
            results.forEach { calculator ->
                stringBuilder.append("${calculator.firstNumber} ${calculator.secondNumber} ${calculator.result}")
            }
            textCalculatorResult.text = stringBuilder.toString()
        })

        btnCalculator.setOnClickListener {
            val calculator = Calculator(5.0, 5.0, 10.0)
            viewModel.addCalculator(calculator)
        }
    }
}