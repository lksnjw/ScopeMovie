package com.example.scopemovie

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class deadpoolmovie : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_deadpoolmovie)

        // Get references to the buttons
        val backButton: ImageButton = findViewById(R.id.backButton3)
        val continueButton: Button = findViewById(R.id.continueButton)

        // Set click listener for the back button
        backButton.setOnClickListener {
            finish() // Finish the current activity to go back
        }

        // Set click listener for the continue button
        continueButton.setOnClickListener {
            // Navigate to the seat selection activity
            val intent = Intent(this, dpdticket::class.java)
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
