package com.example.lyricsviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lyricsviewerapp.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val lyrics4 = intent.getStringExtra("fourthSong")
        binding.txtSong4Lyrics.text = lyrics4
    }
}