package com.example.scopemovie

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton // Make sure this import is present
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout // Import for type safety
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        // Handle back button click (with nullability check)
        val backButton: ImageButton? = findViewById(R.id.backButton)
        backButton?.setOnClickListener {
            finish()
        }

        // Handle Get Started button click (with nullability check)
        val getStartedButton: Button? = findViewById(R.id.getStartedButton)
        getStartedButton?.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }

        // Handle window insets (with nullability check and explicit type)
        val mainLayout: ConstraintLayout? = findViewById(R.id.main)
        mainLayout?.let {
            ViewCompat.setOnApplyWindowInsetsListener(it) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}
