package com.example.practice04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
            User(R.drawable.android, "GukJang", "25", "Hi"),
            User(R.drawable.android, "GukJang1", "25", "Hi"),
            User(R.drawable.android, "GukJang2", "25", "Hi"),
            User(R.drawable.android, "GukJang3", "25", "Hi"),
            User(R.drawable.android, "GukJang4", "25", "Hi"),
            User(R.drawable.android, "GukJang5", "25", "Hi"),
            User(R.drawable.android, "GukJang6", "25", "Hi")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var listView : ListView = findViewById(R.id.listView)
//        val item = arrayOf("apple", "pear", "strawberry", "gukjang")
//
//        // context란 한 액티비티의 모든 정보를 담고 있다
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        var listView = findViewById<ListView>(R.id.listView)

        val Adapter = UserAdapter(this, UserList)
        listView.adapter = Adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this,selectItem.name, Toast.LENGTH_SHORT).show()
        }

    }
}