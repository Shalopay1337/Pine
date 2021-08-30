package com.example.pine

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import com.example.pine.domain.ScreenSlidePagerAdapter

class AppActivity : FragmentActivity() {

    private lateinit var mPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_Pine)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        mPager = findViewById(R.id.fragment_container)
        val pagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager)
        mPager.adapter = pagerAdapter

    }

    override fun onBackPressed() {
        if (mPager.currentItem == 0) super.onBackPressed()
        else mPager.currentItem = mPager.currentItem - 1

    }
}