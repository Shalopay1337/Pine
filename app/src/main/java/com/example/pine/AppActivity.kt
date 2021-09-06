package com.example.pine

import android.os.Bundle
import androidx.fragment.app.FragmentActivity


class AppActivity : FragmentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Pine)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
    }

    /*private val navigator = object : Navigator {
       override fun applyCommand(command: Command) {
//TODO
        }
    }*/

}