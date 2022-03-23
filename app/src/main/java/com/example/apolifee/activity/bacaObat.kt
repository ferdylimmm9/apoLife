package com.example.apolifee.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.codesgood.views.JustifiedTextView
import com.example.apolifee.R
import com.example.apolifee.data.classObat
import java.text.NumberFormat

class bacaObat : AppCompatActivity() {
    lateinit var tvNama :TextView
    lateinit var tvBpom :TextView
    lateinit var tvDosis :TextView
    lateinit var tvHarga :TextView
    lateinit var tvBentuk :TextView
    lateinit var tvKonsumsi :TextView
    lateinit var tvKategori :TextView
    lateinit var tvGolongan :TextView

    lateinit var jvDesc:JustifiedTextView
    lateinit var jvManfaat:JustifiedTextView

    lateinit var ivObat:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baca_obat)

        tvNama = findViewById(R.id.tvNama)
        tvBpom = findViewById(R.id.tvBpom)
        tvDosis = findViewById(R.id.tvDosis)
        tvHarga = findViewById(R.id.tvHarga)
        tvBentuk = findViewById(R.id.tvBentuk)
        tvKonsumsi = findViewById(R.id.tvKonsumsi)
        tvKategori = findViewById(R.id.tvKategori)
        tvGolongan = findViewById(R.id.tvGolongan)

        jvDesc = findViewById(R.id.tvDesc)
        jvManfaat = findViewById(R.id.tvManfaat)

        ivObat = findViewById(R.id.ivObat)

        val data  = intent.getParcelableExtra<classObat>("data")

        val numberFormat = NumberFormat.getCurrencyInstance()
        numberFormat.setMaximumFractionDigits(0);

        tvNama.setText(data!!.nama_obat)
        tvBpom.setText(data!!.kode_bpom)
        tvDosis.setText("${data!!.dosis} mg")
        tvHarga.setText("${numberFormat.format(data!!.harga)}")
        tvBentuk.setText(data!!.bentuk_obat)
        tvKonsumsi.setText(data!!.dikonsumsi)
        tvKategori.setText(data!!.kategori)
        tvGolongan.setText(data!!.golongan)
        Glide.with(this).load(data!!.foto).into(ivObat)
        jvDesc.setText(data!!.desc_obat)
        jvManfaat.setText(data!!.manfaat)
    }
}