package com.example.lyricsviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lyricsviewerapp.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val lyrics1 = intent.getStringExtra("firstSong")
        binding.txtSong1Lyrics.text = lyrics1
    }
}