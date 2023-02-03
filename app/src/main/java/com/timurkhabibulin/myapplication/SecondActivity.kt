package com.timurkhabibulin.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private val LIFE_CYCLE_TAG = this::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val squareNumberText: TextView = findViewById(R.id.square_number_text)
        val headerText: TextView = findViewById(R.id.activity_2_header)
        val inputData: Bundle? = intent.extras

        headerText.text = this::class.java.simpleName

        if (inputData != null) {
            val number = inputData.getInt("number")
            squareNumberText.text = (number * number).toString()
        }
        Log.i(LIFE_CYCLE_TAG, "onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.i(LIFE_CYCLE_TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(LIFE_CYCLE_TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(LIFE_CYCLE_TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(LIFE_CYCLE_TAG, "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(LIFE_CYCLE_TAG, "onDestroy()")
    }

}