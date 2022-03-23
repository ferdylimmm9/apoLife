package com.example.apolifee.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apolifee.R
import com.example.apolifee.activity.bacaBerita
import com.example.apolifee.activity.bacaObat
import com.example.apolifee.data.classBerita
import com.example.apolifee.data.classObat
import java.text.NumberFormat

class newObatListAdapter (private val listData:ArrayList<classObat>) : RecyclerView.Adapter<newObatListAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivObat : ImageView = itemView.findViewById(R.id.ivBerita)
        var tvObat : TextView = itemView.findViewById(R.id.tvJudul)
        var tvKeterangan : TextView = itemView.findViewById(R.id.tvKeterangan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.model_berita_list,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = listData[position]
        Glide.with(holder.itemView.context)
            .load(data.foto)
            .into(holder.ivObat)
        holder.tvObat.setText(data.kategori)
        val numberFormat = NumberFormat.getCurrencyInstance()
        numberFormat.setMaximumFractionDigits(0);
        holder.tvKeterangan.setText("${data.kategori} | ${numberFormat.format(data.harga)}")

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context,bacaObat::class.java)
            intent.putExtra("data",data)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}