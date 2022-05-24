package com.example.vadadi3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vadadi3.databinding.ActivityInterUsuarioBinding
import com.example.vadadi3.databinding.ActivityLoginBinding


class InterUsuario : AppCompatActivity() {
    private lateinit var binding: ActivityInterUsuarioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInterUsuarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BotonC.setOnClickListener {//logica para el boton

            val intent = Intent(applicationContext, calculoTrip::class.java)
            startActivity(intent)

        }
        binding.Botonmiperfil.setOnClickListener {
            val intent = Intent(applicationContext, MiperfilActivity::class.java)
            startActivity(intent)
        }

        binding.botonVolver2.setOnClickListener{

            val intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }


    }

}



