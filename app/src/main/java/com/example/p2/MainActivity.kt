package com.example.p2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.p2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.decorView.layoutDirection = View.LAYOUT_DIRECTION_RTL

        binding.show.setOnClickListener { showOmen() }
        binding.aboutMe.setOnClickListener { showAboutMe() }
    }

    private fun showOmen() {
        OmenDialog((1..10).random()).show(supportFragmentManager, "dialog main")

    }

    private fun showAboutMe() {
        AboutMeDialog().show(supportFragmentManager, "dialog main")
    }
}