package com.example.apolifee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.apolifee.fragment.beranda
import com.example.apolifee.fragment.chat
import com.example.apolifee.fragment.profil

import com.ismaeldivita.chipnavigation.ChipNavigationBar

class MainActivity : AppCompatActivity() {
    lateinit var chipNavigationBar: ChipNavigationBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        setContentView(R.layout.activity_main)

        chipNavigationBar = findViewById(R.id.bottom_navigation)

        makeCurrentFragment(beranda())
        chipNavigationBar.setItemSelected(R.id.homeMenu)
        chipNavigationBar.setOnItemSelectedListener {
            when(it){
                R.id.homeMenu -> makeCurrentFragment(beranda())
                R.id.profilMenu -> makeCurrentFragment(profil())
                R.id.chatMenu -> makeCurrentFragment(chat())
            }
        }


    }
    private fun makeCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flMain,fragment)
            commit()
        }
    }
}