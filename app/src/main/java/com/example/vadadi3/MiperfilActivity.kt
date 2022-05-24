package com.example.vadadi3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vadadi3.databinding.ActivityLoginBinding
import com.example.vadadi3.databinding.ActivityMiperfilBinding

class MiperfilActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMiperfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMiperfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonVolver.setOnClickListener {//logica para el boton

            val intent = Intent(applicationContext, InterUsuario::class.java)
            startActivity(intent)

        }
        binding.botonGuardar.setOnClickListener {
            val intent = Intent(applicationContext, InterUsuario::class.java)
            startActivity(intent)
        }

    }
}

