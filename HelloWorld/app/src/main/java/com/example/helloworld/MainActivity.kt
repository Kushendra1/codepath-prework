package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


// This Kotlin file is where we're going to be handling user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show the layout file: activity_main
        setContentView(R.layout.activity_main)

        // Display customized text to show 'Hello from {name}'
        // User can tap a button to change the text color of the label
        //1. Add a button to our layout

        // Get a reference id
        //2. Set up logic to know when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            //Handle button tap
            //3. Change color of text when user taps button
            Log.i("Kush", "Tapped on button")
            //1. Get a reference to the text view
            //2. Set color of text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))
        }
    }
}