package com.example.demo1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // register our controls aka views
         var etInput = findViewById<EditText>(R.id.et_input)
         var btnInput = findViewById<Button>(R.id.btn_input)
         var tvResults = findViewById<TextView>(R.id.tv_results)

        btnInput.setOnClickListener{
            var str : String = etInput.text.toString()
            tvResults.textSize= 20f
            tvResults.text = "Hello ${str}"

            Toast.makeText(this, "Hello $str", Toast.LENGTH_LONG).show()
            Snackbar.make(findViewById(R.id.main), "Greetings: ${str}", Snackbar.LENGTH_LONG).show()
        }
    }
}