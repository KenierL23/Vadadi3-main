package com.example.vadadi3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.vadadi3.databinding.ActivityLoginBinding
import com.example.vadadi3.databinding.ActivityLoginBinding.*


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    companion object{
        var personas: Array<Usuario> = arrayOf(
            Usuario(
                usuario = "David15", contraseña = "kenier123", Nombre = "Kenier",
                Apellido = "Ramirez", Telefono = 322334414, Correo = "leud.23@gmail.com"
            ),
            Usuario(
                usuario = "felipe23", contraseña = "pipe123", Nombre = "Felipe",
                Apellido = "Gonzalez", Telefono = 321334413, Correo = "pipe23@gmail.com"
            ),Usuario(
                usuario = "Alejandro", contraseña = "0000", Nombre = "Alejandro",
                Apellido = "Franco", Telefono = 324553413, Correo = "Alejandro123@gmail.com"
            ),Usuario(
                usuario = "k", contraseña = "0", Nombre = "Felipe",
                Apellido = "Gonzalez", Telefono = 321334413, Correo = "k@gmail.com"
            )
        )
        var UsuarioLoging=""

    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)

        binding.BotonC.setOnClickListener {//logica para el boton

            if (binding.emailEditText.text.toString() == "") {
                Toast.makeText(
                    applicationContext,
                    "El campo correo esta vacio",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (binding.passwordEditText.text.toString() == "") {
                Toast.makeText(
                    applicationContext,
                    "El campo contraseña esta vacio",
                    Toast.LENGTH_SHORT
                ).show()

            } else {
                var estadoUsuario = false
                var estadoContra = false
                for(usuario in personas){
                    if (usuario.usuario == binding.emailEditText.text.toString() && usuario.contraseña == binding.passwordEditText.text.toString() ){
                        estadoUsuario = true
                        estadoContra = true
                        break

                    }



                }
                if(estadoUsuario && estadoContra){
                    val intent = Intent(applicationContext, InterUsuario::class.java)
                    UsuarioLoging = binding.emailEditText.text.toString()

                    startActivity(intent)
                }else{
                    Toast.makeText(
                        applicationContext,
                        "error al iniciar sesion",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
        binding.signUpTextView.setOnClickListener {
            val intent = Intent(applicationContext, MiperfilActivity::class.java)
            startActivity(intent)
        }
    }
}