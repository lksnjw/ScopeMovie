package com.example.scopemovie

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class googlemap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_googlemap)

        val backButton: ImageButton = findViewById(R.id.backButton2)
        val homeButton: ImageButton = findViewById(R.id.imageButton)
        // val mapButton: ImageButton = findViewById(R.id.imageButton2)  // This button is likely already on the map screen, so no need to navigate
        val messagesButton: ImageButton = findViewById(R.id.imageButton3)
        val profileButton: ImageButton = findViewById(R.id.imageButton4)

        backButton.setOnClickListener {
            finish() // Go back to the previous screen
        }

        homeButton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        messagesButton.setOnClickListener {
            val intent = Intent(this, notification::class.java) // Replace 'MessagesActivity' with your actual messages activity class
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
