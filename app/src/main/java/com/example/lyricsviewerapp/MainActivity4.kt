package com.example.lyricsviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lyricsviewerapp.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val lyrics3 = intent.getStringExtra("thirdSong")
        binding.txtSong3Lyrics.text = lyrics3
    }
}