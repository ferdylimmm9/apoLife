package com.example.apolifee.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.apolifee.MainActivity
import com.example.apolifee.R
import com.example.apolifee.data.classUser
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class register : AppCompatActivity() {
    lateinit var user : classUser

    lateinit var namaInput : TextInputEditText
    lateinit var emailInput : TextInputEditText
    lateinit var passwordInput : TextInputEditText
    lateinit var noTeleponInput : TextInputEditText

    lateinit var nama : TextInputLayout
    lateinit var email : TextInputLayout
    lateinit var password : TextInputLayout
    lateinit var noTelepon : TextInputLayout

    lateinit var btnDaftar : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.title ="Kembali ke Login"

        btnDaftar = findViewById(R.id.btnRegister)
        namaInput = findViewById(R.id.namaInput)
        emailInput = findViewById(R.id.emailInput)
        passwordInput = findViewById(R.id.passwordInput)
        noTeleponInput = findViewById(R.id.noTeleponInput)

        nama = findViewById(R.id.nama)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        noTelepon = findViewById(R.id.noTelepon)


        btnDaftar.setOnClickListener {
            if(validasi())
                onBackPressed()
        }


    }
    fun validasi() : Boolean{
        reset()
        if(namaInput.text.toString().equals("")){
            nama.error = "Masukkan Nama"
            return false
        }
        if(emailInput.text.toString().equals("")){
            email.error = "Masukkan Email"
            return false
        }
        if(passwordInput.text.toString().equals("")){
            password.error = "Masukkan Password"
            return false
        }
        if(noTeleponInput.text.toString().equals("")){
            noTelepon.error="Masukkan Nomor Telepon"
            return false
        }
        return true
    }
    fun reset(){
        nama.error=""
        email.error=""
        password.error=""
        noTelepon.error=""
    }

    override fun navigateUpTo(upIntent: Intent?): Boolean {

        return super.navigateUpTo(upIntent)
    }
}