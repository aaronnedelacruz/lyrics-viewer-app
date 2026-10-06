package com.example.lyricsviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lyricsviewerapp.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val lyrics5 = intent.getStringExtra("fifthSong")
        binding.txtSong5Lyrics.text = lyrics5
    }
}