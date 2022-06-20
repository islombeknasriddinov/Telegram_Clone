package com.example.telegramclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telegramclone.R
import com.example.telegramclone.fragment.ChatPageFragment
import com.example.telegramclone.fragment.ContactsPageFragment
import com.example.telegramclone.model.Chat
import com.example.telegramclone.model.Contact
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapter(var context: ChatPageFragment, var items: ArrayList<Chat>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_view, parent,false)
        return MessegeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = items[position]

        if (holder is MessegeViewHolder){
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            var tv_message = holder.tv_message

            iv_profile.setImageResource(chat.profile)
            tv_fullname.text = chat.fullname
            tv_message.text = chat.message
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class MessegeViewHolder(var view: View): RecyclerView.ViewHolder(view){
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView
        var tv_message: TextView

        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname =  view.findViewById(R.id.tv_fullname)
            tv_message = view.findViewById(R.id.tv_messege)
        }
    }
}