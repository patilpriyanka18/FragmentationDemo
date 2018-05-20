package com.example.pc.fragmentdemo

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFrag(ScreenFragment())
    }
    fun loadFrag(frag:  android.support.v4.app.Fragment)= supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayout,frag)
                .commit()



}
