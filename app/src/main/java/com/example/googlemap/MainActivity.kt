package com.example.googlemap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMap : AppCompatButton = findViewById(R.id.btnMap)


        btnMap.setOnClickListener {
            startActivity(Intent(this,GoogleMapActivity::class.java))
        }
    }
}