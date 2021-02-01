package com.example.practice01

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {                // 액티비티가 최초 실행 되면 이곳을 수행한다.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_title : TextView = findViewById(R.id.tv_title)
        tv_title.setText("Hi")

        val et_id : EditText = findViewById(R.id.ed_ID)

        val btn_getText : Button = findViewById(R.id.btn_getText)
        btn_getText.setOnClickListener{                         // 에딧 텍스트에 입력되어 있는 값을 가지고 와서 텍스트뷰에 뿌려준다.
            var resultText = et_id.text.toString()
            tv_title.setText(resultText)
        }
    }
}