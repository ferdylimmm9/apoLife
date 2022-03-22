package com.example.apolifee.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apolifee.R
import com.example.apolifee.activity.bacaObat
import com.example.apolifee.data.classObat

class newObatCardAdapter (private val listData:ArrayList<classObat>): RecyclerView.Adapter<newObatCardAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivObat:ImageView = itemView.findViewById(R.id.ivObat)
        var tvObat:TextView = itemView.findViewById(R.id.tvObat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.model_obat_card,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = listData[position]
        holder.ivObat.setImageResource(data.foto)
        holder.tvObat.text = data.nama_obat

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