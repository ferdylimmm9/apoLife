package com.example.apolifee.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apolifee.R
import com.example.apolifee.activity.bacaBerita
import com.example.apolifee.data.classBerita
import com.google.android.material.chip.Chip

class newBeritaCardAdapter(private val listData:ArrayList<classBerita>) : RecyclerView.Adapter<newBeritaCardAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivBerita : ImageView = itemView.findViewById(R.id.ivBerita)
        var tvBerita : TextView = itemView.findViewById(R.id.tvBerita)
        var chipBerita : Chip = itemView.findViewById(R.id.chipBerita)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.model_berita_card,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = listData[position]
        holder.ivBerita.setImageResource(data.imageBerita)
        holder.tvBerita.setText(data.judulBerita)
        holder.chipBerita.text = data.kategori


        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, bacaBerita::class.java)
            intent.putExtra("data",data)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }

}