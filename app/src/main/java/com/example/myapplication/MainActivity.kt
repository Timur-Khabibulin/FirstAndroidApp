package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

private var number: Int = 0

class MainActivity : AppCompatActivity() {
    private val LIFE_CYCLE_TAG = this::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val headerText: TextView = findViewById(R.id.activity_1_header)
        val numberText: TextView = findViewById(R.id.text_for_number)
        val button: Button = findViewById(R.id.button)

        headerText.text = this::class.java.simpleName

        button.setOnClickListener {
            val sendIntent = Intent(this, SecondActivity::class.java).apply {
                val bundle = Bundle().apply { putInt("number", number) }
                putExtras(bundle)
            }
            startActivity(sendIntent)
        }

        numberText.text = number.toString()
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
        number++
        super.onDestroy()
        Log.i(LIFE_CYCLE_TAG, "onDestroy()")
    }
}
