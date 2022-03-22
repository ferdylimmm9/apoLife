package com.example.apolifee.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.apolifee.MainActivity
import com.example.apolifee.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class login : AppCompatActivity() {

    lateinit var btnLogin:Button
    lateinit var btnDaftar:Button

    lateinit var email : TextInputLayout
    lateinit var password : TextInputLayout

    lateinit var emailInput:TextInputEditText
    lateinit var passwordInput:TextInputEditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lateinit var intent:Intent

        setContentView(R.layout.activity_login)
        btnLogin = findViewById(R.id.btnLogin)
        btnDaftar = findViewById(R.id.btnRegister)

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)

        emailInput = findViewById(R.id.emailInput)
        passwordInput = findViewById(R.id.passwordInput)

        if(savedInstanceState!=null){ //onSaveInstanceRestore
            emailInput.setText(savedInstanceState.getStringArrayList("data")?.get(0))
            passwordInput.setText(savedInstanceState.getStringArrayList("data")?.get(1))
        }

        btnDaftar.setOnClickListener {
            intent = Intent(this, register::class.java) //intent implisit
            startActivity(intent)
        }
        btnLogin.setOnClickListener {
            intent = Intent(this, MainActivity::class.java) //intent implisit
            if(validasi())
                startActivity(intent)

        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        var data01:String = emailInput.text.toString()
        var data02:String = passwordInput.text.toString()
        outState.putStringArrayList("data", arrayListOf(data01,data02))
    } //onSaveInstance

    fun validasi() : Boolean{
        reset()
        if(emailInput.text.toString().equals("")){
            email.error="Masukkan email"
            return false
        }
        if(passwordInput.text.toString().equals("")){
            password.error="Masukkan password"
            return false
        }
        return true
    }

    fun reset() {
        email.error =""
        password.error=""
    }
}