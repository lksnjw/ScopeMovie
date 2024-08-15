package com.example.scopemovie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        // Get references to the buttons
        val backButton: ImageButton = findViewById(R.id.backButton)
        val saveChangesButton: Button = findViewById(R.id.saveChangesButton)
        val homeButton: ImageButton = findViewById(R.id.imageButton)
        val mapButton: ImageButton = findViewById(R.id.imageButton2)
        val messagesButton: ImageButton = findViewById(R.id.imageButton3)
        // val profileButton: ImageButton = findViewById(R.id.imageButton4) // This button is likely already on the profile screen

        backButton.setOnClickListener {
            finish() // Go back to the previous screen
        }

        saveChangesButton.setOnClickListener {

            Toast.makeText(this, "Changes saved successfully!", Toast.LENGTH_SHORT).show()
        }

        homeButton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        mapButton.setOnClickListener {
            val intent = Intent(this, googlemap::class.java)
            startActivity(intent)
        }

        messagesButton.setOnClickListener {
            val intent = Intent(this, notification::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
