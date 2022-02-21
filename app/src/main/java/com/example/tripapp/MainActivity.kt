package com.example.tripapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SystemClock.sleep(3000) //3초 후 화면 전환
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

        finish()
    }
}