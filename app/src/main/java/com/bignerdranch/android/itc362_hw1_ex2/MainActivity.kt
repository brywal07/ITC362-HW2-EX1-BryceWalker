package com.bignerdranch.android.itc362_hw1_ex2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        //changes for ex2 below
        trueButton.setOnClickListener { view: View ->
            Snackbar.make(
                view,
                R.string.correct_snack,
                Toast.LENGTH_SHORT
            ).show()
        }
        falseButton.setOnClickListener { view: View ->
            Snackbar.make(
                view,
                R.string.incorrect_snack,
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}
