package com.example.apolifee.data

import android.os.Parcelable
import com.example.apolifee.R
import kotlinx.parcelize.Parcelize
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.*

@Parcelize
data class classUser (var email:String = "dummy@dummy.com",
                      var password : String = "dummy123",
                      var nama : String = "dummy",
                      var jenisKelamin : String = "Pria",
                      var alamat : String = "Jalan Pemburu no.13, Medan Kota",
                      var kodePos : String ="20711",
                      var tinggiBadan: Int = 168,
                      var beratBadan : Int = 69,
                      var noTelp : String = "+6281234567890",
                      var foto : Int = R.drawable.drawkit_vector_illustration_medical_01,
                      var pesan:String="Generate Lorem Ipsum placeholder text. ",
                      var waktu:String="17:21"

                      ):Parcelable