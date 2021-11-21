package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val namaTextView = findViewById<TextView>(R.id.namaeditText)
        val emailTextView = findViewById<TextView>(R.id.emaileditText)

        val nama = intent.getStringExtra("nama")
        val Email = intent.getStringExtra("email")
        val sks = intent.getIntExtra("sks", 0)

        namaTextView.setText(nama)
        emailTextView.setText(Email)
    }
}