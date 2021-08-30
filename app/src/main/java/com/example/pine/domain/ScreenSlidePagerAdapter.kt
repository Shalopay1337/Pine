package com.example.pine.domain

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.pine.ui.MainFragment


class ScreenSlidePagerAdapter (fm: FragmentManager): FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int = 2

    override fun getItem(position: Int): Fragment = MainFragment()




}