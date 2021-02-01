package com.example.practice03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_toast : TextView = findViewById(R.id.btn_toast)
        var iv_profile : ImageView = findViewById(R.id.iv_profile)

        btn_toast.setOnClickListener(){
            iv_profile.setImageResource(R.drawable.android2)
            Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_LONG).show()
        }
    }
}