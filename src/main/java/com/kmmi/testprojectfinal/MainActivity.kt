package com.kmmi.testprojectfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.DocumentsContract
import com.kmmi.testprojectfinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvLihatNilai.setOnClickListener {
            startActivity(Intent(this@MainActivity, nilai_mhs::class.java))
        }
        binding.tvInputNilai.setOnClickListener {
            startActivity(Intent(this@MainActivity, input::class.java ))
        }
        binding.tvMahasiswa.setOnClickListener {
            startActivity(Intent(this@MainActivity, kelas::class.java))
        }
    }
}