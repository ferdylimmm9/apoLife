package com.example.apolifee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import com.example.apolifee.activity.login

class splashScreen : AppCompatActivity() {

    lateinit var btnMulai : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()
        btnMulai = findViewById(R.id.btnMulai)
        val intent = Intent(this, login::class.java) //intent Implisit
        btnMulai.setOnClickListener {
            startActivity(intent)
        }
    }
}