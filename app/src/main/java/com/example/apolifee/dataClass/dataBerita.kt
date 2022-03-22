package com.example.apolifee.dataClass

import com.example.apolifee.R
import com.example.apolifee.data.classBerita

object dataBerita {
    private val gambarBerita = intArrayOf(
        R.drawable.drawkit_vector_illustration_medical_01,
        R.drawable.drawkit_vector_illustration_medical_02,
        R.drawable.drawkit_vector_illustration_medical_03,
        R.drawable.drawkit_vector_illustration_medical_04,
        R.drawable.drawkit_vector_illustration_medical_05,
        R.drawable.drawkit_vector_illustration_medical_06,
        R.drawable.drawkit_vector_illustration_medical_07,
        R.drawable.drawkit_vector_illustration_medical_08,
        R.drawable.drawkit_vector_illustration_medical_09,
        R.drawable.drawkit_vector_illustration_medical_10
    )

    private val judulBerita = arrayOf(
        "Why do we use it?",
        "Where can I get some?",
        "Where does it come from?",
        "What is Lorem Ipsum?",
        "Why do we use it?",
        "Where can I get some?",
        "Where does it come from?",
        "What is Lorem Ipsum?",
        "Why do we use it?",
        "Where can I get some?"
    )
    private val penulisBerita = arrayOf(
        "Enzo01", "Enzo02", "Enzo03", "Enzo04", "Enzo05", "Enzo06", "Enzo07", "Enzo08", "Enzo09", "Enzo10"
    )

    private val tanggal = arrayOf(
        "3/22/2022", "3/23/2022", "3/24/2022", "3/25/2022", "3/26/2022", "3/27/2022", "3/28/2022", "3/29/2022", "3/30/2022", "3/31/2022"
    )
    private val isi = arrayOf(
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum"
    )
    private val kategori = arrayOf(
        "covid-19", "otot", "jantung", "hati", "otak", "mental", "stamina", "covid-19", "covid-19", "covid-19"
    )
    val listData : ArrayList<classBerita>get() {
        val list = arrayListOf<classBerita>()
        for (i in gambarBerita.indices){
            var data = classBerita()
            data.imageBerita = gambarBerita[i]
            data.judulBerita = judulBerita[i]
            data.namaPenulis = penulisBerita[i]
            data.tanggal = tanggal[i]
            data.isi = isi[i]
            data.kategori = kategori[i]
            list.add(data)
        }
        return list
    }
}