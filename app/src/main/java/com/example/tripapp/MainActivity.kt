package com.example.tripapp

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.util.Log
import androidx.annotation.RequiresApi
import com.example.tripapp.databinding.ActivityMainBinding
import java.security.MessageDigest

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