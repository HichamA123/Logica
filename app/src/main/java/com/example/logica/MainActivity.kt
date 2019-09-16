package com.example.logica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        btnSubmit.setOnClickListener {
            if (submit()) onAnswerCorrect()
            else onAnswerIncorrect()
        }

    }

    private fun submit(): Boolean {
        return (etTrueTrue.text.toString() == getString(R.string.answerTrueTrue)
                && etTrueFalse.text.toString() == getString(R.string.answerRest)
                && etFalseTrue.text.toString() == getString(R.string.answerRest)
                && etFalseFalse.text.toString() == getString(R.string.answerRest))
    }

    /**
     * Displays a successful Toast message.
     */
    private fun onAnswerCorrect() {
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show()
    }

    /**
     * Displays an incorrect Toast message.
     */
    private fun onAnswerIncorrect() {
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_SHORT).show()
    }
}
