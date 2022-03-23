package com.example.apolifee.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.apolifee.R
import com.example.apolifee.data.classUser


class profil2 : Fragment() {

    lateinit var nama:TextView
    lateinit var email:TextView
    lateinit var jenis:TextView
    lateinit var alamat:TextView
    lateinit var tinggi:TextView
    lateinit var berat:TextView
    lateinit var nomor:TextView
    lateinit var photo:ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profil2, container, false)
        nama = view.findViewById(R.id.tvNama)
        email = view.findViewById(R.id.tvEmail)
        jenis = view.findViewById(R.id.tvJenis)
        alamat = view.findViewById(R.id.tvAlamat)
        tinggi = view.findViewById(R.id.tvTinggi)
        berat = view.findViewById(R.id.tvBerat)
        nomor = view.findViewById(R.id.tvNomor)
        photo = view.findViewById(R.id.ivPhoto)
        val data = classUser()

        nama.setText(data.nama)
        email.setText(data.email)
        jenis.setText(data.jenisKelamin)
        alamat.setText(data.alamat)
        tinggi.setText("${data.tinggiBadan} cm")
        berat.setText("${data.beratBadan} kg")
        nomor.setText(data.noTelp)
        photo.setImageResource(data.foto)
        return view
    }


}