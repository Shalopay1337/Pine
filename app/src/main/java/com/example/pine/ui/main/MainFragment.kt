package com.example.pine.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.pine.R
import com.example.pine.ui.DepthPageTransformer
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment() {

    private lateinit var pager: ViewPager2

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        pager = view.findViewById(R.id.pager)
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)

        val pagerAdapter = ScreenSlidePagerAdapter(requireActivity())
        pager.adapter = pagerAdapter
        pager.setPageTransformer(DepthPageTransformer())
        TabLayoutMediator(tabLayout, pager) { tab, position ->
            if (position == 0) tab.text = "FEED"
            else tab.text = "Favorite"
        }.attach()
    }




}