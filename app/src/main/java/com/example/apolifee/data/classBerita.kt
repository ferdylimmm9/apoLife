package com.example.apolifee.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class classBerita (var imageBerita:Int=0,
                        var judulBerita:String="",
                        var namaPenulis:String="",
                        var tanggal:String="",
                        var isi:String="",
                        var kategori:String=""
) : Parcelable
