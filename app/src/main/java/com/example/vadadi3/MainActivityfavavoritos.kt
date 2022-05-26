package com.example.vadadi3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vadadi3.databinding.ActivityFavoritosBinding
import com.example.vadadi3.databinding.ActivityMain2Binding

class MainActivityfavavoritosav : AppCompatActivity() {
private lateinit var binding:  ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)




        this.supportActionBar?.hide()



        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = CustomAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter



    }
}
