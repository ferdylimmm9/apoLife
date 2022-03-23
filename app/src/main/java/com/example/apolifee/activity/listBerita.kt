package com.example.apolifee.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apolifee.R
import com.example.apolifee.adapter.newBeritaListAdapter
import com.example.apolifee.dataClass.dataBerita

class listBerita : AppCompatActivity() {
    lateinit var rv_list : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_berita)

        supportActionBar?.title = "Daftar Berita"
        rv_list = findViewById(R.id.rv_Berita)
        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.adapter = newBeritaListAdapter(dataBerita.listData)

    }
}