package com.example.scopemovie

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val profileButton: ImageButton = findViewById(R.id.imageButton5)
        val movieButton: ImageButton = findViewById(R.id.imageButton7)
        val googleMapButton: ImageButton = findViewById(R.id.imageButton2)
        val notificationButton: ImageButton = findViewById(R.id.imageButton3)
        val profileButton2: ImageButton = findViewById(R.id.imageButton4)

        val deadpoolButton: ImageButton = findViewById(R.id.deadpool)

        profileButton.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        movieButton.setOnClickListener {
            val intent = Intent(this, movie::class.java)
            startActivity(intent)
        }

        googleMapButton.setOnClickListener {
            val intent = Intent(this, googlemap::class.java)
            startActivity(intent)
        }

        notificationButton.setOnClickListener {
            val intent = Intent(this, notification::class.java)
            startActivity(intent)
        }

        profileButton2.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        deadpoolButton.setOnClickListener {
            val intent = Intent(this, deadpoolmovie::class.java) // Replace 'DeadpoolMovieDetailsActivity' with your actual activity class
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
