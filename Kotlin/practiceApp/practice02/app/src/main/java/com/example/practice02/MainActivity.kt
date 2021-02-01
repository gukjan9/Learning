package com.example.practice02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv_sendMsg : TextView = findViewById(R.id.tv_sendMsg)

        val btn_a : Button = findViewById(R.id.btn_a)
        btn_a.setOnClickListener{
            // var : 변수, 값이 언제든지 변경될 수 있음
            // val : 자바에서는 final 값이 변경되지 못하는 변수

            val intent = Intent(this, SubActivity::class.java)  // 다음 화면으로 이동하기 위한 인텐트 객체 생성
            intent.putExtra("msg", tv_sendMsg.text.toString())          // Hello World 라는 텍스트 값을 담은 뒤 msg라는 키로 잠궜다.
            startActivity(intent)   // intent에 저장되어 있는 Activity 쪽으로 이동한다.
            finish()                // 현재 Activity( = MainActivity) 가 삭제된다.
        }
    }
}