package com.example.apolifee.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apolifee.R
import com.example.apolifee.adapter.newChatListAdapter
import com.example.apolifee.dataClass.dataUser

class chat : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    lateinit var rvList : RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        rvList = view.findViewById(R.id.rv_list)
        rvList.layoutManager = LinearLayoutManager(view.context)
        rvList.adapter = newChatListAdapter(dataUser.listData)
        return view
    }

}