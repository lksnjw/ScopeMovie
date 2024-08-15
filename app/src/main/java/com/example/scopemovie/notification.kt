package com.example.scopemovie

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_notification)

        // Get references to the buttons
        val backButton: ImageButton = findViewById(R.id.backButton2)
        val mapButton: ImageButton = findViewById(R.id.imageButton2)
        val homeButton: ImageButton = findViewById(R.id.imageButton)
        // val notificationButton: ImageButton = findViewById(R.id.imageButton3)  // This button is likely already on the notifications screen
        val profileButton: ImageButton = findViewById(R.id.imageButton4)

        backButton.setOnClickListener {
            finish() // Go back to the previous screen
        }

        mapButton.setOnClickListener {
            val intent = Intent(this, googlemap::class.java) // Replace 'GoogleMapActivity' with your actual map activity class
            startActivity(intent)
        }

        homeButton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        profileButton.setOnClickListener {
            val intent = Intent(this, profile::class.java) // Replace 'ProfileActivity' with your actual profile activity class
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
