package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUser: EditText = findViewById(R.id.editTextUser)
        val buttonCredit: Button = findViewById(R.id.buttonCredit)

        buttonCredit.setOnClickListener {
            val userName = editTextUser.text.toString()

            if (userName.isNotEmpty()) {
                val intent = Intent(this, CreditActivity::class.java)
                intent.putExtra("userName", userName)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor, introduce un nombre de usuario", Toast.LENGTH_SHORT).show()
            }
        }
    }
}