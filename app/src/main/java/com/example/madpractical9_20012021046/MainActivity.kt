package com.example.madpractical9_20012021046

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.madpractical9_20012021046.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}