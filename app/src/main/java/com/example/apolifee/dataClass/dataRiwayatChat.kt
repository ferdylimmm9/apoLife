package com.example.apolifee.dataClass

import com.example.apolifee.data.classRiwayatChat

object dataRiwayatChat {
    private val pesan = arrayOf(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Nulla pellentesque dignissim enim sit.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Nulla pellentesque dignissim enim sit.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Nulla pellentesque dignissim enim sit.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Nulla pellentesque dignissim enim sit.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Nulla pellentesque dignissim enim sit.",
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Nulla pellentesque dignissim enim sit.",
    )
    private val tipe = intArrayOf(
        1,
        0,
        1,
        0,
        1,
        0
    )
    val listData:ArrayList<classRiwayatChat>get() {
        val list = arrayListOf<classRiwayatChat>()
        for (i in pesan.indices){
            val data = classRiwayatChat()
            data.pesan = pesan[i]
            data.tipe = tipe[i]
            list.add(data)
        }
        return list
    }
}