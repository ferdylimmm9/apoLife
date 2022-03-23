package com.example.apolifee.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apolifee.R
import com.example.apolifee.activity.listBerita
import com.example.apolifee.activity.listObat
import com.example.apolifee.adapter.newBeritaCardAdapter
import com.example.apolifee.adapter.newObatCardAdapter
import com.example.apolifee.data.classUser
import com.example.apolifee.dataClass.dataBerita
import com.example.apolifee.dataClass.dataObat
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import org.w3c.dom.Text

class beranda : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    lateinit var tvNama : TextView
    lateinit var tvData : TextView

    lateinit var buttonChat : ImageButton
    lateinit var buttonToko : ImageButton
    lateinit var buttonRiwayat : ImageButton

    lateinit var rvBerita : RecyclerView
    lateinit var rvObat : RecyclerView

    lateinit var buttonLainBerita : Button
    lateinit var buttonLainObat : Button


    lateinit var chipNavigationBar: ChipNavigationBar
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_beranda, container, false)

        tvNama = view.findViewById(R.id.tvUserName)
        tvData = view.findViewById(R.id.tvUserWH)

        buttonChat = view.findViewById(R.id.btnChat)
        buttonToko = view.findViewById(R.id.btnToko)
        buttonRiwayat = view.findViewById(R.id.btnRiwayat)

        buttonLainBerita = view.findViewById(R.id.btnLainBerita)
        buttonLainObat = view.findViewById(R.id.btnLainObat)

        chipNavigationBar = requireActivity().findViewById(R.id.bottom_navigation)
        var user = classUser()

        tvNama.text = user.nama
        tvData.text = "${user.tinggiBadan}cm, ${user.beratBadan} kg"

        rvBerita = view.findViewById(R.id.rvBerita)
        rvObat = view.findViewById(R.id.rvObat)

        rvBerita.layoutManager = LinearLayoutManager(view.context,LinearLayoutManager.HORIZONTAL,false)
        rvObat.layoutManager = LinearLayoutManager(view.context,LinearLayoutManager.HORIZONTAL,false)

        rvBerita.adapter = newBeritaCardAdapter(dataBerita.listData)
        rvObat.adapter = newObatCardAdapter(dataObat.listData)

        buttonLainBerita.setOnClickListener {
            val intent = Intent(view.context,listBerita::class.java)
            startActivity(intent)
        }
        buttonLainObat.setOnClickListener {
            val intent = Intent(view.context,listObat::class.java)
            startActivity(intent)
        }

        buttonToko.setOnClickListener {
            val intent = Intent(view.context,listObat::class.java)
            startActivity(intent)
        }
        buttonChat.setOnClickListener {
            activity?.supportFragmentManager!!.beginTransaction().replace(R.id.flMain,chat()).commit()
            chipNavigationBar.setItemSelected(R.id.chatMenu)
        }
        return view
    }


}