package com.example.vadadi3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.vadadi3.databinding.ActivityCalculoTripBinding

class calculoTrip : AppCompatActivity() {
    private lateinit var binding: ActivityCalculoTripBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculoTripBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BotonIr.setOnClickListener {
            ValidarViaje()
        }

        binding.botonVolver.setOnClickListener{

            val intent = Intent(applicationContext, InterUsuario::class.java)
            startActivity(intent)
        }

    }

    fun ValidarViaje() {
        with(binding) {
            if (InicioViaje.text.toString() == "") {
                Toast.makeText(
                    applicationContext,
                    "El campo viaje esta vacio", Toast.LENGTH_SHORT
                ).show()


            } else if (Destino.text.toString() == "") {
                Toast.makeText(
                    applicationContext,
                    "El campo destino esta vacio",
                    Toast.LENGTH_SHORT
                ).show()


            } else {
                val intent = Intent(applicationContext, InterUsuario::class.java)
                startActivity(intent)
            }


        }


    }

}









