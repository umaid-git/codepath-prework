package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// This is where the user interface would be handle
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // show this layout file: activity_main
        setContentView(R.layout.activity_main)

        //Tap a button to change the text color of the label
        // 1. Add a button to the layout

        // Get a reference to button
        // 2. Set up the logic to know when the user have pressed the button
        findViewById<Button>(R.id.button).setOnClickListener {
            // Handle button tap
            // a. Change the color of the text
            Log.i("Umaid", "Tapped on button")

            // 1. Get a reference to the text view
            // 2. Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.purple_200))

        }

        // Get the text from Edit text
        val simpleEditText = findViewById<EditText>(R.id.et_simple) as EditText

        // Get a reference to button
        // 1. Set the logic for the button
        findViewById<Button>(R.id.button2).setOnClickListener {
            // check in the logs if the button is pressed
            Log.i("Umaid","Tapped on Change Text String Button")

            // 1. Get a reference to the text view
            // 2. Change the text view by getting the string from edit text
            findViewById<TextView>(R.id.textView).setText(simpleEditText.text)

        }


    }
}