package com.example.telegramclone.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.example.telegramclone.R

class NotificationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)
        initView()
    }

    private fun initView() {
        backToSettings()
    }

    private fun backToSettings() {
        var btn_back = findViewById<LinearLayout>(R.id.btn_back)
        btn_back.setOnClickListener{
            finish()
        }
    }
}