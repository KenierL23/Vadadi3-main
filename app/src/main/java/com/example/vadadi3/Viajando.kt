package com.example.vadadi3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vadadi3.databinding.ActivityViajandoBinding

class Viajando : AppCompatActivity() {
    private lateinit var  binding: ActivityViajandoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViajandoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonVolver2.setOnClickListener{

            val intent = Intent(applicationContext, InterUsuario::class.java)
            startActivity(intent)
        }
    }
}