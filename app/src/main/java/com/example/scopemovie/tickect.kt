package com.example.scopemovie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class tickect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tickect)

        // Handle back button click
        val backButton: ImageButton = findViewById(R.id.backButton3)
        backButton.setOnClickListener {
            finish()
        }

        // Handle Book Ticket button click
        val bookTicketButton: Button = findViewById(R.id.bookTicketButton)
        bookTicketButton.setOnClickListener {
            val intent = Intent(this, confirm::class.java)
            startActivity(intent)
        }

        // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
