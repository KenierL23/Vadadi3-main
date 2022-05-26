package com.example.vadadi3
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vadadi3.LoginActivity.Companion.UsuarioLoging
import com.example.vadadi3.LoginActivity.Companion.personas
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

                for (usuario in personas){
                    if(usuario.usuario == UsuarioLoging){
                        usuario.Nombre = binding.inputNombre.editText?.text.toString()
                        usuario.Apellido = binding.inputApellido.editText?.text.toString()
                        usuario.Telefono = binding.inputTelefono.editText?.text.toString().toInt()
                        usuario.Correo = binding.inputCorreo.editText?.text.toString()
                        break
                    }
                }

            val intent = Intent(applicationContext, InterUsuario::class.java)
            startActivity(intent)
        }

        for(usuario in personas){
            if (usuario.usuario == UsuarioLoging){
                binding.inputNombre.editText?.setText(usuario.Nombre)
                binding.inputApellido.editText?.setText(usuario.Apellido)
               binding.inputTelefono.editText?.setText(usuario.Telefono.toString())
                binding.inputCorreo.editText?.setText(usuario.Correo)
                break
            }
        }
    }
}

