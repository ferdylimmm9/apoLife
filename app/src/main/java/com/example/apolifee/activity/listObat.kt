package com.example.apolifee.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apolifee.R
import com.example.apolifee.adapter.newObatListAdapter
import com.example.apolifee.dataClass.dataObat

class listObat : AppCompatActivity() {
    lateinit var rv_obat:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_obat)
        rv_obat = findViewById(R.id.rv_Obat)
        rv_obat.layoutManager = LinearLayoutManager(this)
        rv_obat.adapter = newObatListAdapter(dataObat.listData)
        supportActionBar?.title="Daftar Obat"

    }
}