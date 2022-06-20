package com.example.telegramclone.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegramclone.R
import com.example.telegramclone.adapter.ChatAdapter
import com.example.telegramclone.model.Chat

class ChatPageFragment: Fragment() {
    lateinit var recyclerView: RecyclerView

    private fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList<Chat>()

        for (i in 1..30){
            chats.add(Chat(R.drawable.profile, "Islombek Naasriddinov","Yes you are good study"))
        }

        return chats

    }

    private fun refreshAdadpter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView!!.adapter = adapter
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.fragment_chats, container,false)
        recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setLayoutManager(LinearLayoutManager(activity))
        refreshAdadpter(getAllChats())
        return view
    }
}