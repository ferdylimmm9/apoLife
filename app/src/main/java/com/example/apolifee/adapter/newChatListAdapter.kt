package com.example.apolifee.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.apolifee.R
import com.example.apolifee.data.classUser
import de.hdodenhof.circleimageview.CircleImageView

class newChatListAdapter (private val listData:ArrayList<classUser>): RecyclerView.Adapter<newChatListAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama : TextView = itemView.findViewById(R.id.tvNama)
        var tvPesan : TextView = itemView.findViewById(R.id.tvPesan)
        var tvTanggal : TextView = itemView.findViewById(R.id.tvWaktu)
        var ivProfil : CircleImageView = itemView.findViewById(R.id.ivPhoto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.model_chat_list,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = listData[position]
        holder.tvNama.setText(data.nama)
        holder.tvPesan.setText(data.pesan)
        holder.tvTanggal.setText(data.waktu)
        Glide.with(holder.itemView.context).load(data.foto).into(holder.ivProfil)
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}