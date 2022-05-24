package com.example.vadadi3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.vadadi3.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BotonC.setOnClickListener {//logica para el boton
            ValidarSesion()
        }



        binding.signUpTextView.setOnClickListener {
            val intent = Intent(applicationContext, MiperfilActivity::class.java)
            startActivity(intent)
        }
    }

    fun ValidarSesion() {//metodo para validar sesion
        with(binding) {
            if (emailEditText.text.toString() == "") {
                Toast.makeText(
                    applicationContext,
                    "El campo correo esta vacio",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else if (passwordEditText.text.toString() == "") {
                Toast.makeText(
                    applicationContext,
                    "El campo contraseña esta vacio",
                    Toast.LENGTH_SHORT
                ).show()

            }else{
                val intent = Intent(applicationContext, InterUsuario::class.java)
                startActivity(intent)
            }

        }


    }

}