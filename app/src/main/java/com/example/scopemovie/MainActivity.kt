package com.example.scopemovie

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout // Assuming you're using ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.logging.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Make sure you've defined this function
        setContentView(R.layout.activity_main)

        android.os.Handler().postDelayed({
            val intent = Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(intent)
            finish() // Finish the current activity if you don't want to return to it
        }, 2500)

    }
}
