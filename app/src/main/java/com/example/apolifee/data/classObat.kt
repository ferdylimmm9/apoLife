package com.example.apolifee.data

import android.os.Parcelable
import com.example.apolifee.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class classObat (
    var kode_bpom : String ="",
    var nama_obat :String="",
    var desc_obat :String="",
    var bentuk_obat:String="",
    var dikonsumsi:String="",
    var kategori:String="",
    var golongan:String="",
    var manfaat:String="",
    var dosis:Int=0,
    var harga:Int=0,
    var foto:Int = R.drawable.drawkit_vector_illustration_medical_10
    ) : Parcelable


