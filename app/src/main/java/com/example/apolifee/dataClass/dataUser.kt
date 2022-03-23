package com.example.apolifee.dataClass

import com.example.apolifee.data.classUser

object dataUser  {
    private val nama = arrayOf(
        "Alex",
        "Enzo",
        "David",
        "Shiera",
        "Cindy",
        "Eliska",
        "Bomba"
    )
    val listData:ArrayList<classUser>get() {
        val list = arrayListOf<classUser>()
        for (i in nama.indices){
            val data = classUser()
            data.nama = nama[i]
            list.add(data)
        }
        return list
    }
}