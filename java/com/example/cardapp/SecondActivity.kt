package com.example.cardapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // riferimenti ai due pulsanti
        val buttonConsulta = findViewById<Button>(R.id.buttonConsulta)
        val buttonModuli = findViewById<Button>(R.id.buttonModuli)

        // click su "Consulta tutte le CARD"
        buttonConsulta.setOnClickListener {
            val intent = Intent(this, PresenceActivity::class.java)
            startActivity(intent)
        }

        // click su "Elenco moduli Form attivi"
        buttonModuli.setOnClickListener {
            val intent = Intent(this, PresenceActivity::class.java)
            startActivity(intent)
        }
    }
}
