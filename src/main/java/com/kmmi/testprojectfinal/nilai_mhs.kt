package com.kmmi.testprojectfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kmmi.testprojectfinal.databinding.ActivityNilaiMhsBinding

class nilai_mhs : AppCompatActivity() {
    private lateinit var binding : ActivityNilaiMhsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNilaiMhsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}