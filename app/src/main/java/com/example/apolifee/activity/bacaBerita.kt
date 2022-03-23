package com.example.apolifee.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.codesgood.views.JustifiedTextView
import com.example.apolifee.R
import com.example.apolifee.data.classBerita

class bacaBerita : AppCompatActivity() {
    lateinit var judul:TextView
    lateinit var penulis:TextView
    lateinit var tanggal:TextView
    lateinit var isi: JustifiedTextView
    lateinit var gambar:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baca_berita)
        supportActionBar?.title=""
        judul = findViewById(R.id.judul)
        penulis = findViewById(R.id.penulis)
        tanggal = findViewById(R.id.tanggal)
        isi = findViewById(R.id.isi)
        gambar = findViewById(R.id.photo)
        val data = intent.getParcelableExtra<classBerita>("data")
        judul.setText(data?.judulBerita)
        penulis.setText(data?.namaPenulis)
        tanggal.setText(data?.tanggal)
        isi.setText(data?.isi)
        gambar.setImageResource(data!!.imageBerita)
    }
}