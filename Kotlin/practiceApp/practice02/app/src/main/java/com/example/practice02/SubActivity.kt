package com.example.practice02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        var tv_getMsg : TextView = findViewById(R.id.tv_getMsg)

        if(intent.hasExtra("msg")){
            tv_getMsg.text = intent.getStringExtra("msg")       // 서브 액티비티에 존재하는 TextView에다가 Hello World가 넘겨져 옴
                                                                      // setText도 가능
        }
    }
}