package com.nichotined.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.nichotined.myapplication.main.MainPresenter
import com.nichotined.myapplication.main.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    private val presenter: MainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.initListener()
    }

    override fun setButtonListener() {
        plusButton.setOnClickListener {
            presenter.onCalculation("+")
        }

        minusButton.setOnClickListener {
            presenter.onCalculation("-")
        }

        multiplyButton.setOnClickListener {
            presenter.onCalculation("*")
        }

        divideButton.setOnClickListener {
            presenter.onCalculation("/")
        }
    }

    override fun showResult() {
        textResult.text = presenter.result
    }

    override fun getTextFirst() {
        textFirst.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s?.length != 0) {
                    presenter.onTextFirstFilled(s)
                }
            }
        })
    }

    override fun getTextSecond() {
        textSecond.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s?.length != 0) {
                    presenter.onTextSecondFilled(s)
                }
            }
        })
    }
}
