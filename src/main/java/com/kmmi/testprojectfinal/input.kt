package com.kmmi.testprojectfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kmmi.testprojectfinal.databinding.ActivityInputBinding

class input : AppCompatActivity() {
    private lateinit var binding: ActivityInputBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}