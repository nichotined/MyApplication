package com.nichotined.myapplication.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nichotined.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    private val presenter: MainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.onViewInit()
    }

    override fun setButtonListener() {
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
            presenter.onCalculateClicked(
                operator = "+",
                firstNumber = firstNumber,
                secondNumber = secondNumber
            )
        }

        minusButton.setOnClickListener {
            getNumber()
            presenter.onCalculateClicked(
                operator = "-",
                firstNumber = firstNumber,
                secondNumber = secondNumber
            )
        }

        multiplyButton.setOnClickListener {
            getNumber()
            presenter.onCalculateClicked(
                operator = "*",
                firstNumber = firstNumber,
                secondNumber = secondNumber
            )
        }

        divideButton.setOnClickListener {
            getNumber()
            presenter.onCalculateClicked(
                operator = "/",
                firstNumber = firstNumber,
                secondNumber = secondNumber
            )
        }
    }

    override fun showResult(result: Int) {
        textResult.text = result.toString()
    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
