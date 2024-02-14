package com.example.greetingsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.btn)

        button.setOnClickListener(){
            var input = text.text
            Toast.makeText(this, "Hello "+input, Toast.LENGTH_LONG).show()
        }
    }
}