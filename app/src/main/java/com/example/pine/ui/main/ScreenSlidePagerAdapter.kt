package com.example.pine.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.pine.ui.favorites.FavoritesFragment
import com.example.pine.ui.feed.FeedFragment


class ScreenSlidePagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FeedFragment()
            1 -> FavoritesFragment()
            else -> FeedFragment()
        }
    }

}