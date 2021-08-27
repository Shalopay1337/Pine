package com.example.pine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.FragmentManager

class AppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_Pine)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}