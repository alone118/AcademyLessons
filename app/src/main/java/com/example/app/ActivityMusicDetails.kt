package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app.databinding.ActivityMusicDetailsBinding

class ActivityMusicDetails : AppCompatActivity() {

    private val binding by lazy {
        ActivityMusicDetailsBinding.inflate(layoutInflater)
    }
    private val  isPlay = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            
        }
    }
}