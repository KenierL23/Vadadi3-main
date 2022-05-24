package com.example.vadadi3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vadadi3.databinding.ActivityFavoritosBinding
import com.example.vadadi3.databinding.ActivityMiperfilBinding

class FavoritosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavoritosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoritosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}