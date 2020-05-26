package com.nichotined.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nichotined.myapplication.main.MainPresenter
import com.nichotined.myapplication.main.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    private val presenter: MainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.onViewInit()
    }

    override fun setButtonListener() {
        val firstNumber = textFirst.text.toString().toInt()
        val secondNumber = textSecond.text.toString().toInt()

        plusButton.setOnClickListener {
            presenter.onCalculateClicked(
                operator = "+",
                firstNumber = firstNumber,
                secondNumber = secondNumber
            )
        }

        minusButton.setOnClickListener {
            presenter.onCalculateClicked(
                operator = "-",
                firstNumber = firstNumber,
                secondNumber = secondNumber
            )
        }

        multiplyButton.setOnClickListener {
            presenter.onCalculateClicked(
                operator = "*",
                firstNumber = firstNumber,
                secondNumber = secondNumber
            )
        }

        divideButton.setOnClickListener {
            presenter.onCalculateClicked(
                operator = "/",
                firstNumber = firstNumber,
                secondNumber = secondNumber
            )
        }
    }

    override fun showResult(result: Int) {
        textResult.setText(result)
    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
