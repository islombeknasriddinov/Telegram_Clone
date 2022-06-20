package com.example.telegramclone.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.telegramclone.R
import com.example.telegramclone.fragment.ChatPageFragment
import com.example.telegramclone.fragment.ContactsPageFragment
import com.example.telegramclone.fragment.SettingsPageFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private val chatPageFragment = ChatPageFragment()
    private val contactsPageFragment = ContactsPageFragment()
    private val settingsPageFragment = SettingsPageFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        replaceFragment(contactsPageFragment)

        var bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_chats -> replaceFragment(chatPageFragment)
                R.id.nav_contacts -> replaceFragment(contactsPageFragment)
                R.id.nav_settings -> replaceFragment(settingsPageFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment){
        if (fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }

}