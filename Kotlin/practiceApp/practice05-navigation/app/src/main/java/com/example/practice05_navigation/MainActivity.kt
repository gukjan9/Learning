package com.example.practice05_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var layout_drawer : DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layout_drawer = findViewById(R.id.layout_drawer)

        val btn_navi : ImageButton = findViewById(R.id.btn_navi)
        val naviView : NavigationView = findViewById(R.id.naviView)

        btn_navi.setOnClickListener{
            layout_drawer.openDrawer(GravityCompat.START)   // START = Left, END = Right
        }
        
        naviView.setNavigationItemSelectedListener(this)    // Navigation 메뉴 아이템 클릭 능력 부여
    }

    override fun onNavigationItemSelected(item : MenuItem): Boolean {       // Navigation 메뉴 아이템 클릭 시 수행
        when (item.itemId){
            R.id.access -> Toast.makeText(applicationContext, "Accessibility", Toast.LENGTH_SHORT).show()
            R.id.email -> Toast.makeText(applicationContext, "Email", Toast.LENGTH_SHORT).show()
            R.id.message -> Toast.makeText(applicationContext, "Send", Toast.LENGTH_SHORT).show()
        }
        layout_drawer.closeDrawers()        // 클릭 후 Navigation 뷰 닫기
        return false
    }

    override fun onBackPressed() {
        if(layout_drawer.isDrawerOpen(GravityCompat.START)){
            layout_drawer.closeDrawers()
        }
        else {
            super.onBackPressed()               // 일반 BackButton 기능 실행
        }
    }
}