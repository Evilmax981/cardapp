package com.example.cardapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Prendo i riferimenti ai due pulsanti nel layout
        val buttonConsulta = findViewById<Button>(R.id.buttonConsulta)
        val buttonModuli = findViewById<Button>(R.id.buttonModuli)

        // Quando clicco su "Consulta tutte le CARD"
        buttonConsulta.setOnClickListener {
            val intent = Intent(this, PresenceActivity::class.java)
            startActivity(intent)
        }

        // Quando clicco su "Elenco moduli Form attivi"
        buttonModuli.setOnClickListener {
            val intent = Intent(this, PresenceActivity::class.java)
            startActivity(intent)
        }
    }
}
