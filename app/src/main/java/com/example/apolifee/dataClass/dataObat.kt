package com.example.apolifee.dataClass

import com.example.apolifee.data.classObat

object dataObat {
    private val kode_bpom = arrayOf(
        "A00001", "A00002", "A00003", "A00004", "A00005", "A00006", "A00007", "A00008"
    )
    private val nama_obat = arrayOf(
        "Lorem Batuk", "Lorem Covid", "Lorem Vaksin", "Lorem Pusing", "Lorem Flu", "Lorem Demam", "Lorem Vertigo", "Lorem Maag"
    )
    private val desc_obat = arrayOf(
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum"
    )
    private val bentuk_obat = arrayOf(
        "tablet", "cair", "tablet", "bubuk", "tablet", "tablet", "tablet", "tablet"
    )
    private val dikonsumsi = arrayOf(
        "dewasa", "anak-anak", "semua usia", "dewasa", "anak-anak", "semua usia", "dewasa", "anak-anak"
    )
    private val kategori = arrayOf(
        "Batuk", "Antibiotik", "Antivirus", "Ibumorfen", "Ibumorfen", "Ibumorfen", "Ibumorfen", "Ibumorfen"
    )
    private val golongan = arrayOf(
        "obat serap", "obat serap", "obat serap", "obat serap", "obat serap", "obat serap", "obat serap", "obat serap"
    )
    private val manfaat = arrayOf(
        "mengontrol batuk dan flu membuat lebih semangat", "mengontrol batuk dan flu serta membuat lebih semangat", "mengontrol batuk dan flu serta membuat lebih semangat", "mengontrol batuk dan flu serta membuat lebih semangat", "mengontrol batuk dan flu serta membuat lebih semangat", "mengontrol batuk dan flu serta membuat lebih semangat", "mengontrol batuk dan flu serta membuat lebih semangat", "mengontrol batuk dan flu serta membuat lebih semangat"
    )
    private val dosis = intArrayOf(
        50, 40, 20, 20, 18, 5, 2, 8
    )
    private val harga = intArrayOf(
        25000, 15000, 7500, 3000, 3000, 7000, 8000, 9000
    )

    val listData:ArrayList<classObat>get() {
        val list = arrayListOf<classObat>()
        for (i in kode_bpom.indices){
            val data = classObat()
            data.kode_bpom = kode_bpom[i]
            data.nama_obat = nama_obat[i]
            data.desc_obat = desc_obat[i]
            data.bentuk_obat = bentuk_obat[i]
            data.dikonsumsi = dikonsumsi[i]
            data.kategori = kategori[i]
            data.golongan = golongan[i]
            data.manfaat = manfaat[i]
            data.dosis = dosis[i]
            data.harga = harga[i]
            list.add(data)
        }
        return list
    }
}