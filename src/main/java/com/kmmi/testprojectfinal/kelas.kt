package com.kmmi.testprojectfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kmmi.testprojectfinal.databinding.ActivityKelasBinding

class kelas : AppCompatActivity() {
    private lateinit var binding: ActivityKelasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKelasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}