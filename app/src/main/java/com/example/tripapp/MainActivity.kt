package com.example.tripapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tripapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layoutmain = ActivityMainBinding.inflate(layoutInflater)

        setContentView(layoutmain.root)

        layoutmain.mapButton.setOnClickListener {
            startActivity(Intent(this@MainActivity,MapActivity::class.java))
        }

    }



}