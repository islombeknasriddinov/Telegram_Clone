package com.example.telegramclone.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.telegramclone.R
import com.example.telegramclone.activity.AppearanceActivity
import com.example.telegramclone.activity.NotificationsActivity

class SettingsPageFragment: Fragment() {

    private fun openNotificationActivity() {
        activity?.let{
            val intent = Intent (it, NotificationsActivity::class.java)
            it.startActivity(intent)
        }
    }

    private fun openAppearanceActivity() {
        activity?.let{
            val intent = Intent (it, AppearanceActivity::class.java)
            it.startActivity(intent)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
         var view: View = inflater.inflate(R.layout.fragment_settings, container,false)

         var btn_notification  = view.findViewById<LinearLayout>(R.id.btn_notification)
         btn_notification.setOnClickListener {
            openNotificationActivity()
        }

        var btn_appearance  = view.findViewById<LinearLayout>(R.id.btn_appearance)
        btn_appearance.setOnClickListener {
            openAppearanceActivity()
        }

        return view
    }
}