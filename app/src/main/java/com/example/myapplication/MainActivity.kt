package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val namaeditText = findViewById<EditText>(R.id.namaeditText)
        val emailditText = findViewById<EditText>(R.id.emaileditText)
        val hpeditText = findViewById<EditText>(R.id.hpeditText)
        val tgleditText = findViewById<EditText>(R.id.tgleditText)
        val skseditText = findViewById<EditText>(R.id.skseditText)

        simpanButton.setOnClickListener{
            val nama = namaeditText.text.toString()
            var sks = skseditText.text.toString().toInt()
            sks = 160 - sks
            Toast.makeText(this,"sks...$sks", Toast.LENGTH_SHORT).show()


            val intent = intent(createPackageContext this,ResultActivity::class.java)
            intent.putExtra(nama:"nama",nama)
            intent.putExtra(nama:"Email",email)
            intent.putExtra(nama:"sks",sks)
            startActivity(intent)
        }
        batalButton.setOnClickListener{
            Toast.makeText(this,"batal", Toast.LENGTH_SHORT).show()

        }
    }

    private fun intent(activity: MainActivity, java: Class<ResultActivity>): Any {

    }


}
