package com.example.cardapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PresenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presence)

        // Collegamento per ogni pulsante
        findViewById<View>(R.id.buttonLavoratori).setOnClickListener {
            openLink("https://forms.office.com/e/Mdzvf9cC3m?origin=lprLink")
        }

        findViewById<View>(R.id.buttonStudenti).setOnClickListener {
            openLink("https://forms.office.com/e/CA0AgWcWjD?origin=lprLink")
        }

        findViewById<View>(R.id.buttonPazienti).setOnClickListener {
            openLink("https://forms.office.com/e/s2sRDTEPqE?origin=lprLink")
        }

        findViewById<View>(R.id.buttonVisitatori).setOnClickListener {
            openLink("https://forms.office.com/e/s2sRDTEPqE?origin=lprLink")
        }

        findViewById<View>(R.id.buttonClienti).setOnClickListener {
            openLink("https://forms.office.com/e/HHyb6LGd5Z?origin=lprLink")
        }
    }

    private fun openLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
