package com.example.telegramclone.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegramclone.R
import com.example.telegramclone.activity.NotificationsActivity
import com.example.telegramclone.adapter.ContactAdapter
import com.example.telegramclone.model.Contact

class ContactsPageFragment: Fragment() {

    lateinit var recyclerView: RecyclerView

    private fun getAllContacts(): ArrayList<Contact> {
        val contacts: ArrayList<Contact> = ArrayList<Contact>()

       for (i in 1..50){
           contacts.add(Contact(R.drawable.profile,"Islombek"))
       }

        return contacts

    }

    private fun refreshAdadpter(contacts: ArrayList<Contact>) {
        val adapter = ContactAdapter(this, contacts)
        recyclerView!!.adapter = adapter
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.fragment_contacts, container,false)
        recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setLayoutManager(LinearLayoutManager(activity))
        refreshAdadpter(getAllContacts())
        return view
    }
}