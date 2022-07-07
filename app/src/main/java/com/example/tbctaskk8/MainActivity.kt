package com.example.tbctaskk8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tbctaskk8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val startBtn = binding.startBtn
        startBtn.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            finish()
            startActivity(intent)
        }
    }
}