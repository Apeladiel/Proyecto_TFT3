package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CreditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)

        val textViewCredit: TextView = findViewById(R.id.textViewCredit)
        val buttonContact: Button = findViewById(R.id.buttonContact)

        val userName = intent.getStringExtra("userName")

        textViewCredit.text = "¡Hola, $userName! Estás usando la versión 1 de la aplicación."

        buttonContact.setOnClickListener {
            val subject = "Consultation jijijaja"
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:ejemplo@gmail.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, subject)
            startActivity(intent)
        }
    }
}