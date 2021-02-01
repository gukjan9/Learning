package com.example.practice06_sharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var et_hello : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_hello = findViewById(R.id.et_hello)

        // TODO : 저장된 데이터를 로드
        loadData()                      // edit text 저장되어 있던 값 setText
    }

    private fun loadData() {
        val pref = getSharedPreferences("pref",0)
        et_hello.setText(pref.getString("name", ""))    // 1번째 인자에서는 저장할 당시의 키 값을 적어줌, 2번째는 키 값에 데이터가 존재하지 않을 경우 대체되는 값
    }

    private fun saveData() {
        val pref = getSharedPreferences("pref",0)
        val edit = pref.edit()          // 수정 모드
        edit.putString("name", et_hello.text.toString())          // 1번째 인사에는 키 값, 2번째 인자에는 실제로 담아둘 값
        edit.apply()                    // 저장 완료
    }

    override fun onDestroy() {          // 해당 액티비티가 종료되는 시점이 다가올 때 호출
        super.onDestroy()

        saveData()                      // edit text 값 저장
    }
}